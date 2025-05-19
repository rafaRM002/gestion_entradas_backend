package com.museo.gestion_entradas.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.museo.gestion_entradas.entities.Usuario;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static com.museo.gestion_entradas.security.TokenJwtConfig.*;

@Component
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
        // No llamar a super(authenticationManager)
        super.setFilterProcessesUrl("/login");
        this.authenticationManager = authenticationManager;
        // Asigna el AuthenticationManager correctamente
        super.setAuthenticationManager(authenticationManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response)
            throws AuthenticationException {
        Usuario usuario;
        try {
            usuario = new ObjectMapper().readValue(request.getInputStream(), Usuario.class);
        } catch (IOException e) {
            throw new AuthenticationServiceException("Error leyendo credenciales", e);
        }
        UsernamePasswordAuthenticationToken authToken =
                new UsernamePasswordAuthenticationToken(usuario.getUsername(), usuario.getPassword());
        return authenticationManager.authenticate(authToken);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult)
            throws IOException, ServletException {
        org.springframework.security.core.userdetails.User userDetails =
                (org.springframework.security.core.userdetails.User) authResult.getPrincipal();

        String username = userDetails.getUsername();
        Collection<? extends GrantedAuthority> roles = userDetails.getAuthorities();
        String rol = roles.stream()
                .map(GrantedAuthority::getAuthority)
                .findFirst()
                .orElse("ROLE_EMPLEADO");

        Map<String, Object> claims = new HashMap<>();
        claims.put("username", username);
        claims.put("authorities", roles.stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList()));
        claims.put("rol", rol);

        // Asegúrate de que SECRET_KEY es un objeto Key; por ejemplo:
        // public static final SecretKey SECRET_KEY =
        //     Keys.hmacShaKeyFor(Decoders.BASE64.decode("tu_clave_base64_de_256_bits"));
        String token = Jwts.builder()
                .setSubject(username)
                .addClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + 36000))
                .signWith(SECRET_KEY)
                .compact();

        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType(CONTENT_TYPE);
        response.addHeader(HEADER_AUTHORIZATION, PREFIX_TOKEN + token);

        Map<String, String> body = new HashMap<>();
        body.put("token", token);
        body.put("username", username);
        body.put("mensaje", "Has iniciado sesión con éxito!");

        response.getWriter().write(new ObjectMapper().writeValueAsString(body));
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request,
                                              HttpServletResponse response,
                                              AuthenticationException failed)
            throws IOException, ServletException {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType(CONTENT_TYPE);

        Map<String, String> body = new HashMap<>();
        body.put("message", "Error en la autenticación, usuario o password incorrectos!");
        body.put("error", failed.getMessage());

        response.getWriter().write(new ObjectMapper().writeValueAsString(body));
    }
}