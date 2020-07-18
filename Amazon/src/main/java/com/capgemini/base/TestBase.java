package com.capgemini.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	String parameters = "src/test/resources/Book1.xlsx";
	String appDetails = "Sheet1";
	
	static {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Amazon\\src\\main\\resources\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Amazon\\src\\main\\resources\\geckodriver.exe");
	}
	
	
	public static void openBrowser(String browser) throws IOException {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public void closeBrowser() {
		driver.close();
	}
	
	public String getExcelData(String path, String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}
