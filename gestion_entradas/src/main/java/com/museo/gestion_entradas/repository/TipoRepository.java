package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo,Integer> {
}
