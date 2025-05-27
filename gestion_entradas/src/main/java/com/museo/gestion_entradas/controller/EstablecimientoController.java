package com.museo.gestion_entradas.controller;

import com.museo.gestion_entradas.entities.Comercio;
import com.museo.gestion_entradas.entities.Establecimiento;
import com.museo.gestion_entradas.services.implementations.EstablecimientoServiceImpl;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/obtenerbycomercio/{comercio_id}")
    public ResponseEntity<List<Establecimiento>> getEstablecimientosByComercioId(@PathVariable("comercio_id") int comercioId) {
        List<Establecimiento> establecimientos = establecimientoServiceImpl.findAllByComercio_Id(comercioId);
        if (establecimientos.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204 si no hay resultados
        }
        return ResponseEntity.ok(establecimientos); // 200 OK con la lista
    }

}
