package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElseIfLaderexample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your city name : ");
		String cityName = scanner.next();
		
		if(cityName.equals("Hyderabad")) {
			System.out.println("Hello Hyderabadi.. Adab..");
		} else if(cityName.equals("Chennai")) {
			System.out.println("Hello Madrasi.. vanakkam...");
		} else if(cityname.equals("Banglore")) {
			System.out.println("Hello Kannadiga.... Namaskar...");
		} else {
			System.out.println("Enter the valid city name...");
		}

	}

}
