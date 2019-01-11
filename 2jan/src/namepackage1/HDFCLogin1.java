package namepackage1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HDFCLogin1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\Browser drivers\\geckodriver.exe");
		  FirefoxOptions option= new FirefoxOptions();
		  option.setCapability("marionette", false);
		  WebDriver dr= new FirefoxDriver(option);
		  dr.get("https://www.hdfcbank.com/");
		  WebDriverWait wait= new WebDriverWait(dr, 8000);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //a[@id='loginsubmit']")));
		  dr.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		  Thread.sleep(8000);
		  Set<String>list= dr.getWindowHandles();
		  Iterator<String> I= list.iterator();
			  String handle1= I.next();
			  Boolean b= I.hasNext();
			  System.out.println(b);		 
			  String handle2=I.next();
			  System.out.println(handle1);
			  System.out.println(handle2);
		  dr.switchTo().window(handle2);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/a[1]")));
		
		  dr.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/a[1]")).click();
		  Thread.sleep(5000);
		  dr.switchTo().frame("login_page");
		  Thread.sleep(6000);
		  System.out.println("in the frame");
		  dr.findElement(By.xpath("//input[@name=\"fldLoginUserId\"]")).sendKeys("1234");
          dr.findElement(By.xpath("/html[1]/body[1]/form[1]/table[2]/tbody[1]/tr[1]/td[2]"
          		+ "/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/table[1]"
          		+ "/tbody[1]/tr[6]/td[2]/a[1]/img[1]")).click();
          
          TakesScreenshot screen= ((TakesScreenshot)dr);
          File src= screen.getScreenshotAs(OutputType.FILE);
//          FileUtils.copyFile(src, new File("C:\\Users\\hp\\Desktop\\Screenshot\\abc.jpg"));
          FileHandler.copy(src, new File("C:\\Users\\hp\\Desktop\\Screenshot\\abc.jpg"));
          
	}

}
