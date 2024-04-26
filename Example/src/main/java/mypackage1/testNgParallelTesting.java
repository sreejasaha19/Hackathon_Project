package mypackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNgParallelTesting {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String d) {
		if(d.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else {
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test(priority=1)
	void testImage() {
		try {
			Thread.sleep(5000);
			boolean status=driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
			Assert.assertEquals(status, true);
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
	@Test(priority=2)
	void testTitle() {
		String a=driver.getTitle();
		Assert.assertEquals(a, "OrangeHRM");
		
	}
	@AfterClass
	void shut() {
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
