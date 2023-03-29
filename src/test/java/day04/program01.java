package day04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	public static void main(String[] args) throws Exception {
		System.out.println(getxpath("firstname"));
		System.out.println(getdata("firstname"));
		System.out.println(getxpath("lastname"));
		System.out.println(getdata("lastname"));
	}

	public static String getxpath(String fieldname) throws Exception {
		File file=new File(".\\src\\test\\resources\\datasheet.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet sh=wb.getSheet("demo");
		DataFormatter data =new DataFormatter();
		
		for(int i=1;i<=sh.getLastRowNum();i++) {
			if(fieldname.equals(data.formatCellValue(sh.getRow(i).getCell(0)))) {
				return(data.formatCellValue(sh.getRow(i).getCell(1)));
			}
		}
		return null;
	}
	public static String getdata(String fieldname) throws Exception {
		File file=new File(".\\src\\test\\resources\\datasheet.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet sh=wb.getSheet("demo");
		DataFormatter data =new DataFormatter();
		
		for(int i=1;i<=sh.getLastRowNum();i++) {
			if(fieldname.equals(data.formatCellValue(sh.getRow(i).getCell(0)))) {
				return (data.formatCellValue(sh.getRow(i).getCell(2)));
			}
		}
		return null;
	}
}
