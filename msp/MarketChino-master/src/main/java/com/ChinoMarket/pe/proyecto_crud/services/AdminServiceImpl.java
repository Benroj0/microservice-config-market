package com.ChinoMarket.pe.proyecto_crud.services.impl;

import com.ChinoMarket.pe.proyecto_crud.entities.Admin;
import com.ChinoMarket.pe.proyecto_crud.repository.AdminRepository;
import com.ChinoMarket.pe.proyecto_crud.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Guardar un nuevo admin
    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Obtener un admin por nombre de usuario
    @Override
    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    // Actualizar un admin
    @Override
    public Admin updateAdmin(Long id, Admin adminDetails) {
        Admin admin = adminRepository.findById(id).orElseThrow(() -> new RuntimeException("Admin not found"));
        admin.setUsername(adminDetails.getUsername());
        admin.setEmail(adminDetails.getEmail());
        // El rol no cambia, ya que es fijo en "ADMIN"
        return adminRepository.save(admin);
    }

    // Eliminar un administrador
    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    // Obtener todos los administradores
    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
}
