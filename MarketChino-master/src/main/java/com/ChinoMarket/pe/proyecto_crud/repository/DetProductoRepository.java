package com.ChinoMarket.pe.proyecto_crud.repository;

import com.ChinoMarket.pe.proyecto_crud.entities.DetProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface DetProductoRepository extends JpaRepository<DetProducto, Long> {
    // Métodos personalizados si es necesario
    List<DetProducto> findByProductoId(Long productoId);
}
