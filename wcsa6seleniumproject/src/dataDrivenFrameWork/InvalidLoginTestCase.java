package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://localhost/login.do");
        
        //to read invalid usn and pass from excel sheet
        Flib flib = new Flib();
        //get the last count of row 
        int rc = flib.getLastRowCount("./data/ActiTimeTestData.xlsx","Invalidcreads");
		Thread.sleep(2000);
		for (int i = 1; i <=rc; i++) 
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","Invalidcreads",i,0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","Invalidcreads",i,1));
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
	    }

		Thread.sleep(2000);
		driver.quit();
		
	}

}
