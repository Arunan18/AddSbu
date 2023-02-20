//***********************************************************************************
//* Description
//*------------
//* Add Sbu functionaltiy
//***********************************************************************************
//*
//* Author           : Suntharalingam Arunan
//* Date Written     : 10/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        20/02/2023   Arunan     Orginal Version
//*
//************************************************************************************

package com.invicta.qa.testcases.sbu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.AddSbuFunPage;
import com.invicta.qa.pages.sbu.EditSbuFunPage;
import com.invicta.qa.testcases.login.LoginTest;

public class AddSbuFunTest2 extends DriverIntialization {
	static AddSbuFunPage asfp = new AddSbuFunPage();
	static boolean ButtonVisible = true;
	static boolean ButtonEnable = true;
	static int ActualTotalPage = 1;
	static int TotalRow = 0;
	static boolean TableData = false;

	@Test
	public static void AddSbuFunction() throws InterruptedException, IOException {

//		Login Function
		LoginTest.Login();

//		Click Master
		ClickMaster();

//		Click Plant
		ClickPlant(); 

//		Click SBU
		ClickSbu();
		
		/*STEP 1 : Check Add SBU Button UI Properties (1.Visibility, 2.Enablity, 3.Size, 4.Postion, 
		5.Background-color ,6.Font-color ,7.Border-color, 8.Font-type, 9.Font-size, 10.Text , 
		11.Box-shadow, 12.Padding, 13.Cursor, 14.Border-radius, 15.Opacity, 16.Font-weight)*/
		AddSbuUITest.AddSbuButton();

//		STEP 2 : Check Add SBU Button Click
		ClickAddSBU();

//		STEP 3 : Check SBU Add Form UI Properties 
		AddSbuUITest.addsbuModal();

/*		STEP 4 : Check SBU Add Form Heading UI Properties (1.visibility, 2.Font-color, 3.Font-size, 
		4.Font-style , 5.Text-spelling,6. position, 7.padding, 8. margin, 9.shadow,10.Enablity, 
		11. Word Spacing, 12.Letter Spacing, 13.Text Align, 14. Text- Transformation, 15.Text-Line-Height, 
		16. Text-Vertical -Alignment, 17. Text - Indent, 18. Text -Decoration, 19. Text - Orientation, 20.Font-Family)*/
		AddSbuUITest.addsbutext();

/*		STEP 5 : Check SBU Text UI Properties (1.visibility, 2.Font-color, 3.Font-size, 4.Font-style , 
		5.Text-spelling,6. position, 7.padding, 8. margin, 9.shadow,10.Enablity, 11. Word Spacing, 
		12.Letter Spacing, 13.Text Align, 14. Text- Transformation, 15.Text-Line-Height, 
		16. Text-Vertical -Alignment, 17. Text - Indent, 18. Text -Decoration, 19. Text - Orientation, 20.Font-Family)*/
		AddSbuUITest.sbutext();

/*		STEP 6 : Check SBU Description UI Properties (1.visibility, 2.Font-color, 3.Font-size, 4.Font-style , 
		5.Text-spelling,6. position, 7.padding, 8. margin, 9.shadow,10.Enablity, 11. Word Spacing, 
		12.Letter Spacing, 13.Text Align, 14. Text- Transformation, 15.Text-Line-Height, 
		16. Text-Vertical -Alignment, 17. Text - Indent, 18. Text -Decoration, 19. Text - Orientation, 20.Font-Family)*/
		AddSbuUITest.description();

/*		STEP 7 : Check SBU TextBox UI Properties (1.PlaceHolder ,2.Visibility,3.Enablity, 4.Postion, 5.Background-color,
		6.Border-color, 7.Length, 8.Width, 9.Border Color, 10.Font style, 11.Font Size, 12.Font-color)*/
		AddSbuUITest.sbutextbox();

/*		STEP 8 : Check SBU Description TextBox UI Properties (1.PlaceHolder ,2.Visibility,3.Enablity, 4.Postion, 5.Background-color,
		6.Border-color, 7.Length, 8.Width, 9.Border Color, 10.Font style, 11.Font Size, 12.Font-color)*/
		AddSbuUITest.descriptiontextbox();

//		STEP 9 : INPUT SBU and Descreption Data 
		InputSbuData();



	}

//	Click Master
	public static void ClickMaster() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		Thread.sleep(2500);
		AddSbuFunPage.Master.click();
	}

