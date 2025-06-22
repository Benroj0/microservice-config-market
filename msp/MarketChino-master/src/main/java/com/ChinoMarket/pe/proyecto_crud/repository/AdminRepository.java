package com.ChinoMarket.pe.proyecto_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ChinoMarket.pe.proyecto_crud.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Método para encontrar un administrador por su nombre de usuario
    Admin findByUsername(String username);
}