package com.museo.gestion_entradas.controller;

import com.museo.gestion_entradas.entities.Comercio;
import com.museo.gestion_entradas.entities.Establecimiento;
import com.museo.gestion_entradas.services.implementations.EstablecimientoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/establecimiento")
public class EstablecimientoController {
    private EstablecimientoServiceImpl establecimientoServiceImpl;

    EstablecimientoController(EstablecimientoServiceImpl establecimientoServiceImpl) {
        this.establecimientoServiceImpl = establecimientoServiceImpl;
    }

    @GetMapping
    public List<Establecimiento> listarComercios() {
        return establecimientoServiceImpl.listarEstablecimiento();
    }

    @PostMapping
    public Establecimiento crearEstablecimiento(@RequestBody Establecimiento establecimiento) {
        return establecimientoServiceImpl.crearEstablecimiento(establecimiento);
    }

    @PutMapping
    public Establecimiento actualizarEstablecimiento(@RequestBody Establecimiento establecimiento) {
        return establecimientoServiceImpl.actualizarEstablecimiento(establecimiento);
    }

    @DeleteMapping("/{id}")
    public void DeleteEstablecimiento(@PathVariable int id) {
        this.establecimientoServiceImpl.eliminarEstablecimiento(id);
    }
}
