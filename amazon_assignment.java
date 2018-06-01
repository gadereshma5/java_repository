package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class amazon_assignment {

	public static void main(String[] args) throws IOException {
		try {
			File src=new File("C://Users//Admin//Desktop//Execution Status.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = wb.getSheetAt(0);//means it takes first tab sheet
		
			String ch;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter value:");
			ch=scanner.nextLine();
			System.out.println("Input="+ch);
			
			
			String URL="https://www.amazon.in/";
			System.setProperty("webdriver.chrome.driver","E:\\Project\\SeleniumProj\\Driver\\chromedriver.exe");
			WebDriver Driver=new ChromeDriver();
			Driver.get(URL);
			
			Driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ch);
			Driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']")).click();
			//Driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
			//Driver.findElement(By.id("sort")).click();
			Select rel=new Select(Driver.findElement(By.id("sort")));
			rel.selectByVisibleText("Price: High to Low");
			Thread.sleep(3000);
			List<WebElement> list1 = Driver.findElements(By.xpath("//h2[contains(@class,'a-size-base')]"));
			Thread.sleep(3000);
			System.out.println(" lists :" + list1.size());
			
			ArrayList<String> arr=new ArrayList<String>();
			for (WebElement sugg : list1) 
			{
			    System.out.println(sugg.getText());
			    arr.add(sugg.getText());
			}
      
			
			
			for(int i=0;i<arr.size();i++) 
			{
				FileOutputStream fos = new FileOutputStream(src);
				sheet1.createRow(i).createCell(0).setCellValue(arr.get(i));
			
				// finally write content
				
				wb.write(fos);
			
				
			}
			wb.close();
			
			//scanner.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
