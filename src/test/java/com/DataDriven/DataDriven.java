package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void particular_Data() throws IOException {
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\DataDriven\\username_password.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wrkbok=new XSSFWorkbook(fis);
		Sheet sheetAt = wrkbok.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			String s = cell.getStringCellValue();
			System.out.println(s);
		}
		else if(cellType.equals(CellType.NUMERIC)) {
			double d = cell.getNumericCellValue();
			int i=(int)d;
			System.out.println(i);
		}
		else if(cellType.equals(CellType.BLANK)) {
			String s1 = "Empty";
			System.out.println(s1);
		}
	}
	public static void main(String[] args) throws Throwable {
		particular_Data();
	}

}
