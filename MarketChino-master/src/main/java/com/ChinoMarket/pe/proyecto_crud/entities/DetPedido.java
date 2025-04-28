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
    private Long cantidad;
    private Long precio;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdP", referencedColumnName = "IdP")
    private Pedido pedido;

    public Long getIdDP() {
        return idDP;
    }

    public void setIdDP(Long idDP) {
        this.idDP = idDP;
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
