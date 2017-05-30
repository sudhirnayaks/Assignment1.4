package com.test.acadgild;

public class Swapping {

	public static void main(String[] args) {
		int x = 20;
		int y = 30;
		
		System.out.println("Befor Swapping :" + "Value of X is "+x+" and value of Y is "+y);
		
		x = x + y; //50
		y = x - y; //20
		x = x - y; //30
		
		System.out.println("After Swapping :" + "Value of X is "+x+" and value of Y is "+y);

	}

}
