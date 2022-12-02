package com.project.statements;

public class NestedIfDemo {
	public static void main(String[] args) {
		boolean haveAccountNumber=true;
		boolean haveAdharCard=true;
		boolean haveMinimumBalance=true;
		int salary=20000;
		
		if(haveAccountNumber) {
			if(haveAdharCard) {
				if(haveMinimumBalance) {
					if(salary>20000) {
						System.out.println("You are eligible for credit card");
					}
					else {
						System.out.println("Your salary is less than 20k");
					}
				
				}
				else {
					System.out.println("You don't have minimum balance");
				}
			}
			else {
				System.out.println("You don't have adhar card");
			}
		}
		else {
			System.out.println("You don't have account number");
		}
	}

}
