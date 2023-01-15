package SS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceptionalExcel {

	public static void main(String[] args) throws Exception {
		 FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium\\TestData/RediffData.xlsx");
			Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");

	for(int row=0;row<=excel.getLastRowNum();row++)  //lastRowNum=5(0 1 2 3 4)
	{	
    for(int col=0;col<excel.getRow(row).getLastCellNum();col++)		//5 4 3 2 1	
    {
    	String value = excel.getRow(row).getCell(col).getStringCellValue();
    	System.out.print(value + "\t");
    }
	}
    	System.out.println("--------------------");
    	System.out.println(excel.getLastRowNum());
    	System.out.println(excel.getRow(0).getLastCellNum());
	}
	}

