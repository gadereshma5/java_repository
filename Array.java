package First_package;

public class Array {

	public static void main(String[] args) {
		String[] StudName;
		StudName= new String[] {"Ted","jack","john","jerry"};
		int[] age;
		age= new int[] {20,30,24,37};
		System.out.println("The student name is "+ StudName[1]);
		System.out.println("and his age is " +age[2]);
		
		String[] subject=new String[5];
		subject[0]="CS";
		subject[1]="Toc";
		subject[2]="DOS";
		System.out.println("The subject is "+subject[2]);
	}

}
