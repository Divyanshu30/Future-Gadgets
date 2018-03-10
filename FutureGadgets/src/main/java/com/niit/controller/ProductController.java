package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.service.ProductService;
@Controller
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping("/viewProduct/{productId}")
	public ModelAndView getSingleProduct(@PathVariable String productId)
	{
		Product viewProduct=productService.viewProduct(productId);
		return new ModelAndView("viewProduct","product",viewProduct);
	}
	@RequestMapping("/addProduct")
	public String addProduct(Model model)
	{
		Product product=new Product();
		model.addAttribute("product",product);
		return "addProduct";
	}
	
	@RequestMapping(value="/submit", method= RequestMethod.POST)
	public String addProductData( @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request)
	{
		System.out.println("1");
		boolean flag =productService.addProduct(product);
		System.out.println("2");
		if(flag==true)return "index";
		else return "addProduct";
	}
}
