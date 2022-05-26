package com.masai;

class Bank{
	String branchName;
	String Name;
	String ifscCode;
	int rateOfInterest;
	void displayDetails() {
	}
	
}
class AxisBank extends Bank{
	@Override
	void displayDetails() {
		System.out.println(branchName="ballia");
		System.out.println(Name="abc");
		System.out.println(ifscCode="xyz");
		System.out.println(rateOfInterest=5);
		
	}
	void getCreaditCard() {
		System.out.println("Get The Craedit card from the axis bank");
	}
}
class ICICBank extends Bank{
	@Override
	void displayDetails() {
		
		System.out.println(branchName="cbn");
		System.out.println(Name="opq");
		System.out.println(ifscCode="jkl");
		System.out.println(rateOfInterest=9);
		
	}
}

public class Qustion4 {

	public static void main(String[] args) {
		AxisBank a1 = new AxisBank();
		a1.displayDetails();
		a1.getCreaditCard();
		
		ICICBank b1 = new ICICBank();
		b1.displayDetails();
	}
	
	

}
