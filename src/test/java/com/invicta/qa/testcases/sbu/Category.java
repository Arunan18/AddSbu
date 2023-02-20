package com.invicta.qa.testcases.sbu;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;

public class Category extends DriverIntialization {

//	Low Severity and Low Priority Testcases
	public static void LowLow(String TstCase, String ActualResults, String ExpectedResults) {
		testCase = extent.createTest(TstCase);
		try {
			Assert.assertEquals(ActualResults, ExpectedResults);
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Low-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Low-Priority");
			testCase.log(Status.PASS, TstCase + " Script PASS");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Low-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Low-Priority");
			testCase.log(Status.FAIL, TstCase + " Script FAIL");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Low-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Low-Priority");
			testCase.log(Status.FAIL, "Dont Have "+ TstCase + " Locator");
		}
	}

//	Low Severity and Medium Priority Testcases
	public static void LowMedium(String TstCase, String ActualResults, String ExpectedResults) {
		testCase = extent.createTest(TstCase);
		try {
			Assert.assertEquals(ActualResults, ExpectedResults);
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Low-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Medium-Priority");
			testCase.log(Status.PASS, TstCase + " Script PASS");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Low-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Medium-Priority");
			testCase.log(Status.FAIL, TstCase + " Script FAIL");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Low-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Medium-Priority");
			testCase.log(Status.FAIL, "Dont Have "+ TstCase + " Locator");
		}
	}

//	Low Severity and High Priority Testcases
	public static void LowHigh(String TstCase, String ActualResults, String ExpectedResults) {
		testCase = extent.createTest(TstCase);
		try {
			Assert.assertEquals(ActualResults, ExpectedResults);
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Low-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("High-Priority");
			testCase.log(Status.PASS, TstCase + " Script PASS");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Low-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("High-Priority");
			testCase.log(Status.FAIL, TstCase + " Script FAIL");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Low-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("High-Priority");
			testCase.log(Status.FAIL, "Dont Have "+ TstCase + " Locator");
		}
	}

//	Medium Severity and Low Priority Testcases
	public static void MediumLow(String TstCase, String ActualResults, String ExpectedResults) {
		testCase = extent.createTest(TstCase);
		try {
			Assert.assertEquals(ActualResults, ExpectedResults);
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Medium-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Low-Priority");
			testCase.log(Status.PASS, TstCase + " Script PASS");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Medium-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Low-Priority");
			testCase.log(Status.FAIL, TstCase + " Script FAIL");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Medium-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Low-Priority");
			testCase.log(Status.FAIL, "Dont Have "+ TstCase + " Locator");
		}
	}

//	Low Severity and Medium Priority Testcases
	public static void MediumMedium(String TstCase, String ActualResults, String ExpectedResults) {
		testCase = extent.createTest(TstCase);
		try {
			Assert.assertEquals(ActualResults, ExpectedResults);
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Medium-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Medium-Priority");
			testCase.log(Status.PASS, TstCase + " Script PASS");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Medium-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Medium-Priority");
			testCase.log(Status.FAIL, TstCase + " Script FAIL");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Medium-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Medium-Priority");
			testCase.log(Status.FAIL, "Dont Have "+ TstCase + " Locator");
		}
	}

//	Medium Severity and High Priority Testcases
	public static void MediumHigh(String TstCase, String ActualResults, String ExpectedResults) {
		testCase = extent.createTest(TstCase);
		try {
			Assert.assertEquals(ActualResults, ExpectedResults);
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Medium-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("High-Priority");
			testCase.log(Status.PASS, TstCase + " Script PASS");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Medium-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("High-Priority");
			testCase.log(Status.FAIL, TstCase + " Script FAIL");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("Medium-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("High-Priority");
			testCase.log(Status.FAIL, "Dont Have "+ TstCase + " Locator");
		}
	}

//	High Severity and Low Priority Testcases
	public static void HighLow(String TstCase, String ActualResults, String ExpectedResults) {
		testCase = extent.createTest(TstCase);
		try {
			Assert.assertEquals(ActualResults, ExpectedResults);
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("High-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Low-Priority");
			testCase.log(Status.PASS, TstCase + " Script PASS");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("High-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Low-Priority");
			testCase.log(Status.FAIL, TstCase + " Script FAIL");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("High-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Low-Priority");
			testCase.log(Status.FAIL, "Dont Have "+ TstCase + " Locator");
		}
	}

//	High Severity and Medium Priority Testcases
	public static void HighMedium(String TstCase, String ActualResults, String ExpectedResults) {
		testCase = extent.createTest(TstCase);
		try {
			Assert.assertEquals(ActualResults, ExpectedResults);
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("High-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Medium-Priority");
			testCase.log(Status.PASS, TstCase + " Script PASS");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("High-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Medium-Priority");
			testCase.log(Status.FAIL, TstCase + " Script FAIL");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("High-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("Medium-Priority");
			testCase.log(Status.FAIL, "Dont Have "+ TstCase + " Locator");
		}
	}

//	High Severity and High Priority Testcases
	public static void HighHigh(String TstCase, String ActualResults, String ExpectedResults) {
		testCase = extent.createTest(TstCase);
		try {
			Assert.assertEquals(ActualResults, ExpectedResults);
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("High-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("High-Priority");
			testCase.log(Status.PASS, TstCase + " Script PASS");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("High-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("High-Priority");
			testCase.log(Status.FAIL, TstCase + " Script FAIL");
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO, TstCase + " ActualResults : " + ActualResults).assignCategory("High-Severity");
			testCase.log(Status.INFO, TstCase + " ExpectedResults : " + ExpectedResults).assignCategory("High-Priority");
			testCase.log(Status.FAIL, "Dont Have "+ TstCase + " Locator");
		}
	}
}
