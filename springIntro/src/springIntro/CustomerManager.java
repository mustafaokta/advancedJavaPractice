package springIntro;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal icustomerDal;
	
	
public void setIcustomerDal(ICustomerDal icustomerDal) {
		this.icustomerDal = icustomerDal;
	}



	//cunstructor
	//public CustomerManager(ICustomerDal icustomerDal) {		 
	//	this.icustomerDal = icustomerDal;
	//}



	public void add() {  		
		//iþ kurallarý çalýþýr kontroller gerçekleþirse CustomerDal çaðrýlýr				
		icustomerDal.add();		
	}

}
