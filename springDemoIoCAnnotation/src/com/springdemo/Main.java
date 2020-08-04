package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class); 
		
		    ICustomerService iCustomerService = context.getBean("service", ICustomerService.class);
		
		
		//CustomerManager customerManager=new CustomerManager(context.getBean("database", ICustomerDal.class));
		
		iCustomerService.add();
		
			//CustomerManager customerManager=new CustomerManager(new CustomerDal()); //oracle a eklendi
			//CustomerManager customerManager=new CustomerManager(new MysqlCustomerDal()); //mysql e eklendi
		
		
		
			//customerManager.add();
	}
 
}
