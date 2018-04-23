package First_package;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String whether="Raining";
		if(whether=="Raining") {
			System.out.println("I am staying at home");
		}
		else {
			System.out.println("I am going out for a walk");
		}
		if (whether.equals("NotRaining"))
			System.out.println(" I am staying at home");
		else
			System.out.println("I am going for a walk");
	}

}
