package com.ChinoMarket.pe.proyecto_crud.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdC;
    private String Nombres;
    private String Email;
    private String Password;
    private Long Celular;
    private String Direccion;

    public Long getIdC() {
        return IdC;
    }

    public void setIdC(Long idC) {
        IdC = idC;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Long getCelular() {
        return Celular;
    }

    public void setCelular(Long celular) {
        Celular = celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}


