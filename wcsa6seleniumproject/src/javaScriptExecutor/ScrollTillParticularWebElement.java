package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollTillParticularWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		         // Launch the browser 
				 WebDriver driver =new ChromeDriver();
				 //maximize the browser
				 driver.manage().window().maximize();
				 //apply implicitly wait
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			        
				 //Launch the WeApplication
				 driver.get("https://www.selenium.dev/");
				 
				 //scroll till particular webElement
				 //WebElement is newsText
				 
				 Thread.sleep(2000);
				 //identify news WebElement 
				 WebElement newsElement = driver.findElement(By.xpath("//h2[.='News']"));
			
		     	 File src = newsElement.getScreenshotAs(OutputType.FILE);
				 File dest = new File("./Screenshots/newsElement.png");
				 
				 Files.copy(src, dest);
				 
				 
				 //point loc = newsElement.getLocation();
				 
				 //perform scrolling till newsElement 
		//		 JavascriptExecutor jse = (JavascriptExecutor)driver;
				// jse.executeScript("window.scrollBy(+loc.getX()+","+(loc.getY()-90)+")");

				 //by passing the input as js code
				 //jse.executeAsyncScript("arguments[0].scrollIntoview(false)",newsElement);

                //take ss of newsElement




	}

}
