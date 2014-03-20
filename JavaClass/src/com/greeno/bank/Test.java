package com.greeno.bank;

public class Test {
	
	public static void main(String args[])
	{
		System.out.println("Bank Manager");
		BankManager b=new BankManager();
		b.setData("Ram", "1/23", 123456778);
		b.displayDetails();
		
		Bank b1=new BankManager();
		b1.getBankDetails("SBI","AshokNagar");
		b.loanDetails();
		b1.loanDetails();
		
		
		System.out.println("Customer");
		Customer c=new Customer();
		c.getData();
		c.loanDetails();
		
		
		Bank c1=new Customer();
		c1.getBankDetails("HDFC", " Chennai ", " AnnaSalai");
		c.displayDetails();
	}

}
