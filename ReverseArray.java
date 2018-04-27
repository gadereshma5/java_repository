package Package1;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[]=new int[] {5,3,2,1,0};
		int i,j;
		for (i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		System.out.println(arr.length);
		for(j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}

}
