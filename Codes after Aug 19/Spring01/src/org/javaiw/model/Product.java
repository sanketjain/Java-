package org.javaiw.model;

import java.util.List;

public class Product {
	
	int pid;
	String pname;
	String brand;
	int price;
//	Vendor vendor;
	List<Vendor> vendors;

	public List<Vendor> getVendors() {
		return vendors;
	}
	public void setVendors(List<Vendor> vendors) {
		this.vendors = vendors;
	}
	//	public Vendor getVendor() {	return vendor;}
//	public void setVendor(Vendor vendor) {		this.vendor = vendor;	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int pid, String pname, String brand, int price) {
		this.pid = pid;
		this.pname = pname;
		this.brand = brand;
		this.price = price;
	}
	
	public Product() {
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pname+"---"+brand + "===" + price+ ";  " + vendors;
	}
	
}
