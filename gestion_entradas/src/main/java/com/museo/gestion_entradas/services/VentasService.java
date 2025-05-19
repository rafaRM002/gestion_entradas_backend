package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.Ventas;

import java.util.List;

public interface VentasService {
    List<Ventas> listarVentas();

    /**
     * Se encarga de Listar uns venta en concreto
     * @Param recibe una venta para su listado
     * @return retorna la venta que quermos ver
     */
    Ventas crearVentas(Ventas ventas);

    Ventas actualizarVentas(Ventas ventas);
    /**
     * Se encarga de eliminar una venta recibiendo los datos
     * @Param recibe una venta para su eliminacion
     */
    void eliminarVentas(int id);
}
