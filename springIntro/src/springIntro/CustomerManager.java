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
		//i� kurallar� �al���r kontroller ger�ekle�irse CustomerDal �a�r�l�r				
		icustomerDal.add();		
	}

}
