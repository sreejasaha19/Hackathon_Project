package mypackage1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.findElement(By.xpath("//*[@class='widget-content']/button")).click();
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		Set<String> win=driver.getWindowHandles();
		List<String> win1=new ArrayList(win);
		String ap=win1.get(0);
		String ac=win1.get(1);
		driver.switchTo().window(ac);
		//mouse hover
		WebElement a=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement b=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		Actions act=new Actions(driver);
		act.moveToElement(a).moveToElement(b).build().perform();
		//b.click();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement c=driver.findElement(By.className("context-menu-one"));
		//for right click we should use contextClick()
		act.contextClick(c).perform();
		WebElement d=driver.findElement(By.xpath("//span[text()='Copy']"));
		d.click();
		Alert as=driver.switchTo().alert();
		as.accept();
		driver.switchTo().window(ap);
		WebElement e=driver.findElement(By.id("field1"));
		e.clear();
		e.sendKeys("1234");
		WebElement f=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		//for double click action we have to use doubleClick()
	    act.doubleClick(f).perform();
	    WebElement g=driver.findElement(By.id("field2"));
	    String h=g.getAttribute("value");
	    System.out.println(h);
		//getText() return inner text of the element
	    //getAttribute() return the value or any attribute of the element when there is no inner text
	    //if there is no value attribute it will create dynamically in runtime
	    //Drag and Drop
	    WebElement soe=driver.findElement(By.xpath("//*[@id='draggable']"));
	    WebElement toe=driver.findElement(By.xpath("//*[@id='droppable']"));
	    act.dragAndDrop(soe, toe).perform();
		//slider
//	    JavascriptExecutor jh=(JavascriptExecutor) driver;
//		jh.executeScript("window.scrollBy(0,300)");
//	    WebElement j=driver.findElement(By.xpath("//*[@id='slider']/span"));
//	    //getLocation() is used to locate the x and y axis position of the webElement
//	    System.out.println(j.getLocation());//(639, 1087)
//	    act.dragAndDropBy(soe, 730, 1087).perform();
	    driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	    //min slider
	    WebElement sd=driver.findElement(By.xpath("//*[@id='slider-range']/span"));
	    System.out.println(sd.getLocation());//(68, 130)
	    act.dragAndDropBy(sd, 100, 130).perform();
	    //max slider
	    WebElement df=driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
	    System.out.println(df.getLocation());
	    Action ast=act.dragAndDropBy(df, -100, 125).build();
	    ast.perform();
	    //Actions is a class but Action is a interface where the action is initiated and stored in a variable
	    //maximize the screen
	    driver.manage().window().maximize();
	    //minimize the screen
	    driver.manage().window().minimize();
	    //fullscreen
	    driver.manage().window().fullscreen();
	    //set any size of the window
	    Point p=new Point(100,100);
	    driver.manage().window().setPosition(p);
	    driver.get("http://demo.guru99.com/test/drag_drop.html");
	    WebElement sd1=driver.findElement(By.xpath("//*[@id='credit2']/a"));
	    WebElement sd2=driver.findElement(By.xpath("//*[@id='bank']/li"));
	    act.dragAndDrop(sd1, sd2).perform();

	}

}
