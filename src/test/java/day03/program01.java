package day03;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class program01 {

	public static void main(String[] args) throws Exception {
		File file=new File(".\\src\\test\\resources\\datasheet.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet sh=wb.getSheet("test");
		
		//in this we have to specify the format
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getNumericCellValue());

		//it will store any format in string
		DataFormatter data=new DataFormatter();
		System.out.println(data.formatCellValue(sh.getRow(0).getCell(0)));
		System.out.println(data.formatCellValue(sh.getRow(1).getCell(0)));
	
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getRow(0).getLastCellNum());
		System.out.println(sh.getRow(1).getLastCellNum());
	
		for(int i = 0;i<=sh.getLastRowNum();i++) {
			System.out.println(sh.getRow(i).getCell(0));
		}
		System.out.println("************************");
		
		for(int i = 0;i<=sh.getLastRowNum();i++) {
			int cellcount=sh.getRow(i).getLastCellNum();
					for(int j=0;j<cellcount;j++) {						
						System.out.println(data.formatCellValue(sh.getRow(i).getCell(j)));						
					}
					System.out.println("completed row - "+i);
		}
		
	
	
	
	
	
	
	}
}
