package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		    ICustomerService iCustomerService = context.getBean("service", ICustomerService.class);
		//customermanager beanini getBean ile çektik ve interface e atadýk
		
		//CustomerManager customerManager=new CustomerManager(context.getBean("database", ICustomerDal.class));
		
		iCustomerService.add();
		
			//CustomerManager customerManager=new CustomerManager(new CustomerDal()); //oracle a eklendi
			//CustomerManager customerManager=new CustomerManager(new MysqlCustomerDal()); //mysql e eklendi
		
		
		
			//customerManager.add();
	}
 
}
