package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankingController {

	@RequestMapping("compute")		//for  a request with url "compute" this method will called
	public void computeInterest(HttpServletRequest request, HttpServletResponse response) {
		//request-read
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		//process
		int amount=Integer.parseInt(s1);
		int time=Integer.parseInt(s2);
		int interest=(amount*time*8)/100;
		int net=amount+interest;
		//response-provide
		try {
			PrintWriter out=response.getWriter();
			out.println("Thanks For Visiting Us..........");
			out.println("Your Deposit : "+amount);
			out.println("Interest Amount : "+interest);
			out.println("Net Amount : "+net);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping("info")		//for a request with url "info" this method will called
	public void provideInfo() {
		System.out.println("Providing Info About SSI...............>>>>>>>>>>>>>>");
	}
}
