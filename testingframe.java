package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testingframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Project\\SeleniumProj\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		driver.switchTo().defaultContent();
		//driver.close();
		
	}

}
