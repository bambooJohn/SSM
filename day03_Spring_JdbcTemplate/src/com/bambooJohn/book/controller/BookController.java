package com.bambooJohn.book.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bambooJohn.book.service.BookService;
import com.bambooJohn.book.service.Cashier;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private Cashier cashier;
	
	public void buyBook() {
		bookService.buyBook("1", "1001");
	}
	
	public void checkOut() {
		List<String> bids = new ArrayList<String> ();
		bids.add("1");
		bids.add("2");
		String uid = "1001";
		cashier.checkOut(uid, bids);
	}
	
}
