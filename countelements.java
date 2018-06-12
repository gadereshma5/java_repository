package Package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class countelements {

	public static void main(String[] args) throws IOException {
		
		try {
			File file = new File("E:\\Study Material\\numbees.txt");
			 
			  BufferedReader br = new BufferedReader(new FileReader(file));
			  String str=null;
			  
			  while ((str = br.readLine()) != null) 
			  {
				  
				     System.out.println(str);
				     char[] ch = str.toCharArray();
					 int[] num = new int[str.length()];
					 System.out.println("Length of the string is: "+str.length());
					 for (int i = 0; i < str.length(); i++) {
					     num[i] = Character.digit(ch[i],20);
					     System.out.println(num[i]);
					     
					 }
					     int count=0;

					      for(char a='1';a<='9';a++)

					      {
					    	  count=0;
					    	  char k=a;

					    	 for(int j=0;j<str.length();j++)
					    	 {

					    		  if(k==str.charAt(j))
					    		  {
					    			  
					    			  count=count+1;
					    			
					    		  }
					    		  
					    	 }
					    	  if(count>0)
					    	  { 
					    		  
					    		  System.out.println(a+" coming "+count+" times");
					    	  }
					      }
					      
					      }
					      
			  	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}

}
