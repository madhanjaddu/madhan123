 package tamilnadu.chennai;

import java.util.Scanner;

public class Credit_Card_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner obj = new Scanner(System.in);
			System.out.println("Enter credit/debit card number");
			String no=obj.next();
			 int length=no.length();
			 
			if(length==15)
			{
				if((no.startsWith("34"))|| (no.startsWith("37")))
				{
				   System.out.println("American Express");	      
				}
				else if((no.startsWith("2123"))||(no.startsWith("1800")))
				{
					System.out.println("JCB");
				}
			}
			else if((length==13) || (length==16))
			{
				if((no.startsWith("51"))||
						(no.startsWith("52")) ||
						(no.startsWith("53")) ||
						(no.startsWith("54")) ||
						(no.startsWith("55")))
				{
					System.out.println("Master Card");
				}
				else if(no.startsWith("6011"))
				{
					System.out.println("Discover");
				}
				else if(no.startsWith("4"))
				{
					System.out.println("Visa card");
				}
				else if(no.startsWith("3"))
				{
					System.out.println("JCB");
				}
			}
			
			else if(length==14)
			{
				if((no.startsWith("36")) ||
				(no.startsWith("38"))  ||
				(no.startsWith("300")) ||
				(no.startsWith("301")) ||
				(no.startsWith("302")) ||
				(no.startsWith("303")) ||
				(no.startsWith("304")) ||
				(no.startsWith("305")))
				{
					System.out.println("Diners Club & Carte Blanche");
				}
			}
			else
			{
				System.out.println("Invalid credit/debit card number");
			}
			
			// Luhn's algorithm
		
			char ch[]=no.toCharArray();
			int dble[]=new int [ch.length/2];
			int remain[]=new int[dble.length];
			int j=0;
			
			
			// finding double of every second elements and store dble[]-- right to left
			for(int i=ch.length-2;i>=0;i-=2)
			{
				dble[j]=(ch[i]-48)*2;
				j++;
			}
			
			
			// finding remaining number of every second and store remain[] elements-- left to right
			int k=0;
			for(int i=1;i<ch.length;i+=2)
			{
				remain[k]=ch[i]-48;
				k++;
			}
			//addition of dble values
			int sum1=0;//7//16
			for(int i=0;i<dble.length;i++)//16//18//......untill dble value
			{
				int remainder=dble[i]%10;//6//8
				int quotient=dble[i]/10;//1//1
				sum1+=quotient+remainder;//0+1+6=7//7+1+8=16.....
			}
			//addition of remain values
			int sum2=0;
			for(int i=0;i<remain.length;i++)
			{
				sum2+=remain[i];//0+6=6//6+4=10//.....
			}
			
			
			int result=sum1+sum2;
			
			
			if(result%10==0)
				System.out.println("Given card number is valid");
			else
				System.out.println("Given card number is not valid");

		
			}

}



