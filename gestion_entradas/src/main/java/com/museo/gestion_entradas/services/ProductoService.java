package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.Producto;
import com.museo.gestion_entradas.entities.Usuario;

import java.util.List;

public interface ProductoService {
    /**
     * Metodo que Lista todos los usuarios
     * @return retorna una lista de usuarios
     */
    List<Producto> listarProductos();

    /**
     * Se encarga de Listar un usuario en concreto
     * @Param recibe un usuario para su listado
     * @return retorna el usuario que quermos ver
     */
    Producto crearProducto(Producto producto);

    Producto actualizarProducto(Producto producto);
    /**
     * Se encarga de eliminar un uusuario recibiendo los datos
     * @Param recibe un usuario para su eliminacion
     */
    void eliminarProducto(int id);
}
