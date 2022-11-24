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


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
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
