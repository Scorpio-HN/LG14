package com.cssl.test01;

import java.lang.reflect.Array;

public class Test5 {

	public static void main(String[] args) {
		try {
			Class clazz=Class.forName("java.lang.Integer");
			
			Object arr =Array.newInstance(clazz, 10);
			//Object arr=Array.newInstance(Integer.TYPE, 10);
			Array.set(arr, 0, 200);
			Array.set(arr, 1, 300);
			Array.set(arr, 2, 400);
			System.out.println(Array.get(arr, 1));
		
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeArraySizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
