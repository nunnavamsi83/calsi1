package mobile;

import java.util.Scanner;
public class Calsi
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculator is started to exit type 'x'");
		double store=0;
		double t=sc.nextDouble();
		store=t;
		System.out.println(t);
		for (double o=1;true;o++)
		{
			char a=sc.next().charAt(0);
			
			 if (a=='+')
			{
				
				double d=sc.nextDouble();
				store=d+store;
				System.out.println();
				System.out.println(store);
				
			}
			else if (a=='-')
			{
				double s=sc.nextDouble();
				store=store-s;
				t=0;
				System.out.println();
				System.out.println(store);
				
			}
			else if (a=='*')
			{
				double v=sc.nextDouble();
				store=store*v;
				t=1;
				System.out.println();
				System.out.println(store);
				
			}
			else if (a=='/')
			{
				double c=sc.nextDouble();
				store=store/c;
				System.out.println();
				System.out.println(store);
				
			}
			else if (a=='%')
			{
				store=(store)/100;
				System.out.println();
				System.out.println(store);
			}
			
			else if (a=='=')
			{
				System.out.println(store);
				store=0;
				double m=sc.nextDouble();
				store=m;
				System.out.println(store);
			}
            else if (a=='x')
            {
            	System.out.println("*************exit**************");
				break;
			}      
			else 
			{
				System.out.println("enter a valid symbole ");
			}
		}
	}
}