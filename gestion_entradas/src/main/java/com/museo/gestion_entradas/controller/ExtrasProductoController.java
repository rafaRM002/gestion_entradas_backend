package com.museo.gestion_entradas.controller;

import com.museo.gestion_entradas.entities.ExtrasProductos;
import com.museo.gestion_entradas.services.implementations.ExtrasProductosServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/extrasProducto")
public class ExtrasProductoController {

    private ExtrasProductosServiceImpl extrasProductoServiceImpl;

    ExtrasProductoController(ExtrasProductosServiceImpl extrasProductoServiceImpl) {
        this.extrasProductoServiceImpl = extrasProductoServiceImpl;
    }

    @GetMapping
    public List<ExtrasProductos> ListarExtrasProducto() {
        return extrasProductoServiceImpl.listarExtrasProductos();
    }

    @PostMapping
    public ExtrasProductos crearExtraProducto(@RequestBody ExtrasProductos extras) {
        return extrasProductoServiceImpl.crearExtrasProductos(extras);
    }

    @PutMapping
    public ExtrasProductos actualizarExtrasProductos(@RequestBody ExtrasProductos extras) {
        return extrasProductoServiceImpl.actualizarExtrasProductos(extras);
    }

    @DeleteMapping("/{id}")
    public void DeleteExtraProductos(@PathVariable int id) {
        this.extrasProductoServiceImpl.eliminarExtrasProductos(id);
    }

}
