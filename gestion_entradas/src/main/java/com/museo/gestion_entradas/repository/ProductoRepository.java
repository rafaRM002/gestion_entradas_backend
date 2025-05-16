package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
