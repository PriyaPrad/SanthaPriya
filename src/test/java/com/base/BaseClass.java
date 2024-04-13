package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class BaseClass {
	// selenium reuseble 

		public static WebDriver driver = null;
		
		
		public static void browser(String url) {
			
			
			driver  = new ChromeDriver();
			driver.get(url);
			
		}
		
		public static void input_text(WebElement element , String data) {
			try {
				element.sendKeys(data);
			} catch (TimeoutException e) {
				throw new RuntimeException("Unable to load the browser");
			}catch (NoSuchElementException e) {
				throw new RuntimeException("Unable to locate the element");
			}
		}
		
		public static void click_value(WebElement element) {
			element.click();
		}
		public static void clear_value(WebElement element) {
			element.clear();
		}
		
		public static void select_value(WebElement element, String data) {
			Select s = new Select(element);
			s.selectByValue(data);
		}
		
		public static String excelRead(int a, int b) {
			String value = null;
			try {
			FileInputStream fis = new FileInputStream(
						new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\Sample_Test\\src"
								+ "\\test\\resources\\TestData\\Feb_Test.xlsx"));
			Workbook wb = new XSSFWorkbook(fis);
				Sheet sheet = wb.getSheet("Sheet1");
				Row row = sheet.getRow(a);
				Cell cell = row.getCell(b);
				CellType cellType = cell.getCellType();
				
				if (cellType == cellType.STRING) {
					value= cell.getStringCellValue();
					System.out.println(value);
				} else if (cellType == cellType.NUMERIC) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sm = new SimpleDateFormat("MM/dd/yy");
						value = sm.format(dateCellValue);
						System.out.println(value);
					} else {
						double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
						value = String.valueOf(l);
					System.out.println(value);

				}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return value;

	}
	
		public static void dropDown_Value(WebElement element,String value) {
			
			try {
				Select s = new Select(element);
				s.selectByValue(value);
			} catch (Exception e) {
				throw new RuntimeException("");
			}
			
		}
		
		public static void dropDown_VisbleText(WebElement element,String value) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
			
		}
		
		public static void dropDown_Index(WebElement element,int value) {
			Select s = new Select(element);
			s.deselectByIndex(value);
			
		}
//		public static String prop_reuse(String data) {
//			String value = null;
//
//			try {
//				FileReader read = new FileReader("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\Sample_Test\\src"
//						+ "\\test\\resources\\TestData\\config.properties");
//				Properties prop = new Properties();
//				prop.load(read);
//				value = prop.getProperty(data);
//				System.out.println(value);
//			
//
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return value;
//		}

		public static void get_values(WebElement hotelBooks, String string) {
			// TODO Auto-generated method stub
			
		}
		

//		public static void screenShot() {
//		    File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		    File dest = new File(System.getProperty("user.dir")+ "/ScreenShot" + timestamp() + ".png");
//		    try {
//				FileUtils.copyFile(scr, dest);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

//		public static String timestamp() {
//		    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
//		} 

}
