package com.javaproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
