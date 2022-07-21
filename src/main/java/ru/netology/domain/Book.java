package ru.netology.domain;

public class Book extends Product {
    private String author;


    public Book(int id, String title, int price, String author) {
        super(id, title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // public void setAuthor(String author) {
    //       this.author = author;
    //  }
    @Override
    public boolean matches(String search) {
        return super.matches(search) || getAuthor().contains(search);
    }
    // public boolean matches(String searchBy) {
    //  if (super.matches(searchBy)) {
    //   Book book = (Book)
    //   if (book.getTitle().contains(searchBy)) {
    //     return true;
    // }
    // if (book.getAuthor().contains(searchBy)) {
    //       return true;
    //  }

    // }return super.matches(searchBy) || getAuthor().contains(searchBy);
    // }
    // return false;
}

