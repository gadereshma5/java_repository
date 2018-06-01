package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class filewriting {

	public static void main(String[] args)  {
		
			try {
				// TODO Auto-generated method stub
				File src = new File("C://Users//Admin//Desktop//Execution Status.xlsx");
				FileInputStream fis = new FileInputStream(src);
				
				//Create workbook
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				//HSSFWorkbook wb1= new HSSFWorkbook(fis);
				
				//Create worksheet
				XSSFSheet sheet1 = wb.getSheetAt(0);//means it takes first tab in sheet
				
				
				sheet1.getRow(0).createCell(2).setCellValue("reshma");
				
				
				FileOutputStream fos = new FileOutputStream(src);
				wb.write(fos);
				wb.close();
			}
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}			

}
