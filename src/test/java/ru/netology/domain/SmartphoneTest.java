package ru.netology.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SmartphoneTest {
    Smartphone smartphone1 = new Smartphone(4, "xiaomi mi A2", 12000, "Xiaomi Corporation");
    Smartphone smartphone2 = new Smartphone(5, "redmi note 11", 25000, "Xiaomi Corporation");

    @Test
    public void shouldFindTitle(){
        boolean actual = smartphone1.matches("xiaomi mi A2");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotFindTitle(){
        boolean actual = smartphone1.matches("Samsung");
        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldFindManufacturer(){
        boolean actual = smartphone1.matches("Xiaomi Corporation");
        Assertions.assertTrue(actual);
        }

    @Test
    public void shouldNotFindManufacturer(){
        boolean actual = smartphone1.matches("China");
        Assertions.assertFalse(actual);
        }

    }



