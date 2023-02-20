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

public class AddSbuFunTest extends DriverIntialization {
	static AddSbuFunPage asfp = new AddSbuFunPage();
	static AddSbuUITest UI = new AddSbuUITest();
	static LoginTest lt = new LoginTest();
	static boolean ButtonVisible = true;
	static boolean ButtonEnable = true;
	static int ActualTotalPage = 1;
	static int TotalRow = 0;
	static boolean TableData = false;

//	Click Master
	public static void ClickMaster() throws InterruptedException {
		PageFactory.initElements(driver, asfp);
		Thread.sleep(2500);
		AddSbuFunPage.Master.click();
//		 String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
//	        System.out.println("**********The name of this method is: " + methodName);
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

	}

//	Click Save Sbu Button
	public static void ClickSaveSbu() {
		PageFactory.initElements(driver, asfp);
		AddSbuFunPage.SaveBtn.click();
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

//		driver.navigate().refresh();
//		Thread.sleep(2000);
	}
	public static void InputSbuData() throws InterruptedException, IOException {
		PageFactory.initElements(driver, asfp);
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("AddSbu");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {

			XSSFRow row = sheet.getRow(i);
			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String sbu = (String) row.getCell(1).getStringCellValue();
			String description = (String) row.getCell(2).getStringCellValue();

			Thread.sleep(2000);
//		AddSbuFunPage.AddSBU.click();
			if (check) {
				AddSbuFunPage.SBUName.sendKeys(sbu);
				AddSbuFunPage.Des.sendKeys(description);
//				STEP 9 : Check SBU Save Button UI Testcases
				UI.SbusaveButton();
//				STEP 10 : Check SBU Save Button Click
				ClickSaveSbu();
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

	@Test
	public static void AddSbuFunction() throws InterruptedException, IOException {
		PageFactory.initElements(driver, asfp);
		PageFactory.initElements(driver, lt);

		lt.Login();
		ClickMaster();
		ClickPlant();
		ClickSbu();
//		STEP 1 : Check Add SBU Button UI Testcases
		UI.addsbubutton();
//		STEP 2 : Check Add SBU Button Click
		ClickAddSBU();
//		STEP 3 : Check SBU Modal UI Testcases
		UI.addsbuModal();
//		STEP 4 : Check SBU Modal Heading UI Testcases
		UI.addsbutext();
//		STEP 5 : Check SBU Text UI Testcases
		UI.sbutext();
//		STEP 6 : Check SBU Description UI Testcases
		UI.description();
//		STEP 7 : Check SBU TextBox UI Testcases
		UI.sbutextbox();
//		STEP 8 : Check SBU Description UI Testcases
		UI.descriptiontextbox();
//		STEP 9 : INPUT DATA 
		InputSbuData();


	}
}













//STEP 9 : Check SBU Save Button UI Testcases
//UI.SbusaveButton();
////STEP 10 : Check SBU Save Button Click
//ClickSaveSbu();
