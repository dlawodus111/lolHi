package com.sbs.example.lolHi.controller.usr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {	
	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showmain() {
		return "안녕";
	}

	@RequestMapping("/usr/home/main2")
	@ResponseBody
	public String showmain2() {
		return "잘가";
	}

	@RequestMapping("/usr/home/main3")
	@ResponseBody
	public String showmain3() {
		return "또봐";
	}
	
	// usr/home/plus?a=10&b=20
	@RequestMapping("/usr/home/plus")
	@ResponseBody
	public int showplus(int a, int b) {
		return a+b;
	}
	
	@RequestMapping("/usr/home/minus")
	@ResponseBody
	public int showminus(int a, int b) {
		return a-b;
	}
	
	@RequestMapping("/usr/home/mul")
	@ResponseBody
	public int showmultiple(int a, int b) {
		return a*b;
	}
	
	@RequestMapping("/usr/home/div")
	@ResponseBody
	public int showdivide(int a, int b) {
		return a/b;
	}
}