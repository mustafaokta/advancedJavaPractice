package springIntro;

public class MssqlCustomerDal implements ICustomerDal {

	String connectionString;
	
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Mssql  veritaban�na eklendi");
		
		
		System.out.println("connectionString verisi : "+ this.connectionString);
	}

}
