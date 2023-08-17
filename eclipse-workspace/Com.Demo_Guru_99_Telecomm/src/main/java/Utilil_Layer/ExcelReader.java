package Utilil_Layer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass{
	
	   public  static XSSFWorkbook workbook;
	    
		public static void excel_reader(String path) throws Exception {
			
			File f=new File("path");
			FileInputStream fis=new FileInputStream(f);
			 workbook=new XSSFWorkbook(fis);
		}
		
		public String getDateFromExcel(int Sheet, int rows, int cell) 
		
		{ XSSFSheet sheet= workbook.getSheetAt(Sheet);
		
		try {return sheet.getRow(rows).getCell(cell).getStringCellValue();}
	               	catch (Exception e) {
			                 double d=sheet.getRow(rows).getCell(cell).getNumericCellValue();
			                    long abc=(long)d;	
		                       	return Long.toString(abc);}}

	   public int countRows(int SheetIndex)  
	                        {	return workbook.getSheetAt(SheetIndex).getLastRowNum();}

	    public int countcells(int SheetIndex) 
	                       {      return workbook.getSheetAt(SheetIndex).getLastRowNum()-1;}



	}
