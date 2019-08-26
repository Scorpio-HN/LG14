package com.cssl.test04;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		RealStar rs = new RealStar();
		Dog dog = new Dog();
		StarHander sh1 = new StarHander(rs);
		StarHander sh2 = new StarHander(dog);

		// 产生代理对象
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), // 加载器
				new Class[] { Star.class }, // 真实角色实现接口
				sh1);// 处理

		proxy.action();

		// 产生代理对象
		Pet proxy1 = (Pet) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), // 加载器
				new Class[] { Pet.class }, // 真实角色实现接口
				sh2);// 处理

		System.out.println("*********************");
		proxy1.show();

	}

}
