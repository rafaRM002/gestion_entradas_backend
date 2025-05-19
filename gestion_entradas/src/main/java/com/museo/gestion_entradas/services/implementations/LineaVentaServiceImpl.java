package com.museo.gestion_entradas.services.implementations;

import com.museo.gestion_entradas.entities.LineaVenta;
import com.museo.gestion_entradas.repository.LineaVentaRepository;
import com.museo.gestion_entradas.repository.ProductoRepository;
import com.museo.gestion_entradas.services.LineaVentaService;
import com.museo.gestion_entradas.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("lineaVentaServiceImpl")
public class LineaVentaServiceImpl implements LineaVentaService {

    @Autowired
    private LineaVentaRepository lineaVentaRepository;

    @Override
    public List<LineaVenta> listarLineasVenta() {
        return lineaVentaRepository.findAll();
    }

    @Override
    public LineaVenta crearLineaVenta(LineaVenta lineaVenta) {
        return lineaVentaRepository.save(lineaVenta);
    }

    @Override
    public LineaVenta actualizarLineaVenta(LineaVenta lineaVenta) {
        return lineaVentaRepository.save(lineaVenta);
    }

    @Override
    public void eliminarLineaVenta(int id) {

    }
}
