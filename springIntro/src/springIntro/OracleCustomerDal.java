package springIntro;

public class OracleCustomerDal implements ICustomerDal{
	String connectionString;
	

public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}


public void add() {	
	//Data access layer demek dal veritabanýna veri kayýt Crud iþlemleri yapýlýr
	System.out.println("Oracle veritabanýna eklendi");
	
	System.out.println("connectionString verisi : "+ this.connectionString);
	
}




}
