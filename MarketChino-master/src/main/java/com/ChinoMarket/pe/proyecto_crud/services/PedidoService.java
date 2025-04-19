package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Pedido;

import java.util.List;

public interface PedidoService {
    Pedido crearPedido(Pedido pedido);
    List<Pedido> obtenerTodosLosPedidos();
    List<Pedido> obtenerPedidosPorClienteId(Long clienteId);
    List<Pedido> obtenerPedidosPorEstado(String estado);
    void eliminarPedido(Long id);
}
