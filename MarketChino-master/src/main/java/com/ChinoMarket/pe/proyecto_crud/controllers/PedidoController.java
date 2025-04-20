package com.ChinoMarket.pe.proyecto_crud.controllers;

import com.ChinoMarket.pe.proyecto_crud.entities.Pedido;
import com.ChinoMarket.pe.proyecto_crud.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        return pedidoService.crearPedido(pedido);
    }

    @GetMapping
    public List<Pedido> obtenerTodosLosPedidos() {
        return pedidoService.obtenerTodosLosPedidos();
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Pedido> obtenerPedidosPorClienteId(@PathVariable Long clienteId) {
        return pedidoService.obtenerPedidosPorClienteId(clienteId);
    }

    @GetMapping("/estado/{estado}")
    public List<Pedido> obtenerPedidosPorEstado(@PathVariable String estado) {
        return pedidoService.obtenerPedidosPorEstado(estado);
    }

    @DeleteMapping("/{id}")
    public void eliminarPedido(@PathVariable Long id) {
        pedidoService.eliminarPedido(id);
    }
}
