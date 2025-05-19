package com.museo.gestion_entradas.controller;

import com.museo.gestion_entradas.entities.Ventas;
import com.museo.gestion_entradas.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentasController {

    @Autowired
    private VentasService ventasService;

    // Obtener todos los usuarios
    @GetMapping
    public ResponseEntity<List<Ventas>> listarVentas() {
        List<Ventas> ventas = ventasService.listarVentas();
        return ResponseEntity.ok(ventas);
    }

    // Crear un nuevo usuario
    @PostMapping
    public ResponseEntity<Ventas> crearUsuario(@RequestBody Ventas ventas) {
        Ventas nuevaVenta = ventasService.crearVentas(ventas);
        return ResponseEntity.ok(nuevaVenta);
    }

    // Actualizar un usuario existente
    @PutMapping("/{id}")
    public ResponseEntity<Ventas> actualizarUsuario(@RequestBody Ventas ventas) {
        Ventas actualizado = ventasService.actualizarVentas(ventas);
        return ResponseEntity.ok(actualizado);
    }

    // Eliminar un usuario
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable int id) {
        ventasService.eliminarVentas(id);
        return ResponseEntity.noContent().build();
    }
}
