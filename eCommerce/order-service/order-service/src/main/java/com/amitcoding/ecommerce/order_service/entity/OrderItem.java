package com.amitcoding.ecommerce.order_service.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long productId;
    private Integer quantity;

    @ManyToOne()
    @JoinColumn(name = "order_id")
    private Orders order;
}
