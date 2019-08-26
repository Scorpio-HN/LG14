package com.cssl.test04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//处理类 cglib
public class StarHander implements InvocationHandler {

	//持有引用
	private Object rs;
	
	public StarHander(Object rs) {
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
		//调用被代理对象要执行的方法
		if("action".equals(method.getName())) {
			obj=method.invoke(rs, args);
		}
		//调用被代理对象要执行的方法
		if("show".equals(method.getName())) {
			
			obj=method.invoke(rs, args);
		}
		
		System.out.println("3.事务结束···");
		System.out.println("4.日志结束···");
		
		
		
		
		return obj;
	}

}
