package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod_GetSizeMethod_GetReactMethod {

	public static void main(String[] args) {
		//Launch the browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
       //Launch the web application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
        //identify login button
       Point loginButton = driver.findElement(By.xpath("//button[text()=' Login ']")).getLocation();
       
       int xaxis = loginButton.getX(); 
       int yaxis = loginButton.getY(); 
       
       System.out.println("This is the xaxis of Login Button :"+xaxis+" "  
       		          +  "This the yaxis of Login Button:" +yaxis);
       
       Dimension loginButton1 = driver.findElement(By.xpath("//button[text()=' Login ']")).getSize();
       
       int hight = loginButton1.getHeight();
       int width = loginButton1.getWidth();
       
       System.out.println("Hight of login Button:"+hight+"+"+"width of loginButton:"+width);
       
       
       Rectangle loginButton2 = driver.findElement(By.xpath("//button[text()=' Login ']")).getRect();
       
       int xaxis1 = loginButton2.getX();
       int yaxis1 = loginButton2.getY();
       
       int h = loginButton2.getHeight();
       int w = loginButton2.getWidth();
       
       System.out.println(xaxis1+" "+yaxis1+" "+h+" "+w);

        
        
        }

}
