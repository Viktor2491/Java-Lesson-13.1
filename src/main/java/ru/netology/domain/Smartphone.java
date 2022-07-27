package ru.netology.domain;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String title, int price, String manufacturer) {
        super(id, title, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || getManufacturer().contains(search);
    }

    //Сделал не учитываемыми для джавы, т.к. нам необходимо 100% покрытие по бранчам методов с логикой
    //  public void setManufacturer(String manufacturer) {
    //     this.manufacturer = manufacturer;
    // }
}
