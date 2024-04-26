package mypackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		List<WebElement> a=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		a.size();
		// to select all checkboxes
//		for(int i=0;i<a.size();i++) {
//			a.get(i).click();
//		}
		for(WebElement b:a) {
			b.click();
		}
		//to select last 2 checkboxes
		//first specify the starting index if you want to select last checkboxes the iterate towards the last
		for(int i=5;i<a.size();i++) {
			a.get(i).click();
		}
		//To check first three checkboxes
		//First take 0 as starting index then iterate to the desired number
		for(int i=0;i<3;i++) {
			a.get(i).click();
		}
		
		// clear/unselect the checkboxes
		for(int i=0;i<a.size();i++) {
			if(a.get(i).isSelected()) {
				a.get(i).click();
			}
			
		}
		//Using dropdown
		WebElement b=driver.findElement(By.id("country-list"));
		Select c=new Select(b);
		c.selectByVisibleText("USA");
		c.selectByValue("7");
		c.selectByIndex(3);
		
		//get all options of dropdown
		List<WebElement>d=c.getOptions();
		d.size();
		
		//all options of dropdown
		for(int i=0;i<d.size();i++) {
			d.get(i).getText();
		}
		//enhanced for loop
		for(WebElement e:d) {
			e.getText();
		}
		
		//print all options of dropdown
		for(int i=0;i<d.size();i++) {
			System.out.println(d.get(i).getText());
		}
		
		//Select multiple options from the dropdown
		for(int i=0;i<d.size();i++) {
			String f=d.get(i).getText();
			if(f.equals("Java") || f.equals("python")) {
				f.get(i).click();
			}
		}
		
		//Select any option from dropdown
		for(int i=0;i<d.size();i++) {
			String g=d.get(i).getText();
			if(g.equals("Java")) {
				g.get(i).click();
				break;
			}
		}
	}

}
