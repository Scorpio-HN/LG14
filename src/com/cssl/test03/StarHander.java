package com.cssl.test03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//处理类
public class StarHander implements InvocationHandler {

	//持有引用
	private RealStar rs;
	
	public StarHander(RealStar rs) {
		super();
		this.rs = rs;
	}

	//执行方法  日志记录  权限的控制 安全检查  事务控制
	@Override
	public Object invoke(
			Object proxy, //代理对象
			Method method, //被代理对象要执行的方法
			Object[] args) throws Throwable {//执行方法的参数
		Object obj=null;
		System.out.println("1.日志加载···");
		System.out.println("2.事务开始···");
		System.out.println("面谈");
		System.out.println("签合同");
		System.out.println("订票");
		if("action".equals(method.getName())) {
			obj=method.invoke(rs, args);
		}
		if("show".equals(method.getName())) {
			obj=method.invoke(rs, args);
		}
		System.out.println("收钱");
		System.out.println("3.事务结束···");
		System.out.println("4.日志结束···");
		
		
		
		
		return obj;
	}

}
