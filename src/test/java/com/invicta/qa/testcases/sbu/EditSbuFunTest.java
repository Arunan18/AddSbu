package com.invicta.qa.testcases.sbu;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.login.LoginPage;
import com.invicta.qa.pages.sbu.EditSbuFunPage;
import com.invicta.qa.pages.sbu.EditSbuUIPage;

public class EditSbuFunTest extends DriverIntialization {
	LoginPage lp = new LoginPage();
	EditSbuFunPage esfp = new EditSbuFunPage();
//	int TotalRow = EditSbuFunPage.SbuNameColumn.size();
	int ActualTotalPage = 1;
EditSbuUITest ee= new EditSbuUITest();
EditSbuUIPage Ebup = new EditSbuUIPage();
	
	@Test(priority = 0)
	public void NavigateSbu() throws InterruptedException {
		
//		ee.test();
		PageFactory.initElements(driver, lp);
		PageFactory.initElements(driver, esfp);

		LoginPage.Username.sendKeys("admin");
		Thread.sleep(1000);
		LoginPage.Password.sendKeys("tokyo@admin");
		Thread.sleep(1000);
		LoginPage.LoginButton.click();

		Thread.sleep(5000);
		EditSbuFunPage.Master.click();
		Thread.sleep(1000);
		EditSbuFunPage.Plant.click();
		Thread.sleep(1000); 
		EditSbuFunPage.SBU.click();
		Thread.sleep(5000);
		boolean Enablity = EditSbuFunPage.NextPageBtn.isEnabled();
		while (Enablity) {
			Thread.sleep(1000);
			EditSbuFunPage.NextPageBtn.click();
			ActualTotalPage = ActualTotalPage + 1;
			Enablity = EditSbuFunPage.NextPageBtn.isEnabled();
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		
	}

	@Test(priority = 1)
	public void EditSbu() throws InterruptedException, IOException {
		
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel-sheets\\SampleExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("EditSBU");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String OldSbu = (String) row.getCell(1).getStringCellValue();
			String NewSbu = (String) row.getCell(2).getStringCellValue();
			String Des = (String) row.getCell(3).getStringCellValue();
			String Validation = (String) row.getCell(4).getStringCellValue();
			String Message = (String) row.getCell(5).getStringCellValue();
			int TotalRow = EditSbuFunPage.SbuNameColumn.size();
			if (check) { 
				boolean CheckAddedValue = false;
//				boolean AddedVAlueCorrect = false;
				for (int k = 1; k <= ActualTotalPage; k++) {
//					System.out.println("222222"+OldSbu);
					for (int j = 2; j <= TotalRow; j++) {
//						Thread.sleep(1000);
						String name = driver  
								.findElement(By.xpath(EditSbuFunPage.SbuNameBefore + j + EditSbuFunPage.SbuNameAfter))
								.getText();
						Thread.sleep(1000); 
						if (name.contentEquals(OldSbu)) {
							CheckAddedValue = true;
//							System.out.println("333333" + OldSbu);
							WebElement editButton = driver.findElement(
									By.xpath(EditSbuFunPage.EditBtnBefore + j + EditSbuFunPage.EditBtnAfter));
							boolean editbuttonEnable=true;
							try {
								editButton.isEnabled();
							} catch (NoSuchElementException e) {
								editbuttonEnable = false;
								testCase = extent.createTest("Dont Have Edit BUtton Locator");
							}
							if (editbuttonEnable) {
								editButton.click(); 
								Thread.sleep(1000);
								
								ee.EditSBU();
								ee.SBUText();
								ee.DesText();
								ee.SbuUIUpdateButton();
								 
								Thread.sleep(1000);
								EditSbuFunPage.SBUName.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
								EditSbuFunPage.SBUName.sendKeys(NewSbu);
								EditSbuFunPage.Des.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
								EditSbuFunPage.Des.sendKeys(Des); 
								EditSbuFunPage.UpdateBtn.click();
								
								Thread.sleep(1000);
								System.out.println(EditSbuFunPage.Validation.getText() + "SBU NAME:-" + NewSbu);
								String ActualValidation = EditSbuFunPage.Validation.getText();
								String ExpectedValidation = Validation;
						 		testCase = extent.createTest("Check " + Message + " Script");
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


								if (EditSbuFunPage.CancelBtn.isEnabled()) {
									EditSbuFunPage.CancelBtn.click();
								}

								break;
							}
						}

					}
					if (CheckAddedValue) {
						break;
					}
					if (EditSbuFunPage.NextPageBtn.isEnabled() == true) {
						Thread.sleep(1000);
						EditSbuFunPage.NextPageBtn.click();
					}
				}

			}
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
 
		}
	}
}
