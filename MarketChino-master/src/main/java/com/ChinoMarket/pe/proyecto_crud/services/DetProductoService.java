package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.DetProducto;

import java.util.List;

public interface DetProductoService {
    DetProducto crearDetProducto(DetProducto detProducto);
    List<DetProducto> obtenerTodosLosDetProductos();
    List<DetProducto> obtenerDetProductoPorProductoId(Long productoId);
    void eliminarDetProducto(Long id);
}
