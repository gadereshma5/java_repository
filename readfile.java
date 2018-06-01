package package1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readfile {

	public static void main(String[] args) throws IOException {
		try {
			
			 File src=new File("C://Users//Admin//Desktop//Execution Status.xlsx");
			 FileInputStream fis=new FileInputStream(src); 
			 XSSFWorkbook wb=new XSSFWorkbook(fis); 
			 XSSFSheet sheet1=wb.getSheetAt(0); 
			 String data=sheet1.getRow(0).getCell(0).getStringCellValue();
			 System.out.println(" " +data); 
			 wb.close();
			 

			/*// Import excel sheet.

			File src = new File("C://Users//Admin//Desktop//Execution Status.xlsx");
			// Load the file.
			FileInputStream finput = new FileInputStream(src);
			// Load the workbook.
			XSSFWorkbook workbook = new XSSFWorkbook(finput);
			// Load the sheet in which data is stored.
			XSSFSheet sheet1 = workbook.getSheetAt(0);
			for (int i = 1; i <= sheet1.getLastRowNum(); i++)

			{

				// Import data for Email.

				XSSFCell cell = sheet1.getRow(i).getCell(0);
				System.out.println(cell.getStringCellValue());
				cell = sheet1.getRow(i).getCell(1);
				System.out.println(cell.getStringCellValue());

			}
			workbook.close();*/
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
