package com.bambooJohn.book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bambooJohn.book.dao.BookDao;
import com.bambooJohn.book.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Transactional
	@Override
	public void buyBook(String bid, String uid) {
		// TODO Auto-generated method stub
		Integer price = bookDao.selectPrice(bid);
		bookDao.updateSt(bid);
		bookDao.updateBalance(uid, price);
	}

}
