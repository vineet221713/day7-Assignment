package com.masai;

public class Student{
	int studid;
	String studName;
	double examFee;
	
	void displayDetails() {
		
	}
	void payFee() {
		double pend = 6000;
		System.out.println("pending"+pend);
		
	}
}
class DayScholar extends Student{
	double transportFree;
	
	
}
class Hostelar extends Student{
	double hostelfee;
	
}

class Sudent{
	public static void main(String[] args) {
		DayScholar d1 = new DayScholar();
		System.out.println(d1.studid = 120321);
		System.out.println(d1.studName = "vijay");
		System.out.println(d1.examFee = 5000);
		d1.payFee();
		System.out.println(d1.transportFree = 700);
		
		Hostelar h1 = new Hostelar();
		
		System.out.println(h1.studid = 171555);
		System.out.println(h1.studName = "shanu");
		System.out.println(h1.examFee = 8000);
		h1.payFee();
		System.out.println(h1.hostelfee = 600);
		
	}
}