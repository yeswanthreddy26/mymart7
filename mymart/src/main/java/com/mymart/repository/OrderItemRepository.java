package com.mymart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mymart.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
