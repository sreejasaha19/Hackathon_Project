import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://testautomationpractice.blogspot.com/");
//		WebElement a=driver.findElement(By.id("country"));
//		Select b=new Select(a);
//		b.selectByValue("canada");
		String dfj="abcdefgh";
		String hgg="";
		for(int i=dfj.length()-1;i>=0;i--) {
			hgg=hgg+dfj.charAt(i);
		}
		System.out.println(hgg);
		Scanner sc=new Scanner(System.in);
		int as=sc.nextInt();
		switch(as) {
		    case 1:
		    	System.out.println("Monday");
		    	break;
		    case 2:
		    	System.out.println("Tuesday");
		    	break;
		    case 3:
		    	System.out.println("Wednesday");
		    	break;
		    case 4:
		    	System.out.println("Thrusday");
		    	break;
		    case 5:
		    	System.out.println("Friday");
		    	break;
		    case 6:
		    	System.out.println("Saturday");
		    	break;
		    case 7:
		    	System.out.println("Wednesday");
		    	break;
		    default:
		    	System.out.println("Wrong!!");
		}
		String fg="DSD";
		boolean gh=fg.matches("[aeiouAEIOU]+");
		System.out.println(gh);
		int g=0;
		while(g<5) {
			System.out.println(g);
			g++;
		}
		int f=6;
		do {
			System.out.println(f);
			f--;
		}
		while(f>0);
		int e=2,y=9;
		y=e+y;
		e=y-e;
		y=y-e;
		System.out.println(e);
		System.out.println(y);
		int ghy=10;
		int f1=0,h1=1,h2=1;
		for(int i=0;i<=ghy;i++) {
			f1=h1;
			h1=h2;
			h2=f1+h1;
			System.out.println(f1+" ");
		}
		int cf=4;
		int gfgfg=1;
		for(int i=1;i<=4;i++) {
			gfgfg=i*(i+1);
		}
		System.out.println(gfgfg);
		int[] array = {1, 2, 3, -1, -2, 4};

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));
		 int i =0;
	      int num =0;
	      //Empty String
	      String  p = "";
	      int n = 10;
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2) {
		    p = p + i + " ";
		 }	
	      }
	      System.out.println(p);
	      int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int ij = 0; ij < arr.length; ij++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[ij] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	}

}
