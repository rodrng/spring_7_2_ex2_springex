package com.javagyeongmin.ex;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class OtherStudent {
	
	private String name;
	private int age;
	
	public OtherStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@PostConstruct
	public void initMethod() { // 임의의 메소드 이름 사용가능
		System.out.println("initMethod() 메소드 호출");
	}
	
	@PreDestroy
	public void destroyMethod() { // 임의의 메소드 이름 사용가능
		System.out.println("destroyMethod() 메소드 호출");
	}

}