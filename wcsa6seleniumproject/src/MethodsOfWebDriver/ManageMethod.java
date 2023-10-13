package MethodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) {
		// Launch the Chrome browser
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   // use manage method and set size of browser
		    Dimension targetSize = new Dimension(350, 250);
		    driver.manage().window().setSize(targetSize);
		    //use manage method and set the position if browser
		   Point taegetPosition = new Point(4500, 450);
		   driver.manage().window().setPosition(taegetPosition);
		   // full screen
		   driver.manage().window().fullscreen();
	}

}
