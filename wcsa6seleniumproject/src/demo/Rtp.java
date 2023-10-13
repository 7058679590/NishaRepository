package demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TO take Input from user use scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser value");
		 String Browservalue = sc.next();
		 
		 if(Browservalue.equalsIgnoreCase("chrome"))
		 {
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.close();
		 }
		 else if(Browservalue.equalsIgnoreCase("firefox"))
		 {
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.close();
		 }
		 else if(Browservalue.equalsIgnoreCase("Edge"))
		 {
			 driver = new EdgeDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(3000);
			 driver.close();
		 }
		 else
		 {
			 System.out.println("browser value is incorrect");
		 }
			 
			 
	   }		 
			 
}		 
        
	


