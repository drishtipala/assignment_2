package main_demo;

import java.util.Scanner;

public class switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int add,sub,mul,div,num1,num2,choice;
		System.out.print("Enter first number:\n");
		num1 = sc.nextInt();
		System.out.print("\nEnter second number:\n");
		num2 = sc.nextInt();
		System.out.print("1:Addition\n, 2:Subtraction\n, 3:Multiplication\n, 4:Division\n");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			add = num1 + num2;
			System.out.println("Addition is:" + add);
			break;
		case 2:
			sub = num1 - num2;
			System.out.println("Subtraction is:" + sub );
			break;
		case 3:
			mul = num1 * num2;
			System.out.println("Multiplication is:" + mul);
			break;
		case 4:
			div = num1 / num2;
			System.out.println("Division is:" + div);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}

}
