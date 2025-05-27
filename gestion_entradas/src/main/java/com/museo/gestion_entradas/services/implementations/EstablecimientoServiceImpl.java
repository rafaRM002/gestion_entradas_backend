package com.museo.gestion_entradas.services.implementations;

import com.museo.gestion_entradas.entities.Comercio;
import com.museo.gestion_entradas.entities.Establecimiento;
import com.museo.gestion_entradas.entities.Extras;
import com.museo.gestion_entradas.repository.ComercioRepository;
import com.museo.gestion_entradas.repository.EstablecimientoRepository;
import com.museo.gestion_entradas.repository.ExtrasRepository;
import com.museo.gestion_entradas.repository.TipoRepository;
import com.museo.gestion_entradas.services.ComercioService;
import com.museo.gestion_entradas.services.EstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Service("EstablecimientoServiceImpl")
public class EstablecimientoServiceImpl implements EstablecimientoService {

    @Autowired
    private EstablecimientoRepository establecimientoRepository;
    @Autowired
    private ComercioRepository comercioRepository;

    @Override
    public List<Establecimiento> listarEstablecimiento() {
        return establecimientoRepository.findAll();
    }

    @Override
    public Establecimiento crearEstablecimiento(Establecimiento establecimiento) {
        return establecimientoRepository.save(establecimiento);
    }

    @Override
    public Establecimiento actualizarEstablecimiento(Establecimiento establecimiento) {
        return establecimientoRepository.save(establecimiento);
    }

    @Override
    public void eliminarEstablecimiento(int id) {establecimientoRepository.deleteById(id);}

    @Override
    public List<Establecimiento> findAllByComercio_Id(int idComercio) {
        // Obtener todos los establecimientos
        List<Establecimiento> todos = establecimientoRepository.findAll();

        // Filtrar manualmente los establecimientos cuyo comercio.id coincida con idComercio
        List<Establecimiento> filtrados = new ArrayList<>();
        for (Establecimiento e : todos) {
            if (e.getComercio() != null && e.getComercio().getId() == idComercio) {
                filtrados.add(e);
            }
        }
        return filtrados;
    }

}
