package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idP;
    private Long numpedido;
    private String estPedido;
    private LocalDate fechaEmi;
    private Long totalPago;
    private String tipoComprobante;
    private Long numeroComprobante;
    private String metodoPago;
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "idC", referencedColumnName = "idC")
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

    public String getEstPedido() {
        return estPedido;
    }

    public void setEstPedido(String estPedido) {
        this.estPedido = estPedido;
    }

    public LocalDate getFechaEmi() {
        return fechaEmi;
    }

    public void setFechaEmi(LocalDate fechaEmi) {
        this.fechaEmi = fechaEmi;
    }

    public Long getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Long totalPago) {
        this.totalPago = totalPago;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public Long getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(Long numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
