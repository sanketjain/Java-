package org.javaiw.service;
//This is our service class, not the actual service
import java.util.ArrayList;

import javax.jws.WebService;

import org.javaiw.model.Product;
//This is my webservice in action
import org.javaiw.model.ProductData;

@WebService(endpointInterface="org.javaiw.service.ProductIntf")//My endpoint interface is org.javaiw.service.ProductIntf
public class EShop implements ProductIntf {
	ProductData data = new ProductData(); //got my data service object created in webservice
	
	public ArrayList<Product> getProducts(){
		return data.getProducts();
	}

	public boolean removeProduct(int pid){
		return data.deleteProduct(pid);
	}
	
	public boolean addProduct(String pname, int price, String brand){
		return data.addProduct(new Product(-1, pname, price, brand));
	}
}

