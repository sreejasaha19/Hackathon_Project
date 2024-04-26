package mypackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		//using tag#id
		//driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//using tag.valueOfClass
		driver.findElement(By.cssSelector("input.input_error")).sendKeys("standard_user");
		//using tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		//using tag.valueOfClass[attribute=value]
		driver.findElement(By.cssSelector("input.submit-button[name=login-button]")).click();
		String a=driver.getWindowHandle();
		driver.switchTo().window(a);
		//using tag#id
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		//using tag[attribute$=substring]
		driver.findElement(By.cssSelector("button[name*=Bike")).click();
		//xpath is basically address of an element which will traverse through the DOM(Document object Model) structure
		//from the root node.
		//It will traverse through each and every node till the element is found in the DOM
		//and it basically works on the DOM.
		//absolute xpath starts from the root node of the element where as relative xpath directly jumps to the element
		//absolute xpath does not use any attributes where as relative xpath use attributes
		//we should prefer relative xpath because absolute xpath will not work if there is any change in the web page
		
	}

}
