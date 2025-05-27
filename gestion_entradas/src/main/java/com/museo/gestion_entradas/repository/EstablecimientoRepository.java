package com.museo.gestion_entradas.repository;

import com.museo.gestion_entradas.entities.Entrada;
import com.museo.gestion_entradas.entities.Establecimiento;
import com.museo.gestion_entradas.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EstablecimientoRepository extends JpaRepository<Establecimiento, Integer> {

    List<Establecimiento> findAllByComercio_Id(int idComercio);

}
