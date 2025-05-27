package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findAllByEstablecimientoId(Integer establecimientoId);
}
