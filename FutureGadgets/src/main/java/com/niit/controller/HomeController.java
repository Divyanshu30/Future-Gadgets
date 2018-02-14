package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.service.ProductService;

@Controller
public class HomeController {
@Autowired
ProductService productService;
	@RequestMapping(value= {"/", "/index"})
	public String homePage()
	{
		return "index";
	}
	@RequestMapping("/AboutUs")
	public String nextPage()
	{
		return "AboutUs";
		
	}
	@RequestMapping("/LogIn")
	public String Signin()
	{
		return "LogIn";
		
	}
	@RequestMapping("/SignUp")
	public String SignUp()
	{
		return "SignUp";
		
	}
	@RequestMapping("/allproducts")
	public ModelAndView getAllProducts()
	{
	 List<Product> allProducts=productService.getAllProducts();
		return new ModelAndView("allproducts","product",allProducts);
	}
	
}