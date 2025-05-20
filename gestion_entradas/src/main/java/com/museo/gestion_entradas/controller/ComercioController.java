package com.museo.gestion_entradas.controller;

import com.museo.gestion_entradas.entities.Comercio;
import com.museo.gestion_entradas.entities.Entrada;
import com.museo.gestion_entradas.services.implementations.ComercioServiceImpl;
import com.museo.gestion_entradas.services.implementations.EntradaServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comercio")
public class ComercioController {
    private ComercioServiceImpl comercioServiceImpl;

    ComercioController(ComercioServiceImpl comercioServiceImpl) {
        this.comercioServiceImpl = comercioServiceImpl;
    }

    @GetMapping
    public List<Comercio> listarComercios() {
        return comercioServiceImpl.listarComercios();
    }

    @PostMapping
    public Comercio crearComercio(@RequestBody Comercio comercio) {
        return comercioServiceImpl.crearComercio(comercio);
    }

    @PutMapping
    public Comercio actualizarComercio(@RequestBody Comercio comercio) {
        return comercioServiceImpl.actualizarComercio(comercio);
    }

    @DeleteMapping("/{id}")
    public void DeleteComercio(@PathVariable int id) {
        this.comercioServiceImpl.eliminarComercio(id);
    }
}