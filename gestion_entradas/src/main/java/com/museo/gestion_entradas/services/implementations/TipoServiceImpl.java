package com.museo.gestion_entradas.services.implementations;

import com.museo.gestion_entradas.entities.Comercio;
import com.museo.gestion_entradas.entities.Tipo;
import com.museo.gestion_entradas.repository.ComercioRepository;
import com.museo.gestion_entradas.repository.TipoRepository;
import com.museo.gestion_entradas.services.ComercioService;
import com.museo.gestion_entradas.services.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tipoServiceImpl")
public class TipoServiceImpl implements TipoService {

    @Autowired
    private TipoRepository tipoRepository;

    @Override
    public List<Tipo> listarTipos() {
        return tipoRepository.findAll();
    }

    @Override
    public Tipo crearTipo(Tipo tipo) {
        return tipoRepository.save(tipo);
    }

    @Override
    public Tipo actualizarTipo(Tipo tipo) {
        return tipoRepository.save(tipo);
    }

    @Override
    public void eliminarTipo(int id) {tipoRepository.deleteById(id);}

}