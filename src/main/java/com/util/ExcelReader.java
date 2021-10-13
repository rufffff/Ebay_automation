package com.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	public static Workbook wb;
	public static Sheet sh; 
	public static Row row;
	public static Cell cell;
	
	public  void setExcelFile(String Path, String SheetName) throws Exception {

		try {
			
			String fileType = Path.substring(Path.indexOf(".")); 
			File f = new File(Path);
			FileInputStream is = new FileInputStream(f);
			if(fileType.equals(".xls"))
				wb = new HSSFWorkbook(is);
			else if(fileType.equals(".xlsx"))
				wb = new XSSFWorkbook(is);
			
			sh=wb.getSheet(SheetName);
		} catch (Exception e){
				throw (e);
		}
	}
	
	public  int getRowCount(String sheetName){
		int index = wb.getSheetIndex(sheetName);
		sh = wb.getSheetAt(index);
		int number=sh.getLastRowNum()+1;
		
		return number;
	}

	public  int getColumnCount(String sheetName){

		sh= wb.getSheet(sheetName);
		row = sh.getRow(0);
		
		return row.getLastCellNum();

	}
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

	public  String getCellData(int RowNum, int ColNum,String sheetName) throws Exception{

	try{
			sh= wb.getSheet(sheetName);
			cell = sh.getRow(RowNum).getCell(ColNum);
			String CellData = cell.getStringCellValue();
			return CellData;

		}catch (Exception e){
				return"";
		}
	}
	public  double getCellDataNumeric(int RowNum, int ColNum,String sheetName) throws Exception{

		try{
			sh= wb.getSheet(sheetName);
				cell = sh.getRow(RowNum).getCell(ColNum);
				double CellData = cell.getNumericCellValue();
				return CellData;

			}catch (Exception e){
					return 0;
			}
		}
	
	public  Date getCellDataDate(int RowNum, int ColNum,String sheetName) throws Exception{

		try{
			sh= wb.getSheet(sheetName);
				cell = sh.getRow(RowNum).getCell(ColNum);
				Date CellData = cell.getDateCellValue();
				return CellData;

			}catch (Exception e){
				Date CellData = cell.getDateCellValue();
				return CellData;
			}
		}
	//This method is to write in the Excel cell, Row num and Col num are the parameters

	public  void setCellData(String Path,String Result,  int RowNum, int ColNum) throws Exception	{

	try{
			row  = sh.getRow(RowNum);
			cell = row.getCell(ColNum, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
		

			if (cell == null) {
					cell = row.createCell(ColNum);
					cell.setCellValue(Result);
			
			} else {
					//Cell = Row.createCell(ColNum+2);
					cell.setCellValue(Result);
			}

	FileOutputStream fileOut = new FileOutputStream(Path);

	wb.write(fileOut);
	fileOut.flush();
	fileOut.close();

	}catch(Exception e){
		throw (e);
			}

		}
	
}
