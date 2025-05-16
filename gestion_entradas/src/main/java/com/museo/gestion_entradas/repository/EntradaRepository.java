package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaRepository extends JpaRepository<Entrada, Integer> {
}
