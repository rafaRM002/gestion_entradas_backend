package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Extras;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExtrasRepository extends JpaRepository<Extras,Integer> {
    List<Extras> findAllByEstablecimientoId(Integer establecimientoId);
}
