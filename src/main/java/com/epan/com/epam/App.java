package com.epan.com.epam;

import  java.util.Scanner;		//YAGNI

public class App{		// infrastructure layer
	
	private static Scanner sc = new Scanner(System.in);	
	private static int num1, num2, ch, re;
	
	public static void main(String[] args) {	//Open close principle100
		
		takeInput();			//presentation layer	
		
		askOperation();			//application layer	
		
		performOperation();		//domain layer
		
		printResult();			//presentation layer
		
		sc.close();				//KISS

	}
	
	private static void printResult() {
		
		System.out.println("Result = " + re);
		
	}

	private static void performOperation() {
		
		switch(ch) {
			case 1:
				re = num1 + num2;
				break;
			case 2:
				re = num1 - num2;
				break;
			case 3:
				re = num1 * num2;
				break;
			case 4:					//Zero Division Error
				if( num2==0 ) {
					re = 0;
				} else {
					re = num1 / num2;
				}
				break;
			default:
				System.out.println("Invalid choice!");
		}
		
	}
	
	private static void askOperation() {
		
		System.out.println("Select choice - ");
		
		System.out.println("1 - Addition");
		System.out.println("2 - Subraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		
		ch = sc.nextInt();
	}
	
	private static void takeInput() {	//Single responsibility Principle
		
		System.out.println("Enter number 1: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter number 2: ");
		num2 = sc.nextInt();
		
	}

}
