package com.museo.gestion_entradas.services.implementations;

import com.museo.gestion_entradas.entities.Producto;
import com.museo.gestion_entradas.entities.Usuario;
import com.museo.gestion_entradas.repository.ProductoRepository;
import com.museo.gestion_entradas.services.ProductoService;
import com.museo.gestion_entradas.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productoServiceImpl")
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(int id) {productoRepository.deleteById(id);}

}
