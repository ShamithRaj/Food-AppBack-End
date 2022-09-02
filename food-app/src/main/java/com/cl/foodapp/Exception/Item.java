package com.cl.foodapp.Exception;

public class Item extends RuntimeException {
	
	String message="Item is not available now";
	
	@Override
	public String getMessage() {
		return message;
	}

}

