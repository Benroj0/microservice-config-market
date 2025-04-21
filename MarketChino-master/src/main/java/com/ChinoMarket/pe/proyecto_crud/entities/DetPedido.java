package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "det_pedido")
public class DetPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDP;
    private Long cantidad;
    private Long precio;

    // Relación ManyToOne (Cada DetPedido pertenece a un Pedido)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdP", referencedColumnName = "IdP")  // Asegúrate de que 'IdP' en Pedido sea la clave primaria
    private Pedido pedido;  // Relación inversa con Pedido

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
