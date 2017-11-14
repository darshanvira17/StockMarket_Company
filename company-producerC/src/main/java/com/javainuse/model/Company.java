package com.javainuse.model;
import org.springframework.beans.factory.annotation.Autowired;
public class Company {
	 @Autowired
	private String name;
	private int number_of_shares;
	private double price_of_shares;
	private double shares_doubles_when;
	public int buy_shares(int n) {
	if(n>shares_doubles_when) {
		doubletheshare();
	}
	if(n>number_of_shares) {
	return 0;
	}
	else {
		number_of_shares-=n;
		return n;
	}}
	public void doubletheshare() {
		number_of_shares*=2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber_of_shares() {
		return number_of_shares;
	}
	public void setNumber_of_shares(int number_of_shares) {
		this.number_of_shares = number_of_shares;
	}
	public double getPrice_of_shares() {
		return price_of_shares;
	}
	public void setPrice_of_shares(double price_of_shares) {
		this.price_of_shares = price_of_shares;
	}
	public double getShares_doubles_when() {
		return shares_doubles_when;
	}
	public void setShares_doubles_when(double price_doubles_when) {
		this.shares_doubles_when = price_doubles_when;
	}

}
