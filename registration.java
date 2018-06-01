package Package;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class registration {
		
	public static void main(String[] args) {
		
		String URL="https://jqueryui.com/";
		System.setProperty("webdriver.gecko.driver","E:\\Project\\SeleniumProj\\Driver\\geckodriver.exe");
		WebDriver gecko=new FirefoxDriver();
		gecko.get(URL);
		
		gecko.findElement(By.xpath("//a[@href='https://jqueryui.com/spinner/']")).click();
		gecko.findElement(By.xpath("//iframe[@src=\"/resources/demos/spinner/default.html\" or @id=\"content\"]"));
		
		gecko.switchTo().frame(0);
		//gecko.findElement(By.xpath("//button[@id=\"destroy\"]")).click();//toggle widget button
		//gecko.findElement(By.id("spinner")).sendKeys("3"); //text box
		//gecko.findElement(By.id("disable")).click(); //toggle disable/enable button
		//gecko.findElement(By.xpath("//button[@id=\"setvalue\"]")).click(); //button set to 5
		//gecko.findElement(By.id("disable")).click(); //toggle disable/enable button
		//gecko.findElement(By.xpath("//button[@id=\"getvalue\"]")).click(); //button set to 5
		gecko.findElement(By.xpath("//span[@class=\"ui-button-icon ui-icon ui-icon-triangle-1-n\"]")).click();		
		gecko.findElement(By.xpath("//span[@class=\"ui-button-icon ui-icon ui-icon-triangle-1-n\"]")).click();
		gecko.findElement(By.xpath("//span[@class=\"ui-button-icon ui-icon ui-icon-triangle-1-s\"]")).click();
		gecko.findElement(By.xpath("//span[@class=\"ui-button-icon ui-icon ui-icon-triangle-1-s\"]")).click();
		gecko.switchTo().defaultContent();
		gecko.findElement(By.xpath("//a[@href='https://jqueryui.com/draggable/']")).click();
		
	    gecko.quit();
	}
}