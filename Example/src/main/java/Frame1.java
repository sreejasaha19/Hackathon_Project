import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://the-internet.herokuapp.com/iframe");
//		driver.switchTo().frame("mce_0_ifr");
//		WebElement a=driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
//		a.clear();
//		a.sendKeys("Welcome");
//		driver.switchTo().defaultContent();	}
		int year = 1900;
        if (year % 4 == 0 && year % 100 != 0  || year % 400 == 0){
        	System.out.println(year + " is a leap year.");
        }
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3}; 
		int count=0;
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {
                	count++;
                	System.out.println(arr[j]);
                }  
            }  
        }  
        System.out.println(count);
        String ah="321abba123",r="";
        String c=ah.replaceAll("[a-z]","");
        int b;
        int i=ah.length()-1; 
        try{ 
        	b=Integer.parseInt(c); System.out.println(b);
        	} 
        catch(Exception e) { System.out.println(e);
        e.printStackTrace();}
        finally
        {
        	while(i>=0){
        	r=r+ah.charAt(i);
        	i--;
        	
        } 
        if(ah.equals(r)) System.out.println(r+" is pallindrome");
        else System.out.println(r+" is not pallindrome");
	}
        int dfg=10;
        int aa=0,cc=1;
        int dd=0;
        for(int gf=0;gf<10;gf++) {
        	aa=cc;
        	cc=dd;
        	dd=aa+cc;
            System.out.println(dd);
        }
        String act="323";
        String rev="";
        for(int k=act.length()-1;k>=0;k--) {
        	rev=rev+act.charAt(k);
        }
        System.out.println(rev);
        
        int sum=0;
        for(int l=0;l<10;l++) {
        	sum+=l;
        }
        System.out.println(sum);
        
        
}
}
