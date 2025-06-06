package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByUsername(String username);

}
