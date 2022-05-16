package assignment_work;

import java.util.Scanner;

public class food_ordering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
        
        int ans,choice,starter,main_course,dessert,amount = 0,bill,gst,total, quantity=1;
        
        System.out.print("\t\t-----Delight Food Corner----\t\t\n\n");
        do {       
              System.out.print("Enter choice:\n");
              System.out.print("1:Starter\n,2:Main Course\n,3:Dessert\n");
              choice = sc.nextInt();
              switch(choice)
           	  {
            	case 1:
                	System.out.print("Choose Starter from the menu:");
                	{
                 	do
        	    	{
        	        	System.out.print("1:Veggie Fries :90,2:Soup :100,3:Spring Rolls :100\n");
        	        	starter = sc.nextInt();
        	        	if(starter==1)
        	        	{
        	        		System.out.println("Your veggie fries will be served soon");
        	        		amount = amount+90;
        			
        	        	}
        	        	else if(starter==2)
                		{
        	        		System.out.println("Your soup will be served soon");
        	        		amount = amount+100;
        	        	}
                 		else if(starter==3)
        	        	{
                			System.out.println("Your Spring rolls will be served soon");
        	        		amount = amount+100;
                 		}
        	        	else
        	        	{
        	        		System.out.println("Invalid Choice");
        	         	}	
    		        	System.out.println("How much quantity would you like to order?");
    		        	quantity = sc.nextInt();
        	        	System.out.print("Do you want to add any more item? \n 1:Yes, 2:No");
        	        	ans = sc.nextInt();
        	     	}
        	    	while(ans==1);
        	    	break;
        	    }	
            	case 2:
             	{
        	        	System.out.print("Choose Main Course from the menu:");
        	        	do 
        	        	{	
        	             	System.out.print("1:Veg Thali :110,2:Punjabi Thali :120,3:Jain Thali :120\n");
        		            main_course = sc.nextInt();
        		            if(main_course==1)
        	            	{
        	              		System.out.println("Your Veg thali will be served soon");
        	             		amount = amount+110;
        	             	}
        	            	else if(main_course==2)
        	            	{
        	              		System.out.println("Your Punjabi thali will be served soon");
        	             		amount = amount+120;
        		            }
        	             	else if(main_course==3)
        	             	{
        		         	System.out.println("Your Jain thali will be served soon");
        		          	amount = amount+120;
        		       }
        		       else
              		   {
        			       System.out.println("Invalid Choice");
        		       }
        	           System.out.println("How much quantity would you like to order?");
    			       quantity = sc.nextInt();
        	           System.out.print("Do you want to add any more item? \n 1:Yes, 2:No");
        		       ans = sc.nextInt();
        		  }while(ans==1);
        		  break;
            	}
            	case 3:
        	    {
        	     	System.out.print("Choose Dessert from the menu:");
        	    	do
        	    	{
        		        System.out.print("1:Chocolate Ice-cream :90,2:Strawberry Ice-cream :90,3:Mango Ice-cream :90\n");
        	        	dessert = sc.nextInt();
        	        	if(dessert==1)
        	        	{
        	         		System.out.println("Your chococlate ice-cream will be served soon");
        	        		amount = amount+90;
        	        	}
        	        	else if(dessert==2)
                 		{
                			System.out.println("Your Strawberry ice-cream will be served soon");
        		        	amount = amount+90;
        	         	}
        	        	else if(dessert==3)
        	        	{
        	        		System.out.println("Your Mango ice-cream will be served soon");
        	        		amount = amount+90;
                		}
                		else
                		{
                 			System.out.println("Invalid Choice");
                 		}
                  		System.out.println("How much quantity would you like to order?");
    	        		quantity = sc.nextInt();
                		System.out.print("Do you want to add any more item? \n 1:Yes, 2:No");
        		        ans = sc.nextInt();
        	     	}while(ans==1);
        		    break;      		
        	     }
        	     default:
        	    	System.out.println("Invalid Choice");    	
                 }
      	         System.out.print("Do you want to add any more item? \n 1:Yes, 2:No");
		         ans = sc.nextInt();
         	}  
           while(ans==1);
          quantity = amount*quantity;
          gst=(amount/100)*18+quantity;
          total=amount+gst;
          System.out.println("Your total amount is:"+ total);
          System.out.println("Thank you for visiting.......See you soon again");
	  }
}
