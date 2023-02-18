package tamilnadu.chennai;

public class LoopingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingProgram lp = new LoopingProgram();
        //lp.printno0();
        //lp.printno1();
		//lp.printno2();
	    //lp.printno3();
		//lp.printno4();
		//lp.printno5();
		//lp.printno6();
		//lp.printno7();
		//lp.printno8();
		//lp.printno9();
		//lp.printno10();
		//lp.printno11();
		//lp.printno13();
		//lp.printno14();
		//lp.printno15();
		//lp.printno16();
		//lp.printno17();
		//lp.print3and5multiples();
		//lp.print2and10multiples();
		//lp.print4and8multiples();
		//lp.print5or9multiples();
		//lp.devicerofgivenno();
		//lp.devicerofgivenno1();
		//lp.sumofNnumbers();
		//lp.finddivisor100();
		//lp.countofdivisorgivenno();
		//lp.prime_num(13);
		//lp.printreverse();
		//lp.printreverse(12345);
		//lp.swaping_two_num();
		//lp.swaping_two_num_withoutvariable();
		//lp.lcm(3,9);
		//lp.lcm1(3,40);
		//lp.print_fibino_series();
		//lp.printnumbers(100);
		//lp.printnum();
		//lp.factorials();
		lp.prime_num();
		
		
	}	
		   

 
	
	private void prime_num() {
		// TODO Auto-generated method stub
		int div = 1;
		int count = 0;
		int no = 13;
		while(no>div) {
			if(no%2==0) {
				System.out.println(div+" ");
			count++;
			}
		System.out.println(count);
		div = div+1;
		}
	



	if(count==0) {
		System.out.println(" its the prime num ");
		
	}
	}






	private void factorials() {
		// TODO Auto-generated method stub
		int fact = 1; int no2 = 1;
		while(no2<=5)
		{
			int no = no2;
			while(no>fact) 
			{
				fact = fact*no;
				no = no-1;
			}
			System.out.print(fact);
			no2 = no2+1;
				
			}
	}




	private void printnum() {
		// TODO Auto-generated method stub
		for(int row =1;row<=3;row++) {
		for(int no=1;no<=5;no++) {
			System.out.print(no+" ");
		}
		System.out.println();
		}
		}


	private void printnumbers(int no) {
		// TODO Auto-generated method stub
		System.out.println(no++);
		System.out.println(no);
		
		System.out.println(--no);
		System.out.println(no);
		
	}


	private void print_fibino_series() {
		// TODO Auto-generated method stub
		int first = 0; int second = 1; int third = 0;
		while(first<100) 
		{
			System.out.println(first);
			third = first+second;
			first = second;
			second = third;
		}
		
	}


	private void lcm1(int no1, int no2) {
		// TODO Auto-generated method stub
		int big = no1>no2? no1:no2;
		while(true) {
			if(big%no1==0 && big%no2==0) {
				System.out.println(" least multiple num "+ big);
				break;
			}
			big = big+1;
			}
		}
	





	private void lcm(int no1, int no2) {
		// TODO Auto-generated method stub
		int big = no1>no2? no1:no2;
		if(big%no1==0 && big%no2==0) {
			System.out.println(" least multible no "+ big);
		}
		
		
		
	}





	private void swaping_two_num_withoutvariable() {
		// TODO Auto-generated method stub
		int no1 = 200; int no2 = 300; int no3 = 500;
		no1 = no1+no2+no3;            //200+300 //  500
		no2 = no1-no2-no3;            //500-300 //  200
		no1 = no1-no2-no3;            //500-200 //  300
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
	}





	private void swaping_two_num() {
		// TODO Auto-generated method stub
		int no1 = 100;
		int no2 = 200;
		int temp_no = no1;
		no1 = no2;
		no2 = temp_no;
		System.out.println(no1);
		System.out.println(no2);
		
	}





	private void printreverse(int no) {
		// TODO Auto-generated method stub
		while(no>0) {
			System.out.print(no%10+" ");
			no = no/10;
		}
		
	}

	private void printreverse() {
		// TODO Auto-generated method stub
		int no = 32;
		while(no>0) {
			System.out.print(no%10);
		no = no/10;
		}
	
	}
		
		
	

	private void prime_num(int no) {
		// TODO Auto-generated method stub
		int count = 0;
		int div =2;       // or 2 any one (1)
		while(div<no) {
			if(no%div==0) {
				System.out.print(div+" ");
				count = count+1;
			}
			div = div+1;
		}
		System.out.println(" no of count "+ count);
		if(count==0) {
			System.out.println(" it is prime num");
		}
		else
		{
			System.out.println(" it is not prime num");
		}
		
	}

	private void countofdivisorgivenno() {
		// TODO Auto-generated method stub
		int count = 0;
		int div = 1;
		int no = 200;
		while(div<no) {
			if(no%div==0) {
				//System.out.println(div+" ");
			count = count+1;
		}
			div = div+1;
		}
		
			System.out.println(" no of count is " + count);
		
		}
	

	private void finddivisor100() {
		// TODO Auto-generated method stub
		int div = 1;
		int no = 100;
		while(div<=100) {       // or (div<no) 
			if(no%div==0) {
				System.out.print(div+" ");
			}
			div = div+1;
			}
		}
	

	private void sumofNnumbers() {
		// TODO Auto-generated method stub
		int sum = 0;
		int no = 1;
		while(no<=10) {
			sum = sum + no;
			no = no +1;
			}
		System.out.print( " sum of given num " +sum);
		
	}

	private void devicerofgivenno1() {
		// TODO Auto-generated method stub
		int div = 1;
		int no = 999;
		while(div<no) {
			if(no%div==0) {
				System.out.print(div+" ");
			}
			div = div+1;
		}
		
	}

	private void devicerofgivenno() {
		// TODO Auto-generated method stub
		int div = 1;
		int no = 100;
		while(div<no) {
			if(no%div==0) {
				System.out.print(div+" ");
			}
			div = div+1;
			}
		}


	private void print5or9multiples() {
		// TODO Auto-generated method stub
		int no = 1;
		while(no<=500) {
			if(no%2==0 || no%9==0) {
				System.out.print(no+" ");
			}
			no = no+1;
			}
		}

	private void print4and8multiples() {
		// TODO Auto-generated method stub
		int no = 1;
		while(no<=200) {
			if(no%4==0 && no%8==0) {
				System.out.print(no+" ");
			}
			no = no+1;
			}
		}
	

	private void print2and10multiples() {
		// TODO Auto-generated method stub
		int no = 1;
		while(no<=100) {
			if(no%2==0 && no%10==0) {
				System.out.print(no+" ");
			}
			no = no+1;
			}
		}
		
	
	private void print3and5multiples() {
		// TODO Auto-generated method stub
		int no = 1;
		while(no<=30) 
		{
			if(no%3==0 || no%5==0)   // use and (&&) or (||)
			{
			System.out.print(no+" ");
			}
			no = no+1;
			}
		}
		

	private void printno17() {
		// TODO Auto-generated method stub
		int no = 25;
		while(no>=5) {
			System.out.print(no+" ");
			no = no-5;
		}
		
	}

	private void printno16() {
		// TODO Auto-generated method stub
		int no = 2;
		while(no<=10) {
			System.out.print(no+" ");
			no = no+2;
		}
		
	}

	private void printno15() {
		// TODO Auto-generated method stub
		int no = 0;
		while(no<=10) {
			System.out.print(5+" ");
			no = no+1;
		}
		
	}

	private void printno14() {
		// TODO Auto-generated method stub
		int no = 0;
		while(no<=5) {
			System.out.print(1+" ");
			no = no+1;
		}
		
	}

	private void printno13() {
		// TODO Auto-generated method stub
		int no = 1;
		while(no<5) {
			System.out.println(no+" ");
			no = no+1;
		}
		
	}

	private void printno11() {
		// TODO Auto-generated method stub
		int div = 2;
		int no = 100;
		while(no<=100) {
		if(no%div==0){
			System.out.print(div+" ");
			div = div+1;
		}
		}
	}

	private void printno10() {
		// TODO Auto-generated method stub
		int no = 50;
		while(no<=1000) {
			System.out.println(no);
			no = no+50;
		}
	}

	private void printno9() {
		// TODO Auto-generated method stub
		int no = 100;
		while(no>=1) {
			System.out.println(no);
			no = no-1;
		}
		
	}

	private void printno8() {
		// TODO Auto-generated method stub
		int no = 15;
		while(no<=150) {		
			System.out.print(no+"\t");
			no = no+15;
		}
	}

	private void printno7() {
		// TODO Auto-generated method stub
		
	}

	private void printno6() {
		// TODO Auto-generated method stub
		int no = 5;
		while(no<=500) {
			System.out.print(no+" ");
			no = no+5;
		}
	}

	private void printno5() {
		// TODO Auto-generated method stub
		int no = 2;
		while(no<=100) {
			System.out.print(no+" ");
			no = no+2;
		}
		
	}

	private void printno4() {
		// TODO Auto-generated method stub
		int no = 3;
		while(no<=15) {
			System.out.print(no+"\t");
			no = no+3;
		}
		
	}

	private void printno3() {
		// TODO Auto-generated method stub
		int no = 4;
		while(no>0) {       // or (no>=1)
			System.out.print(no+" ");
			no = no-1;
			
		}
		
	}

	private void printno2() {
		// TODO Auto-generated method stub
		int no = 2;
		while(no<=100) {
			System.out.print(no+" ");
			no = no+2;
		}
	}

	private void printno1() {
		// TODO Auto-generated method stub
		int no = 30;
		while(no>=3) {
			System.out.print(no+" ");
			no = no-3;
		}
		
	}

	private void printno0() {
		// TODO Auto-generated method stub
		int no = 100;
		while(no>=10) {
			System.out.println(no);
			no = no-10;
		}
		
		
	}

}
