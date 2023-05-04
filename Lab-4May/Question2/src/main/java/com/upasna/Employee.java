package com.upasna;

public class Employee {
	int id;
	String name;
	Employee(int id,String name){
	this.id=id;
	this.name=name;
	}
	public String toString() {
	return"Name : "+name+" Id : "+id;
	}
	}


