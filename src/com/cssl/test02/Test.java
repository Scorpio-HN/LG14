package com.cssl.test02;
/**
 * 
 * 代理目的：
 * 解决直接访问对象带来问题
 * 可以提供额外的功能，扩展目标对象功能
 * 
 * 代理模式：
 * 设置中间代理来控制访问原目的，
 * 以达到增强原目标的功能或者简化访问方式
 * 
 * 
 * */
public class Test {

	public static void main(String[] args) {
		//创建真实角色
		RealStar rs=new RealStar();
		//创建代理角色
		ProxyStar ps=new ProxyStar(rs);
		//执行流程
		ps.meet();
		ps.singCount();
		ps.orderTicket();
		ps.action();
		ps.collectionMoney();

	}

}
