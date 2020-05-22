package com.aliarshad.grocery.online.shop.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int prod_id;
	private int prod_qty;
	private int prod_unit_price;
	private String prod_weight_unit;
	private int prod_weight;
	private String prod_name;
	private String prod_pic;
	private String prod_mfg_date;
	private String prod_exp_date;
	@ManyToOne
	private Category prod_category;
	@OneToOne
	private SubCategory prod_subcategory;
	@OneToOne
	private Company prod_company;

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public int getProd_qty() {
		return prod_qty;
	}

	public void setProd_qty(int prod_qty) {
		this.prod_qty = prod_qty;
	}

	public int getProd_unit_price() {
		return prod_unit_price;
	}

	public void setProd_unit_price(int prod_unit_price) {
		this.prod_unit_price = prod_unit_price;
	}

	public String getProd_weight_unit() {
		return prod_weight_unit;
	}

	public void setProd_weight_unit(String prod_weight_unit) {
		this.prod_weight_unit = prod_weight_unit;
	}

	public int getProd_weight() {
		return prod_weight;
	}

	public void setProd_weight(int prod_weight) {
		this.prod_weight = prod_weight;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_pic() {
		return prod_pic;
	}

	public void setProd_pic(String prod_pic) {
		this.prod_pic = prod_pic;
	}

	public String getProd_mfg_date() {
		return prod_mfg_date;
	}

	public void setProd_mfg_date(String prod_mfg_date) {
		this.prod_mfg_date = prod_mfg_date;
	}

	public String getProd_exp_date() {
		return prod_exp_date;
	}

	public void setProd_exp_date(String prod_exp_date) {
		this.prod_exp_date = prod_exp_date;
	}

	public Category getProd_category() {
		return prod_category;
	}

	public void setProd_category(Category prod_category) {
		this.prod_category = prod_category;
	}

	public SubCategory getProd_subcategory() {
		return prod_subcategory;
	}

	public void setProd_subcategory(SubCategory prod_subcategory) {
		this.prod_subcategory = prod_subcategory;
	}

	public Company getProd_company() {
		return prod_company;
	}

	public void setProd_company(Company prod_company) {
		this.prod_company = prod_company;
	}

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_qty=" + prod_qty + ", prod_unit_price=" + prod_unit_price
				+ ", prod_weight_unit=" + prod_weight_unit + ", prod_weight=" + prod_weight + ", prod_name=" + prod_name
				+ ", prod_pic=" + prod_pic + ", prod_mfg_date=" + prod_mfg_date + ", prod_exp_date=" + prod_exp_date
				+ ", prod_category=" + prod_category + ", prod_subcategory=" + prod_subcategory + ", prod_company="
				+ prod_company + "]";
	}

}
