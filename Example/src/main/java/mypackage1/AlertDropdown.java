package mypackage1;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String b=driver.findElement(By.xpath("//*[@class='example']/p")).getText();
		if(b.contains("Congratulations")) {
			System.out.println("test case passed");
		}else {
			System.out.println("test case failed");
		}
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> a=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		System.out.println(a.size());
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i).getText());
		}
//		for(int i=0;i<a.size();i++) {
//			String b=a.get(i).getText();
//			if(b.equals("selenium download")) {
//				b.get(i).click();
//				break;
//			}
//		}
		driver.get("https://the.internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.alertIsPresent());
		//switching to alert window
		Alert aletwindow=driver.switchTo().alert();
		//fetch the text of alert window
		System.out.println(aletwindow.getText());
		//accept the alert
		aletwindow.accept();
		//cancel the alert
		aletwindow.dismiss();
		//alert having input box
		aletwindow.sendKeys("welcome");
		aletwindow.accept();
		///validation of the input entered in the alert
		String c=driver.findElement(By.id("result")).getText();
		if(c.equals("You entered: welcome")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test passed");
		}
		//in this we can not just directly switch to the alert window
		//for this we need to bypass the url using the username and password in it
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		//http://the-internet.herokuapp.com/basic_auth
//		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
//		String b=driver.findElement(By.xpath("//p[contains(text(),'Congratulation!')]")).getText();
//		if(b.contains("Congratulations")) {
//			System.out.println("test case passed");
//		}else {
//			System.out.println("test case failed");
//		}
		
	}

}
