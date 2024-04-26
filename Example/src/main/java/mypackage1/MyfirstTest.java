package mypackage1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import net.sourceforge.tess4j.ITesseract;
//import net.sourceforge.tess4j.Tesseract;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class MyfirstTest {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		WebElement a= driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div[1]/div/div/div[1]/img"));
//		File src=a.getScreenshotAs(OutputType.FILE);
//		String path="C:\\Users\\2327239\\eclipse-workspace\\Example\\Image\\captcha.jpg";
//		FileHandler.copy(src, newFile(path));
//		ITesseract image=new Tesseract();
//		image.doOCR(new File(path));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("mobile smartphones under 30000");
        searchBox.submit();
        //String a=driver.getWindowHandle();
        //driver.switchTo().window(a);
        String adf=driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div")).getText();
        System.out.println(adf);
        if(adf.contains("mobile smartphones under 30000")) {
        	System.out.println("Test case passed");
        }else {
        	System.out.println("Test case failed");
        }
//        WebElement searchResults = driver.findElement(By.xpath("//span[contains(text(), 'of over')]"));
//        String searchText = searchResults.getText();
//        System.out.println("Search results: " + searchText + " mobile smartphones under 30000");
        WebElement sortListBox = driver.findElement(By.name("s"));
        //sortListBox.click();
        List<WebElement> jh=driver.findElements(By.className("a-dropdown-label"));
        int hj=jh.size();
        System.out.println(hj);
//        for(int i=0;i<hj;i++) {
//        	if(jh.get(i).getText().equals("Newest Arrivals")) {
//        		jh.get(i).click();
//        	}
//        }
        
        
        
        Select listbx = new Select(sortListBox);
        listbx.selectByVisibleText("Newest Arrivals");
        
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_4\"]")).click();
        String selectedOption = listbx.getFirstSelectedOption().getText();
        if (selectedOption.equals("Newest Arrivals")) {
            System.out.println("Selected option: "+ selectedOption );
        }
        else {
            System.out.println("Unexpected selected option: " + selectedOption);
        }
        //driver.quit();
      //span[@class='a-dropdown-prompt']
        
        
       
        driver.close();


				
	}

	private static File newFile(String path) {
		// TODO Auto-generated method stub
		
		String[] arr=searchText.split(" ");
        String count="";
        String range="";
        
        String patt="[0-9]+";
        if(searchText.contains("over")) {
         count=arr[3];
        range=arr[0];
        }
        else {
        	 count=arr[2];
             range=arr[0];
        }
        count=count.replaceAll(",","");
        range=range.replaceAll("-","");
       
        System.out.println(searchText);
        if(range.matches(patt) & count.matches(patt)) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        } 
	}
		return null;
	}

}
