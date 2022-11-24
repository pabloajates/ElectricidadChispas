package com.Pajates.electricidadChispas;

public class Society implements Client {

    private String cif;
    private String enterpriseName;
    private String town;
    private String address;
    private String province;
    private String email;
    private String phone;

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return getAddress();
    }

    @Override
    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String getTown() {
        return getTown();
    }

    @Override
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String getProvince() {
        return getProvince();
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return getEmail();
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getPhone() {
        return getPhone();
    }
}
