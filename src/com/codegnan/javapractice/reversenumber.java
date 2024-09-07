package com.codegnan.javapractice;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int number = scanner.nextInt();
	
	int reversedNumber = 0;
	int originalNumber=number;
	while(originalNumber !=0) {
		int remainder = originalNumber % 10;
		reversedNumber = reversedNumber * 10 + remainder;
		originalNumber = number / 10;
	}
	//System.out.println("reverse of a number : "+number+" is "+reversedNumber);
	if(number==reversedNumber) {
		System.out.println(number+" is a palindrome");
	}else {
		System.out.println(number+" is not a palindrome ");
	}

	}

}
