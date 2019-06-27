package com.fengjunbang.fbs.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengjunbang.fbs.service.RandomService;

@Controller
public class RandomController {

	@Autowired
	@Qualifier("randomService")
	private RandomService randomService;
	
	
	@RequestMapping("list")
	public String list() {
		
		return "list";
	}
	
	
	@RequestMapping("res")
	@ResponseBody
	public String res(HttpServletRequest request) {
		
		String random = randomService.random();
		
		request.getSession().setAttribute("ran", random);
		
		return random;
	}
}
