package mypackage1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class OnlineMobileSearch {
	public WebDriver driver;
	public WebElement searchBox,searchResults,sortListBox;
	public Select listbx;
	public String s_option;
	public List<WebElement> countList;
	public int count;
	
	//Constructor
	OnlineMobileSearch(WebDriver driver){
		this.driver=driver;
	}
	
	//locators
	By search_text=By.id("twotabsearchtextbox");
	By result=By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[1]");
	By sort_list=By.xpath("//select[@name='s']");
	By option=By.xpath("//*[@id=\"s-result-sort-select_4\"]");
	
	
	//Action methods
	public void search(String text) {
		searchBox = driver.findElement(search_text);
        searchBox.sendKeys(text);
        searchBox.submit();
	}
	public void searchResult() {
		searchResults = driver.findElement(result);
        String searchText = searchResults.getText();
        System.out.println("Search results: " + searchText + " mobile smartphones under 30000");
	}
	public void sortList(String text) {
		sortListBox = driver.findElement(sort_list);        
        listbx = new Select(sortListBox);
        countList=listbx.getOptions();
		count=countList.size();
		System.out.println("The count of options displayed:" +(count-1));
        listbx.selectByVisibleText(text);
        driver.findElement(option).click();

	}
	public String verifySelectedOption() {
		s_option=listbx.getFirstSelectedOption().getText();
		System.out.println(s_option);
		return s_option;
	}
	public void takeScreenshot() throws IOException {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\2327239\\eclipse-workspace\\Example\\ScreenShot\\screenshot.jpg"));
	}
	public void takeScreenshot1() throws IOException {
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-bold']")));
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f1,new File("C:\\Users\\2327239\\eclipse-workspace\\Example\\ScreenShot\\screenshot1.jpg"));
	}

}
