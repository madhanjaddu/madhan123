package tamilnadu.chennai;

public class Patterns {
	public static void main(String[] args) {
	Patterns p1 = new Patterns();
	//p1.print12345();
	//p1.patterns1();
	//p1.patterns2();
	//p1.patterns3();
	//p1.patterns4();
	//p1.patterns5();
	//p1.patterns6();
	//p1.patterns7();
	//p1.patternsM();
	//p1.printN();
	//p1.printK();
	//p1.printI();
	//System.out.println();
	//p1.printI();
	//p1.printC();
	//p1.printA();
	//p1.printE();
	//p1.printstarpatterns();
	
	
	
	
	
	
	
	
	
	p1.revarse_the_array();
	
	
}
	
	
	
	private void revarse_the_array() {
		// TODO Auto-generated method stub
		String name = " madhan kumar";
		for(int i=0;i<name.length();i++)
		{
			if(i=='a' && i== 'z') {
			System.out.print(i);
		}
		}
	}



	private void printstarpatterns() {
		// TODO Auto-generated method stub
		
	}



	private void printE() {
		// TODO Auto-generated method stub
		for(int row=1;row<=10;row++)
		{
		for(int col=1;col<=10;col++)
		{ 
			if(row==1 || row==5 || row==10 || col==1)
		
			System.out.print(" * ");
		}
		
		System.out.println();
		}
	}
	


		
	

	private void printI() {
		for(int row=1;row<=7;row++)
		{
			//if(row==1)
				//System.out.print(" ");
			//else
			System.out.print("* ");}
		System.out.println();
		
		for(int star=1;star<=10;star++)
		{ if(star==4)
			System.out.println("* ");
		else
			System.out.print(" ");}
	    System.out.println();
	    
		for(int row=1;row<=7;row++)
		{ 
			//if(row==1)
				//System.out.print(" ");
			//else
			System.out.print("* ");}
		System.out.println();
	}




	private void printA() {
		for(int row=1;row<=7;row++)
		{ if(row==1 && row==9)
			System.out.print(" *");
		else
			System.out.print(" ");
			for(int col=1;col<=9;col++)
			{
				if(col==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("*");}
		System.out.println();
	}



	private void printC() {
		for(int row=1;row<=7;row++)
			{ System.out.print("*");}
			System.out.println();
			
		
			for(int col=1;col<=7;col++)
			{ System.out.println("*");}
			System.out.println();
			 
		
			for(int row=1;row<=7;row++)
			{
				System.out.print("*");}
			System.out.println();
					
			}
	
		
	



	private void printK() {
		for(int row= 1; row<=6;row++){
			for(int col=1;col<=4;col++){
				if(col==1) 
				      System.out.print("* "); 
					else if(col==1 || row==1 && col==4 || row==2 && col==3 || row==3 && col==2 || row==4 && col==2 || row==5 && col==3 || row==6 && col==4)
						System.out.print(" * ");
					//else if(row+col==10 && row<=col)
						//System.out.print("* ");
					else
				    System.out.print("  ");}
				  
			        System.out.println();
		}
	}

	private void printN() {
		for(int row= 1; row<=9;row++){
			for(int col=1;col<=9;col++){
				if(col==1 || col==9) 
				      System.out.print("* "); 
					else if(row==col)
						System.out.print("* ");
					//else if(row+col==10 && row<=col)
						//System.out.print("* ");
					else
				    System.out.print("  ");}
				  
			        System.out.println();
		
	}

	}

	
		
		
	

	private void patternsM(){
		for(int row= 1; row<=9;row++){
			for(int col=1;col<=9;col++){
				if(col==1 || col==9) 
				      System.out.print("* "); 
					else if(row==col && row<=5)
						System.out.print("* ");
					else if(row+col==10 && row<=col)
						System.out.print("* ");
					else
				    System.out.print("  ");}
				  
			        System.out.println();
		
	}

	}


	//int row=5;row<=1;row--) {              //making row
	   // for(int col=1;col<=row;col++) {
	    	//System.out.print(" ");}
          //for(int col=row;col>=1;col--) {
         	//System.out.print(col+" ");}
      //  System.out.println(); } 

	//private void patterns7() {
		//for(int row ;row  ;row )
		//{ 
			//for(int col  ;col  ;col )
			//{ System.out.print(col+" ");}
			//System.out.println();
		//}
		
	//}

	private void patterns7() {
		// TODO Auto-generated method stub
		
	}

	private void patterns6() {
		for(int row=5;row>=1;row--)
		{
			for(int col=row;col>=1;col--)
			{
			System.out.print(col+ " ");}
			System.out.println();
		}
		
	}

	private void patterns5() {
		for(int star=1; star<=7;star++ )
		{ System.out.print("* ");}
		System.out.println();
	
			for(int star=1;star<=9;star++)
		{
				if(star==4) {
				System.out.print("* "); 
				}
				
					else
						System.out.print(" ");
				}
				System.out.print("* ");
			
			for(int star=1; star<=7;star++ )
			{ System.out.print("* ");}
			System.out.println();
	}

	private void patterns4() {
		for(int row= 5;row>=1;row--)
		{
			for(int col= 5;col>=6-row;col--)
			{System.out.print(col+" ");}
			System.out.println();
			}
	}


	private void patterns3() {
		for(int row =1;row<=5;row++)
		{
			for(int col =5;col>=6-row;col--)
			{System.out.print(col+" ");}
			System.out.println();
		}

		
	}

	private void patterns2() {
		for(int row =1; row<=5;row++) {
			for(int col =1;col<=row;col++) {
				System.out.print(col+ " ");
			}
			System.out.println();
		}
		
	}

	private void patterns1() {
		int row=5;
		while(row>=1) {
		for(int col=row;col>=1;col--) {
			System.out.print(col +" ");
		}
		System.out.println();
		row--;
	}
		
	}
	

	private void print12345() {
	 
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=6-row;col++) {
				System.out.print(col+ " ");
		}
		System.out.println();
	}
	}
	}

	