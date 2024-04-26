package mypackage1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataprovider {
	WebDriver driver;
//	@BeforeClass
//	void setup() {
//		driver=new ChromeDriver();
//	}
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void testlogo() {
		try {
		WebElement a=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		boolean status=a.isDisplayed();
		Assert.assertTrue(status);
		}catch(NoSuchElementException e) {
			Assert.assertTrue(false);
		}
	}
	@Test(dataProvider="dp")
	void login(String email, String password) {
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
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
	
	
	@DataProvider(name="dp",indices= {0,1})
	String [][] c()
	{
		String [][]d= {
				{"sd@gmail.com","test@19"},
				{"abc@gmail.com","test@19"},
				{"sss@gmail.com","test@123"},
				{"ss@gmail.com","test@1234"}
		};
		return d;
	}
	//we are applying data provider to avoid looping statement. we are just providing the data. 
	//not bothering about the no of times it will execute
	//if we only want to execute specific data then use indices with the particular value
	@AfterClass
	void teardown() {
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
