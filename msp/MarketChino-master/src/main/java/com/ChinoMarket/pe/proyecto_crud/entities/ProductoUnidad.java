package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "productounidad")
public class ProductoUnidad {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProductoUNidad;

    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "IdPro")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "idUnidades")
    private UnidadesMedida unidadesMedida;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Long getIdProductoUNidad() {
        return idProductoUNidad;
    }

    public void setIdProductoUNidad(Long idProductoUNidad) {
        this.idProductoUNidad = idProductoUNidad;
    }

    public UnidadesMedida getUnidadesMedida() {
        return unidadesMedida;
    }

    public void setUnidadesMedida(UnidadesMedida unidadesMedida) {
        this.unidadesMedida = unidadesMedida;
    }
}
