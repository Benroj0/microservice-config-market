package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "envio")
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación ManyToOne (Cada Envio pertenece a un Producto)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPro", referencedColumnName = "IdPro")
    private Producto producto; // Referencia a Producto
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // Otros atributos
    private String direccion;
    private String estado;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
