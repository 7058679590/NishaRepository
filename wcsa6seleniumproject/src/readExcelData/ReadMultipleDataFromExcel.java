package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
            
	    //read the data from ipl sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
       for (int i = 1;i <=7; i++)
    	   
       {
	     FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	     Workbook wb = WorkbookFactory.create(fis);//make the file ready for 
		 Sheet sheet = wb.getSheet("ipl");//provide sheet name
		 Row row = sheet.getRow(3);//get into the row
		 Cell cell = row.getCell(1);//get into the  cell/column 
		 String data = cell.getStringCellValue();//it will read the value
		 System.out.println(data);
       }

		
		
		
		
	
		
		
	}

}
