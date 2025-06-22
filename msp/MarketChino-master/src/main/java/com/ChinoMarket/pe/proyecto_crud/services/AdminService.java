package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Admin;

import java.util.List;

public interface AdminService {

    // Crear un nuevo administrador
    Admin saveAdmin(Admin admin);

    // Obtener un administrador por nombre de usuario
    Admin getAdminByUsername(String username);

    // Actualizar un administrador
    Admin updateAdmin(Long id, Admin adminDetails);

    // Eliminar un administrador
    void deleteAdmin(Long id);

    // Obtener todos los administradores
    List<Admin> getAllAdmins();
}
