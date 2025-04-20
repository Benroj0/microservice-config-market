package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "detPedido")
public class DetPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idDP;
    private Long Cantidad;
    private Long Precio_U;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "IdP", referencedColumnName = "IdP")
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "IdPro", referencedColumnName = "IdPro")
    private Producto producto;

    public Long getIdDP() {
        return idDP;
    }

    public void setIdDP(Long idDP) {
        this.idDP = idDP;
    }

    public Long getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Long cantidad) {
        Cantidad = cantidad;
    }

    public Long getPrecio_U() {
        return Precio_U;
    }

    public void setPrecio_U(Long precio_U) {
        Precio_U = precio_U;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}