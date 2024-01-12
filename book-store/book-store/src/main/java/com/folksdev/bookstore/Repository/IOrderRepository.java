package com.folksdev.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.folksdev.bookstore.model.Order;

public interface IOrderRepository extends JpaRepository<Order, Integer>{

	
}
