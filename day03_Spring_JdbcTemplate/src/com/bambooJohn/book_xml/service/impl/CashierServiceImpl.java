package com.bambooJohn.book_xml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bambooJohn.book.dao.BookDao;
import com.bambooJohn.book.service.BookService;
import com.bambooJohn.book.service.Cashier;


@Service
public class CashierServiceImpl implements Cashier {

	@Autowired
	private BookService bookService;
	
	@Override
	public void checkOut(String uid, List<String> bids) {
		// TODO Auto-generated method stub
		for(String bid : bids) {
			bookService.buyBook(bid, uid);
		}
	}

}
