package com.upasna;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {
	public void doWork() {
		System.out.println("Managing");
	} 

}
