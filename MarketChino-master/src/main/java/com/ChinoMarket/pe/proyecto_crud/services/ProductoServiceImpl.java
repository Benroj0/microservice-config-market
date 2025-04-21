package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Categoria;
import com.ChinoMarket.pe.proyecto_crud.entities.Producto;
import com.ChinoMarket.pe.proyecto_crud.repository.ProductoRepository;
import com.ChinoMarket.pe.proyecto_crud.repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto obtenerProductoPorNombre(String nombre) {
        return productoRepository.findByNombre(nombre);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Producto actualizarProducto(Long id, Producto productoActualizado) {
        Optional<Producto> optionalProducto = productoRepository.findById(id);
        if (optionalProducto.isPresent()) {
            Producto productoExistente = optionalProducto.get();

            productoExistente.setNombre(productoActualizado.getNombre());
            productoExistente.setDescripcion(productoActualizado.getDescripcion());
            productoExistente.setImagen(productoActualizado.getImagen());
            productoExistente.setCantidad(productoActualizado.getCantidad());
            productoExistente.setPrecio(productoActualizado.getPrecio());

            //ACTUALZIAR CATEGRIA
            if (productoActualizado.getCategoria() != null) {
                Categoria categoriaExistente = categoriaRepository.findById(productoActualizado.getCategoria().getIdCat())
                        .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
                productoExistente.setCategoria(categoriaExistente);
            }


            return productoRepository.save(productoExistente);
        }
        return null;
    }
}