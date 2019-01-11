package namepackage1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class GmailLogin extends BaseClass {

	@Test
	public static void Login() throws IOException 
	{
//		FirefoxOptions option= new FirefoxOptions();
//		option.setCapability("marionette", false);
//		WebDriver dr= new FirefoxDriver(option);
//		Properties prop= new Properties();
//		FileInputStream fis= new FileInputStream("E:\\selenium\\workspace1\\2jan\\src\\namepackage1\\abc.properties");
//		prop.load(fis);
		dr.get("https://www.google.com/intl/en-GB/gmail/about/#");
		dr.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/a[2]")).click();
//		dr.findElement(By.xpath("//p[contains(text(),'Use another account')]")).click();
//		dr.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(prop.getProperty("email"));
//		System.out.println(prop.getProperty("email"));

	}

}
