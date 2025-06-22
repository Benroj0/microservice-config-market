package com.ChinoMarket.pe.proyecto_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ChinoMarket.pe.proyecto_crud.entities.UnidadesMedida;

public interface UnidadesMedidaRepository extends JpaRepository<UnidadesMedida, Long> {
    UnidadesMedida findByNombre(String nombre);
}
