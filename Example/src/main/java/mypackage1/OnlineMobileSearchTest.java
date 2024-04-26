package mypackage1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class OnlineMobileSearchTest {
	WebDriver driver;
	OnlineMobileSearch on;
	
	
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=0)
	void testSearch() {
		on=new OnlineMobileSearch(driver);
		on.search("mobile smartphones under 30000");
	}
	

	@Test(priority=1, dependsOnMethods= {"testSearch"})
	void testSearchResult() throws IOException {
		 on.searchResult();
		 on.takeScreenshot();
	}
	@Test(priority=2, dependsOnMethods= {"testSearch"})
	void testSortList(){
		on.sortList("Newest Arrivals");
	}
	@Test(priority=3,dependsOnMethods= {"testSearch","testSortList"})
	void testSelectedOption() {
		Assert.assertEquals(on.verifySelectedOption(), "Newest Arrivals");
	}
	@Test(priority=4)
	void testScreenshot() throws IOException {
		on.takeScreenshot1();
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
