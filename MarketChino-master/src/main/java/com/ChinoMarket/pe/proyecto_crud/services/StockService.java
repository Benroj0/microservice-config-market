package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Stock;

import java.util.List;

public interface StockService {
    Stock crearDetProducto(Stock detProducto);
    List<Stock> obtenerTodosLosDetProductos();
    List<Stock> obtenerDetProductoPorProductoId(Long productoId);
    void eliminarDetProducto(Long id);
}
