package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.Comercio;
import com.museo.gestion_entradas.entities.Entrada;

import java.util.List;

public interface ComercioService {
    List<Comercio> listarComercios();

    /**
     * Se encarga de Listar un comercio en concreto
     * @Param recibe un comercio para su listado
     * @return retorna el comercio que quermos ver
     */
    Comercio crearComercio(Comercio comercio);

    Comercio actualizarComercio(Comercio comercio);
    /**
     * Se encarga de eliminar un omercio recibiendo los datos
     * @Param recibe un comercio para su eliminacion
     */
    void eliminarComercio(int id);
}
