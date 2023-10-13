package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new EdgeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.google.com/");
	       //switch to controls active element.
	       driver.switchTo().activeElement().sendKeys("poha");
	       //identiy all the suggestion of Poha element
	       Thread.sleep(2000);
	       
	       
	}

}
