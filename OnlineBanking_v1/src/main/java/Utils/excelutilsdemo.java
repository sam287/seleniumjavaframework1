package Utils;

public class excelutilsdemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		Excelutils excel = new Excelutils(projectPath+ "\\Excel\\data.xlsx", "Sheet1");
		
		excel.getrowCount();
		excel.getCellDataNumber(1, 1);
		excel.getCellDataString(0, 0);

	}

}
