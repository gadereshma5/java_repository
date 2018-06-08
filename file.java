package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
public class file {


	
	public static void main(String[] args) throws IOException {
		
		//create directory
				String dir = "E:\\filesource\\";
				
				int a=65;
				char i=(char)a;
			
			Random rn = new Random();
			int maximum = 90;
			int minimum = 65;
				//Running loop for creating j # of files
			for(int j=1;j<=10;j++) {
					
					
					int n = maximum - minimum + 1;
					int k= rn.nextInt(n) ;
					int randomNum =  minimum + k;
					
					File file1 = new File(dir+"/"+(char)randomNum+".txt");
					file1.createNewFile();
					
					File folder4 = new File("E:\\filesource");
					 File[] listOfFiles = folder4.listFiles();

					   
					       for (int p = 0; p < listOfFiles.length; p++) {
					        
					         if (listOfFiles[p].isFile()) {
					           System.out.println("File " + listOfFiles[p].getName());
					           String str = listOfFiles[p].getName().substring(0, 1);
					           System.out.println(str);
					           File f1 = new File("E:\\destination\\" + str);
					           f1.mkdir();                  
					         
					          FileUtils.copyFileToDirectory((listOfFiles[p]), f1);
					          
					         } else if (listOfFiles[p].isDirectory()) {
					           System.out.println("Directory " + listOfFiles[p].getName());
					         }
					      }       
				}	
	}
					
			
				
	}


