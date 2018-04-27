package Package1;

import java.util.Scanner;

public class ArmstrongNumber {
	

		public static void main(String[] args) {
			int a,num,sum=0;
			int original;
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter number:");
			a=scanner.nextInt();
			original=a;
			
			while(a>0)
			{
				num=a%10;
				sum=sum+(num*num*num);
				a=a/10;
			}
			if(sum==original)
			{
			System.out.println(sum);
			System.out.println("Number is armstrong number");
			}
			else
			{
			System.out.println("Number is not amstrong number");
			}
		}

	}

