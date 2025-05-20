package com.museo.gestion_entradas.controller;


import com.museo.gestion_entradas.entities.Entrada;
import com.museo.gestion_entradas.entities.Extras;
import com.museo.gestion_entradas.services.implementations.EntradaServiceImpl;
import com.museo.gestion_entradas.services.implementations.ExtrasServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/extras")
public class ExtrasController {

    private ExtrasServiceImpl extrasServiceImpl;

    ExtrasController(ExtrasServiceImpl extrasServiceImpl) {
        this.extrasServiceImpl = extrasServiceImpl;
    }

    @GetMapping
    public List<Extras> ListarExtras() {
        return extrasServiceImpl.listarExtras();
    }

    @PostMapping
    public Extras crearExtra(@RequestBody Extras extras) {
        return extrasServiceImpl.crearExtras(extras);
    }

    @PutMapping
    public Extras actualizarExtra(@RequestBody Extras extras) {
        return extrasServiceImpl.actualizarExtras(extras);
    }

    @DeleteMapping("/{id}")
    public void DeleteExtra(@PathVariable int id) {
        this.extrasServiceImpl.eliminarExtras(id);
    }

}
