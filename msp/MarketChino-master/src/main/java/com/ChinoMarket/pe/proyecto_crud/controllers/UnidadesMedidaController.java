package com.ChinoMarket.pe.proyecto_crud.controllers;

import com.ChinoMarket.pe.proyecto_crud.entities.UnidadesMedida;
import com.ChinoMarket.pe.proyecto_crud.services.UnidadesMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidades-medida")
public class UnidadesMedidaController {

    @Autowired
    private UnidadesMedidaService unidadesMedidaService;

    // Crear o actualizar una unidad de medida
    @PostMapping("/create")
    public UnidadesMedida createUnidadesMedida(@RequestBody UnidadesMedida unidadesMedida) {
        return unidadesMedidaService.saveUnidadesMedida(unidadesMedida);
    }

    // Obtener una unidad de medida por ID
    @GetMapping("/get/{id}")
    public UnidadesMedida getUnidadesMedidaById(@PathVariable Long id) {
        return unidadesMedidaService.getUnidadesMedidaById(id);
    }

    // Obtener todas las unidades de medida
    @GetMapping("/all")
    public List<UnidadesMedida> getAllUnidadesMedida() {
        return unidadesMedidaService.getAllUnidadesMedida();
    }

    // Eliminar una unidad de medida por ID
    @DeleteMapping("/delete/{id}")
    public void deleteUnidadesMedida(@PathVariable Long id) {
        unidadesMedidaService.deleteUnidadesMedida(id);
    }
}
