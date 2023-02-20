package com.invicta.qa.testcases.sbu;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.AddSbuFunPage;
import com.invicta.qa.pages.sbu.AddSbuUIPage;

public class ButtonTestCases extends DriverIntialization {
	static AddSbuUIPage asup = new AddSbuUIPage();
	static boolean AddSbuBtnVisible = true;
	static boolean AddSbuBtnEnable = true;

	static XSSFSheet sheet = null;
	static Object check = null;
	static char[] testcases = null;
	static char[] expectedResult = null;
	public static void ReadExcel(String ExcelTapName,int checkRow, int checkColumn,int testcaseRow, int testcaseColumn,int expectedResultRow, int expectedResultColumn) throws IOException {
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\Button.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(ExcelTapName);

		XSSFCell check = sheet.getRow(checkRow).getCell(checkColumn);
		XSSFCell testcases = sheet.getRow(testcaseRow).getCell(testcaseColumn); 
		XSSFCell expectedResult = sheet.getRow(expectedResultRow).getCell(expectedResultColumn);
	}

//	public static void AddSbuButton() {
//		PageFactory.initElements(driver, asup);
//		try {
//			Category.HighHigh("ADD SBU BUTTON VISIBLE", String.valueOf(AddSbuFunPage.AddSbuButton.isDisplayed()),
//					String.valueOf(true));
//		} catch (AssertionError e) {
//			AddSbuBtnVisible = false;
//			Category.HighHigh("ADD SBU BUTTON VISIBLE", String.valueOf(AddSbuFunPage.AddSbuButton.isDisplayed()),
//					String.valueOf(true));
//		} catch (NoSuchElementException e) {
//			AddSbuBtnVisible = false;
//			Category.HighHigh("ADD SBU BUTTON VISIBLE", String.valueOf(AddSbuFunPage.AddSbuButton.isDisplayed()),
//					String.valueOf(true));
//		}
//		if (AddSbuBtnVisible) {
//			try { 
//				Category.HighHigh("ADD SBU BUTTON ENABLE", String.valueOf(AddSbuFunPage.AddSbuButton.isEnabled()),
//						String.valueOf(true));
//			} catch (AssertionError e) {
//				AddSbuBtnEnable = false;
//				Category.HighHigh("ADD SBU BUTTON ENABLE", String.valueOf(AddSbuFunPage.AddSbuButton.isEnabled()),
//						String.valueOf(true));
//			}
//
//			if (AddSbuBtnEnable) {
//
//			}
//
//		}
//
//	}



	public static void AddSbuBtnVisible() throws IOException {
		PageFactory.initElements(driver, asup);
		ReadExcel("AddSbu",0,0,0,0,0,0);
		if (check.equals("TRUE")) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			try {
				Category.HighHigh(String.valueOf(testcases), String.valueOf(AddSbuFunPage.AddSbuButton.isDisplayed()),
						String.valueOf(expectedResult));
			} catch (AssertionError e) {
				AddSbuBtnVisible = false;
				Category.HighHigh(String.valueOf(testcases), String.valueOf(AddSbuFunPage.AddSbuButton.isDisplayed()),
						String.valueOf(expectedResult));
			} catch (NoSuchElementException e) {
				AddSbuBtnVisible = false;
				Category.HighHigh(String.valueOf(testcases), String.valueOf(AddSbuFunPage.AddSbuButton.isDisplayed()),
						String.valueOf(expectedResult));
			}
		}
		
	}

	public static void AddSbuBtnEnable() {

	}

	public static void AddSbuBtnSize() {

	}

	public static void AddSbuBtnPosition() {

	}

	public static void AddSbuBtnBackgroundColor() {

	}

	public static void AddSbuBtnFontColor() {

	}

	public static void AddSbuBtnBorderColor() {

	}

	public static void AddSbuBtnFontType() {

	}

	public static void AddSbuBtnFontSize() {

	}

	public static void AddSbuBtnText() {

	}

	public static void AddSbuBtnBoxShadow() {

	}

	public static void AddSbuBtnPadding() {

	}

	public static void AddSbuBtnCursor() {

	}

	public static void AddSbuBtnBorderRadious() {

	}

	public static void AddSbuBtnOpacity() {

	}

	public static void AddSbuBtnFontWeight() {

	}

}
