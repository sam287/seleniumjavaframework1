package Utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exceldataprovider {
	@Test (dataProvider="test1data" )
	public void test1(String Username, String Password) {
		System.out.println(Username +"  " + Password);

	}

	@DataProvider(name = "test1data")
	public Object getdata() {

		String excelPath = ("C:\\Users\\Suhas\\eclipse-workspace\\OnlineBanking_v1\\Excel\\data.xlsx");
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}

	public  Object[][] testData(String excelPath, String  sheetName) {

		@SuppressWarnings("unused")
		Excelutils excel = new Excelutils(excelPath, sheetName);

		int rowCount = 	excel.getrowCount();
		int ColCount = excel.getColCount();

		Object data [][] = new Object [rowCount-1][ColCount];

		for(int i = 1; i<rowCount; i++) {
			for (int j = 0 ; j< ColCount; j++) {
				String celldata = excel.getCellDataString(i,  j);
				System.out.print(celldata);
				data [i-1][j] = celldata;

			}

		}
		return data;

	}
}





