package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
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
	
	@RequestMapping("/allproducts")
	public ModelAndView getAllProducts()
	{
	 List<Product> allProducts=productService.getAllProducts();
		return new ModelAndView("allproducts","product",allProducts);
	}
	
@RequestMapping("/login")
public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required =false) String logout, Model model)
{
if(error != null)
{
model.addAttribute("error", "Invalid username or password");}
if (logout !=null)
model.addAttribute("msg", "Successfully Logged Out");

return "login";
}
	

}