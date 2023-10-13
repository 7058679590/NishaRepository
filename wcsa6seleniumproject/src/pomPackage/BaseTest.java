package pomPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import KeyWordDrivenFrameWork.Flib;
import KeyWordDrivenFrameWork.IautoConstant;

public class BaseTest extends Flib implements IautoConstant {
    	
    	private static final String PROP_PATH = null;
		static WebDriver driver;
    	public void openBrowser()throws IOException 
    	{
    		//read the data from property file to get the BrowserValue and Url
    		Flib flib = new Flib();
    		String browservalue = flib.readPropertyDat(PROP_PATH,"Browser");
    		String url = flib.readPropertyDat(PROP_PATH,"Url");
    		
    	
            if (browservalue.equalsIgnoreCase("Chrome")) 
            {
				driver=new ChromeDriver();
			}
            else if(browservalue.equalsIgnoreCase("firefox"))
            {
            	driver=new FirefoxDriver();
            }
           
            else if(browservalue.equalsIgnoreCase("Edge"))
            {
            	driver=new EdgeDriver();
            }
            
         
            else
            {
             System.out.println("entr the valid Browser value!!!");
			}
    		
    		//maximize the browser
            driver.manage().window().maximize();
            //apply implicit wait 
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            //launch the WebApplication 
            driver.get(url);
    		
    	}
    	
    	public void closebrowser() 
    	{
    		driver.quit();
    	}
    	
    	
  }
    	
    

