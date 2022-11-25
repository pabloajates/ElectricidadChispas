package com.Pajates.electricidadChispas;

public class Invoice{

    private Integer idInvoice;
    private String date;
    private Client client;
    private Products_Service productsService;
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

    public void setProductsService(Product productsService) {
        this.productsService = productsService;
    }

    public Products_Service getProductsService() {
        return productsService;
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
