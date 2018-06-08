package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.commons.io.FileUtils;

import com.google.common.io.Files;

public class FileTransfer_assignment {
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		//create directory
		File dir = new File("E:\\");
		int a=65;
		char i=(char)a;
		
		for(i=65;i<=90;i++) {
			File file1 = new File(dir+""+i+".txt");
			file1.createNewFile();
			File f=new File(dir+""+i+"");
			f.mkdir();
			 
		}

	}

}



