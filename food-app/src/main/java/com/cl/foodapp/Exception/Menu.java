package com.cl.foodapp.Exception;

public class Menu extends RuntimeException {
	
	String message="This menu is not there";
	
	public String getMessage() {
		return message;
	}

}
