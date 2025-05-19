package com.museo.gestion_entradas.controller;


import com.museo.gestion_entradas.entities.Entrada;
import com.museo.gestion_entradas.entities.Producto;
import com.museo.gestion_entradas.services.implementations.EntradaServiceImpl;
import com.museo.gestion_entradas.services.implementations.ProductoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entrada")
public class EntradaController {
    private EntradaServiceImpl entradaServiceImpl;

    EntradaController(EntradaServiceImpl entradaServiceImpl) {
        this.entradaServiceImpl = entradaServiceImpl;
    }

    @GetMapping
    public List<Entrada> ListarEntradas() {
        return entradaServiceImpl.listarEntradas();
    }

    @PostMapping
    public Entrada crearEntrada(@RequestBody Entrada entrada) {
        return entradaServiceImpl.crearEntradas(entrada);
    }

    @PutMapping
    public Entrada actualizarEntradas(@RequestBody Entrada entrada) {
        return entradaServiceImpl.crearEntradas(entrada);
    }

    @DeleteMapping("/{id}")
    public void Deleteentrada(@PathVariable int id) {
        this.entradaServiceImpl.eliminarEntrada(id);
    }
}
