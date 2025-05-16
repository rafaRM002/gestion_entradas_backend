package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.Usuario;
import com.museo.gestion_entradas.entities.Ventas;

import java.util.List;

public interface VentasService {
    List<Ventas> listarVentas();

    /**
     * Se encarga de Listar un usuario en concreto
     * @Param recibe un usuario para su listado
     * @return retorna el usuario que quermos ver
     */
    Ventas crearVentas(Ventas ventas);

    Ventas actualizarVentas(Ventas ventas);
    /**
     * Se encarga de eliminar un uusuario recibiendo los datos
     * @Param recibe un usuario para su eliminacion
     */
    void eliminarVentas(int id);
}
