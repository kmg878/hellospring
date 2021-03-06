package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//매소드 방식
@Controller
@RequestMapping("/board")
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/list")
	public String list(){
		return "BoardController:list()";
	}
	
	@ResponseBody
	@RequestMapping(value="/write",method = RequestMethod.GET)
	public String writeForm(){
		return "BoardController :writeForm()";
	}
	
	@ResponseBody
	@RequestMapping(value="/write",method = RequestMethod.POST)
	public String wrtie(){
		return "BoardController:write()";
	}
	
	@ResponseBody
	@RequestMapping("/view")
	public String view( @RequestParam (value="no",required=false, defaultValue = "-1") Long no ){
		System.out.println(no);
		return "BoardController:view"+no;
	}
	
	@ResponseBody
	@RequestMapping("/delete/{no}")
	public String delete( @PathVariable("no") Long no ){
		System.out.println(no);
		return "BoardController:view"+no;
	}
	
	

}
