package com.project.statements;

public class SwitchDemo {
	public static void main(String[] args) {
		String trafficSignal="Green";
		
		switch(trafficSignal) {
		case "Red":
			System.out.println("Please stop");
			break;
		case "Yellow":
			System.out.println("Get ready to move");
			break;
		case "Green":
			System.out.println("Please move");
			break;
			default:
				System.out.println("Invalid input");
	}

}

}