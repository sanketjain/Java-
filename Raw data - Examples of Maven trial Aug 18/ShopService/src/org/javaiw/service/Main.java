package org.javaiw.service;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:4321/product/demo", new EShop());
	}

}
