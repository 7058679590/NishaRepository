package MethodsOfWebDriver;

import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

               WebDriver driver	=new	EdgeDriver();
               driver.manage().window().maximize();
               
               driver.get("https://www.google.com/");
               //use switch to and switch the controle to activeElement
               //on google search box
               Thread.sleep(3000);
               driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
               
	}

}
