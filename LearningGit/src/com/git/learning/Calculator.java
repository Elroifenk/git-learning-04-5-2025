package com.git.learning;

public class Calculator {

	public int add(int x, int y) {
		int result = 0;
		result =x +y;
		
		return result;
	}
	
	public int multiply (int x, int y) {
		return x * y ;
	}
	
	public int divide(int x, int y) {
		int result = 0;
		try {
		if (y !=0) {
			result = x / y;
		 }else {
			 throw new Exception(" you cannot divide number by zero. "); 
		 }
	}catch (Exception e) {
		e.printStackTrace();
	}
		return result;
}
	public void Encapsulation() {
		
	}
}