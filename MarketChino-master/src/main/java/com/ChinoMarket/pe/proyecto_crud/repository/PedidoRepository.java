package com.ChinoMarket.pe.proyecto_crud.repository;

import com.ChinoMarket.pe.proyecto_crud.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByClienteId(Long clienteId);
    List<Pedido> findByEstado(String estado);  // Ejemplo: buscar pedidos por estado
}
