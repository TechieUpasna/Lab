package com.upasna;
import org.springframework.context.annotation.AnnotionConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {  //main class

	public static void main(String[] args) {  //main method
		AnnotionConfigApplicationContext context= new AnnotationConfiApplicationContext(AppConfig.class);
		Employee e=context.getBean(Manager.class);
		e.doWork();
		Employee f=context.getBean(Accountant.class);
		f.doWork();
		context.close();
	}

}
