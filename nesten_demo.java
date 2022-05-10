package main_demo;

import java.util.Scanner;


public class nesten_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
        char gender,m,f;
        System.out.println("Enter your gender");
        gender = sc.next().charAt(0);
        System.out.println("Enter your age");
        age  = sc.nextInt();
        if(gender == 'm' &&  age > 60) 
        {
            System.out.println("The RI is 7%");
        }
        
        else  if (gender == 'f' && age >60 ) {
                System.out.println("The Ri is 7.5%");
        }
                
                else if (gender == 'm' &&  age<60){
                        System.out.println("The Ri is 5%");
                      }
                else if (gender == 'f' &&  age<60){
                    System.out.println("The Ri is 5%");
                  }
                else
          
                {
                	System.out.println("Invalid");
                }
             
             }
            
           
            {
            System.out.println("You have enterd invalid nummber");
        }
        
	}
         
            

		
			
			
		
		
		
		

	


