package com.Pajates.electricidadChispas;

public class Service implements Products_Service{

    private int idService;
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

        return String.valueOf(this.ivaType);
    }


    @Override
    public int getId() {

        return this.idService;
    }

    public void setIdService(int idService) {
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
