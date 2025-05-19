package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.Entrada;


import java.util.List;

public interface EntradaService {
    List<Entrada> listarEntradas();

    /**
     * Se encarga de Listar una entrada en concreto
     * @Param recibe una entrada para su listado
     * @return retorna la entrada que quermos ver
     */
    Entrada crearEntradas(Entrada entrada);

    Entrada actualizarEntrada(Entrada entrada);
    /**
     * Se encarga de eliminar una entrada recibiendo los datos
     * @Param recibe una entrada para su eliminacion
     */
    void eliminarEntrada(int id);
}
