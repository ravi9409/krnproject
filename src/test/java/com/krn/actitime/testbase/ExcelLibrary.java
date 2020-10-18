package com.krn.actitime.testbase;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	
	public String getExcelData(String sheetname,int rowNum,int cellNum)
	{
		String retVal=null;
		try {
			FileInputStream fileInputStream=new FileInputStream("H:\\krn project\\data.xlsx");
			Workbook workbook=WorkbookFactory.create(fileInputStream);
			Sheet sheet=workbook.getSheet(sheetname);
			Row row=sheet.getRow(rowNum);
			Cell cell=row.getCell(cellNum);
			retVal=cell.getStringCellValue();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
		
	}
	
	public int getLastRowNumber(String sheetname)
	{
		int retVal=0;
		try {
			FileInputStream fileInputStream=new FileInputStream("H:\\krn project\\data.xlsx");
			Workbook workbook=WorkbookFactory.create(fileInputStream);
			Sheet sheet =workbook.getSheet(sheetname);
			retVal=sheet.getLastRowNum();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	
	
	
	}




