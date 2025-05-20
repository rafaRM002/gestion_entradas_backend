package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.Extras;
import com.museo.gestion_entradas.entities.ExtrasProductos;

import java.util.List;

public interface ExtrasProductosService {

    /**
     * Metodo que Lista todos los usuarios
     * @return retorna una lista de usuarios
     */
    List<ExtrasProductos> listarExtrasProductos();

    /**
     * Se encarga de Listar un usuario en concreto
     * @Param recibe un usuario para su listado
     * @return retorna el usuario que quermos ver
     */
    ExtrasProductos crearExtrasProductos(ExtrasProductos extrasProductos);

    ExtrasProductos actualizarExtrasProductos(ExtrasProductos extrasProductos);
    /**
     * Se encarga de eliminar un uusuario recibiendo los datos
     * @Param recibe un usuario para su eliminacion
     */
    void eliminarExtrasProductos(int id);
}
