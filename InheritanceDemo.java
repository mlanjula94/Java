package com.mapmay2;

class Parent{
	double bankBalance=1300.76;
	public Parent() {
		System.out.println("paent def");
	}
	
	Parent(int num1){
		System.out.println("Parent's int param constr");
	}
	
	int addition(int num1,int num2) {
		double bankBalance=123;
		System.out.println("bank balance:"+this.bankBalance);	//1300.76
		System.out.println("bank balance:"+bankBalance);	//123
		return num1+num2;
	}
	
	double division(double num1, double num2) {
		double bankBalance=1450;
		return num1 / num2 ;
	}
	
}

//super keyword referers to parent class object. It differtiates the parent class's instance variable from child(current) class's instance variable
//super() refers to parent/super class's constructor used to call parent class's constuctor from the child class's constructor
//super() will be added as a first statement of every constructor by default.
class Child extends Parent{
	//this() refers to the current class constructor used to call the constructors from one another
	
	int division(int num1, int num2) {
		return num1/num2;
	}

	Child(){  //3
		super(1450);
		System.out.println("Child's default constr");
		//System.out.println(super(1450));
	}
	
	

	Child(int num1){
		//this(1234.45);
		System.out.println("Child's int param constr");
	}
	Child(double num1){
		//this();
		System.out.println("Child's double param constr");
	}
	
	double bankBalance=1140.71;
	double division(double num1, double num2) {
		double bankBalance=1450;
		//System.out.println("*****************");
		//System.out.println(bankBalance); // 1450
		//System.out.println(this.bankBalance); // 1140.71
		//System.out.println(super.bankBalance); // 1300.76
		return num1 / num2 +100;
	}
}

class GrandChild extends Child{
	double multiplcation(double num1, double num2) {
		return num1*num2;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		//System.out.println(child.bankBalance);
		//System.out.println(child.addition(444, 222));
		//System.out.println(child.division(444, 222));
		
		
		/*
		GrandChild  child2 = new GrandChild ();
		System.out.println(child2.bankBalance);
		System.out.println(child2.addition(44, 222));
		System.out.println(child2.division(44, 222));
		System.out.println(child2.multiplcation(234, 3));
		*/
	}

}
