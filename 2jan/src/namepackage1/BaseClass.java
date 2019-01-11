package namepackage1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class BaseClass {

	static WebDriver dr=null;
	@Test
	public static void launch() throws IOException 
	{
		 Properties prop= new Properties();
		 FileInputStream fis= new FileInputStream("E:\\selenium\\workspace1\\2jan\\src\\namepackage1\\abc.properties");
		 prop.load(fis);
         if((prop.getProperty("Browser")).equalsIgnoreCase("firefox"))
         {
        	 FirefoxOptions option = new FirefoxOptions();
        	 dr= new FirefoxDriver(option);
         }
         else if((prop.getProperty("Browser")).equalsIgnoreCase("chrome"))
         {
        	 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Browser drivers\\chromedriver.exe");
        	 dr= new ChromeDriver();
         }
	}

}
