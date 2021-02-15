package com.bambooJohn.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestUploadAndDown {

	@RequestMapping("/down")
	@ResponseBody
	public ResponseEntity<byte[]> down(HttpSession session) throws Exception{
		//获取文件下载路径
		String realPath = session.getServletContext().getRealPath("img");
		
		realPath = realPath + File.separator + "mn.jpg";
		
		System.out.println(realPath);
		
		FileInputStream io = new FileInputStream(realPath);
		//available():获取输入流所读取的文件的最大字节数
		byte[] b = new byte[io.available()];
		
		io.read(b);
		//设置请求头
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=abc.jpg");
		//设置响应状态
		HttpStatus statusCode = HttpStatus.OK;
		
		ResponseEntity<byte[]> entity = new ResponseEntity<>(b, headers, statusCode);
		
		return entity;
		
	}
	
}
