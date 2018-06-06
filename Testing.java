package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

	public static void main(String[] args) {
		//print path of the current project
		String path=System.getProperty("user.dir");
		System.out.println(path);
		
		//print path of the drivers
		String driverpath= path+("\\Driver\\geckodriver.exe");
		System.out.println(driverpath);
		
		//open browser
		System.setProperty("webdriver.gecko.driver",driverpath);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.popuptest.com/popuptest2.html");
		
		//get title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		//get page source
		//String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
		
		//get current url
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//close current window
		driver.close();
		
		//close all windows
		//driver.quit();
		
		
		
	}

}
