package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
