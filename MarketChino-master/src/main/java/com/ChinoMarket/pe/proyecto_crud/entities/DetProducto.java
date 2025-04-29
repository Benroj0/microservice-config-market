package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "det_producto")
public class DetProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdPro", referencedColumnName = "IdPro")
    private Producto producto;
    private Long cantidad;
    private Long precio;

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

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }
}
