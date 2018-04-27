package Package1;

class A{
	int i=5, j=10;
	
	void fun() {
	System.out.println("Values of i and j are:"+i +j);
	}
	A()
	{
		System.out.println("Default constructor of class A");
	}
	
}

class B extends A{
	void fun1() {
		System.out.println("hii..");
	}
	B(){
		System.out.println("Default constructor of class B");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		//obj.fun1();
		//obj.fun();
		
	}

}
