import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//Advantage- easy  to use
		//Disadvantage--
		//1)if the time is not sufficient you will get exception
		//2)it will wait for maximum timeout , this will reduce performance script
		//3)it has to be used multiple times
		
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Advantage
		//1) single time and one statement
		//2)if the element is found it will not wait for maximum time
		//Disadvantage
		//1) if the element is not found you will find exception
		
		
		//explicit wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement a=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		a.sendKeys("Admin");
		//1)condition based , it will work more efficiently
		//2)finding element is inclusive
		//3)it will wait for condition to be  true, then consider time
		//4)we need to write multiple statement for multiple elements
		
		
		//fluent wait
		FluentWait mwait=new FluentWait(driver);
		mwait.withTimeout(Duration.ofSeconds(50));
		mwait.pollingEvery(Duration.ofSeconds(10));
		//Every 10seconds it will fetch the element, if the element is found then it will return the element
		mwait.ignoring(NoSuchElementException.class);
		//for handelling the exception
		WebElement b=(WebElement) mwait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		b.sendKeys("admin123");
		//URL murl=new URL("");
		//navaigate().to(url)--- accepts url as well as string format
		//driver.get()--- method accept only string format
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();//navigating backward
		driver.navigate().forward();//navigating forward
		driver.navigate().refresh();//refreshing the window
		
		//get methods
		//1)driver.get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//2)getCurrentUrl-- it will also return string value 
		System.out.println(driver.getCurrentUrl());
		//3)getPageSource()-- it will return the html component of the page
		System.out.println(driver.getPageSource());
		//4)getTitle()
		System.out.println(driver.getTitle());
		//getWindowHandle()
		System.out.println(driver.getWindowHandle());
		//getWindowHandles()
		
		
		//conditional command
		WebElement s1=driver.findElement(By.xpath("//*[@class='orangehrm-login-branding']/img"));
		System.out.println(s1.isDisplayed());//isDisplayed()
		WebElement s2=driver.findElement(By.name("username"));
		System.out.println(s2.isEnabled());//isEnabled()
		
		//isSelected()
		driver.get("https://demo.nopcommerce.com/register");
		WebElement s3=driver.findElement(By.id("gender-male"));
		System.out.println(s3.isSelected());
		s3.click();
		System.out.println(s3.isSelected());
		//driver.close()- it just close the current browser Window where the driver is focussed
		//driver.quit()- it close all the browser windows at a time
		//full screen screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\2327239\\eclipse-workspace\\Example\\ScreenShot\\1.jpg");
		FileUtils.copyFile(src, trg);
		//particular element screenshot
		WebElement df=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src1=df.getScreenshotAs(OutputType.FILE);
		File trg1=new File("C:\\Users\\2327239\\eclipse-workspace\\Example\\ScreenShot\\2.jpg");
		FileUtils.copyFile(src1, trg1);
	}

}
