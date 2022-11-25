package com.Pajates.electricidadChispas;

public class Invoice {

    private Integer idInvoice;
    private String date;
    private String client;
    private String product;
    private String service;
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
        this.client = String.valueOf(client);
    }

    public void setClient(Autonomus client) {
        this.client = String.valueOf(client);
    }

    public String getClient() {
        return client;
    }

    public void setProduct(Product product) {
        this.product = String.valueOf(product);
    }

    public String getProduct() {
        return product;
    }

    public void setService(Service service) {
        this.service = String.valueOf(service);
    }

    public String getService() {
        return service;
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
