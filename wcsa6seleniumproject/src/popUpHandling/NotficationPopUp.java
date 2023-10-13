package popUpHandling;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class NotficationPopUp {

	public static void main(String[] args) throws InterruptedException {
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser value1!!");
		String browserValue = sc.next();
		
		
		if (browserValue.equalsIgnoreCase("chrome")) 
		{
		       //handle notification popUp in chrome
		        ChromeOptions co = new ChromeOptions();
		        co.addArguments("--disable-notifications");
		        Thread.sleep(2000);
		        WebDriver driver=new ChromeDriver(co);
		        driver.manage().window().maximize();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.get("https://www.airvistara.com/");
		}
		else if (browserValue.equalsIgnoreCase("FireFox")) 
		{
			  //handle notification popup in firefox
			   FirefoxOptions fo = new FirefoxOptions();
			   fo.addArguments("--disable-notificatons");
			   Thread.sleep(2000);
		       WebDriver driver=new FirefoxDriver(fo);
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		       driver.get("https://www.airvistara.com/");
			}
		else if (browserValue.equalsIgnoreCase("edge"))
		{
			  //handle notificationPopup in edge
			  EdgeOptions eo=new EdgeOptions();
			  eo.addArguments("--disable-notifications");
			  Thread.sleep(2000);
			  WebDriver driver =new EdgeDriver(eo);
			  driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		      driver.get("https://www.airvistara.com/");
			  }
		else
		{
          System.out.println("entre correct browservalue!!!");
		}

	}

}
//WebDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//driver.get("https://www.airasia.co.in/");
