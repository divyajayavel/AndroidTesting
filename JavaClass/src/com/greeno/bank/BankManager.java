package com.greeno.bank;
import java.util.Scanner;
@SuppressWarnings("unused")

public class BankManager extends Bank {
	
	Scanner s=new Scanner(System.in);
	private String Agentname;
	private String AgentAddress;
	private int AgentNumber;
	
	private void getData()  //Encapsulation
	{
		System.out.println("Name "+" Address "+" Mobile ");
		Agentname=s.next();
		AgentAddress=s.next();
		AgentNumber=s.nextInt();
	}
	
	public void setData(String Name,String Address,int MNumber)  
	{
		this.Agentname=Name;
		this.AgentAddress=Address;
		this.AgentNumber=MNumber;
		System.out.println("Name "+Agentname+" AgentAddr "+AgentAddress+" Mobile "+AgentNumber);
	}
	
	public void displayDetails()
    {
    	System.out.println(Agentname+" "+AgentAddress+" "+AgentNumber);
    }
	
	public void loanDetails()
	{
		System.out.println("Loan Sanctioned");
	}
	
}

