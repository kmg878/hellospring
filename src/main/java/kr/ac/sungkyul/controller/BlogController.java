package kr.ac.sungkyul.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/blog/*")
public class BlogController {
	
	@ResponseBody
	@RequestMapping
	public String list(
//			HttpServletRequest request,
			@RequestParam("p") int page,
			@RequestParam("n") String name){
		
//		String p = request.getParameter("p");
		System.out.println("page : "+page+" name:"+name);
		return "BlogController:list()";
	}
	@ResponseBody
	@RequestMapping
	public String add(){
		common();
		return "BlogController:add()";
	}
	

	public void common(){
		System.out.println("common() called");
	}


}
