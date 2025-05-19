package com.museo.gestion_entradas.services.implementations;

import com.museo.gestion_entradas.entities.Usuario;
import com.museo.gestion_entradas.repository.UsuarioRepository;
import com.museo.gestion_entradas.services.UsuarioService;
import org.hibernate.boot.jaxb.internal.UrlXmlSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usuarioServiceImpl")
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuarioExistente) {
        return usuarioRepository.save(usuarioExistente);
    }

    @Override
    public void eliminarUsuario(int id) {usuarioRepository.deleteById(id);}

    @Override
    public Usuario findByUsername(String username) {
        return null;

    }
}

