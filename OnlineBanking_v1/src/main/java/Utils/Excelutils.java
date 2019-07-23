package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getrowCount();
		getCellDataNumber(1, 1 ); 
		getCellDataString(0, 0);
	}

	public Excelutils(String excelPath, String sheetName ) { 
		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName );
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public static int getrowCount() {
		int rowCount = 0;
		try {	
			rowCount  = sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);

		} catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}
		return rowCount;
		
	}
		public static int getColCount() {
			int colCount = 0;
			try {	
				colCount  = sheet.getRow(0).getPhysicalNumberOfCells();
			
			System.out.println(colCount);
			
		} catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
			return colCount;
			
	}

	public static void getCellDataNumber(int rowNum, int colNum) {
		try {
			double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldata); 

		} catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return;
		
		}

	public static String getCellDataString(int rowNum, int colNum) {
		String celldata = null;
		try {
			celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(celldata);

		} catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return celldata;
		}

}
