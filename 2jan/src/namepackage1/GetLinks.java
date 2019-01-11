package namepackage1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;

public class GetLinks {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxProfile fp= new FirefoxProfile();
		FirefoxBinary fb= new FirefoxBinary();
		
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\Browser drivers\\geckodriver.exe");
		WebDriver dr= new FirefoxDriver(options);
		dr.get("https://www.ebay.com/");
		dr.manage().window().maximize();
//		List<WebElement> li=dr.findElements(By.tagName("a"));
//		System.out.println(li.size());
////		for(WebElement k:li)
////		{
////			System.out.println(k.getText());
////		}
//		WebElement col1=dr.findElement(By.xpath("//div[@id='gf-BIG']//tr//td[1]"));
//		List<WebElement> li2=col1.findElements(By.tagName("a"));
//		System.out.println(li2.size());
//		for(WebElement k:li2)
//		{
//		String a= k.getText();
//		System.out.println(a);
//		}
//		System.out.println("Title : "+dr.getTitle());

		String title1=dr.getTitle();
		System.out.println(title1);
		WebElement col2=dr.findElement(By.xpath("//div[@id='gf-BIG']//tr//td[2]"));
		List<WebElement> li3=col2.findElements(By.tagName("a"));
		for(WebElement k1:li3)
		{
		String ab= k1.getText();
//		System.out.println(ab);
		if(ab.equalsIgnoreCase("Site Map"))
		{
			k1.click();
	
			break;
		}
		}
		Thread.sleep(5000);
		String title2=dr.getTitle();
//		System.out.println("Title : "+title2);
//		if(title1.equalsIgnoreCase(title2))
//		{
//			System.out.println("Fail");
//		}
//		else
//		{System.out.println("Pass");}
		
		Assert.assertNotEquals(title1, title2, "Pass");;
	
		dr.close();

}}
