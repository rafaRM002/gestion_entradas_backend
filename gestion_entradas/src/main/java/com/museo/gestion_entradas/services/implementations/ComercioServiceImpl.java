package com.museo.gestion_entradas.services.implementations;

import com.museo.gestion_entradas.entities.Comercio;
import com.museo.gestion_entradas.entities.Entrada;
import com.museo.gestion_entradas.entities.Ventas;
import com.museo.gestion_entradas.repository.ComercioRepository;
import com.museo.gestion_entradas.repository.EntradaRepository;
import com.museo.gestion_entradas.repository.VentasRepository;
import com.museo.gestion_entradas.services.ComercioService;
import com.museo.gestion_entradas.services.EntradaService;
import com.museo.gestion_entradas.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("comercioServiceImpl")
public class ComercioServiceImpl implements ComercioService {

    @Autowired
    private ComercioRepository comercioRepository;

    @Override
    public List<Comercio> listarComercios() {
        return comercioRepository.findAll();
    }

    @Override
    public Comercio crearComercio(Comercio comercio) {
        return comercioRepository.save(comercio);
    }

    @Override
    public Comercio actualizarComercio(Comercio comercio) {
        return comercioRepository.save(comercio);
    }

    @Override
    public void eliminarComercio(int id) {comercioRepository.deleteById(id);}

    @Override
    public List<Comercio> getComerciosByUsername(String username) {
        return comercioRepository.findAllByUsuarioUsername(username);
    }
}
