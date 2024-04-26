package mypackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGGrouping {
	WebDriver driver=new ChromeDriver();
	@Test(priority=1,groups= {"sanity","regression"})
	void loginByemail() {
		System.out.println("Thois is login by email");
	}
	@Test(priority=3,groups= {"sanity"})
	void loginByGoogle() {
		System.out.println("Thois is login by email");
	}
	@Test(priority=5,groups= {"sanity"})
	void loginByfacebook() {
		System.out.println("This is login by facebook");
	}
	@Test(priority=2,groups= {"sanity","regression"})
	void signinemail() {
		System.out.println("Sign in by email");
	}
	@Test(priority=4,groups= {"regression"})
	void signingoogle() {
		System.out.println("Sign in by google");
	}
	@Test(priority=5,groups= {"regression"})
	void signbyfacebook() {
		System.out.println("Sign in by facebook");
	}
	@Test(priority=6,groups= {"sanity","regression"})
	void paymentbyruppees() {
		System.out.println("This payment is done by ruppees");
	}
	@Test(priority=7,groups= {"sanity"})
	void paymentbydollar() {
		System.out.println();
	}
	@Test(priority=8,groups= {"regression"})
	void paymentreturnbyBank() {
		System.out.println("This payment return by bank");
	}
	@Test(dataProvider="dp")
	void setup(String email, String password) {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
		String a=driver.getTitle();
		String b="nopCommerce demo store";
		System.out.println(a);
		Assert.assertEquals(a, b);
	}
//	@Test(priority=9)
//	void testLogin(String email, String pwd) {
//		driver=new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("Email")).sendKeys("sss@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[normalize-space='Log in']")).click();
//		
//	}
	@DataProvider(name="dp")
	String [][] c()
	{
		String [][]d= {
				{"abc@gmail.com","test@123"},
				{"ab@gmail.com","test@12"},
				{"sss@gmail.com","test@123"},
				{"ss@gmail.com","test@1234"}
		};
		return d;
	}
	//sss@gmail.com
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
