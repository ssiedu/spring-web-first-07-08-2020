package com.ssi;

public class InterestModel {
	private int amount;
	private int rate=8;
	private int time;
	private int interest;
	private int net;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	public int getNet() {
		return net;
	}
	public void setNet(int net) {
		this.net = net;
	}
	@Override
	public String toString() {
		return "InterestModel [amount=" + amount + ", rate=" + rate + ", time=" + time + ", interest=" + interest
				+ ", net=" + net + "]";
	}
	
	
}
