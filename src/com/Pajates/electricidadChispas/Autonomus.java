package com.Pajates.electricidadChispas;

public class Autonomus implements Client{

    private String dni;
    private String name;
    private String surname;
    private String address;
    private String town;
    private String province;
    private String email;
    private String phone;



    @Override
    public String getId() {
        return this.dni;
    }
    @Override
    public String getName() {
        return this.name +" " +surname;
    }
    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getTown() {
        return this.town;
    }

    @Override
    public String getProvince() {
        return this.province;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
    @Override
    public String getPhone() {
        return this.phone;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
