package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver =  new ChromeDriver();
       driver.manage().window().maximize();
       //Launch flipkart 
       driver.get("https://www.flipkart.com");
       //read the source code of login page
        String loginPageOfSourcecode = driver.getPageSource();
		System.out.println("loginPageOfSourcecode");
		driver.close();
	}

}
