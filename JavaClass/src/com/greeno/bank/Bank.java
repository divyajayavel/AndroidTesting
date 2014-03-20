package com.greeno.bank;

//Abstraction
public abstract class Bank {
    
    public String BankName;
    public String BankAddr;
    public String BankBranch;
    
    
    public abstract void loanDetails(); //Abstract method
    
    //Method overloading
    public void getBankDetails(String bName,String bAddr) {
        
        this.BankName=bName;
        this.BankAddr=bAddr;
        System.out.println("Name "+BankName+" Address "+BankAddr);
        
    }
    
    //Method overloading
        public void getBankDetails(String bName,String bAddr,String bBran) {
            
            this.BankName=bName;
            this.BankAddr=bAddr;
            this.BankBranch=bBran;
            System.out.println("Name "+BankName+" Address "+BankAddr+"Branch"+BankBranch);
        }
     
       //Method Overriding
        public void displayDetails()
        {
        	System.out.println(BankName+" "+BankAddr+" "+BankBranch);
        }
     

}
