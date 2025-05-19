package com.museo.gestion_entradas.services;

import com.museo.gestion_entradas.entities.Usuario;

import java.util.List;

public interface UsuarioService {

    /**
     * Metodo que Lista todos los usuarios
     * @return retorna una lista de usuarios
     */
    List<Usuario> listarUsuarios();

    /**
     * Se encarga de Listar un usuario en concreto
     * @Param recibe un usuario para su listado
     * @return retorna el usuario que quermos ver
     */
    Usuario crearUsuario(Usuario usuario);

    Usuario actualizarUsuario(Usuario usuario);
    /**
     * Se encarga de eliminar un uusuario recibiendo los datos
     * @Param recibe un usuario para su eliminacion
     */
    void eliminarUsuario(int id);

    Usuario findByUsername(String username);

}
