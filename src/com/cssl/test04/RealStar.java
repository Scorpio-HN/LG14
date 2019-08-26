package com.cssl.test04;
//真实角色
public class RealStar implements Star {

	@Override
	public void meet() {
		System.out.println("宝强自己约谈");
		
	}

	@Override
	public void singCount() {
		System.out.println("宝强自己签合同");
		
	}

	@Override
	public void orderTicket() {
		System.out.println("宝强自己订单");
		
	}

	@Override
	public void action() {
		System.out.println("宝强自己实力出演");
		
	}

	@Override
	public void collectionMoney() {
		System.out.println("宝强自己收钱");
		
	}

	

}
