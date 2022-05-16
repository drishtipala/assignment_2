package conditional_statements;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,choice;
		System.out.print("Enter your choice:");
		System.out.print("1:Arithmetic Operator\n,2:Assignment Operator\n,3:Bitwise Operator\n,4:Logical Operator\n,5:Assignment Operator\n");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			int add,sub,mul,div;
			System.out.print("Enter first number:");
			a = sc.nextInt();
			System.out.print("Enter second number:");
			b = sc.nextInt();
			add = a+b;
			sub = a-b;
			mul = a*b;
			div = a/b;
			System.out.println("Addition:"+add);
			System.out.println("Subtraction:"+sub);
			System.out.println("Multiplication:"+mul);
			System.out.println("Divison:"+div);
			break;
		}
		case 2:
		{
			System.out.print("Enter first number:");
			a = sc.nextInt();
			System.out.print("Enter second number:");
			b = sc.nextInt();
			if(a>b)
			{
				System.out.println(a+" is greater than "+b);
			}
			else if(b>a)
			{
				System.out.println(b+" is greater than "+a);
			}
			else if(a==b)
			{
				System.out.println("Numbers are equal" );
			}
			else
			{
				System.out.println("Invalid numbers");
			}
			break;
		}
		case 3:
		{
			System.out.print("Enter a number:\n");
			a = sc.nextInt();
			System.out.print("Enter a number:\n");
			b = sc.nextInt();
			System.out.println("a & b = " +(a&b));
			System.out.println("a ^ b = " +(a^b));
			System.out.println("a | b = " +(a|b));
			System.out.println("a>>2 = " +(a>>2));
			System.out.println("a<<1 = " +(a<<1));	
			break;
		}
		case 4:
		{
			System.out.print("Enter a number:\n");
			a = sc.nextInt();
			System.out.print("Enter a number:\n");
			b = sc.nextInt();
			int c;
			System.out.print("Enter a number:\n");
			c = sc.nextInt();
			if((b>a)&&(c>b))
			{
				System.out.println("True");
			}
			else 
			{
				System.out.println("False");
			}
		    if((a>c)||(b>c))
			{
				System.out.println("True");
			}
			else 
			{
				System.out.println("False");
			}
		    if(!((b>a)==(c>a)))
			{
				System.out.println("True");
			}
			else 
			{
				System.out.println("False");
			}
			if((a==b)&&(b==c)&&(a==c))
			{
				System.out.println("Numbers are equal");
			}
			else
			{
				System.out.println("False");
			}	
			break;
		}
		case 5:
		{
			System.out.print("Enter a number:\n");
			a = sc.nextInt();
			System.out.print("Enter a number:\n");
			b = sc.nextInt();
			System.out.println("Variables using  = " +(a=b));
			System.out.println("Variables using  += " +(a+=b));
			System.out.println("Variables using  -= " +(a-=b));
			System.out.println("Variables using  *= " +(a*=b));
			System.out.println("Variables using  /= " +(a/=b));
			System.out.println("Variables using  %= " +(a%=b));
			break;
		 }
		default:
			System.out.println("Choice entered is invalid");
			break;
	   }
	}
}
