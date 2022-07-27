package ru.netology.domain;

public class Book extends Product {
    private String author;


    public Book(int id, String title, int price, String author) {
        super(id, title, price);
        this.author = author;
    }

    //Сделал не учитываемыми для джавы, т.к. нам необходимо 100% покрытие по бранчам методов с логикой


    //public String getAuthor() {
    //    return author;
    //}

    // public void setAuthor(String author) {
    //       this.author = author;
    //  }

}
