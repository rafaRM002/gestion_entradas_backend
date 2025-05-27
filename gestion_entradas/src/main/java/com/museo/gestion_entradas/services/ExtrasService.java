package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.Extras;
import com.museo.gestion_entradas.entities.Tipo;

import java.util.List;

public interface ExtrasService {

    /**
     * Metodo que Lista todos los usuarios
     * @return retorna una lista de usuarios
     */
    List<Extras> listarExtras();

    /**
     * Se encarga de Listar un usuario en concreto
     * @Param recibe un usuario para su listado
     * @return retorna el usuario que quermos ver
     */
    Extras crearExtras(Extras extras);

    Extras actualizarExtras(Extras extras);
    /**
     * Se encarga de eliminar un uusuario recibiendo los datos
     * @Param recibe un usuario para su eliminacion
     */
    void eliminarExtras(int id);

    List<Extras> getExtrasByEstablecimientoId(Integer establecimientoId);
}
