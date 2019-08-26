package com.cssl.test01;

import java.lang.reflect.*;


	public class TestDemo {
		public static void test01() {
			long start = System.currentTimeMillis();
			User u = new User();
			for (int i = 0; i < 1000000000l; i++) {
				u.getName();
			}
			long end=System.currentTimeMillis();
			System.out.println("非反射运行1一亿次的时间差：" + (end - start)+"ms");
		}
		
		public static void test02() {
			try {
				long start = System.currentTimeMillis();
				Class clazz=Class.forName("com.cssl.test01.User");
				User u=(User)clazz.newInstance();
				Method m=clazz.getDeclaredMethod("getName", null);
				for (int i = 0; i < 1000000000l; i++) {
					m.invoke(u, null);
				}
				long end=System.currentTimeMillis();
				System.out.println("反射运行1一亿次的时间差：" + (end - start)+"ms");
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
			}
			
		}
		public static void test03() {
			try {
				long start = System.currentTimeMillis();
				Class clazz=Class.forName("com.cssl.test01.User");
				User u=(User)clazz.newInstance();
				Method m=clazz.getDeclaredMethod("getName", null);
				m.setAccessible(true);//去除安全检查
				for (int i = 0; i < 1000000000l; i++) {
					m.invoke(u, null);
				}
				long end=System.currentTimeMillis();
				System.out.println("反射去除安全检查运行1一亿次的时间差：" + (end - start)+"ms");
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
			}
			
		}

		public static void main(String[] args) {
			//System.out.println("xxxx");
			test01();
			test02();
			test03();
		}
	}

