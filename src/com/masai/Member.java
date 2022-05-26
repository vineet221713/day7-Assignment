package com.masai;

public class Member{
	String Name ;
	int Age ;
	String PhonNumber;
	String Address;
	
	void printSalarey() {
		double salary= 300000;
		System.out.println("salary is"+salary );
	}
	
}
class Empoloyee extends Member{
	String Specialisation ;
	String Departement;
	
}
class Manager extends Member{
	String Specialisation ;
	String Departement;
}

class Main {
	public static void main(String[] args) {
		Empoloyee e1 = new Empoloyee();
		System.out.println(e1.Name = "vineet Kumar Singh");
		System.out.println(e1.Age  = 25);
		System.out.println(e1.PhonNumber = "8090805100");
		System.out.println(e1.Address = "ballia");
		System.out.println(e1.Specialisation = "backend Developer");
		System.out.println(e1.Departement = "It");
		
		
		Manager m1 = new Manager();
		System.out.println(m1.Name = "Shankar ji");
		System.out.println(m1.Age  = 26);
		System.out.println(m1.PhonNumber = "7007034994");
		System.out.println(m1.Address = "Chitbara Gaon");
		System.out.println(m1.Specialisation = "backend Developer");
		System.out.println(m1.Departement = "It");
		
		
	}
}
