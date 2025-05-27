package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Comercio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComercioRepository extends JpaRepository<Comercio,Integer> {
    List<Comercio> findAllByUsuarioUsername(String username);
}
