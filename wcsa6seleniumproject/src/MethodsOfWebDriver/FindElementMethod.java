package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver =new EdgeDriver();
       driver.manage().window().maximize();
       driver.get("");
       
     //idetify username textbox and pass the inputs as admin
      //to identify we use findElement Method
		//once the webElement found it return webElement
       WebElement usernametextbox = driver.findElement(By.name("username"));
       System.out.println(usernametextbox);
       usernametextbox.sendKeys("admin");
       //to identify  password text box we use findElement Method
        WebElement passwordtextbox = driver.findElement(By.name("pwd"));
        System.out.println(passwordtextbox);
        passwordtextbox.sendKeys("manager");
        
        driver.close();
	}

}
