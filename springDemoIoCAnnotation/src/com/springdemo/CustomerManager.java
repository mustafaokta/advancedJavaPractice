package com.springdemo;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal icustomerDal;
	
	/* set injection yerine cunstroction injection kullanýlýr
public void setIcustomerDal(ICustomerDal icustomerDal) {
		this.icustomerDal = icustomerDal;
	}
*/


	//cunstructor injection
	public CustomerManager(ICustomerDal icustomerDal) {		 
	this.icustomerDal = icustomerDal;
	}



	public void add() {  		
		//iþ kurallarý çalýþýr kontroller gerçekleþirse CustomerDal çaðrýlýr				
		icustomerDal.add();		
	}

}
