package com.ChinoMarket.pe.proyecto_crud.controllers;

import com.ChinoMarket.pe.proyecto_crud.entities.DetProducto;
import com.ChinoMarket.pe.proyecto_crud.services.DetProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalle-productos")
public class DetProductoController {

    @Autowired
    private DetProductoService detProductoService;

    @PostMapping
    public DetProducto crearDetProducto(@RequestBody DetProducto detProducto) {
        return detProductoService.crearDetProducto(detProducto);
    }

    @GetMapping
    public List<DetProducto> obtenerTodosLosDetProductos() {
        return detProductoService.obtenerTodosLosDetProductos();
    }

    @GetMapping("/producto/{productoId}")
    public List<DetProducto> obtenerDetProductoPorProductoId(@PathVariable Long productoId) {
        return detProductoService.obtenerDetProductoPorProductoId(productoId);
    }

    @DeleteMapping("/{id}")
    public void eliminarDetProducto(@PathVariable Long id) {
        detProductoService.eliminarDetProducto(id);
    }
}
