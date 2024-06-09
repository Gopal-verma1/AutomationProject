package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTheDataXLSX {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\ngv40\\eclipse-workspace\\data.xlsx.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //using for sheetname.
		//XSSFSheet sheet=workbook.getSheetAt(0); //using for sheetIndexing
	   int rowcount=sheet.getLastRowNum();//returns the row count..
	    int colcount=sheet.getRow(0).getLastCellNum();//return column/cell count
	    for(int i=0; i<rowcount;i++)
	    {
	    	XSSFRow currentrow=sheet.getRow(i);//focus on current row
	    	for(int j=0; j<colcount;j++)
	    	{
	    		String value=currentrow.getCell(j).toString();//read the value from the cell
	    	    System.out.print("    " +value);
	    	}
	    	System.out.println();
	    }
	
	}

}
