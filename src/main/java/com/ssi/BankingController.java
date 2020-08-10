package com.ssi;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankingController {

	
	@RequestMapping("dataentry")	//when a url ends with "/dataentry", this method should get called, 
	public String showInputPage() {
		//this method to display inputpage.jsp
		return "inputpage.jsp";	//view-name
		
	}
	@RequestMapping("compute")	//here we will provide the response using a view (result.jsp).
	
	public ModelAndView computeInterest(@RequestParam("t1") int amount, @RequestParam("t2") int time, HttpServletResponse response) {	//the value of request parameter t1 should be stored to amount, t2 to time
	
		int interest=(amount*time*8)/100;
		int net=amount+interest;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		//store the proceed data to this ModelAndView object
		mv.addObject("amt", amount);
		mv.addObject("intr",interest);
		mv.addObject("net",net);
		//return this ModelAndView object to front controller (DispatcherServlet)
		return mv;
		
	}
	/*
	@RequestMapping("compute")	//for  a request with url "compute" this method will called
	public void computeInterest(@RequestParam("t1") int amount, @RequestParam("t2") int time, HttpServletResponse response) {	//the value of request parameter t1 should be stored to amount, t2 to time
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
	*/
	/*
	@RequestMapping("compute")	//for  a request with url "compute" this method will called
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
	*/
	
}
