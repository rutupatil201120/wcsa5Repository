package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//To store generic reusable methods
	//all the methods are non-static
	
	//it is Use To Read the Data from Excel Sheet
  public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
	  FileInputStream fis = new FileInputStream(excelPath);//Provide the Path of file
	  Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
	  Sheet sheet = wb.getSheet(sheetName);//get into the sheet
	  Row row = sheet.getRow(rowCount);//get into the desired row
	  Cell cell = row.getCell(cellCount);
	  String data = cell.getStringCellValue();
	  return data;
	 }
  
  //it is use to get last count of row where we store data
  public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
  {
	  FileInputStream fis = new FileInputStream(excelPath);//Provide the Path of file
	  Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
	  Sheet sheet = wb.getSheet(sheetName);//get into the sheet
	  int rc = sheet.getLastRowNum();
	  return rc;

  }
  
  //it is use to write the data into excel sheet
  public void WriteExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
  {
	  FileInputStream fis = new FileInputStream(excelPath);//Provide the Path of file
	  Workbook wb = WorkbookFactory.create(fis);//make the file for ready to read
	  Sheet sheet = wb.getSheet(sheetName);//get into the sheet
	  Row row = sheet.getRow(rowCount);//get into the desired row
	  Cell cell = row.createCell(cellCount);//Pass the cell count
	  cell.setCellValue(data);//pass the string arguments as data
	  
	  FileOutputStream fos = new FileOutputStream(excelPath);
	  wb.write(fos);
	  
  }
     

}
