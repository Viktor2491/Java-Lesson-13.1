package ru.netology.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

public class ProductRepositoryTest {
    ProductRepository repo = new ProductRepository();

    Product book1 = new Book(1, "Война и мир", 250, "Лев Толстой");
    Product book2 = new Book(2, "Идиот", 300, "Федор Достоевский");
    Product book3 = new Book(3, "Мертвые души", 350, "Николай Гоголь");
    Product smartphone1 = new Smartphone(4, "xiaomi mi A2", 12000, "Xiaomi Corporation");
    Product smartphone2 = new Smartphone(5, "redmi note 11", 25000, "Xiaomi Corporation");

    @BeforeEach
    public void SetUp() {
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);
    }

    @Test
    //удаление по ид
    public void shouldRemoveProductById() {
        repo.removeProductById(1);
        Product[] expected = {book2, book3, smartphone1, smartphone2};
        Product[] actual = repo.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    //показать весь список товаров
    public void shouldFindAllProducts() {
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2};
        Product[] actual = repo.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    //добавление нового продукта
    public void shouldAddProduct() {
        Smartphone smartphone3 = new Smartphone(6, "Iphone", 50000, "Apple");
        repo.save(smartphone3);
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2, smartphone3};
        Product[] actual = repo.getProducts();
    }
}
