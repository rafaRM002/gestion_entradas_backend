package com.museo.gestion_entradas.services.implementations;


import com.museo.gestion_entradas.entities.Extras;
import com.museo.gestion_entradas.entities.ExtrasProductos;
import com.museo.gestion_entradas.repository.ExtrasProductosRepository;
import com.museo.gestion_entradas.services.ExtrasProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("extrasProductosServiceImpl")
public class ExtrasProductosServiceImpl implements ExtrasProductosService {

    @Autowired
    private ExtrasProductosRepository extrasProductosRepository;

    @Override
    public List<ExtrasProductos> listarExtrasProductos() {
        return extrasProductosRepository.findAll();
    }

    @Override
    public ExtrasProductos crearExtrasProductos(ExtrasProductos extrasProductos) {
        return extrasProductosRepository.save(extrasProductos);
    }

    @Override
    public ExtrasProductos actualizarExtrasProductos(ExtrasProductos extrasProductos) {
        return extrasProductosRepository.save(extrasProductos);
    }

    @Override
    public void eliminarExtrasProductos(int id) {extrasProductosRepository.deleteById(id);}

}
