package com.project.statements;

public class IfElseIfLadder {
	public static void main(String[] args) {
		boolean haveAdharCard=false;
		boolean havePanCard=false;
		boolean haveVoterCard=false;
		
		if(haveAdharCard) {
			System.out.println("Condition1: Citizen of India");
		}
		else if(havePanCard) {
			System.out.println("Condition2: Citizen of India");
		}
		else if(haveVoterCard) {
			System.out.println("Condition3: Citizan of India");
		}
		else {
			System.out.println("Not a citizen of India");
		}
	}

}
