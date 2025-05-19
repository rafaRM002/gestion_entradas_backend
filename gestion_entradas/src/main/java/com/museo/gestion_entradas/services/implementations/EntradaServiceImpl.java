package com.museo.gestion_entradas.services.implementations;

import com.museo.gestion_entradas.entities.Entrada;
import com.museo.gestion_entradas.entities.Ventas;
import com.museo.gestion_entradas.repository.EntradaRepository;
import com.museo.gestion_entradas.repository.VentasRepository;
import com.museo.gestion_entradas.services.EntradaService;
import com.museo.gestion_entradas.services.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service("entradaServiceImpl")
    public class EntradaServiceImpl implements EntradaService {

        @Autowired
        private EntradaRepository entradaRepository;

        @Override
        public List<Entrada> listarEntradas() {
            return entradaRepository.findAll();
        }

        @Override
        public Entrada crearEntradas(Entrada entrada) {
            return entradaRepository.save(entrada);
        }

        @Override
        public Entrada actualizarEntrada(Entrada entrada) {
            return entradaRepository.save(entrada);
        }

        @Override
        public void eliminarEntrada(int id) {entradaRepository.deleteById(id);}

    }
