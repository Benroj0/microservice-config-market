package com.ChinoMarket.pe.proyecto_crud.controllers;

import com.ChinoMarket.pe.proyecto_crud.entities.DetPedido;
import com.ChinoMarket.pe.proyecto_crud.services.DetPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalle-pedidos")
public class DetPedidoController {

    @Autowired
    private DetPedidoService detPedidoService;

    @PostMapping
    public DetPedido crearDetPedido(@RequestBody DetPedido detPedido) {
        return detPedidoService.crearDetPedido(detPedido);
    }

    @GetMapping
    public List<DetPedido> obtenerTodosLosDetPedidos() {
        return detPedidoService.obtenerTodosLosDetPedidos();
    }

    @GetMapping("/pedido/{pedidoId}")
    public List<DetPedido> obtenerDetPedidoPorPedidoId(@PathVariable Long pedidoId) {
        return detPedidoService.obtenerDetPedidoPorPedidoId(pedidoId);
    }

    @DeleteMapping("/{id}")
    public void eliminarDetPedido(@PathVariable Long id) {
        detPedidoService.eliminarDetPedido(id);
    }
}
