package com.gopal;

import java.util.Scanner;

public class CalC {
	
	public static void main(String[] args) {
		double num1;
		double num2;
		char op;
		double ans;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		num1= scanner.nextDouble();
		num2= scanner.nextDouble();
		 System.out.println("\nEnter an operator(+ , - , / , *):  ");
		 op=scanner.next().charAt(0);
		 
		 switch(op) {
		 case '+': ans =num1+num2;
		 break;
		 case'-': ans=num1-num2;
		 break;
		 case'/': ans= num1/num2;
		 break;
		 case'*': ans=num1*num2;
		 break;
		 default: System.out.println("Error! Enter correct operator!");
		 return;
		 }
		 System.out.println("\nThe result of the operation is: ");
		 System.out.println(num1+" "+op+num2+" = "+ ans);
		
		
		
	}
	
}
	