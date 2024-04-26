package mypackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://webapps.tekstac.com/InvoiceUpdates/");
		driver.findElement(By.id("name")).sendKeys("Rakesh");
		driver.findElement(By.id("number")).sendKeys("123");
		driver.findElement(By.id("newUser")).click();
		driver.findElement(By.name("amount")).sendKeys("1000");
		driver.findElement(By.name("num")).sendKeys("9876543210"); // Corrected this line
		driver.findElement(By.name("comments")).sendKeys("New User Invoice");
//		WebElement a = driver.findElement(By.linkText("Category"));
//	    Select b = new Select(a);
//	    b.selectByValue("utility invoice");
		WebElement a = driver.findElement(By.xpath("//select"));
		List <WebElement> all=driver.findElements(By.cssSelector("select option"));
		String o = "Utility Invoice";

	    for(WebElement el : all) {
	        if(el.getText().contains(o)) {
	            el.click();
	        }
	    }
	    
	    
	    driver.findElement(By.cssSelector("input#submit")).click();
	}

}
