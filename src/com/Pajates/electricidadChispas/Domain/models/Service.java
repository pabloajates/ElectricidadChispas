package com.Pajates.electricidadChispas.Domain.models;

public class Service implements Products_Service {

    private Integer idService;
    private String name;
    private String price;
    private String ivaType;


    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public String getPrice() {

        return String.valueOf(this.price);
    }

    @Override
    public String getIvaType() {

        return this.ivaType;
    }


    @Override
    public Integer getId() {

        return this.idService;
    }

    public void setIdService(Integer idService) {
        this.idService = idService;
    }

    public void setName(String name) {
        this.name = String.valueOf(name);
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setIvaType(String ivaType) {
        this.ivaType = ivaType;
    }
}
