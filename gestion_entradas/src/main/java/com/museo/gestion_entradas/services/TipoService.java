package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.LineaVenta;
import com.museo.gestion_entradas.entities.Tipo;

import java.util.List;

public interface TipoService {

    /**
     * Metodo que Lista todos los usuarios
     * @return retorna una lista de usuarios
     */
    List<Tipo> listarTipos();

    /**
     * Se encarga de Listar un usuario en concreto
     * @Param recibe un usuario para su listado
     * @return retorna el usuario que quermos ver
     */
    Tipo crearTipo(Tipo tipo);

    Tipo actualizarTipo(Tipo tipo);
    /**
     * Se encarga de eliminar un uusuario recibiendo los datos
     * @Param recibe un usuario para su eliminacion
     */
    void eliminarTipo(int id);

}
