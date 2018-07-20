package KeywordDriven;
 
import org.openqa.selenium.chrome.ChromeDriver;

 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class Actions 
{
 public static WebDriver driver;
  
 
 
 public static void openBrowser()
 { 
 System.setProperty("webdriver.chrome.driver", "E:\\Project\\SeleniumProj\\Driver\\chromedriver.exe");
 driver=new ChromeDriver();
 
 }
  
 public static void navigate(String site)
 { 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get(site);
 }
  
 public static void type(String cmd)
 {
 driver.get(cmd);
	//driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("iphone");
	
 }
 
 public static void click(String clk)
 {
	 driver.get(clk);
	 
 	//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	 ////*[@id="nav-link-yourAccount"]
 }

 public static void closeBrowser()
 {
 driver.quit();
 }




}