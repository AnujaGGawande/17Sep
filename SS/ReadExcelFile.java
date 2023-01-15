package SS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium\\TestData/RediffData.xlsx");
	Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
	
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<2;col++)
			{String v = excel.getRow(row).getCell(col).getStringCellValue();
			System.out.print(v+"    ");
			}
		System.out.println();
	}
	}
}
