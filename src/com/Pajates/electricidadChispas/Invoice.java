package com.Pajates.electricidadChispas;

public class Invoice{

    private Integer idInvoice;
    private String date;
    private Client client;
    private Products_Service product;
    private String baseImponible;

    private String total;
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

    public void setProduct(Product product) {
        this.product = product;
    }

    public Products_Service getProduct() {
        return product;
    }


    public void setBaseImponible(String baseImponible) {
        this.baseImponible = baseImponible;
    }

    public String getBaseImponible() {
        return baseImponible;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal() {
        return total;
    }
}
