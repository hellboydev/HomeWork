package Demo_TestNg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class testUtility {
	

		//define all required variable above at begning itself.
	   public FileInputStream fis;
	   public FileOutputStream fos;
	   public XSSFWorkbook workbook;
	   public XSSFSheet sheet;
	   public XSSFRow row;
	   public XSSFCell cell;
	   public CellStyle style;
	   String path=null;
	   
	   //Constructor is made here and its function is to whenever i create an object (Utils_Excel) for this class. We have to pass the location of file.
	   // So this constructor take the path of file, and assign the path to local variable i.e(   String Path=null;), so it is a class variabe.

	  public void UtilsExcel(String path)
	   {
		   this.path=path;
	   }
	   
	   //Now get the code for RowCount
	   
	   public int getRowCount(String sheetName) throws IOException
	   {
		   fis=new FileInputStream(path);
		   workbook = new XSSFWorkbook(fis);
		   sheet = workbook.createSheet(sheetName);
		   
		   int rowCount=sheet.getLastRowNum();
		   workbook.close();
		   fis.close();
		   return rowCount;
		   
	   }
	   
	   // Now get code for CellCount
	   
	   public int getCellCount(String sheetName, int rowNum) throws IOException
	   {
		   fis= new FileInputStream(path);
		   workbook = new XSSFWorkbook(fis);
		   sheet=workbook.createSheet(sheetName);
		   
		   row= sheet.getRow(rowNum);
		   int cellcount=row.getLastCellNum();
		   workbook.close();
		   fis.close();
		   return cellcount;
		   	   
	   }
	   
	   //Now get code for GettingCellData
	   public String getCellData(String sheetName, int rownum, int colnum) throws IOException 
	   {
		   fis =new FileInputStream(path);
		   workbook=new XSSFWorkbook(fis);
		   sheet= workbook.createSheet(sheetName);
		   
		   row=sheet.getRow(rownum);
		  // cell=row.getCell(colnum);
		   cell=row.getCell(colnum);
		   DataFormatter formatter=new DataFormatter();
		   String data;
		   try {
			   data= formatter.formatCellValue(cell);
		   }
		   catch(Exception e)
		   {
			   data="";
		   }
		   workbook.close();
		   fis.close();
		   return data;
		   
	   }

}
