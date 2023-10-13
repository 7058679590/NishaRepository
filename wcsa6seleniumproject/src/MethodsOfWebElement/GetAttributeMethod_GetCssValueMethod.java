package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValueMethod {

	public static void main(String[] args) {
		//Launch the browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
       //Launch the web application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        //identify usrename textbox
       String attributeValue = driver.findElement(By.name("username")).getAttribute("Admin");
       
       System.out.println(attributeValue);
       //identify login button
       String cssValue = driver.findElement(By.xpath("//button[text()=' Login '] ")).getCssValue("hight");
       System.out.println(cssValue);
       
       
       
       }

}
