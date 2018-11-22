package b;

import java.util.Scanner;

public class Test67 {

	public static void main(String[] args) 
	{
		//prime number verification
	/*	int Flag=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number");
	int x=sc.nextInt();
	for(int i=2;i<x-1;i++ )
	{
		int y=x%i;
		if(y==0)
		{	
		Flag=1;
		break;
		}
	}
	if(Flag==1)
	{
		System.out.println("given number is not prime");
	}
	else
	{
	
		System.out.println("given number is prime number");
	
	
	}*/
	//fibonanki series
	//0 1 1 2 3 5.......
/*	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int s=sc.nextInt();
	int x=0;
	int y=1;
	System.out.print(x+" "+y);
	for(int i=1;i<s;i++)
	{
		int z=x+y;
		x=y;
		y=z;
		System.out.print(z);
		System.out.print(" ");
	}*/
		
//Reverse number 4456  6544
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		int z=0;
		while(x>0)
			{
			int y=x%10;
			 z=z*10+y;
			 x=x/10;
			}
		System.out.println(z);
	    
	
	
	
	
	
	
	}
}
