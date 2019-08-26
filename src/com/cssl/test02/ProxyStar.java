package com.cssl.test02;
//代理角色
public class ProxyStar implements Star{

	//持有真实角色的引用
	private RealStar rs;
	
	
	public ProxyStar(RealStar rs) {
		super();
		this.rs = rs;
	}

	@Override
	public void meet() {
		System.out.println("宋喆面谈");
		
	}

	@Override
	public void singCount() {
		System.out.println("宋喆签合同");
		
	}

	@Override
	public void orderTicket() {
		System.out.println("宋喆订票");
		
	}

	@Override
	public void action() {
		
		rs.action();
	}

	@Override
	public void collectionMoney() {
		System.out.println("宋喆收钱");
		
	}

}
