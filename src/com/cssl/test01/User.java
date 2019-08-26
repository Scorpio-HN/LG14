package com.cssl.test01;

public class User extends Object {
	private String name="kdb";
	private int age=120;
	public int health=100;
	public String address="河西那个霓红灯小巷子里";
	String sex;//
	public User() {
		super();
	}
	public User(String name, int age, int health, String address, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.health = health;
		this.address = address;
		this.sex = sex;
	}
	public User(String name) {
		super();
		this.name = name;
	}
	private User(String name,int age) {
		super();
		this.name = name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setName() {
		System.out.println("ahah ");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	private String show(String mess) {
		System.out.println("私有方法："+mess);
		return "多少钱啊！！！";
	}
	
	public void print() {
		System.out.println("笔名："+name);
		System.out.println("年龄："+age);
		System.out.println("长度："+health);
		
	}
	
	void liangliang() {
		System.out.println("正宗十三香");
	}
	
	

}
