package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
