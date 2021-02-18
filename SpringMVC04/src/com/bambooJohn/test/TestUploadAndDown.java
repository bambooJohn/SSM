package com.bambooJohn.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	
/*	@RequestMapping(value="up",method=RequestMethod.POST)
	public String up(String desc,MultipartFile uploadFile,HttpSession session) throws IOException {
		
		String name = uploadFile.getName();
		System.out.println(name);
		String filename = uploadFile.getOriginalFilename();
		System.out.println(filename);
		String realPath = session.getServletContext().getRealPath("photo");
		String filePath = realPath + File.separator + filename;
		InputStream is = uploadFile.getInputStream();
		//File file = new File(filePath);
		FileOutputStream os = new FileOutputStream(filePath);
		int i =  0;
		byte[] b = new byte[1024];
		while((i = is.read(b)) != -1) {
			os.write(b, 0, i);
		}
		
		is.close();
		os.close();
		return "success";
	}*/
	
	@RequestMapping(value="up",method=RequestMethod.POST)
	public String up(String desc,MultipartFile[] uploadFile,HttpSession session) throws IOException {
		
		/*String name = uploadFile.getName();
		System.out.println(name);
		String filename = uploadFile.getOriginalFilename();
		System.out.println(filename);
		String realPath = session.getServletContext().getRealPath("photo");
		String filePath = realPath + File.separator;
		String realFilePath = filePath + UUID.randomUUID() + filename.substring(filename.lastIndexOf("."));
		File realFile = new File(realFilePath);
		
		uploadFile.transferTo(realFile);*/
	
		return "success";
	}
	
}
