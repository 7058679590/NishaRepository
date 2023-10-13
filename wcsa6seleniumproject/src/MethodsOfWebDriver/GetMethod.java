package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//parent browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch webApplication 
		driver.get("http://omayo.blogspot.com");
		
		driver.close();
		
	}

}
