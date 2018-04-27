package Package1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int a,num;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number:");
		a=scanner.nextInt();
		while(a>0)
		{
			num=a%10;
			System.out.println(num);
			a=a/10;
		}
	}

}
