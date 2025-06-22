package com.ChinoMarket.pe.proyecto_crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ChinoMarket.pe.proyecto_crud.entities.UnidadesMedida;
import com.ChinoMarket.pe.proyecto_crud.repository.UnidadesMedidaRepository;
import com.ChinoMarket.pe.proyecto_crud.services.UnidadesMedidaService;

import java.util.List;

@Service
public class UnidadesMedidaServiceImpl implements UnidadesMedidaService {

    @Autowired
    private UnidadesMedidaRepository unidadesMedidaRepository;

    // Crear o actualizar una unidad de medida
    @Override
    public UnidadesMedida saveUnidadesMedida(UnidadesMedida unidadesMedida) {
        return unidadesMedidaRepository.save(unidadesMedida);
    }

    // Obtener una unidad de medida por ID
    @Override
    public UnidadesMedida getUnidadesMedidaById(Long id) {
        return unidadesMedidaRepository.findById(id).orElseThrow(() -> new RuntimeException("Unidad de medida no encontrada"));
    }

    // Obtener todas las unidades de medida
    @Override
    public List<UnidadesMedida> getAllUnidadesMedida() {
        return unidadesMedidaRepository.findAll();
    }

    // Eliminar una unidad de medida por ID
    @Override
    public void deleteUnidadesMedida(Long id) {
        unidadesMedidaRepository.deleteById(id);
    }
}
