package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

public class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "Война и мир", 250, "Лев Толстой");
    Product book2 = new Book(2, "Идиот", 300, "Федор Достоевский");
    Product book3 = new Book(3, "Мертвые души", 350, "Николай Гоголь");
    Product smartphone1 = new Smartphone(4, "xiaomi mi A2", 12000, "Xiaomi Corporation");
    Product smartphone2 = new Smartphone(5, "redmi note 11", 25000, "Xiaomi Corporation");

    @BeforeEach
    public void SetUp() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
    }

    @Test
    //добавление нового продукта
    public void shouldAddProduct() {
        Smartphone smartphone3 = new Smartphone(6, "Iphone", 50000, "Apple");
        manager.add(smartphone3);
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3};
        Product[] actual = manager.findAll();
    }

    @Test
    //поиск всех добавленных товаров
    public void shouldFindAllTitleProducts() {
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2};
        Product[] actual = manager.searchByTitle("");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    //поиск по названию смартфона
    public void shouldFindTitleSmartphone() {
        Product[] expected = {smartphone1};
        Product[] actual = manager.searchByTitle("xiaomi mi A2");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    //не должен искать товар по названию,которой не добавлен
    public void shouldNotFindTitleSmartphone() {
        Product[] expected = {};
        Product[] actual = manager.searchByTitle("Samsung");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    //не должен искать товар с ошибкой  в названии
    public void shouldNotFindTitleSmartphone2() {
        Product[] expected = {};
        Product[] actual = manager.searchByTitle("readmi note 11");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    //поиск по назваанию книги
    public void shouldFindTitleBook() {
        Product[] expected = {book1};
        Product[] actual = manager.searchByTitle("Война и мир");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    //не должен искать книгу по названию, которая не добавлена
    public void shouldNotFindTitleBook() {
        Product[] expected = {};
        Product[] actual = manager.searchByTitle("Колобок");
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    //не должен искать книгу с ошибкой  в названии
    public void shouldNotFindTitleBook2() {
        Product[] expected = {};
        Product[] actual = manager.searchByTitle("Мертвые в душе");
        Assertions.assertArrayEquals(expected, actual);
    }


}
