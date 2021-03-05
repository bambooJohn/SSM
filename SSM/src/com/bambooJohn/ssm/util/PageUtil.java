package com.bambooJohn.ssm.util;

import javax.servlet.http.HttpServletRequest;

import com.bambooJohn.ssm.bean.Emp;
import com.github.pagehelper.PageInfo;

/*
 * 首页  上一页  1  2  3  4  5  下一页  尾页
 * 
 * 
 */
public class PageUtil {

	public static String getPageInfo(PageInfo<Emp> pageInfo,HttpServletRequest request) {
		
		String path = request.getContextPath() + "/";
	//	String path = "";
		StringBuilder builder = new StringBuilder("<a href='" + path + "emps/1'>首页</a>");
		builder.append("&nbsp;&nbsp;");
		if(pageInfo.isHasPreviousPage()) {
			builder.append("<a href='" + path + "emps/" + pageInfo.getPrePage() + "'>上一页</a>");
			builder.append("&nbsp;&nbsp;");
		}else {
			builder.append("<a>上一页</a>");
			builder.append("&nbsp;&nbsp;");
		}
		
		int[] nums = pageInfo.getNavigatepageNums();
		for (int i : nums) {
			if(i == pageInfo.getPageNum()) {
				builder.append("<a style='color:red;' href='" + path + "emps/" + i + "'>" + i + "</a>");
				builder.append("&nbsp;&nbsp;");
			}else {
				builder.append("<a href='" + path + "emps/" + i + "'>" + i + "</a>");
				builder.append("&nbsp;&nbsp;");
			}
		}
		
		
		if(pageInfo.isHasNextPage()) {
			builder.append("<a href='" + path + "emps/" + pageInfo.getNextPage() + "'>下一页</a>");
			builder.append("&nbsp;&nbsp;");
		}else {
			builder.append("<a>下一页</a>");
			builder.append("&nbsp;&nbsp;");
		}
		
		builder.append("<a href='" + path + "emps/" + pageInfo.getPages() + "'>尾页</a>");
		return builder.toString();
	}
	
}
