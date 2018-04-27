package Package1;


import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a,num,sum=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number:");
		a=scanner.nextInt();
		while(a>0)
		{
			num=a%10;
			sum=num+sum;
			a=a/10;
		}
		System.out.println(sum);
	}

}
