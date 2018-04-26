package First_package;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
	
		int[] age= new int[] {20,30,24,37,22,40};
		 
		/*for(i=0;i<age[i];i++) {
			 System.out.println("... "+age[i]);
		 }*/
		
	
		Arrays.sort(age);
		System.out.println("Sorted array is "+Arrays.toString(age));
	}
}
