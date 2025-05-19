package com.museo.gestion_entradas.controller;


import com.museo.gestion_entradas.entities.Entrada;
import com.museo.gestion_entradas.entities.LineaVenta;
import com.museo.gestion_entradas.services.implementations.EntradaServiceImpl;
import com.museo.gestion_entradas.services.implementations.LineaVentaServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lineaVenta")
public class LineaVentaController {
    private LineaVentaServiceImpl lineaVentaServiceImpl;

    LineaVentaController(LineaVentaServiceImpl lineaVentaServiceImpl) {
        this.lineaVentaServiceImpl = lineaVentaServiceImpl;
    }

    @GetMapping
    public List<LineaVenta> ListarEntradas() {
        return lineaVentaServiceImpl.listarLineasVenta();
    }

    @PostMapping
    public LineaVenta crearEntrada(@RequestBody LineaVenta lineaVenta) {
        return lineaVentaServiceImpl.crearLineaVenta(lineaVenta);
    }

    @PutMapping
    public LineaVenta actualizarEntradas(@RequestBody LineaVenta lineaVenta) {
        return lineaVentaServiceImpl.actualizarLineaVenta(lineaVenta);
    }

    @DeleteMapping("/{id}")
    public void Deleteentrada(@PathVariable int id) {
        this.lineaVentaServiceImpl.eliminarLineaVenta(id);
    }

}
