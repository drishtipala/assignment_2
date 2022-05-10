package main_demo;

import java.util.Scanner;

public class if_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num,sq;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number:");
			num = sc.nextInt();
			
			if (num%2==0)
			{
				
			    System.out.println("Number is even:" + num);
			    sq = num*num;
			    System.out.println("Square of even number is:" + sq);
				
		    }
			
		}
	

	}


