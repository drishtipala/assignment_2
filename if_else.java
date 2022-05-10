package main_demo;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number:");
		num = sc.nextInt();
		if (num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}

	}

}
