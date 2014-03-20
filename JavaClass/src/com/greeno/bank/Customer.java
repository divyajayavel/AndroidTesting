package com.greeno.bank;
import java.util.Scanner;


public class Customer extends Bank {
	
	Scanner s=new Scanner(System.in);
	private String Customername;
	private int AccountNumber;
	private String CustomerAddress;
	private int CustomerNumber;
	
	
	public void getData()
	{
		System.out.println("Name "+" AccountNumber "+" Address "+" Mobile ");
		Customername=s.next();
		AccountNumber=s.nextInt();
		CustomerAddress=s.next();
		CustomerNumber=s.nextInt();
	}
	
	private void setData(String Name,int AccNo,String Address,int MNumber)  //Encapsulation
	{
		this.Customername=Name;
		this.AccountNumber=AccNo;
		this.CustomerAddress=Address;
		this.CustomerNumber=MNumber;
	}
	
	//Method Overriding
	public void displayDetails()
    {
    	System.out.println(Customername+" "+CustomerNumber);
    }
	
		
	public void loanDetails()
	{
		System.out.println("Loan Needed");
	}

	



}
