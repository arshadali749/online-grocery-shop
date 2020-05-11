package com.aliarshad.grocery.online.shop.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliarshad.grocery.online.shop.main.dao.ProductDao;
import com.aliarshad.grocery.online.shop.main.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDao productdao;

	public void insertProduct(Product product) {
		productdao.save(product);
	}

	public List<Product> getListOfProducts() {
		return productdao.findAll();
	}

	public Product getProductById(int id) {
		return productdao.getOne(id);
	}
	
	public void deleteProductById(int id)
	{
		productdao.deleteById(id);
	}

	public void updateProduct(Product updatedProduct) {
		Product product = getProductById(updatedProduct.getProd_id());
		product.setProd_name(updatedProduct.getProd_name());
		product.setProd_category(updatedProduct.getProd_category());
		product.setProd_subcategory(updatedProduct.getProd_subcategory());
		product.setProd_exp_date(updatedProduct.getProd_exp_date());
		product.setProd_mfg_date(updatedProduct.getProd_mfg_date());
		product.setProd_company(updatedProduct.getProd_company());
		product.setProd_qty(updatedProduct.getProd_qty());
		product.setProd_unit_price(updatedProduct.getProd_unit_price());
		product.setProd_pic(updatedProduct.getProd_pic());
		product.setProd_weight(updatedProduct.getProd_weight());
		product.setProd_weight_unit(updatedProduct.getProd_weight_unit());
		product.setProd_weight(updatedProduct.getProd_weight());
		productdao.save(product);

	}
}
