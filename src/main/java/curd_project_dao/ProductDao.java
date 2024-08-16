package curd_project_dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import curd_project_model.Product;

@Component

public class ProductDao {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void createProduct(Product  Product) {
		
		
		this.hibernateTemplate.save(Product);
		
	}
	
	
	public List<Product> getProducts() {
		
		
	List<Product> products=	this.hibernateTemplate.loadAll(Product.class);
		
	return products;
	
	}
	
	
	
	
	@Transactional
	
	public void  deletePrpduct(int pid) {
		
		
	Product p=	this.hibernateTemplate.load(Product.class, pid);
		
	this.hibernateTemplate.delete(p);
	
	}
	
	
	
	public Product getProduct(int pid) {
		
		
		return this.hibernateTemplate.get(Product.class, pid);
		
	}
	
	
	
	

}
