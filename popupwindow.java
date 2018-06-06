package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popupwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\\\Project\\\\SeleniumProj\\\\Driver\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\'Go!\']")).click();
		String alertmessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertmessage);

	}

}
