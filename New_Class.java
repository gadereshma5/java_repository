package Package;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class New_Class {

	public static void main(String[] args) {
	
		 
	     String URL = "https://www.udemy.com/home/my-courses/learning/";
	     System.out.println(URL);
	     System.setProperty("webdriver.gecko.driver","E://Project//SeleniumProj//Driver//geckodriver.exe");
	     WebDriver geckobj = new FirefoxDriver();
	     geckobj.get(URL);
	 }
	}


