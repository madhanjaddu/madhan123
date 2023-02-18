package tamilnadu.chennai;

import java.util.Scanner;

public class Pass_word_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the pass word ");
		String s = sc.next();
		int caps = 0;
		int smalls =0;
		int nums = 0;
		int spc_chars = 0;
		if(s.length()<8)
		{
			System.out.println(" your passward must have at least 8 characters ");
		}
		else if(s.length()>=8)
		{
			for(int i=0;i<s.length();i++) 
			{
				if(s.charAt(0)>='A' && s.charAt(0)<='Z')
				{
					caps++; 
				}
				else
				{
					System.out.println();
				System.out.println(" Fist letter must have capital letter ");
				break;
				}
			
				if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				{
		            caps++; 
				}
				else if(s.charAt(i)>='a' && s.charAt(i)<='z')
				{
					smalls++; 
				}
				else if(s.charAt(0)>='0' && s.charAt(0)<='9')
				{
					nums++; 
				}
				else
				{
					spc_chars++;
				}
			}
			if((caps>=1) && (smalls>=1) && (spc_chars>=1))  //&& (nums>=1))
			{
				System.out.println("---------------GOOD--------------");
			    System.out.println("Strong Password");
			    System.out.println("Your Password is valid ");
			    System.out.println("Password Accepted");
			   }
			   else
			   {
			    System.out.println("---------------oops--------------");
			    System.out.println("Your Password is not valid ");
			    System.out.println("Password can not Accepted");
			    System.out.println("Your password contains minimum");
			     System.out.println("*1-uppercase*"); 
			     System.out.println("*1-lowercase*");
			     System.out.println("*1-number*");  
			     System.out.println("*1-special character*");
			   }
		}
	}
}
