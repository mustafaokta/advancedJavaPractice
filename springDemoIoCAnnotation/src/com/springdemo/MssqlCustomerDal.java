package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MssqlCustomerDal implements ICustomerDal {
	@Value("${database.connectionString}")
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
		System.out.println("Mssql  veritabanýna eklendi");
		
		
		System.out.println("connectionString verisi : "+ this.connectionString);
	}

}
