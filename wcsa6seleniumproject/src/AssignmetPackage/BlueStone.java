package AssignmetPackage;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Launch the webApplication
        driver.get("https://www.bluestone.com/");
        
        Thread.sleep(2000);
        // handle hidden popup
        driver.findElement(By.id("denyBtn")).click();
        
        //movehover curser using action class
          WebElement ring = driver.findElement(By.xpath("//a[text()='Rings '] "));
           Actions act = new Actions(driver);
           act.moveToElement(ring).perform();
           
           //identify diamond ring 
           driver.findElement(By.xpath("//a[text()='Diamond'] ")).click();
           
           // get price list by default 
            WebElement price = driver.findElement(By.xpath("//span[text()='Price']"));
            Actions act1 = new Actions(driver);
            act1.moveToElement(price).perform();
            
        List<WebElement> pricesuggestion = driver.findElements(By.xpath("//span[@class='title style-fill i-right'] "));
        Thread.sleep(2000);
        
        
        

	}

}
