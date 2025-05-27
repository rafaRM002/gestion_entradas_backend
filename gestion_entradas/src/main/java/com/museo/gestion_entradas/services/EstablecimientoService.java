package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.Establecimiento;
import com.museo.gestion_entradas.entities.ExtrasProductos;
import com.museo.gestion_entradas.entities.Usuario;

import java.util.List;

public interface EstablecimientoService {

    /**
     * Metodo que Lista todos los usuarios
     * @return retorna una lista de usuarios
     */
    List<Establecimiento> listarEstablecimiento();

    /**
     * Se encarga de Listar un usuario en concreto
     * @Param recibe un usuario para su listado
     * @return retorna el usuario que quermos ver
     */
    Establecimiento crearEstablecimiento(Establecimiento establecimiento);

    Establecimiento actualizarEstablecimiento(Establecimiento establecimiento);
    /**
     * Se encarga de eliminar un uusuario recibiendo los datos
     * @Param recibe un usuario para su eliminacion
     */
    void eliminarEstablecimiento(int id);

    List<Establecimiento> findAllByComercio_Id(int idComercio);

}
