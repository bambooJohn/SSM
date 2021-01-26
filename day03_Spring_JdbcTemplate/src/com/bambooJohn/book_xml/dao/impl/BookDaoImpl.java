package com.bambooJohn.book_xml.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bambooJohn.book.dao.BookDao;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer selectPrice(String bid) {
		// TODO Auto-generated method stub
		String sql = "select price from book where bid = ?";
		Integer price = jdbcTemplate.queryForObject(sql, new Object[] {bid}, Integer.class);
		return price;
	}

	@Override
	public void updateSt(String bid) {
		// TODO Auto-generated method stub
		String sql1 = "select st from stock where sid = ?";
		Integer st = jdbcTemplate.queryForObject(sql1, new Object[] {bid}, Integer.class);
		
		if(st <= 0) {
			throw new RuntimeException();
		}else {
			String sql2 = "update stock set st = st - 1 where sid = ?";
			jdbcTemplate.update(sql2, bid);
		}
		
	}

	@Override
	public void updateBalance(String uid, Integer price) {
		// TODO Auto-generated method stub
		String sql = "select balance from money where uid = ?";
		Integer balance = jdbcTemplate.queryForObject(sql, new Object[] {uid}, Integer.class);
		if(balance < price) {
			throw new RuntimeException();
		}else {
			String sql2 = "update money set balance = balance - ? where uid = ?";
			jdbcTemplate.update(sql2, price,uid);
		}
	}

}
