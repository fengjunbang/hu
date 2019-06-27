package com.fengjunbang.fbs.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fengjunbang.fbs.service.RanService;

@Controller
public class RandomController {

	@Autowired
	@Qualifier("ranService") 
	private RanService ranService;
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request) {  //获取密钥控制层
		String string = ranService.randoms();
		request.setAttribute("list", string);
		
		request.getSession().setAttribute("string", string);   //放到session中
		return "list";
	}
}
