package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchingitem {

	public static void main(String[] args) throws InterruptedException {
		String URL="https://www.ebay.co.uk";
		System.setProperty("webdriver.gecko.driver","E:\\Project\\SeleniumProj\\Driver\\geckodriver.exe");
		WebDriver gecko=new FirefoxDriver();
		gecko.manage().deleteAllCookies();
		gecko.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		gecko.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		gecko.get(URL);
		
		
		
		gecko.findElement(By.id("gh-ug-flex")).click();
		gecko.findElement(By.id("firstname")).sendKeys("abcdef");
		gecko.findElement(By.id("lastname")).sendKeys("ghijk");
		gecko.findElement(By.id("email")).sendKeys("i968205@nwytg.com");
		gecko.findElement(By.id("PASSWORD")).sendKeys("resh1234");
		Thread.sleep(3000);
		gecko.findElement(By.id("ppaFormSbtBtn")).click();
		gecko.findElement(By.id("sgninter")).click();
		gecko.findElement(By.id("pass")).sendKeys("resh1234");
		gecko.findElement(By.id("sgnBt")).click();
		Thread.sleep(3000);
		gecko.findElement(By.id("gh-ac")).click();
		gecko.findElement(By.id("gh-ac")).sendKeys("tshirt");
		WebElement a=gecko.findElement(By.id("gh-ac"));
		for(int i=0;i<2;i++)
		{
			a.sendKeys(Keys.ARROW_DOWN);
		}
			a.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
	}

}
