package com.cl.foodapp.Exception;


public class ProductNotFound extends RuntimeException {
	
	String message="Product not present";
	
	@Override
	public String getMessage() {
	
		return message;
	}

}
