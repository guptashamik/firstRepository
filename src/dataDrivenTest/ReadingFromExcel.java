package dataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingFromExcel {

	public static void main(String[] args) throws IOException {
//		try {
			FileInputStream file = new FileInputStream("C:\\Users\\ShamikGupta\\Documents\\Selenium\\Read from selenium.xlsx");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("EMP");
		//XSSFSheet sheet = workbook.getSheet(0);		//Excel worksheet index starts from 0
		
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		
		for (int i=0; i<rowcount; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			
			for (int j=0; j<columncount; j++) {
				String currentCell = currentRow.getCell(j).toString();
				System.out.print(" "+ currentCell);

			}
			System.out.println();
		}
		
	}

}
