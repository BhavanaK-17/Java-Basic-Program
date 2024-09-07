package com.codegnan.javapractice;

import java.util.Scanner;

public class whileexample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number=scanner.nextInt();
		int i = 1;
		while(i < number) {
			System.out.println(i);//1 2
			i++;
		}


	}

}
