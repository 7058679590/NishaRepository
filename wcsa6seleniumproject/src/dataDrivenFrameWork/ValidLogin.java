package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.get("http://localhost/login.do");
         
         Thread.sleep(2000);
         
         //read the valid username in orangeHRM
          FileInputStream fls = new FileInputStream("./data/ActiTimeTestData.xlsx");
          Workbook wb = WorkbookFactory.create(fls);
          Sheet sheet = wb.getSheet("validcreds");
          Row row = sheet.getRow(1);
          Cell cell = row.getCell(0);
          String username = cell.getStringCellValue();
          
          Thread.sleep(2000);

          FileInputStream fls1 = new FileInputStream("");
          Workbook wb1 = WorkbookFactory.create(fls1);
          Sheet sheet1 = wb1.getSheet("validcreds");
          Row row1 = sheet1.getRow(1);
          Cell cell1 = row1.getCell(0);
          String password = cell.getStringCellValue();
          
          Thread.sleep(2000);
          
          driver.findElement(By.name(username)).sendKeys("username");
          Thread.sleep(2000);
          driver.findElement(By.name(password)).sendKeys("password");
          Thread.sleep(2000);
          driver.findElement(By.id("loginButton")).click();
          Thread.sleep(2000);
          driver.quit();
          
            
	}

}
