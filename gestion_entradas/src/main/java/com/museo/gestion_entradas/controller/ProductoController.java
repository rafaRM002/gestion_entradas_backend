package com.museo.gestion_entradas.controller;

import com.museo.gestion_entradas.entities.Producto;
import com.museo.gestion_entradas.services.implementations.ProductoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    private ProductoServiceImpl productoServiceImpl;

    ProductoController(ProductoServiceImpl productoServiceImpl) {
        this.productoServiceImpl = productoServiceImpl;
    }

    @GetMapping
    public List<Producto> ListarAlmacen() {
        return productoServiceImpl.listarProductos();
    }

    @PostMapping
        public Producto crearProducto(@RequestBody Producto producto) {
        return productoServiceImpl.crearProducto(producto);
    }

    @PutMapping
    public Producto actualizarProducto(@RequestBody Producto producto) {
        return productoServiceImpl.actualizarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void Deleteproducto(@PathVariable int id) {
        this.productoServiceImpl.eliminarProducto(id);
    }


}
