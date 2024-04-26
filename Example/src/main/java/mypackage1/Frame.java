package mypackage1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summury.html");
		//for switching to the frame
		//frame(name/id)
		//frame(WebElement)//use any webElement=driver.findElement()
		//frame(index)//it is only possible when there is only 1 frame we can simply write frame(0)
		//driver.switchTo().frame("packageListframe");	
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		//As it is locked in the current frame we need to come to main web page
		//driver.switchTo().defaultContent();
		//then again switch to the next frame
//		driver.switchTo().frame("packageFrame");	
		driver.findElement(By.linkText("Alert")).click();
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("classFrame");	
		driver.findElement(By.id("method-summary-table-tab2")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement a=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(a);
		driver.findElement(By.name("mytext1")).sendKeys("11111");
		driver.switchTo().defaultContent();
		WebElement b=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(b);
		driver.findElement(By.name("mytext2")).sendKeys("2222");
		driver.switchTo().defaultContent();
		WebElement c=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(c);
		driver.findElement(By.name("mytext3")).sendKeys("2");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("div.AB7Lab")).click();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//handelling multiple browser
		Set<String> windowids=driver.getWindowHandles();//first we have to take all ids in a set but in a set it is not possible to receive individual id
		List<String> windowid=new ArrayList(windowids);//so i m converting it to list from list we can get individual ids
		String parentid=windowid.get(0);
		String childid=windowid.get(1);
		driver.switchTo().window(childid);
		driver.findElement(By.linkText("Contact Sales")).click();
		driver.switchTo().window(parentid);
		driver.findElement(By.name("username")).sendKeys("Admin");
		//switch to different window
		for(String windowIDs:windowids) {
			String title=driver.switchTo().window(windowIDs).getTitle();
			if(title.equals("Human Resources Management Software | OrangeHRM")) {
				driver.findElement(By.linkText("Contact Sales")).click();
			}
		}
		//closing different window
		for(String windowIDs:windowids) {
			String title=driver.switchTo().window(windowIDs).getTitle();
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
		}
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ad=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		ad.sendKeys("selenium");
		ad.submit();
		List<WebElement> sd=driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a"));
		for(WebElement w:sd) {
				w.click();
		}
		Set<String> asd=driver.getWindowHandles();
		for(String asd1:asd) {
			String a1=driver.switchTo().window(asd1).getTitle();
			if(a1.equals("Selenium - Wikipedia") || a1.equals("Selenium in biology - Wikipedia") || a1.equals("Selenium (software) - Wikipedia") || a1.equals("Selenium disulfide - Wikipedia") || a1.equals("Selenium dioxide - Wikipedia")) {
				driver.close();
			}
		}
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).clear();
		
	}

}
