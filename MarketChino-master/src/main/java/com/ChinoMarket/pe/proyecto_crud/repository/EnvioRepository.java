package com.ChinoMarket.pe.proyecto_crud.repository;

import com.ChinoMarket.pe.proyecto_crud.entities.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EnvioRepository extends JpaRepository<Envio, Long> {
    // Métodos personalizados si es necesario
    List<Envio> findByClienteId(Long clienteId);
}
