package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.UnidadesMedida;

import java.util.List;

public interface UnidadesMedidaService {

    // Crear o actualizar una unidad de medida
    UnidadesMedida saveUnidadesMedida(UnidadesMedida unidadesMedida);

    // Obtener una unidad de medida por ID
    UnidadesMedida getUnidadesMedidaById(Long id);

    // Obtener todas las unidades de medida
    List<UnidadesMedida> getAllUnidadesMedida();

    // Eliminar una unidad de medida por ID
    void deleteUnidadesMedida(Long id);
}
