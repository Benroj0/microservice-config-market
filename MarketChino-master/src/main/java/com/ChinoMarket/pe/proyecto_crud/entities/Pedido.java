package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdP;
    private Long Numpedido;
    private String EstPedido;
    private LocalDate FechaEmi;
    private Long TotalPago;
    private String TipoComprobante;
    private Long NumeroComprobante;
    private String MetodoPago;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "IdC", referencedColumnName = "id")
    private List<Cliente> cliente;

    public Long getIdP() {
        return IdP;
    }

    public void setIdP(Long idP) {
        IdP = idP;
    }

    public Long getNumpedido() {
        return Numpedido;
    }

    public void setNumpedido(Long numpedido) {
        Numpedido = numpedido;
    }

    public String getEstPedido() {
        return EstPedido;
    }

    public void setEstPedido(String estPedido) {
        EstPedido = estPedido;
    }

    public LocalDate getFechaEmi() {
        return FechaEmi;
    }

    public void setFechaEmi(LocalDate fechaEmi) {
        FechaEmi = fechaEmi;
    }

    public Long getTotalPago() {
        return TotalPago;
    }

    public void setTotalPago(Long totalPago) {
        TotalPago = totalPago;
    }

    public String getTipoComprobante() {
        return TipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        TipoComprobante = tipoComprobante;
    }

    public Long getNumeroComprobante() {
        return NumeroComprobante;
    }

    public void setNumeroComprobante(Long numeroComprobante) {
        NumeroComprobante = numeroComprobante;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        MetodoPago = metodoPago;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }
}
