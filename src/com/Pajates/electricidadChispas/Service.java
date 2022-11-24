package com.Pajates.electricidadChispas;

public class Service implements Products_Service{

    private Integer idService;
    private String name;
    private Integer price;
    private Integer ivaType;


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
        this.idService = idService;
    }

    @Override
    public Integer getId() {
        return idService;
    }
}
