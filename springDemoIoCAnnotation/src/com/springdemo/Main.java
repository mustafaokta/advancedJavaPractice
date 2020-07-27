package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class); 
		
		    ICustomerDal iCustomerDal = context.getBean("database", ICustomerDal.class);
		
		
		//CustomerManager customerManager=new CustomerManager(context.getBean("database", ICustomerDal.class));
		
		iCustomerDal.add();
		
			//CustomerManager customerManager=new CustomerManager(new CustomerDal()); //oracle a eklendi
			//CustomerManager customerManager=new CustomerManager(new MysqlCustomerDal()); //mysql e eklendi
		
		
		
			//customerManager.add();
	}
 
}
