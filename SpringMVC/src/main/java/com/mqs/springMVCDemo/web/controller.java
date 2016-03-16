package com.mqs.springMVCDemo.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mqs.springMVCDemo.entity.User;
import com.mqs.springMVCDemo.service.IUserService;

@Controller
@RequestMapping("/test/")
public class controller {
	
	@Resource
	private IUserService iUserService;
	
	@RequestMapping("goIndex.do")
	public String goIndex(Model model) {
		User user = this.iUserService.getUserById(1);
		model.addAttribute("user", user);
		return "index.jsp";
	}
}
