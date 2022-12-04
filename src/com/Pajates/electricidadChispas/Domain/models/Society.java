package com.Pajates.electricidadChispas.Domain.models;

public class Society implements Client {

    private String cif;
    private String enterpriseName;
    private String town;
    private String address;
    private String province;
    private String email;
    private String phone;

    @Override
    public Integer getId() {
        return Integer.valueOf(this.cif);
    }
    @Override
    public String getName() {
        return this.enterpriseName;
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

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}



