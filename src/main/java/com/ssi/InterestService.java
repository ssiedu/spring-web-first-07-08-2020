package com.ssi;

public class InterestService {

	
	public InterestModel computeInterest(InterestModel model) {
		System.out.println("Service Class Method Called...........");
		System.out.println(model);
		int intr=(model.getAmount()*model.getTime()*model.getRate())/100;
		int net=model.getAmount()+intr;
		model.setInterest(intr);
		model.setNet(net);
		System.out.println("After Proccessing Model Object.......");
		System.out.println(model);
		return model;
		
	}
	
	
}
