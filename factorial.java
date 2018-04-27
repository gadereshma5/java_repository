package Package1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int a;
		int fact=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number:");
		a= scanner.nextInt();
		
		while(a>1)
		{
			fact=fact*a;
			a=a-1;
			
		}
		System.out.println("Factorial of number is: "+fact);
	}

}
