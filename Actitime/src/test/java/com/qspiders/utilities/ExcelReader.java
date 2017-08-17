package com.qspiders.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	static File file;
	static FileInputStream inputstream;
	static Workbook wb;
	static Sheet sheets;
	static Row rows;
	static Cell cell;
	
	
	public ExcelReader(String file_Path) 
	{
		
		try {
			file = new File(file_Path);
			inputstream = new FileInputStream(file);
			wb = WorkbookFactory.create(inputstream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
			
	}
	
	
	public int getRowCount(String sheetName)
	{
		try
		{
			int rowCount = 0;
			sheets = wb.getSheet(sheetName);
			rowCount = sheets.getLastRowNum();
			return rowCount;
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			return -1;
		}
		
		
	}
	
	public int getCellCount(String sheetName,int rowNum)
	{
		try
		{
			int cellCount = 0;
			sheets = wb.getSheet(sheetName);
			Row rows = sheets.getRow(rowNum);
			for(@SuppressWarnings("unused") Cell cell : rows)
			{
				cellCount++;
			}
			return cellCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return -1;
		}
	}
	
	
	public String getCellValue(String sheetName, int rowNum, int cellNum)
	{
		sheets = wb.getSheet(sheetName);
		rows = sheets.getRow(rowNum);
		cell = rows.getCell(cellNum);
		CellType cellType = cell.getCellTypeEnum();
		if(cellType==CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		
		else if (cellType == CellType.NUMERIC) 
		{
			return new Double(cell.getNumericCellValue()).toString();
		}
		
		else
		{
			return "its invalid value";
		}
	}
	
}


