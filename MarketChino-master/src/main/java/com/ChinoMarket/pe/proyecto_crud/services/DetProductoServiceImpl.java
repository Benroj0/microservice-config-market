package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.DetProducto;
import com.ChinoMarket.pe.proyecto_crud.repository.DetProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetProductoServiceImpl implements DetProductoService {

    @Autowired
    private DetProductoRepository detProductoRepository;

    @Override
    public DetProducto crearDetProducto(DetProducto detProducto) {
        return detProductoRepository.save(detProducto);
    }

    @Override
    public List<DetProducto> obtenerTodosLosDetProductos() {
        return detProductoRepository.findAll();
    }

    @Override
    public List<DetProducto> obtenerDetProductoPorProductoId(Long productoId) {
        return detProductoRepository.findByProductoId(productoId);
    }

    @Override
    public void eliminarDetProducto(Long id) {
        detProductoRepository.deleteById(id);
    }
}
