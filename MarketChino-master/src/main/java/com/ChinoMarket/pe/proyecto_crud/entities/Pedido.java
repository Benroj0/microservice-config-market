package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idP;
    private Long numpedido;
    private String estado;
    private LocalDate dechaEmi;
    private Long totalpago;
    private String tipocomprobante;
    private Long numerocomprobante;
    private String metodopago;

    // Relación OneToMany (Un Pedido puede tener muchos DetPedido)
    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetPedido> detallesPedido;  // Relación con DetPedido

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public Long getNumpedido() {
        return numpedido;
    }

    public void setNumpedido(Long numpedido) {
        this.numpedido = numpedido;
    }

    public LocalDate getDechaEmi() {
        return dechaEmi;
    }

    public void setDechaEmi(LocalDate dechaEmi) {
        this.dechaEmi = dechaEmi;
    }

    public Long getTotalpago() {
        return totalpago;
    }

    public void setTotalpago(Long totalpago) {
        this.totalpago = totalpago;
    }

    public String getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(String tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getNumerocomprobante() {
        return numerocomprobante;
    }

    public void setNumerocomprobante(Long numerocomprobante) {
        this.numerocomprobante = numerocomprobante;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public List<DetPedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetPedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
}

