package com.cg.service;

import com.cg.bean.Account;

public interface Transaction {
	 public double withdraw(Account ob,double amount);
	 public double deposit(Account ob,double amount);
	 public String transferMoney(Account from,Account to,double amount);
	 public default void printStatement(Account ob) {
		 
		 System.out.println("========================================");
		 System.out.println("Statement for Account NO.: "+ob.getAid());

		 System.out.println("Account Holder: "+ob.getAccountholder());
		 System.out.println("Balance is => "+ob.getBalance());
		 System.out.println("========================================");
		 
	 }
	 
}
