package PoiPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPoi {

	public static void main(String[] args) throws Exception  {
		
		File scr=new File("C:\\Selium 3.0\\xlsheet\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(scr);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
				
				String s=sheet1.getRow(0).getCell(0).getStringCellValue();
				String s1=sheet1.getRow(0).getCell(1).getStringCellValue();
		
				System.out.println(s);
				System.out.println(s1);
				
			sheet1.getRow(0).createCell(2).setCellValue("pass");
			sheet1.getRow(1).createCell(2).setCellValue("fail");
			FileOutputStream fo=new FileOutputStream(scr);
			wb.write(fo);
			
			wb.close();
		
		
		
		
	}

}
