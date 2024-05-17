package com.mymart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymart.model.OrderItem;
import com.mymart.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	OrderItemRepository orderItemRepository;
	 public void saveOrderItem(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
    }
}
