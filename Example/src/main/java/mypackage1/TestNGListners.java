package mypackage1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGListners {
	WebDriver driver;
	
	@Test(priority=1)
	void test1() {
		Assert.assertEquals(1,1);
	}
	@Test(priority=2)
	void test2() {
		Assert.assertEquals("A","B");
	}
	@Test(priority=3,dependsOnMethods={"test2"})
	void test3() {
		System.out.println("a");
	}
		// TODO Auto-generated method stub
		//testNG listners is used to perform post actions
		//2 ways we can use testNG listners
		//1)ITestListners ---- Interface
		//2)TestListnerAdapter ----- class
		//Methods of TestNG Listners are:
		//OnTestStart(), OnTestFailure(), OnTestSuccess(), OnTestSkipped()
	//once you have executed the program, some test cases may pass, some may fail so based on the result we will
	//perform some actions. so this is called post actions. to perform post actions we use testNG listners.
	//we have to update the result in a report
	//post actions means report generation,updating test case status in the report, capturing screenshot
	
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
	}
	@Test(priority=4)
	void testlogo() {
		try {
		WebElement a=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		boolean status=a.isDisplayed();
		Assert.assertTrue(status);
		}catch(NoSuchElementException e) {
			Assert.assertTrue(false);
		}
	}
	@Test(priority=5)
	void login() {
		driver.findElement(By.id("Email")).sendKeys("sd@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("test@19");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		String a=driver.getTitle();
		String b="nopCommerce demo store";
		System.out.println(a);
		Assert.assertEquals(a, b);
		try {
			Assert.assertEquals(true,false);
		}catch(Exception e) {
			Assert.fail();
		}
	}
	
	@Test(priority=6)
	void logout() {
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		boolean status1=driver.findElement(By.xpath("//a[normalize-space()='Register']")).isDisplayed();
		Assert.assertTrue(status1);
	}
	@AfterClass
	void teardown() {
		driver.quit();
	}

}
