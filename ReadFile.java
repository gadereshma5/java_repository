package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		File src=new File("E:\\Selenium\\Reshma.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("The value in sheet is:"+data);
		wb.close();
	}

}
