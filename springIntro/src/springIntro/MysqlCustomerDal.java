package springIntro;

public class MysqlCustomerDal implements ICustomerDal {

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
		System.out.println("Mysql veritaban�na eklendi");
		
		System.out.println("connectionString verisi : "+ this.connectionString);
	}

}
