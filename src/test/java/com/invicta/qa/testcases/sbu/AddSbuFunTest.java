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
import org.openqa.selenium.Keys;
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

public class AddSbuFunTest extends DriverIntialization {
	static AddSbuFunPage asfp = new AddSbuFunPage();
	static boolean ButtonVisible = true;
	static boolean ButtonEnable = true;
	static int ActualTotalPage = 1;
	static boolean TableData = false;
	public static String sbu = null;
	public static boolean validation = true;
//	Click Master
	public static void ClickMaster() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		Thread.sleep(2500);
		AddSbuFunPage.Master.click();
	}

//	Click Plant
	public static void ClickPlant() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		Thread.sleep(1500);
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
//		Thread.sleep(000);
		if (AddSbuUITest.AddSbuBtnVisible && AddSbuUITest.AddSbuBtnEnable) {
			AddSbuFunPage.AddSbuButton.click();
			testCase = extent.createTest("Check Add SBU Button Click");
			try {
				Thread.sleep(1000);
				Assert.assertEquals(AddSbuFunPage.SaveBtn.isDisplayed(), true);
				testCase.log(Status.PASS, "Add SBU Button Clicking Pass ");
			} catch (AssertionError e) {
				testCase.log(Status.FAIL, "Add SBU Button Clicking Fail ");
			}
		} else {
			testCase = extent.createTest("STEP 2 : Check Add SBU Button Click");
			testCase.log(Status.INFO, "Add SBU Button Not Visible/Enable");
			testCase.log(Status.FAIL, "Dont Have Add SBU Button, So SMOKE FAIL");
		}
	}

//	Click Save Sbu Button
	public static void ClickSaveSbu() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		if (AddSbuUITest.SaveSbuBtnVisible && AddSbuUITest.SaveSbuBtnEnable) {
			AddSbuFunPage.SaveBtn.click();
			Thread.sleep(1000);
			validation=true;
			if (AddSbuFunPage.Validation.getText().contentEquals("SBU already exists")) {
				validation=false;
				testCase = extent.createTest("STEP 11 : Check SBU Save Button Click");
				testCase.log(Status.PASS, "SBU Not Allowed already exists SBU Name");
			} else if (AddSbuFunPage.Validation.getText().contentEquals("Sub Business Unit allow only letters")) {
				validation=false;
				testCase = extent.createTest("STEP 11 : Check SBU Save Button Click");
				testCase.log(Status.PASS, "SBU Not Allowed Numbers or Symbols or Spaces");
			} else if (AddSbuFunPage.Validation.getText().contentEquals("Sub Business Unit can't be empty")) {
				validation=false;
				testCase = extent.createTest("STEP 11 : Check SBU Save Button Click");
				testCase.log(Status.PASS, "SBU Not Allowed Empty Values");
			} else if (AddSbuFunPage.Validation.getText().contentEquals("Only 3 characters long!")) {
				validation=false;
				testCase = extent.createTest("STEP 11 : Check SBU Save Button Click");
				testCase.log(Status.PASS, "SBU Not Allowed Less than 3 Charactor");
			}
//			if(AddSbuFunPage.sucessmessage.isDisplayed()) {
//				testCase = extent.createTest("STEP 11 : Check SBU Save Button Click");
//				testCase.log(Status.PASS, "SBU Save Button Clicked Pass");
//			}else if (AddSbuFunPage.Validation.isDisplayed()) {
//				testCase = extent.createTest("STEP 11 : Check SBU Save Button Click");
//				testCase.log(Status.PASS, "SBU Save Button Clicked Pass");
//			} else {
//				testCase = extent.createTest("STEP 11 : Check SBU Save Button Click");
//				testCase.log(Status.FAIL, "SBU Save Button Clicked Pass");
//			}
		} else {
			testCase = extent.createTest("STEP 11 : Check SBU Save Button Click");
			testCase.log(Status.INFO, "SBU Save Button Not Visible/Enable");
			testCase.log(Status.FAIL, "Cant run this Script, SMOKE FAIL");
		}

	}

