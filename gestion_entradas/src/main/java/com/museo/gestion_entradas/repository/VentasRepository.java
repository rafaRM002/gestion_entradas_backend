package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentasRepository extends JpaRepository <Ventas,Integer> {
}
