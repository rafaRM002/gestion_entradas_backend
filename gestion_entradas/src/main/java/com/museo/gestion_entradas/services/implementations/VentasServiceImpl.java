package com.museo.gestion_entradas.services.implementations;

import com.museo.gestion_entradas.entities.Usuario;
import com.museo.gestion_entradas.entities.Ventas;
import com.museo.gestion_entradas.repository.VentasRepository;
import com.museo.gestion_entradas.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ventasServiceImpl")
public class VentasServiceImpl implements VentasService {

    @Autowired
    private VentasRepository ventasRepository;

    @Override
    public List<Ventas> listarVentas() {
        return ventasRepository.findAll();
    }

    @Override
    public Ventas crearVentas(Ventas ventas) {
        return ventasRepository.save(ventas);
    }

    @Override
    public Ventas actualizarVentas(Ventas ventas) {
        return ventasRepository.save(ventas);
    }

    @Override
    public void eliminarVentas(int id) {ventasRepository.deleteById(id);}

}