//	Check Page Count
	public static void PageCount() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		boolean Enablity = AddSbuFunPage.NextPageBtn.isEnabled();
		while (Enablity) {
			Thread.sleep(3000);
			AddSbuFunPage.NextPageBtn.click();
			ActualTotalPage = ActualTotalPage + 1;
			Enablity = AddSbuFunPage.NextPageBtn.isEnabled();
		}
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
			System.out.println("&&&&&&&");
		}
		if (TableData) {
			testCase = extent.createTest("STEP 12 :Check added data had or not in SBU Table");
			testCase.log(Status.INFO, "Searching Data : " + sbu);
			testCase.log(Status.INFO, "Finded Expected SBU in SBU Webtable");
			testCase.log(Status.PASS, "Pass this test script");
		} else {
			testCase = extent.createTest("STEP 12 :Check added data had or not in SBU Table");
			testCase.log(Status.INFO, "Finded Expected SBU Not in SBU Webtable");
			testCase.log(Status.FAIL, "Fail this test script");
		}
		if (TableData) {
			if (AddSbuFunPage.FirstRowdata.getText().contentEquals(sbu)) {
				testCase = extent.createTest("STEP 12 :Check added data had in first row in SBU Table");
				testCase.log(Status.INFO, "Actual Text : " + AddSbuFunPage.FirstRowdata.getText());
				testCase.log(Status.INFO, "Expected Text :  " + sbu);
				testCase.log(Status.INFO, "Finded Expected SBU in  SBU Webtable First Row ");
				testCase.log(Status.PASS, "Pass this test script");
			} else {
				testCase = extent.createTest("STEP 12 :Check added data had in first row in SBU Table");
				testCase.log(Status.INFO, "Actual Text : " + AddSbuFunPage.FirstRowdata.getText());
				testCase.log(Status.INFO, "Expected Text :  " + sbu);
				testCase.log(Status.INFO, "Finded Expected SBU in Not SBU Webtable First Row ");
				testCase.log(Status.FAIL, "Fail this test script");
			}
		}
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	public static void InputSbuData() throws InterruptedException, IOException {
		PageFactory.initElements(driver, asfp);
		if (AddSbuUITest.SbuTextBoxEnable) {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("add");

			int rowcount = sheet.getLastRowNum();
			for (int i = 0; i <= rowcount; i++) {

				XSSFRow row = sheet.getRow(i);
				boolean check = (boolean) row.getCell(0).getBooleanCellValue();
				sbu = (String) row.getCell(1).getStringCellValue();
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

			}
		} else {
			testCase = extent.createTest("STEP 9 : INPUT SBU and Descreption Data- SBU Data");
			testCase.log(Status.INFO, "SBU TextBox Not Enable");
			testCase.log(Status.FAIL, "SBU TextBox Not Enable, So Cant Run This Script");
		}
	} 

	public static void CancelButton() {
		PageFactory.initElements(driver, asfp);
		System.out.println(AddSbuUITest.CancelSbuBtnVisible + "***" + AddSbuUITest.CancelSbuBtnEnable);
		if (AddSbuUITest.CancelSbuBtnVisible && AddSbuUITest.CancelSbuBtnEnable) {
			AddSbuFunPage.CancelBtn.click();
			testCase = extent.createTest("STEP 4 : Cancel Button Function");
				testCase.log(Status.INFO, "Cancel Button Clicked");
				testCase.log(Status.PASS, "Cancel Button Clicked");
			

		} else {
			testCase = extent.createTest("STEP 4 : Cancel Button Function");
			testCase.log(Status.INFO, "Cancel Button Not Visible / Enable");
			testCase.log(Status.FAIL, "Cancel Button Not Visible / Enable, So Cant Run This Script");
		}

	}

//	Validation
	public static void Validation() throws IOException, InterruptedException {
		PageFactory.initElements(driver, asfp);
		Thread.sleep(1000);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("EditSBU");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String NewSbu = (String) row.getCell(1).getStringCellValue();
			String Des = (String) row.getCell(2).getStringCellValue();
			String Validation = (String) row.getCell(3).getStringCellValue();
			String Message = (String) row.getCell(4).getStringCellValue();

			if (check) {
				AddSbuFunPage.SBUName.sendKeys(NewSbu);
				AddSbuFunPage.Des.sendKeys(Des);
				AddSbuFunPage.SaveBtn.click();
				Thread.sleep(1000);
				String ActualValidation = AddSbuFunPage.Validation.getText();
				String ExpectedValidation = Validation;
				testCase = extent
						.createTest("STEP 2 : Input Test Data and Check Validation, Check " + Message + " Script");
				try {
					Assert.assertEquals(ActualValidation, ExpectedValidation);
					testCase.log(Status.INFO, "Actual Validation :- " + ActualValidation);
					testCase.log(Status.INFO, "Expected Validation :- " + ExpectedValidation);
					testCase.log(Status.PASS, "Pass " + Message + "Script");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Validation :- " + ActualValidation);
					testCase.log(Status.INFO, "Expected Validation :- " + ExpectedValidation);
					testCase.log(Status.FAIL, "Fail " + Message + "Script").assignCategory("Low Priority");
					testCase.log(Status.FAIL, "Fail " + Message + "Script").assignCategory("High Priority");
				}

			}
			Thread.sleep(1000);
			AddSbuFunPage.SBUName.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
			AddSbuFunPage.Des.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
			Thread.sleep(1000);
		}
	}
}
