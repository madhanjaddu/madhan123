package tamilnadu.chennai;

import java.util.Scanner;

public class Arrays_demo {

	public static void main(String[] args) {
		Arrays_demo ad = new Arrays_demo();
		//int[] ar = {100,100,100,100,100};
		int[] ar= {21,30,54,28,50,47,91,79};
		//int [] ar = {-19,-54,-65,87,94,93,-76};
		//ad.printarray(ar);
		//ad.print_total(ar);
		//ad.bigest_and_second_bigest();
		//ad.smallest_and_second_smallest();
		//ad.reverse_order(ar);
		//ad.print_mark(ar);
		//ad.print_mark2(ar);
		//ad.print_even_num(ar);
	    //ad.print_even_intex_num(ar);
	    //ad.print_odd_intex_num(ar);
		//ad.print_lenear_num(ar,50);
		//int[] price = {1000,450,600,300,450,450};
		//int key = 450;
        //ad.count_element(price,450);
		//ad.print_intex_num(ar);
		//ad.print_even_num_even_index(ar);
	     // ad.getbiggest();
		//ad.getbiggest_total();
		//ad.getbiggest1();
		//ad.getsmallest();
		//ad.negative_num(ar);
		//ad.countnegative_num(ar);
		//ad.adjacement_elememt();
		//ad.addition_of_arrays();
		ad.print_num(ar);
	}
	
	
	private void print_num(int[] ar) {
		// TODO Auto-generated method stub
		System.out.println(ar[5]);
		
	}


	private void addition_of_arrays() {
		
		int[] a = {10,20,30};
		int[] b = {40,50,60,70,80,90,100};
			  //      0   1   2   3   4   5     6 
		int big = a.length>b.length?a.length:b.length; //7
		int small = a.length<b.length? a.length: b.length; //3
		int[] c = new int[big]; 
		//50, 70, 90, 70
		//0	1	2
		/*
		 * c[0] = a[0] + b[0]; c[1] = a[1] + b[1]; c[2] = a[2] + b[2];
		 */

		for(int i=0; i<small; i++) //0	1	2
		{
		c[i] = a[i] + b[i]; 
		System.out.print(c[i]+" "); 
		}
		for(int i=small; i<big; i++)
		{
		c[i] = b[i]; 
		System.out.print(c[i]+" "); 
		
		}

		
	}
		
	

	private void adjacement_elememt() {
		
		int [] ar = {3,8,2,7};
		
		for(int j = 0; j<ar.length-1; j++)
		{
		int small = ar[j]<ar[j+1]?ar[j]: ar[j+1];
		int big = ar[j]>ar[j+1]? ar[j]: ar[j+1]; 
		for(int i= small; i<=big; i++)
		System.out.print(i+" "); 
		System.out.println();
		}
		}


	private void countnegative_num(int[] value) {
		int count =0;
		for(int i=0;i<value.length;i++) {
			if(value[i]<0) { 
				count++;
				}
		}
				System.out.println(count);
			
		}
		
	

	private void negative_num(int[] value) {
		
		for(int i=0;i<value.length;i++) {
			if(value[i]<0) {
				System.out.println(value[i]);
			}
		}
		
	}

