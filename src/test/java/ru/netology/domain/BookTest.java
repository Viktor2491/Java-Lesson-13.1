package ru.netology.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BookTest {

    Book book1 = new Book(1, "Война и мир", 250, "Лев Толстой");
    Book book2 = new Book(2, "Идиот", 300, "Федор Достоевский");
    Book book3 = new Book(3, "Мертвые души", 350, "Николай Гоголь");

    @Test
    public void shouldFindTitle() {
        boolean actual = book1.matches("Война и мир");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotFindTitle(){
        boolean actual = book1.matches("Колобок");
        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldFindAuthor(){
        boolean actual = book1.matches("Лев Толстой");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotFindAuthor(){
        boolean actual = book1.matches("Сергей Есенин");
        Assertions.assertFalse(actual);
    }
}
