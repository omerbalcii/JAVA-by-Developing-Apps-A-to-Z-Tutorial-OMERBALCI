package com.folksdev.bookstore.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.folksdev.bookstore.Repository.IOrderRepository;
import com.folksdev.bookstore.model.Book;
import com.folksdev.bookstore.model.Order;

@Service
public class OrderService {
    
    private final BookService bookservice;
    private final IOrderRepository orderRepository;

	private final Logger logger = LoggerFactory.getLogger(OrderService.class);


    public OrderService(BookService bookservice, IOrderRepository orderRepository) {
		
		this.bookservice = bookservice;
		this.orderRepository = orderRepository;
	}


    public Order putAnOrder(List<Integer> bookIdList, String username) {
       
    	List<Optional<Book>> bookList = bookIdList.stream()
                .map(bookservice::findBookById)
                .collect(Collectors.toList());

        Double totalPrice = bookList.stream()
                .map(optionalBook -> optionalBook.map(Book::getPrice).orElse(0.0))
                .reduce(0.0, Double::sum);

        Order order = Order.builder().bookList(bookIdList).totalPrice(totalPrice).username(username).build();
        return orderRepository.save(order);
        

        
    }
}