	private void getsmallest() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the no of subject :");
		int count = sc.nextInt();
		int[] temperature = new int [count];
		int small = Integer.MAX_VALUE; int index = 0;
		for(int i=0;i<temperature.length;i++)
		{
			System.out.println(" enter the mark :");
			temperature[i] = sc.nextInt();
			if(temperature[i]<small) 
			{
			small = temperature[i];
			index = i;
		}
	}
	 System.out.println(" smallest num "+ small + " from the index"+ index);
}
		   
	private void getbiggest1() {
		
		
		Scanner sc = new Scanner( System.in);
		System.out.println(" no of subject ");
		int count = sc.nextInt();
		int [] marks = new int [count];
		int big = Integer.MIN_VALUE; int index =0;
		for(int i = 0;i<marks.length;i++) {
			 System.out.print(" enter the mark ");
			marks[i] = sc.nextInt();
			
		if(marks[i]>big)
		{
			big = marks[i];
			index = i;
			}
		}
        System.out.println(" biggest num "+ big + " from the index"+ index);
        
	}
	
	 
	 
	 
	 
	private void getbiggest_total() {
     
		
		Scanner sc = new Scanner( System.in);
		System.out.println(" no of subject ");
		int count = sc.nextInt();
		int [] marks = new int [count]; 
		int total = 0;
		for(int i = 0;i<marks.length;i++) {
			 System.out.print(" enter the mark ");
			marks[i] = sc.nextInt();
			total = total+ marks[i];
		} 
	 System.out.println(total);
		for(int i = 0;i<marks.length;i++) {
		System.out.print(marks[i] + " ");
	}
	}
	

	private void getbiggest() {
		Scanner sc = new Scanner( System.in);
		System.out.println(" no of subject ");
		int count = sc.nextInt();
		int [] marks = new int [count]; 
		for(int i = 0;i<marks.length;i++) {
			 System.out.print(" enter the mark ");
			marks[i] = sc.nextInt();
		} 
		System.out.println(); 
		for(int i = 0;i<marks.length;i++) {
		System.out.print(marks[i] + " ");
	}
	}

	private void print_even_num_even_index (int[] value) {
		for(int i=0;i<value.length;i++) {
			if(i%2==0 && value[i]%2==0)
			{
				System.out.print(value[i] + " ");
				}
		}
			}

	private void print_intex_num(int[] value) {
		for(int i= 0; i< value.length;i++)
		{
			System.out.println(value[i]);
		}
		
	}

	private void count_element(int[] price, int key) {
		int count=0;
		for(int i=0;i<price.length;i++) {
			if(price[i]==key) {
				count++;
			}
		}
			System.out.println(count);
			}
		
		
	

	private void print_lenear_num(int[] value, int key) {
		for(int i=0;i<value.length;i++) {
			if(value[i]==key) {
				System.out.println(" yes present the intex :" + value[i]);
				break;
			}
		}
		
	}

	private void print_odd_intex_num(int[] value) {
		for(int i=1;i<value.length;i+=2) {
			System.out.println(value[i]);
		}
		
	}

	private void print_even_intex_num(int[] value) {
		for(int i=0;i<value.length;i+=2) {
			System.out.println(value[i]);
		}
		
		
	}

	private void print_even_num(int[] value) {
		for(int i =0;i<value.length;i++) {
			if(value[i]%2==0) {
				System.out.println(value[i]);
			}
		}
		
	}

	private void print_mark2(int[] value) {
		
		int mark = 50;
		for(int i=0;i<value.length;i++) {
			if(value[i]>mark) {
				System.out.println(value[i]);
			}
		}
		
		
	}

	private void print_mark(int[] value) {
		int mark = 50;
		for(int i=0;i<value.length;i++) {
			if(value[i]<mark) {
				System.out.println(value[i]);
			}
		}
		
	}

	private void reverse_order(int[] value) {
		for(int i=value.length-1;i>=0;i--) {
			System.out.println(value[i]);
		}
	
		
	}

	private void print_total(int[] value) {
		 int total = 0;
		for(int i =0;i<value.length;i++) {
			total=total+value[i];
		}
		
		//System.out.println(" total value is " + total);
		//System.out.println(total/value.length);
		System.out.println(total*value.length);
	}

	private void printarray(int[]ar) {  // 
		
		for(int i=0;i<ar.length;i++) 
		{
			System.out.println(ar[i]);
		}
		
	}

	private void smallest_and_second_smallest() {
		int[]ar = {10,18,16,13};
		int small = Integer.MAX_VALUE; int small2 = Integer.MAX_VALUE;
		for(int i= 0; i<ar.length; i++)
		{ 
			if(ar[i]<small) 
			{
				small2 = small;
				small = ar[i];}
			else if(ar[i]<small2) 
			{
				small2 = ar[i];}
		}
		System.out.println(" smallest value is "+ small + " second smallest value"+ small2);
		
	}

		


	private void bigest_and_second_bigest() {
		int[]ar = {-10,-18,-16,-13};
		int big = Integer.MIN_VALUE; int big2 = Integer.MIN_VALUE;
		for(int i= 0; i<ar.length; i++)
		{ 
			if(ar[i]>big) 
			{
				big2 = big;
				big = ar[i];}
			else if(ar[i]>big2) 
			{
				big2 = ar[i];}
		}
		System.out.println(" bigest value is "+ big + " second bigest value"+ big2);
		
	}

}
