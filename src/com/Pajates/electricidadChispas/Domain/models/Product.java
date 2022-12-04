package com.Pajates.electricidadChispas.Domain.models;

public class Product implements Products_Service {

    private Integer idProduct;
    private String name;
    private String brand;
    private String model;
    private String price;
    private String ivaType;


    @Override
    public String getName() {

        return this.name +"" +brand +"" +model;
    }

    @Override
    public String getPrice() {

        return this.price;
    }


    @Override
    public String getIvaType() {

        return this.ivaType;
    }

    @Override
    public Integer getId() {
        return this.idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setIvaType(String ivaType) {
        this.ivaType = ivaType;
    }
}


