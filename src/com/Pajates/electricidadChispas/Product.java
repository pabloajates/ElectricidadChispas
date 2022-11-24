package com.Pajates.electricidadChispas;

public class Product implements Products_Service{

    private Integer idProduct;
    private String name;
    private String brand;
    private String model;
    private Integer price;
    private Integer ivaType;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return getName();
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String getPrice() {
        return getPrice();
    }

    @Override
    public void setIvaType(Integer ivaType) {
        this.ivaType = ivaType;
    }

    @Override
    public Integer getIvaType() {
        return getIvaType();
    }

    @Override
    public void setId(Integer id) {
        this.idProduct = idProduct;
    }

    @Override
    public Integer getId() {
        return idProduct;
    }
}
