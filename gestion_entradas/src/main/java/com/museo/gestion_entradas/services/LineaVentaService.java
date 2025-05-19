package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.LineaVenta;
import com.museo.gestion_entradas.entities.Producto;

import java.util.List;

public interface LineaVentaService {

    /**
     * Metodo que Lista todos los usuarios
     * @return retorna una lista de usuarios
     */
    List<LineaVenta> listarLineasVenta();

    /**
     * Se encarga de Listar un usuario en concreto
     * @Param recibe un usuario para su listado
     * @return retorna el usuario que quermos ver
     */
    LineaVenta crearLineaVenta(LineaVenta lineaVenta);

    LineaVenta actualizarLineaVenta(LineaVenta lineaVenta);
    /**
     * Se encarga de eliminar un uusuario recibiendo los datos
     * @Param recibe un usuario para su eliminacion
     */
    void eliminarLineaVenta(int id);
}
