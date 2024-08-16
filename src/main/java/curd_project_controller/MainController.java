package curd_project_controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.oracle.wls.shaded.org.apache.regexp.recompile;

import curd_project_dao.ProductDao;
import curd_project_model.Product;
import jakarta.servlet.http.HttpServletRequest;

@Controller

public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	
	@RequestMapping("/index")
	public String home(Model m) {
		
		
		List<Product> products=productDao.getProducts();
		
		
		
		
		
		 m.addAttribute("product", products);
		 
		
		return "index1";
		
	}
	
	
	
	
	// show add product form
	
	@RequestMapping("/add_product")
	public String addProduct(Model m) {
		
		
		m.addAttribute("title", "Add product");
		
		return "add_product_form";
		
	}
	
	
	
	
	
	
	// handle add product
	
	@RequestMapping(value ="/handle-product", method = RequestMethod.POST)
	public RedirectView handleproduct(@ModelAttribute Product product , HttpServletRequest  request) {
		
		
		System.out.println(product);
		
		this.productDao.createProduct(product);
		
		
		RedirectView redirectView= new RedirectView();
		
          redirectView.setUrl(request.getContextPath()+"/index");
          
          
          // leraning purpose
          String url = redirectView.getUrl();

		
		
		System.out.println("this is path"+url);
		
		
		return redirectView;
		
	}
	
	
	
	
	// delete handler
	
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deletePrpduct(@PathVariable("productId") int productId,HttpServletRequest request) {
		
		this.productDao.deletePrpduct(productId);

		RedirectView redirectView= new RedirectView();
		
		redirectView.setUrl(request.getContextPath()+"/index");
		
		
		
		return redirectView; 
		
	}
	
	
	
	
	
	

}
