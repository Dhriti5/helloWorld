package com.devopssample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class FrontController{
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getHomeView(HttpServletRequest request) {
		StringBuffer str=new StringBuffer("test");
		str.append("string");
		String str1="An issue that represents something wrong in the code. If this has not broken yet, it will, and probably at the worst possible"+ "moment. This needs to be fixed. Yesterday.";	

		if(true){
			System.out.println(str1);
		}
		else{
            System.out.println(str);
		}
		ModelAndView model = new ModelAndView("home");
		return model;
	}

}
