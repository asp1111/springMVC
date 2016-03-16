package com.mqs.springMVCDemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test/")
public class controller {
	
	@RequestMapping("goIndex.do")
	public String goIndex() {
		return "index.jsp";
	}
}