//	Click Plant
	public static void ClickPlant() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		Thread.sleep(2000);
		AddSbuFunPage.Plant.click();
	}

//	Click SBU
	public static void ClickSbu() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		Thread.sleep(1000);
		AddSbuFunPage.SBU.click();
	}

//	Click Add SBU
	public static void ClickAddSBU() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		Thread.sleep(1000);
		if (AddSbuUITest.AddSbuBtnEnable) {
			AddSbuFunPage.AddSbuButton.click();
		}
		
		testCase = extent.createTest("STEP 2 : Check Add SBU Button Click");
		try {
			Thread.sleep(2000);
			Assert.assertEquals(AddSbuFunPage.SaveBtn.isDisplayed(), true);
			testCase.log(Status.PASS, "Add SBU Button Clicking Pass ");
		} catch (AssertionError e) {
			testCase.log(Status.FAIL, "Add SBU Button Clicking Fail ");
		}
	}

//	Click Save Sbu Button
	public static void ClickSaveSbu() {
		PageFactory.initElements(driver, asfp);
		AddSbuFunPage.SaveBtn.click();
		testCase = extent.createTest("STEP 11 : Check SBU Save Button Click");
		try {
			Assert.assertEquals(AddSbuFunPage.AddSbuButton.isDisplayed(), true);
			testCase.log(Status.PASS, "SBU Save Button Clicked Pass");
		} catch (AssertionError e) {
			testCase.log(Status.FAIL, "SBU Save Button Clicked Pass");
		}
		
	}

//	Check Page Count
	public static void PageCount() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		boolean Enablity = AddSbuFunPage.NextPageBtn.isEnabled();
		while (Enablity) {
			Thread.sleep(1000);
			AddSbuFunPage.NextPageBtn.click();
			ActualTotalPage = ActualTotalPage + 1;
			Enablity = AddSbuFunPage.NextPageBtn.isEnabled();
		}
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
	}

//	Check data in Web Table
	public static void CheckDataTable(String SBU) throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		for (int i = 1; i <= ActualTotalPage; i++) {
			for (WebElement ele1 : AddSbuFunPage.SbuNameColumn) {
				String value1 = ele1.getText();
				// System.out.println(value);
				if (value1.contains(SBU)) {
					TableData = true;
					break;
				}
			}
			if (TableData) {
				break;
			}
			if (AddSbuFunPage.NextPageBtn.isEnabled()) {
				Thread.sleep(1000);
				AddSbuFunPage.NextPageBtn.click();
			}
		}

		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	public static void InputSbuData() throws InterruptedException, IOException {
		PageFactory.initElements(driver, asfp);
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("add");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) { 

			XSSFRow row = sheet.getRow(i);
			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String sbu = (String) row.getCell(1).getStringCellValue();
			String description = (String) row.getCell(2).getStringCellValue();

			Thread.sleep(2000);

			if (check) {
				AddSbuFunPage.SBUName.sendKeys(sbu);
				testCase = extent.createTest("STEP 9 : INPUT SBU and Descreption Data- SBU Data");
				try {
					Assert.assertEquals(AddSbuFunPage.SBUName.getAttribute("value"), sbu);
					testCase.log(Status.INFO, "Actual Data : " + AddSbuFunPage.SBUName.getAttribute("value"));
					testCase.log(Status.INFO, "Expected Data : " + sbu);
					testCase.log(Status.PASS, "Pass this test script");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Data : " + AddSbuFunPage.SBUName.getAttribute("value"));
					testCase.log(Status.INFO, "Expected Data : " + sbu);
					testCase.log(Status.FAIL, "Fail this test script");
				}
				AddSbuFunPage.Des.sendKeys(description);
				testCase = extent.createTest("STEP 9 : INPUT SBU and Descreption Data- Descreption Data");
				try {
					Assert.assertEquals(AddSbuFunPage.Des.getAttribute("value"), description);
					testCase.log(Status.INFO, "Actual Data : " + AddSbuFunPage.Des.getAttribute("value"));
					testCase.log(Status.INFO, "Expected Data : " + description);
					testCase.log(Status.PASS, "Pass this test script");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Data : " + AddSbuFunPage.Des.getAttribute("value"));
					testCase.log(Status.INFO, "Expected Data : " + description);
					testCase.log(Status.FAIL, "Fail this test script");
				}

			}
//			Check Page count
			PageCount();
//			Check added data had or not in SBU Table
			CheckDataTable(sbu);
			
			if (TableData) {
				testCase = extent.createTest("Add SBU");
				testCase.log(Status.INFO, "Finded Expected SBU in SBU Webtable");
				testCase.log(Status.PASS, "Pass this test script");
			}
			else {
				testCase = extent.createTest("Add SBU");
				testCase.log(Status.INFO, "Finded Expected SBU Not in SBU Webtable");
				testCase.log(Status.FAIL, "Pass this test script");
			}

		}
	} 

