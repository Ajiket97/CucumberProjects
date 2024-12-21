package com.aas.utilities;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static Map<String, String> getRowDataByColumnNames(String fileName, int rowNumber) throws Exception {
		String baseDir = System.getProperty("user.dir");
		String filePath = baseDir + "/src/test/resources/" + fileName + ".xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		// XSSFRow row = sheet.getRow(rowNumber);

//        String[] data = new String[2];
//        data[0] = row.getCell(0).getStringCellValue(); 
//        data[1] = row.getCell(1).getStringCellValue(); 

//		int cellCount = row.getLastCellNum();
//		String[] data = new String[cellCount];
//
//		for (int i = 0; i < cellCount; i++) {
//			data[i] = row.getCell(i).getStringCellValue();
//		}
//
//		workbook.close();
//		fis.close();
//
//		return data;
//	}

		XSSFRow headerRow = sheet.getRow(0);

		// Map to store column name and value for the given row
		Map<String, String> rowData = new HashMap<>();

		// Get the desired row
		XSSFRow dataRow = sheet.getRow(rowNumber);

		// Iterate through each cell in the header and data row
		for (int i = 0; i < headerRow.getLastCellNum(); i++) {
			String columnName = headerRow.getCell(i).getStringCellValue();
			String cellValue = dataRow.getCell(i).getStringCellValue();
			rowData.put(columnName, cellValue);
		}

		workbook.close();
		fis.close();

		return rowData;
	}

}