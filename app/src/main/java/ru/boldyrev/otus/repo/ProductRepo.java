package ru.boldyrev.otus.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.boldyrev.otus.model.Product;

public interface ProductRepo  extends JpaRepository<Product, Long> {
}
