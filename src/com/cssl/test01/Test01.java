package com.cssl.test01;

public class Test01 {

	public static void main(String[] args) {
		try {
			//1.方式1
			String clname="com.cssl.test01.User";
			Class clazz=Class.forName(clname);
			System.out.println("clazz:"+clazz);
			System.out.println("calzz:"+clazz.hashCode());
			System.out.println("***************************");
			
			Class clazz2=Class.forName(clname);
			System.out.println("clazz:"+clazz2);
			System.out.println("calzz:"+clazz2.hashCode());
			System.out.println("***************************");
			
			//方式2
			Class clazz3=String.class;
			System.out.println("calzz3:"+clazz3);
			System.out.println("calzz3hashCode:"+clazz3.hashCode());
			Class clazz4=Object.class;
			System.out.println("calzz3:"+clazz4);
		
			//方式3
			Class clazz5="world".getClass();
			System.out.println("clazz5:"+clazz5);
			System.out.println("calzz5hashCode:"+clazz5.hashCode());
		
			//基本数据类型
			System.out.println("int:"+int.class);
			Integer a=new Integer(100);
			System.out.println("Integer:"+a.getClass());
			System.out.println("double:"+double.class);
			
			//数组
			
			int[] arr1=new int[1000];
			int[] arr2=new int[0];
			
			//二维数组
			int[][] arr3=new int[3][2];
			String[] arr4=new String[5];
			String[][] arr5=new String[5][2];
			System.out.println("arr1:"+arr1.getClass().hashCode());
			System.out.println("arr2:"+arr2.getClass().hashCode());
			System.out.println("arr3:"+arr3.getClass().hashCode());
			System.out.println("arr4:"+arr4.getClass().hashCode());
			System.out.println("arr5:"+arr5.getClass().hashCode());
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
