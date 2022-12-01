package com.Pajates.electricidadChispas.Domain.models;

public class Invoice{

    private Integer idInvoice;
    private String date;
    private Client client;
    private Products_Service producto;
    private Products_Service servicio;
    private Integer baseImponible;
    private Integer total;
    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setClient(Society client) {
        this.client = client;
    }

    public void setClient(Autonomus client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setProducto(Products_Service producto) {
        this.producto = producto;
    }

    public Products_Service getProducto() {
        return producto;
    }

    public void setServicio(Products_Service servicio) {
        this.servicio = servicio;
    }

    public Products_Service getServicio() {
        return servicio;
    }

    public void setBaseImponible(Integer baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Integer getBaseImponible() {
        return baseImponible;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }
}
