package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestcase extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://localhost/login.do");
        
        //read the valid username and valid password from ActiTimeTestData excel file
        Flib flib = new Flib();
        
        WebElement usnTB = driver.findElement(By.name("username"));
        usnTB.sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreads",1,0));
        
        WebElement passTB = driver.findElement(By.name("pwd"));
        passTB.sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreads",1,1));
        
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
        
        
        
	}

}
