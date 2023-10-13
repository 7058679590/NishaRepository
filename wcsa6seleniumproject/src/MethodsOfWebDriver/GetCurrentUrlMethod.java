package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//Launch flipkart
		driver.get("https://www.flipkart.com");
		//read the url of login page
		String urlOfloginPage= driver.getCurrentUrl();
		System.out.println();
		driver.close();
		

	}
}