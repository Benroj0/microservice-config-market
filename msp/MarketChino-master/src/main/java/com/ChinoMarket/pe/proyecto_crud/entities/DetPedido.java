package com.ChinoMarket.pe.proyecto_crud.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "det_pedido")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "pedido"})
public class DetPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDP;
    private Integer cantidad;
    private Long precioUnitario;

    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "IdPro")
    private Producto producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdP", referencedColumnName = "IdP")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "productounidad_id")
    private ProductoUnidad productoUnidad;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Long getIdDP() {
        return idDP;
    }

    public void setIdDP(Long idDP) {
        this.idDP = idDP;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Long getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public ProductoUnidad getProductoUnidad() {
        return productoUnidad;
    }

    public void setProductoUnidad(ProductoUnidad productoUnidad) {
        this.productoUnidad = productoUnidad;
    }
}
