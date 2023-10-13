package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {

		// read data into "IPL" sheet
		FileInputStream fis = new FileInputStream("");
         Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("ipl");
		 Row row = sheet.getRow(1);
		 //create the new cell into the 1st row
		 Cell cell = row.createCell(2);
		 //pass the value for cell
		 cell.setCellValue("ramchi");
		 
		  // to write the data
		   FileOutputStream fos = new FileOutputStream("");
		   wb.write(fos);
		 
		 
		 
		
		
		
		
		
		
		
	}

}