//	public static void InputSbuData() throws InterruptedException, IOException {
//		PageFactory.initElements(driver, asfp);
//		FileInputStream file = new FileInputStream(
//				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet sheet = workbook.getSheet("add");
//
//		int rowcount = sheet.getLastRowNum();
//		for (int i = 0; i <= rowcount; i++) {
//
//			XSSFRow row = sheet.getRow(i);
//			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
//			String sbu = (String) row.getCell(1).getStringCellValue();
//			String description = (String) row.getCell(2).getStringCellValue();
//
//			Thread.sleep(2000);
//
//			if (check) {
//				AddSbuFunPage.SBUName.sendKeys(sbu);
//				testCase = extent.createTest("STEP 9 : INPUT SBU and Descreption Data- SBU Data");
//				try {
//					Assert.assertEquals(AddSbuFunPage.SBUName.getAttribute("value"), sbu);
//					testCase.log(Status.INFO, "Actual Data : " + AddSbuFunPage.SBUName.getAttribute("value"));
//					testCase.log(Status.INFO, "Expected Data : " + sbu);
//					testCase.log(Status.PASS, "Pass this test script");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO, "Actual Data : " + AddSbuFunPage.SBUName.getAttribute("value"));
//					testCase.log(Status.INFO, "Expected Data : " + sbu);
//					testCase.log(Status.FAIL, "Fail this test script");
//				}
//				AddSbuFunPage.Des.sendKeys(description);
//				testCase = extent.createTest("STEP 9 : INPUT SBU and Descreption Data- Descreption Data");
//				try {
//					Assert.assertEquals(AddSbuFunPage.Des.getAttribute("value"), description);
//					testCase.log(Status.INFO, "Actual Data : " + AddSbuFunPage.Des.getAttribute("value"));
//					testCase.log(Status.INFO, "Expected Data : " + description);
//					testCase.log(Status.PASS, "Pass this test script");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO, "Actual Data : " + AddSbuFunPage.Des.getAttribute("value"));
//					testCase.log(Status.INFO, "Expected Data : " + description);
//					testCase.log(Status.FAIL, "Fail this test script");
//				}
//
//			}
////			/*		STEP 10 : Check SBU Save Button UI Properties (1.Visibility, 2.Enablity, 3.Size, 4.Postion, 
//	5.Background-color ,6.Font-color ,7.Border-color, 8.Font-type, 9.Font-size, 10.Text , 
//	11.Box-shadow, 12.Padding, 13.Cursor, 14.Border-radius, 15.Opacity, 16.Font-weight)*/
//	AddSbuUITest.SbusaveButton();
//
////	STEP 11 : Check SBU Save Button Click
//	ClickSaveSbu();
//			
//
//		}
//	}
	
	
	
}
