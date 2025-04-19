package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPro;
    private String Nombre;
    private String Desc;
    private String Imagen;
    private Long Cantidad;
    private Long Precio;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "IdC", referencedColumnName = "id")
    private Long IdC;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "IdCat", referencedColumnName = "id")
    private Long IdCat;

    public Long getIdPro() {
        return IdPro;
    }

    public void setIdPro(Long idPro) {
        IdPro = idPro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public Long getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Long cantidad) {
        Cantidad = cantidad;
    }

    public Long getPrecio() {
        return Precio;
    }

    public void setPrecio(Long precio) {
        Precio = precio;
    }

    public Long getIdC() {
        return IdC;
    }

    public void setIdC(Long idC) {
        IdC = idC;
    }

    public Long getIdCat() {
        return IdCat;
    }

    public void setIdCat(Long idCat) {
        IdCat = idCat;
    }
}
