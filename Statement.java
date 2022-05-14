package com.mapmay2;

//java bean is a reusable component with private properties and public getter and setter methods
//any one can set the data through setter methods and can get the data through the getter methods
public class Statement {
	private  String transactionId;
	private String trnsactionDate;
	private int accountNum;
	private double amount;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTrnsactionDate() {
		return trnsactionDate;
	}
	public void setTrnsactionDate(String trnsactionDate) {
		this.trnsactionDate = trnsactionDate;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}