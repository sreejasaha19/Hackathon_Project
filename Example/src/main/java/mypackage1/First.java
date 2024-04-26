package mypackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		String a=driver.getWindowHandle();
		driver.switchTo().window(a);
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		//List <WebElement> m=driver.findElements(By.partialLinkText("Shirt"));
		//System.out.println(m.size());
	}

}
