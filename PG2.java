package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG2 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","E:\\Project\\SeleniumProj\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.popuptest.com/popuptest2.html");
	driver.quit();
		
		
	}

}
