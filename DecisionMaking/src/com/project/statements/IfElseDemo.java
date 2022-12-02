package com.project.statements;

public class IfElseDemo {
	public static void main(String[]args) {
		int age=17;
		int weight=48;
		if(age>18){
		System.out.println("You can vote");
	}
		else {
			System.out.println("You are not eligible");
		}
		if(weight>50) {
			System.out.println("You can donate blood");
		}
		else {
			System.out.println("You are underweight & not eligible");
		}
}

	
}