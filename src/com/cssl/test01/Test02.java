package com.cssl.test01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//反射获取类 属性  方法  构造函数
public class Test02 {
	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("com.cssl.test01.User");
			//获取名字
			System.out.println("名字："+clazz.getName());
			System.out.println("简化版:"+clazz.getSimpleName());
			System.out.println("****************");
			
			//获取属性
			Field f1=clazz.getField("health");
			System.out.println("属性类型："+f1.getType());
			System.out.println("f1:"+f1);
			System.out.println("***********************");
			//只能获取公有的属性
			Field[] fs=clazz.getFields();
			for (Field f : fs) {
				System.out.println("属性："+f);
			}
			System.out.println("***********************");
			//获取指定所有属性
			Field f2=clazz.getDeclaredField("address");
			System.out.println("type:"+f2.getType());
			System.out.println("f2;"+f2);
			System.out.println("*******************");
			Field[] fs2=clazz.getDeclaredFields();
			for (Field f : fs2) {
				System.out.println("属性："+f);
			}
			System.out.println("*******************");
		
			//获取方法
			Method m1=clazz.getMethod("setName", String.class);
			System.out.println("m1:"+m1);
			System.out.println("方法名："+m1.getName());
			Method m2=clazz.getMethod("setName",null);
			System.out.println("m2:"+m2);
			System.out.println("方法名2："+m2.getName());
		
			//获取公有全部的方法(包括父类)
			Method[] methods = clazz.getMethods();
			for (Method m : methods) {
				System.out.println("m:"+m);
			}
			//获取指定私有方法
			Method m3=clazz.getDeclaredMethod("show", String.class);
			System.out.println("m3:"+m3);
			System.out.println("****************************");
			//获取全部的方法（但是不包括父类）
			Method[] sms=clazz.getDeclaredMethods();
			for (Method sn : sms) {
				System.out.println("sn:"+sn);
			}
		
			System.out.println("**************************");
			
			//构造函数
			Constructor c1=clazz.getConstructor(String.class);
			System.out.println("c1:"+c1);
			Constructor c2=clazz.getDeclaredConstructor(String.class,int.class);
			System.out.println("c2:"+c2);
			
			Constructor[] c2s=clazz.getDeclaredConstructors();
			for (Constructor c : c2s) {
				System.out.println("构造："+c);
			}
		
		
		
		
		
		
		
		
		
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
