package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeInvalidLoginTestCase  extends BaseTest{

	private static final String EXCEL_PATH = null;
	private static final String INVALID_SHEET_NAME = null;

	@Test
	public void invalidLoginTestScript() throws EncryptedDocumentException, InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getLastRowCount(EXCEL_PATH, INVALID_SHEET_NAME);
		for(int i=1;i<=rc;i++)
		{
		lp.inValidLogin(flib.readExcelData(EXCEL_PATH, INVALID_SHEET_NAME,i,0),flib.readExcelData(EXCEL_PATH, INVALID_SHEET_NAME, i,1));
		}
	}
	
}
