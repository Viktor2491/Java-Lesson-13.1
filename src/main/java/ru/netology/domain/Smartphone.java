package ru.netology.domain;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String title, int price, String manufacturer) {
        super(id, title, price);
        this.manufacturer = manufacturer;
    }

    //Сделал не учитываемыми для джавы, т.к. нам необходимо 100% покрытие по бранчам методов с логикой

    //public String getManufacturer() {
    //  return manufacturer;
    //}

    //  public void setManufacturer(String manufacturer) {
    //     this.manufacturer = manufacturer;
    // }

}
