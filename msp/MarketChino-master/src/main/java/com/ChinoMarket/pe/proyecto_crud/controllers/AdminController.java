package com.ChinoMarket.pe.proyecto_crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ChinoMarket.pe.proyecto_crud.entities.Admin;
import com.ChinoMarket.pe.proyecto_crud.services.AdminService;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Crear un nuevo administrador
    @PostMapping
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminService.saveAdmin(admin);
    }

    // Obtener un administrador por nombre de usuario
    @GetMapping("/get/{username}")
    public Admin getAdminByUsername(@PathVariable String username) {
        return adminService.getAdminByUsername(username);
    }

    // Actualizar un administrador
    @PutMapping("/update/{id}")
    public Admin updateAdmin(@PathVariable Long id, @RequestBody Admin adminDetails) {
        return adminService.updateAdmin(id, adminDetails);
    }

    // Eliminar un administrador
    @DeleteMapping("/delete/{id}")
    public void deleteAdmin(@PathVariable Long id) {
        adminService.deleteAdmin(id);
    }

    // Obtener todos los administradores
    @GetMapping
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }
}
