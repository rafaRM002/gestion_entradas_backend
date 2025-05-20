package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Entrada;
import com.museo.gestion_entradas.entities.Establecimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstablecimientoRepository extends JpaRepository<Establecimiento, Integer> {
}
