package com.bambooJohn.book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bambooJohn.book.dao.BookDao;
import com.bambooJohn.book.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	/**
	 * @Transactional:对方法中所有的操作作为一个事务进行管理
	 * 在方法上使用，只对方法有效果
	 * 在类上使用，对类中所有方法都有效果
	 * @Transactional中可以设置的属性：
	 * propagation:A方法和B方法都有事务，当A在调用B时，会将A中的事务传播给B方法，B方法对于事务的处理方式就是事务的传播行为
	 * Propagation.REQUIRED:必须使用调用者的事务
	 * Propagation.REQUIRED_NEW:将调用者的事务挂起，不使用调用者的事务，使用新的事务进行处理
	 * isolation:
	 * 
	 * timeout:
	 * 
	 * readOnly:
	 * 
	 * rollbackFor|rollbackForClassName|noRollbackFor|noRollbackForCLassName
	 * 
	 */
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void buyBook(String bid, String uid) {
		// TODO Auto-generated method stub
		Integer price = bookDao.selectPrice(bid);
		bookDao.updateSt(bid);
		bookDao.updateBalance(uid, price);
	}

}
