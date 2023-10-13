package pomPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import KeyWordDrivenFrameWork.Flib;

public class ValidLoginTestcase {

	private static final String PROP_PATH = null;
	private static final WebDriver driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		//to open and close browser
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		//perform valid Login operation
		//refer the WebElements from LoginPage pom
		LoginPage lp = new LoginPage(driver);
		//read the validUsername and validPassword
		Flib flib = new Flib();
		lp.validLogin(flib.readPropertyDat(PROP_PATH,"username"), flib.readPropertyDat(PROP_PATH,"Password"));
		Thread.sleep(2000);
		bt.closebrowser();

	}
	

}
