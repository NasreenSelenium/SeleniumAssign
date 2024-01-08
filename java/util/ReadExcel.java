package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		XSSFSheet sheetAt = book.getSheetAt(0);//index starts with 0 
		
		XSSFRow row = sheetAt.getRow(1);
		
		XSSFCell cell = row.getCell(1);
		
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		//to get no of rows from excel sheet
		int rowNum = sheetAt.getLastRowNum();
		//to get no of coloumns from excel sheet
		short cellNum = row.getLastCellNum();
		
		String [][] data = new String[rowNum][cellNum];
		
		System.out.println("rowNum="+rowNum);
		System.out.println("cellNum="+cellNum);
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 0; j < cellNum; j++) {
				//sheet--row--cell--value
				String allValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println("allValues= "+allValues);
				data[i-1][j]=allValues;
			}
			
		}
		book.close();
		return data;

	}

}
