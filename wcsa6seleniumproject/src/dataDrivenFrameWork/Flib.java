package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public  class Flib {
	
	// it is use to store Generic reusable methods
	//all the reusable methods are non static 
	
	public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException 
	{
              FileInputStream fis = new FileInputStream(excelpath);//provide the path of the file 
             Workbook wb = WorkbookFactory.create(fis);//make the file ready  to
             Sheet sheet = wb.getSheet(sheetName);//provide sheet name
             Row row = sheet.getRow(rowCount);//get into the desire row
             Cell cell = row.getCell(cellCount);//get into the desire cell
            String data = cell.getStringCellValue();//use to read the value
            return data;
		
	}	
	
	//write the data into ecxel sheet
	public void writeExcelData(String excelpath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
	    Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		
		}
      //set the last row count from excel sheet
	  public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException 
	    {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int row = sheet.getLastRowNum();//it is use to get last count of row where we store the data 
		return row;
	   }
	
}
