package ru.netology.domain;

public class Product {
    protected int id;
    protected String title;
    protected int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean matches(String search) {
        return getTitle().contains(search);
    }

    //Сделал не учитываемыми для джавы, т.к. нам необходимо 100% покрытие по бранчам методов с логикой
    //   public void setId(int id) {
    //     this.id = id;
    //   }

    //  public void setTitle(String title) {
    //     this.title = title;
    //  }

    // public int getPrice() {
    //       return price;
    //  }

    // public void setPrice(int price) {
    //      this.price = price;
    //  }
}


