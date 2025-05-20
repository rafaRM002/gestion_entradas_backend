package com.museo.gestion_entradas.services.implementations;

import com.museo.gestion_entradas.entities.Comercio;
import com.museo.gestion_entradas.entities.Extras;
import com.museo.gestion_entradas.repository.ComercioRepository;
import com.museo.gestion_entradas.repository.ExtrasRepository;
import com.museo.gestion_entradas.services.ComercioService;
import com.museo.gestion_entradas.services.ExtrasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("extrasServiceImpl")
public class ExtrasServiceImpl implements ExtrasService {

    @Autowired
    private ExtrasRepository extrasRepository;

    @Override
    public List<Extras> listarExtras() {
        return extrasRepository.findAll();
    }

    @Override
    public Extras crearExtras(Extras extras) {
        return extrasRepository.save(extras);
    }

    @Override
    public Extras actualizarExtras(Extras extras) {
        return extrasRepository.save(extras);
    }

    @Override
    public void eliminarExtras(int id) {extrasRepository.deleteById(id);}

}