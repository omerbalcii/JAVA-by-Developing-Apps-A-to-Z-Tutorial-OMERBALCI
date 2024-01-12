package com.folksdev.bookstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.folksdev.bookstore.dto.BookOrderRequest;
import com.folksdev.bookstore.model.Order;
import com.folksdev.bookstore.service.OrderService;

@RestController
@RequestMapping("/bookstore")
public class BookstoreController {
	
	private final OrderService orderService;
	
	public BookstoreController(OrderService orderService) 
	{
		this.orderService=orderService;
	}

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }

    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){
    	
    	Order order=orderService.putAnOrder(bookOrderRequest.getBookIdList(), bookOrderRequest.getUsername());
    	return ResponseEntity.ok(order);
    } 
        
    
}
