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
	//Data access layer demek dal veritaban�na veri kay�t Crud i�lemleri yap�l�r
	System.out.println("Oracle veritaban�na eklendi");
	
	System.out.println("connectionString verisi : "+ this.connectionString);
	
}




}
