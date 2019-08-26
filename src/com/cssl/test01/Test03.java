package com.cssl.test01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//使用反射获取属性 方法  构造函数  来使用
public class Test03 {
	
	public static void main(String[] args) {
		try {
			Class clazz=Class.forName("com.cssl.test01.User");
			//创建一个实例对象
			User u1=(User)clazz.newInstance();
			System.out.println("u1:"+u1.getName());
			System.out.println("u1:"+u1.getAddress());
			System.out.println("*****************");
			
			//使用构造函数创建
			Constructor c1=clazz.getDeclaredConstructor(String.class,int.class);
			c1.setAccessible(true);
			User u2=(User)c1.newInstance("亮亮",17);
			System.out.println("u1:"+u2.getName());
			System.out.println("u1:"+u2.getAge());
			System.out.println("u1:"+u2.getAddress());
			u2.print();
			System.out.println("***************");
			User u3=(User) clazz.newInstance();
			Method m1=clazz.getDeclaredMethod("setName", String.class);
			Method m2=clazz.getDeclaredMethod("getName", null);
			
			//使用反射给指定对象属性赋值
			m1.invoke(u3, "王五");
			u3.print();
			String mess=(String) m2.invoke(u3, null);
			System.out.println(mess);
			
			//调用私有
			Method m3=	clazz.getDeclaredMethod("show", String.class);
			//放行安全检查 默认检查：false 
			m3.setAccessible(true);
			String mees2=(String) m3.invoke(u3, "哈哈哈");
			System.out.println("mess2:"+mees2);
			System.out.println("****************");
			//属性的使用
			User u4=(User)c1.newInstance("亮亮",17);
			Field f1=clazz.getField("health");
			f1.set(u4, 500);
			System.out.println("u4:"+u4.getHealth());
			System.out.println("f1:"+f1.get(u4));
			
			//私有
			Field f2=clazz.getDeclaredField("name");
			f2.setAccessible(true);
			f2.set(u4, "医院饱满");
			System.out.println(f2.get(u4));
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
