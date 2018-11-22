package b;

import java.util.Scanner;

public class Test63 {

	public static int main(String[] args) 
	{
	int i,a;
	float x=0;
	int mul=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n value");
	int n=sc.nextInt();
	while(n>0)
	{
		
		 mul=mul*n;
		 n--;	 
	}
	return mul;
	
	
	
	
	}

}
