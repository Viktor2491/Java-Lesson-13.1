package ru.netology.manager;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repo;


    public ProductManager(ProductRepository repo) {
        this.repo = repo;
    }


    public void add(Product product) {
        repo.save(product);
    }

    public Product[] findAll() {
        return repo.getProducts();
    }

    public Product[] searchByTitle(String text) {
        Product[] result = new Product[0];
        for (Product product : repo.getProducts()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    //При проверке на соответствие запросу товару мы проверяем вхождение запроса в текст НАЗВАНИЯ товара.
    public boolean matches(Product product, String search) {
        if (product.getTitle().contains(search)) {
            return true;
        } else {
            return false;
        }

    }
}






