package ru.boldyrev.otus.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;


@Data
@Accessors(chain = true)
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    private String id;

    @Version
    private Long version;

    // Добавляем поле status типа OrderStatus
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

}
