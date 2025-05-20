package com.museo.gestion_entradas.controller;


import com.museo.gestion_entradas.entities.Producto;
import com.museo.gestion_entradas.entities.Tipo;
import com.museo.gestion_entradas.services.implementations.ProductoServiceImpl;
import com.museo.gestion_entradas.services.implementations.TipoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipo")
public class TipoController {

    private TipoServiceImpl tipoServiceImpl;

    TipoController(TipoServiceImpl tipoServiceImpl) {
        this.tipoServiceImpl = tipoServiceImpl;
    }

    @GetMapping
    public List<Tipo> ListarTipo() {
        return tipoServiceImpl.listarTipos();
    }

    @PostMapping
    public Tipo crearTipo(@RequestBody Tipo tipo) {
        return tipoServiceImpl.crearTipo(tipo);
    }

    @PutMapping
    public Tipo actualizarTipo(@RequestBody Tipo tipo) {
        return tipoServiceImpl.actualizarTipo(tipo);
    }

    @DeleteMapping("/{id}")
    public void DeleteTipo(@PathVariable int id) {
        this.tipoServiceImpl.eliminarTipo(id);
    }



}
