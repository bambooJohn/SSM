package com.bambooJohn.book;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bambooJohn.book.controller.BookController;

public class BookTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("book.xml");
		
		BookController bookController = ac.getBean("bookController", BookController.class);
		
		bookController.buyBook();
		
	}
	
}
