package com.invicta.qa.testcases.sbu;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.AddSbuFunPage;
import com.invicta.qa.pages.sbu.AddSbuUIPage;

public class AddSbuUITest extends DriverIntialization {
	static AddSbuUIPage sbuui = new AddSbuUIPage();

//	@Test(priority = 0)
public static  void addsbubutton() throws InterruptedException {
PageFactory.initElements(driver, sbuui);
		System.out.println("*******Add Sbu Button Start********");

		PageFactory.initElements(driver, sbuui);

		try {
			if (AddSbuUIPage.SBUbutton.isEnabled()) {

				// BUTTON ENABLED

				boolean ActualImageDisplay = AddSbuUIPage.SBUbutton.isDisplayed();
				boolean ExpectedImageDisplay = true;
				testCase = extent.createTest("STEP 1 : Check Add SBU Button - ENABLE");
				try {
					Assert.assertEquals(ActualImageDisplay, ExpectedImageDisplay);
					testCase.log(Status.INFO, "Actual Button Enabled :- " + ActualImageDisplay);
					testCase.log(Status.INFO, "Expected Button Eanbled :- " + ExpectedImageDisplay);
					testCase.log(Status.PASS, " Button Enabled is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Button Enabled :- " + ActualImageDisplay);
					testCase.log(Status.INFO, "Expected Button Eanbled :- " + ExpectedImageDisplay);
					testCase.log(Status.FAIL, " Expected Button Eanbled");
				}

				// CHEKC THE CLICKABILITY

				boolean clickable = AddSbuUIPage.SBUbutton.isDisplayed();

				String originalURL = driver.getCurrentUrl();
				String originalPageSource = driver.getPageSource();

				// AddSbuUIPage.SBUbutton.click();
				System.out.println("Element is clicked");

				String updatedURL = driver.getCurrentUrl();
				String updatedPageSource = driver.getPageSource();

				if (!originalURL.equals(updatedURL) || !originalPageSource.equals(updatedPageSource)) {

					System.out.println("Changes have happened on the page");

					clickable = true;
				}

				else {

					System.out.println("No changes have happened on the page");
				}

				boolean clickable1 = true;

				testCase = extent.createTest("STEP 1 : Check Add SBU Button - CLICKABLE");
				try {
					AssertJUnit.assertEquals(String.valueOf(clickable), "true");
					// System.out.println(String.valueOf(clickable));

				} catch (AssertionError e) {
					clickable1 = false;
				}
				if (clickable1) {
					testCase.log(Status.INFO, "ActualClick :- " + String.valueOf(clickable));
					testCase.log(Status.INFO, "ExpectedClick :- " + "true");

					testCase.log(Status.PASS, "Clickable");
				} else {
					testCase.log(Status.INFO, "ActualClick  :- " + String.valueOf(clickable));
					testCase.log(Status.INFO, "ExpectedClick :- " + "true");

					testCase.log(Status.FAIL, "Not clickable");
				}

			} else {
				testCase = extent.createTest("STEP 1 : Check Add SBU Button -NOT-ENABLED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("lOGIN-BUTTON Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}

		// VISIBLITY

		// try {

		boolean ActualElement = AddSbuUIPage.SBUbutton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("STEP 1 : Check Add SBU Button-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {
			visibility = false;
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");
		}
		Thread.sleep(2000);

//				// ENABILITY
//
//				try {
//					boolean ActualElementEnable = AddSbuUIPage.SBUbutton.isEnabled();
//					boolean ExpectedElementEnable = false;
//
//					boolean enablity = true;
//					testCase = extent.createTest("BUTTON-ENABLE");
//					try {
//						AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);
//
//					} catch (AssertionError e) {
//						enablity = false;
//					}
//					if (enablity) {
//						testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
//						testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
//						testCase.log(Status.PASS, "Element enable");
//					} else {
//						testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
//						testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
//						testCase.log(Status.FAIL, "Element is not enable");
//					}
//				} catch (Exception e) {
//
//					System.out.println("ELEMET-ENABLE-FAILED");
//
//				}

		Thread.sleep(2000);

		// SIZE

		try {

			String ActualFontSize = AddSbuUIPage.SBUbutton.getCssValue("font-size");
			System.out.println("Font Size: " + ActualFontSize);
			String ExpectedFontSize = "14px";

			boolean Fontsize = true;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-FONT-SIZE");
			try {
				AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

			} catch (AssertionError e) {
				Fontsize = false;
			}
			if (Fontsize) {
				testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
				testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
				testCase.log(Status.PASS, "Correct Font Size");
			} else {
				testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
				testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
				testCase.log(Status.FAIL, "Wrong Font Size");
			}
		} catch (Exception e) {

			System.out.println("ELEMET-VISIBLIY-IS-NOT-AVAILABLE");

		}

		Thread.sleep(2000);

//		size
		Dimension ActualSize = AddSbuUIPage.SBUbutton.getSize();
		System.out.println("*******************Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(600, 254);
		// POSITION

		try {
			Point ActualLocation = AddSbuUIPage.SBUbutton.getLocation();

			int actual_x = ActualLocation.getX();
			int actual_y = ActualLocation.getY();

			System.out.println("X axis: " + actual_x);
			System.out.println("Y axis: " + actual_y);

			Point ExpectedLocation = new Point(588, 93);

			boolean Position = true;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-POSITION");
			try {
				AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

			} catch (AssertionError e) {
				Position = false;
			}
			if (Position) {
				testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
				testCase.log(Status.PASS, "Correct Location");
			} else {
				testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
				testCase.log(Status.FAIL, "Wrong Location");
			}
		} catch (Exception e) {

			System.out.println("ELEMET-VISIBLIY-IS-NOT-AVAILABLE");

		}

		Thread.sleep(2000);

		// SPELLING

		try {

			String text = AddSbuUIPage.SBUbutton.getText();

			String text1 = "Add SBU";
			boolean txt1 = true;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-SPELLING");

			try {
				AssertJUnit.assertEquals(text, text1);
			} catch (AssertionError e) {
				txt1 = false;
			}
			if (txt1) {
				testCase.log(Status.INFO, "ActualElement :- " + text);
				testCase.log(Status.INFO, "ExpectedElement :- " + text1);
				testCase.log(Status.INFO, "correct text");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + text);
				testCase.log(Status.INFO, "ExpectedElement :- " + text1);
				testCase.log(Status.INFO, "wrong text");
				testCase.log(Status.FAIL, "wrong");
			}

		} catch (Exception e) {

			System.out.println("ELEMET-VISIBLIY-IS-NOT-AVAILABLE");

		}

		Thread.sleep(2000);

		// BORDER-COLOR

		try {
			String aa = AddSbuUIPage.SBUbutton.getCssValue("border-color");
			String ActualBorderColour = Color.fromString(aa).asHex();
			String ExpectedBorderColour = "#ffffff";
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-BORDER-COLOUR");
			try {
				Assert.assertEquals(ActualBorderColour, ExpectedBorderColour);
				testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
				testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
				testCase.log(Status.INFO, "Correct Border Colour");
				testCase.log(Status.PASS, "Correct Border Colour");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
				testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
				testCase.log(Status.INFO, "wrong border Colour");
				testCase.log(Status.FAIL, "wrong border Colour");
			}
		} catch (Exception e) {

			System.out.println("ELEMET-VISIBLIY-IS-NOT-AVAILABLE");

		}

		Thread.sleep(2000);

		// OPACITY
		try {
			String elementOpacity = AddSbuUIPage.SBUbutton.getCssValue("opacity");
			double ActualOpacity = Double.parseDouble(elementOpacity);
			double ExpectedOpacity = 1.0;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-OPACITY");
			try {
				Assert.assertEquals(ActualOpacity, ExpectedOpacity);
				testCase.log(Status.INFO, "Actual Image Opacity :- " + ActualOpacity);
				testCase.log(Status.INFO, "Expected Image Opacity :- " + ExpectedOpacity);
				testCase.log(Status.INFO, "CorrectImage Opacity");
				testCase.log(Status.PASS, "Correct Image Opacity");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Image Opacity :- " + ActualOpacity);
				testCase.log(Status.INFO, "Expected Image Opacity :- " + ExpectedOpacity);
				testCase.log(Status.INFO, "wrong Image Opacity");
				testCase.log(Status.FAIL, "wrong Image Opacity");
			}
		} catch (Exception e) {
			testCase = extent.createTest("OPACITY-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// BORDER-RADIUS

		try {
			String ActualBorderRadius = AddSbuUIPage.SBUbutton.getCssValue("border-Radius");
			String ExpectedBorderRadius = "2px";
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-BORDER-RADIUS");
			try {
				Assert.assertEquals(ActualBorderRadius, ExpectedBorderRadius);
				testCase.log(Status.INFO, "Actual Border Radius :- " + ActualBorderRadius);
				testCase.log(Status.INFO, "Expected Border Radius :- " + ExpectedBorderRadius);
				testCase.log(Status.INFO, "Correct Border Radius");
				testCase.log(Status.PASS, "Correct Border Radius");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Border Radius :- " + ActualBorderRadius);
				testCase.log(Status.INFO, "Expected Border Radius :- " + ExpectedBorderRadius);
				testCase.log(Status.INFO, "wrong border Radius");
				testCase.log(Status.FAIL, "wrong border Radius");
			}
		} catch (Exception e) {
			testCase = extent.createTest("BORDER-RADIUS-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// PADDING

		try {
			String Actualpadding = AddSbuUIPage.SBUbutton.getCssValue("padding");
			String Expectedpadding = "4px 15px";
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-PADDING");
			try {
				Assert.assertEquals(Actualpadding, Expectedpadding);
				testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
				testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
				testCase.log(Status.PASS, "padding is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
				testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
				testCase.log(Status.FAIL, "padding is Wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("PADDING-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// BACKGROUND-COLOR
		try {
			String ActualBgColor = AddSbuUIPage.SBUbutton.getCssValue("background-color");
			String hex1 = Color.fromString(ActualBgColor).asHex();
			String ExpectedBgColor = "#001328";

			boolean elementbgcolor = true;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-BACKGROUND-COLOR");
			try {
				AssertJUnit.assertEquals(hex1, ExpectedBgColor);
			} catch (AssertionError e) {
				elementbgcolor = false;
			}
			if (elementbgcolor) {
				testCase.log(Status.INFO, "ActualBgColor :- " + hex1);
				testCase.log(Status.INFO, "ExpectedBgCOlor :- " + ExpectedBgColor);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualBgColor :- " + hex1);
				testCase.log(Status.INFO, "ExpectedBgCOlor :- " + ExpectedBgColor);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {
			testCase = extent.createTest("BACKGROUND-COLOR-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// CURSOR

		try {
			String actualCursorPoint = AddSbuUIPage.SBUbutton.getCssValue("cursor");
			String expectedCursorPoint = "pointer";

			boolean elementCursor = true;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-CURSOR-POINTER");
			try {
				AssertJUnit.assertEquals(actualCursorPoint, expectedCursorPoint);
			} catch (AssertionError e) {
				elementCursor = false;
			}
			if (elementCursor) {
				testCase.log(Status.INFO, "ActualAlignment :- " + actualCursorPoint);
				testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedCursorPoint);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualAlignment :- " + actualCursorPoint);
				testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedCursorPoint);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {
			testCase = extent.createTest("CURSOR-POINTER-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// FONT-COLOR

		try {
			String ab = AddSbuUIPage.SBUbutton.getCssValue("color");
			System.out.println("Font Size: " + ab);
			String Actualfontcolor = Color.fromString(ab).asHex();
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-FONT-COLOUR");
			String Expectedfontcolor = "#ffffff";
			boolean fontcolor = true;
			try {
				AssertJUnit.assertEquals(Actualfontcolor, Expectedfontcolor);
			} catch (AssertionError e) {
				fontcolor = false;
			}
			if (fontcolor) {
				testCase.log(Status.INFO, "ActualfontsSize :- " + Actualfontcolor);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + Expectedfontcolor);
				testCase.log(Status.INFO, "Correct font-size");
				testCase.log(Status.PASS, "Font-size Correct");
			} else {
				testCase.log(Status.INFO, "ActualfontsSize :- " + Actualfontcolor);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + Expectedfontcolor);
				testCase.log(Status.INFO, "Wrong font-size");
				testCase.log(Status.FAIL, "Font-size Wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("FONT-COLOR-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// FONT-TYPE

		try {
			String actualFontType = AddSbuUIPage.SBUbutton.getCssValue("font-family");
			// String hex = Color.fromString(actualbackgroundcolor).asHex();
			System.out.println("actual box shadow:" + actualFontType);
			String expectedFontType = "Roboto, sans-serif";

			boolean boxshadow1 = true;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-FONT-TYPE");
			try {
				AssertJUnit.assertEquals(actualFontType, expectedFontType);
			} catch (AssertionError find) {
				boxshadow1 = false;
			}
			if (boxshadow1) {
				testCase.log(Status.INFO, "ActualElement :- " + actualFontType);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontType);
				testCase.log(Status.PASS, "Correct Element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualFontType);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontType);
				testCase.log(Status.FAIL, "No Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("FONT-TYPE-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// FONT-SIZE

		try {
			String actualFontSize = AddSbuUIPage.SBUbutton.getCssValue("font-size");
			// String hex = Color.fromString(actualbackgroundcolor).asHex();
			System.out.println("actual box shadow:" + actualFontSize);
			String expectedFontSize = "14px";

			boolean boxshadow1 = true;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-FONT-SIZE");
			try {
				AssertJUnit.assertEquals(actualFontSize, expectedFontSize);
			} catch (AssertionError find) {
				boxshadow1 = false;
			}
			if (boxshadow1) {
				testCase.log(Status.INFO, "ActualElement :- " + actualFontSize);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontSize);
				testCase.log(Status.PASS, "Correct Element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualFontSize);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontSize);
				testCase.log(Status.FAIL, "No Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("FONT-SIZE-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// BOX-SHADOW

		try {
			String actualboxshadow = AddSbuUIPage.SBUbutton.getCssValue("box-shadow");
			// String hex = Color.fromString(actualbackgroundcolor).asHex();
			System.out.println("actual box shadow:" + actualboxshadow);
			String expectedboxshadow = "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px";

			boolean boxshadow1 = true;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-BOX-SHADOW");
			try {
				AssertJUnit.assertEquals(actualboxshadow, expectedboxshadow);
			} catch (AssertionError find) {
				boxshadow1 = false;
			}
			if (boxshadow1) {
				testCase.log(Status.INFO, "ActualElement :- " + actualboxshadow);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedboxshadow);
				testCase.log(Status.PASS, "Correct Element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualboxshadow);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedboxshadow);
				testCase.log(Status.FAIL, "No Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("BOX-SHADOW-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// FONT-WEIGHT

		try {
			String Actualfontweight = AddSbuUIPage.SBUbutton.getCssValue("font-weight");
			System.out.println("fontweight  :" + Actualfontweight);
			String Expectedfontweight = "400";

			boolean fontweight = true;
			testCase = extent.createTest("STEP 1 : Check Add SBU Button-FONT-WEIGHT");
			try {
				AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

			} catch (AssertionError e) {
				fontweight = false;
			}
			if (fontweight) {
				testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
				testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
				testCase.log(Status.PASS, "Correct font weight");
			} else {
				testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
				testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
				testCase.log(Status.FAIL, "Wrong font weight");
			}
		} catch (Exception e) {
			testCase = extent.createTest("FONT-WEIGHT-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);
		System.out.println("*******Add Sbu Button End********");
	}

//	@Test(priority = 1)
	public static  void addsbuModal() throws InterruptedException {

		System.out.println("*******Add Sbu Modal Start********");

		// ***** element visible test
		Thread.sleep(1000);
		boolean AcctualVisible = AddSbuUIPage.modal.isDisplayed();
		boolean ExpectedVisible = true;

		boolean elementvisible = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-VISIBLE");
		try {
			Assert.assertEquals(AcctualVisible, ExpectedVisible);
		} catch (AssertionError e) {
			elementvisible = false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// ***** element position test

		Point ActualLocation = AddSbuUIPage.modal.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(383, 100);

		boolean Position = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-POSITION");
		try {
			Assert.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(2000);

		// ***** element size

		Dimension ActualSize = AddSbuUIPage.modal.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(600, 254);

		boolean size = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-SIZE");
		try {
			Assert.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correcrt size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(2000);

		// ***** element background-color

		String ActualButtonColor = AddSbuUIPage.modal.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);
		String ExpectedButtonColor = "rgba(0, 0, 0, 0)";

		boolean buttoncolor = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-BACKGROUND-COLOR");
		try {
			Assert.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(2000);

		// ***** element border-color

		String ActualBorderColor = AddSbuUIPage.modal.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = "";

		boolean bordercolor = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-BORDER-COLOR");
		try {
			Assert.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(2000);

		// ***** element overflow

		String ActualOverflow = AddSbuUIPage.modal.getCssValue("overflow");
		System.out.println("overflow :" + ActualOverflow);

		String ExpectedOverflow = "visible";

		boolean overflow = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-OVERFLOW-TYPE");
		try {
			Assert.assertEquals(ActualOverflow, ExpectedOverflow);

		} catch (AssertionError e) {
			overflow = false;
		}
		if (overflow) {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.PASS, "Correct overflow");
		} else {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.FAIL, "Wrong overflow");
		}
		Thread.sleep(2000);

		// ***** element margin

		String ActualMargin = AddSbuUIPage.modal.getCssValue("margin");
		System.out.println("margin :" + ActualMargin);

		String ExpectedMargin = "0px 383px";

		boolean margin = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-MARGIN-TYPE");
		try {
			Assert.assertEquals(ActualMargin, ExpectedMargin);

		} catch (AssertionError e) {
			margin = false;
		}
		if (margin) {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.PASS, "Correct Margin");
		} else {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.FAIL, "Wrong Margin");
		}
		Thread.sleep(2000);

		// ***** element cursor

		String ActualActions = AddSbuUIPage.modal.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "auto";

		boolean cursor = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-CURSOR-TYPE");
		try {
			Assert.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "correct cursor type");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "wrong cursor type");
		}
		Thread.sleep(2000);

		// ***** element z- index

		String ActualZindex = AddSbuUIPage.modal.getCssValue("z-index");
		System.out.println("z-index :" + ActualZindex);
		String ExpectedZindex = "auto";

		boolean z_index = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-Z-INDEX-TYPE");
		try {
			Assert.assertEquals(ActualZindex, ExpectedZindex);

		} catch (AssertionError e) {
			z_index = false;
		}
		if (z_index) {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.PASS, "correct z-index  type");
		} else {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.FAIL, "wrong z-index type");
		}
		Thread.sleep(2000);

		// ***** click-on element

		// identify modal header

		String modalActual = AddSbuUIPage.modalheader.getText();
		System.out.println("Modal Dialog header: " + modalActual);

		String modalExpected = "Add SBU";

		boolean modalHeader = true;
		testCase = extent.createTest("STEP 3 : Check SBU Add Form-HEADER");
		try {
			Assert.assertEquals(modalActual, modalExpected);

		} catch (AssertionError e) {
			modalHeader = false;
		}
		if (modalHeader) {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + ExpectedZindex);
			testCase.log(Status.PASS, "correct modal header");
		} else {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + ExpectedZindex);
			testCase.log(Status.FAIL, "wrong modal header");
		}
		Thread.sleep(2000);

//		// identify modal content
//		String ActualmodalContent= AddSbuUIPage.modalcontent.getText();
//		System.out.println( ActualmodalContent);
//		String ExpectedModalContent = "Sub Business Unit: Description:";
//
//		boolean modalContent = true;
//		testCase = extent.createTest("ADD-SBU-MODAL-CONTENT");
//		try {
//			Assert.assertEquals(ActualmodalContent, ExpectedModalContent);
//
//		} catch (AssertionError e) {
//			modalContent = false;
//		}
//		if (modalContent) {
//			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
//			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
//			testCase.log(Status.PASS, "correct modal content");
//		} else {
//			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
//			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
//			testCase.log(Status.FAIL, "wrong modal content");
//		}
//		Thread.sleep(2000);

		System.out.println("*******Add Sbu Button End********");

	}

//	@Test(priority = 2)
	public static void addsbutext() throws InterruptedException {

		System.out.println("*******Add Sbu Modal Title Start********");

		PageFactory.initElements(driver, sbuui);
//System.out.println(AddSbuUIPage.AddSBUtext.isDisplayed());

		try {
			if (AddSbuUIPage.AddSBUtext.isDisplayed()) {

//							Text Displayed

				boolean ActualTextDisplay = AddSbuUIPage.AddSBUtext.isDisplayed();
				boolean ExpectedTestDisplay = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-DISPLAYED");
				try {
					Assert.assertEquals(ActualTextDisplay, ExpectedTestDisplay);
					testCase.log(Status.INFO, "Actual text Displayed :- " + ActualTextDisplay);
					testCase.log(Status.INFO, "Expected text Displayed :- " + ExpectedTestDisplay);
					testCase.log(Status.PASS, " text is displayed");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualTextDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedTestDisplay);
					testCase.log(Status.FAIL, " text is not displayed ");
				}

				// text font color

				String Actualtextcolor = AddSbuUIPage.AddSBUtext.getCssValue("font-color");

				String Expectedtextcolor = "";
				System.out.println("font colour :" + Actualtextcolor);
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-FONT-COLOUR");
				try {
					Assert.assertEquals(Actualtextcolor, Expectedtextcolor);
					testCase.log(Status.INFO, "Actual font colour:- " + Actualtextcolor);
					testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
					testCase.log(Status.PASS, "Correct font colour");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font colour :- " + Actualtextcolor);
					testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
					testCase.log(Status.FAIL, "wrong font colour");
				}

				// text font size

				String Actualtextsize = AddSbuUIPage.AddSBUtext.getCssValue("font-size");

				String Expectedtextsize = "16px";
				System.out.println("font size :" + Actualtextsize);
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-FONT-SIZE");
				try {
					Assert.assertEquals(Actualtextsize, Expectedtextsize);
					testCase.log(Status.INFO, "Actual font size:- " + Actualtextsize);
					testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
					testCase.log(Status.PASS, "Correct font size");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font size :- " + Actualtextsize);
					testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
					testCase.log(Status.FAIL, "wrong font size");
				}

				// text font style

				String Actualtextstyle = AddSbuUIPage.AddSBUtext.getCssValue("font-style");

				String Expectedtextstyle = "normal";
				System.out.println("font style :" + Actualtextstyle);
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-FONT-STYLE");
				try {
					Assert.assertEquals(Actualtextstyle, Expectedtextstyle);
					testCase.log(Status.INFO, "Actual font style:- " + Actualtextstyle);
					testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
					testCase.log(Status.PASS, "Correct font style");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font style :- " + Actualtextstyle);
					testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
					testCase.log(Status.FAIL, "wrong font style");
				}

				// text spelling

				String Actualtext = AddSbuUIPage.AddSBUtext.getText();

				String Expectedtext = "Add SBU";
				System.out.println("text :" + Actualtext);
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-TEXT");
				try {
					Assert.assertEquals(Actualtext, Expectedtext);
					testCase.log(Status.INFO, "Actual text:- " + Actualtext);
					testCase.log(Status.INFO, "Expected text :- " + Expectedtext);
					testCase.log(Status.PASS, "Correct text");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font text :- " + Actualtext);
					testCase.log(Status.INFO, "Expected font text :- " + Expectedtext);
					testCase.log(Status.FAIL, "wrong font text");
				}

				// text font family

				String Actualfontfamily = AddSbuUIPage.AddSBUtext.getCssValue("font-family");

				String Expectedfontfamily = "Roboto, sans-serif";
				System.out.println("text :" + Actualfontfamily);
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-FONT-FAMILY");
				try {
					Assert.assertEquals(Actualfontfamily, Expectedfontfamily);
					testCase.log(Status.INFO, "Actual fontfamily:- " + Actualfontfamily);
					testCase.log(Status.INFO, "Expected fontfamily :- " + Expectedfontfamily);
					testCase.log(Status.PASS, "Correct fontfamily");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font fontfamily :- " + Actualfontfamily);
					testCase.log(Status.INFO, "Expected font fontfamily :- " + Expectedfontfamily);
					testCase.log(Status.FAIL, "wrong font fontfamily");
				}

				// text position

				Point ActulaTitleLocation = AddSbuUIPage.AddSBUtext.getLocation();
				int actual_x = ActulaTitleLocation.getX();
				int actual_y = ActulaTitleLocation.getY();

				System.out.println("X axis: " + actual_x);
				System.out.println("Y axis: " + actual_y);

				Point ExpectedTitleLocation = new Point(397, 106);

				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-POSITION");
				try {
					Assert.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);
					testCase.log(Status.INFO, "Actual TitleLocation:- " + ActulaTitleLocation);
					testCase.log(Status.INFO, "Expected TitleLocation :- " + ExpectedTitleLocation);
					testCase.log(Status.PASS, "Correct TitleLocation");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual  TitleLocation :- " + ActulaTitleLocation);
					testCase.log(Status.INFO, "Expected TitleLocation :- " + ExpectedTitleLocation);
					testCase.log(Status.FAIL, "wrong TitleLocation");
				}

				// padding

				String Actualpadding = AddSbuUIPage.AddSBUtext.getCssValue("padding");

				String Expectedpadding = "0px";
				System.out.println("padding :" + Actualpadding);
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-PADDING");
				try {
					Assert.assertEquals(Actualpadding, Expectedpadding);
					testCase.log(Status.INFO, "Actual padding:- " + Actualpadding);
					testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
					testCase.log(Status.PASS, "Correct padding");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
					testCase.log(Status.INFO, "Expected padding:- " + Expectedpadding);
					testCase.log(Status.FAIL, "wrong padding");
				}

				// text margin

				String Actualmargin = AddSbuUIPage.AddSBUtext.getCssValue("margin");

				String Expectedmargin = "0px 0px 16px";
				System.out.println("margin :" + Actualmargin);
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-MARGIN");
				try {
					Assert.assertEquals(Actualmargin, Expectedmargin);
					testCase.log(Status.INFO, "Actual padding:- " + Actualmargin);
					testCase.log(Status.INFO, "Expected padding :- " + Expectedmargin);
					testCase.log(Status.PASS, "Correct padding");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual padding :- " + Actualmargin);
					testCase.log(Status.INFO, "Expected padding:- " + Expectedmargin);
					testCase.log(Status.FAIL, "wrong padding");
				}

				// text box shadow

				String Actualshadow = AddSbuUIPage.AddSBUtext.getCssValue("box-shadow");

				String Expectedshadow = "none";
				System.out.println("shadow :" + Actualshadow);
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-SHADOW");
				try {
					Assert.assertEquals(Actualshadow, Expectedshadow);
					testCase.log(Status.INFO, "Actual shadow:- " + Actualshadow);
					testCase.log(Status.INFO, "Expected shadow :- " + Expectedshadow);
					testCase.log(Status.PASS, "Correct shadow");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual shadow :- " + Actualshadow);
					testCase.log(Status.INFO, "Expected shadow:- " + Expectedshadow);
					testCase.log(Status.FAIL, "wrong shadow");
				}

				// LETTER SPACING

				String ActualLetterSpacing = AddSbuUIPage.AddSBUtext.getCssValue("letter-spacing");
				System.out.println("Letter Spacing :" + ActualLetterSpacing);

				String ExpectedLetterSpacing = "normal";

				boolean letterspacing = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-LETTER-SPACING");
				try {
					AssertJUnit.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);

				} catch (AssertionError e) {
					letterspacing = false;
				}
				if (letterspacing) {
					testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
					testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
					testCase.log(Status.PASS, "Letter spacing is as expected");
				} else {
					testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
					testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
					testCase.log(Status.FAIL, "Letter spacing is not as expected");
				}

				// WORD SPACING

				String ActualWordSpacing = AddSbuUIPage.AddSBUtext.getCssValue("word-spacing");
				System.out.println("Word Spacing :" + ActualWordSpacing);

				String ExpectedWordSpacing = "0px";

				boolean wordspacing = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-WORD-SPACING");
				try {
					AssertJUnit.assertEquals(ActualWordSpacing, ExpectedWordSpacing);

				} catch (AssertionError e) {
					wordspacing = false;
				}
				if (wordspacing) {
					testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
					testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
					testCase.log(Status.PASS, "Word spacing is as expected");
				} else {
					testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
					testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
					testCase.log(Status.FAIL, "Word spacing is not as expected");
				}

				// ALIGNMENT (CENTER/LEFT/RIGHT)

				String ActualAlignment = AddSbuUIPage.AddSBUtext.getCssValue("text-align");
				System.out.println("Text Alignment :" + ActualAlignment);

				String ExpectedAlignment = "start";

				boolean alignment = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-ALIGNMENT");
				try {
					AssertJUnit.assertEquals(ActualAlignment, ExpectedAlignment);

				} catch (AssertionError e) {
					alignment = false;
				}
				if (alignment) {
					testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
					testCase.log(Status.PASS, "Alignment is as expected");
				} else {
					testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
					testCase.log(Status.FAIL, "Alignment is not as expected");
				}
				// TEXT TRANSFORMATION (UPERCASE/ LOWECASE)

				String ActualTextTransformation = AddSbuUIPage.AddSBUtext.getCssValue("text-transform");
				System.out.println("Text Transformation :" + ActualTextTransformation);

				String ExpectedTextTransformation = "none";

				boolean texttransformation = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-TRANSFORMATION");
				try {
					AssertJUnit.assertEquals(ActualTextTransformation, ExpectedTextTransformation);

				} catch (AssertionError e) {
					texttransformation = false;
				}
				if (texttransformation) {
					testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
					testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
					testCase.log(Status.PASS, "Transformation expected");
				} else {
					testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
					testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
					testCase.log(Status.FAIL, "Transformation unexpected");
				}

				// LINE HEIGHT

				String ActualLineHeight = AddSbuUIPage.AddSBUtext.getCssValue("line-height");
				System.out.println("Line Height :" + ActualLineHeight);

				String ExpectedLineHeight = "22px";

				boolean lineheight = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-LINE-HEIGHT");
				try {
					AssertJUnit.assertEquals(ActualLineHeight, ExpectedLineHeight);

				} catch (AssertionError e) {
					lineheight = false;
				}
				if (lineheight) {
					testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
					testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
					testCase.log(Status.PASS, "Line height is as expected");
				} else {
					testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
					testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
					testCase.log(Status.FAIL, "Line height is not as expected");
				}

				// Text Decoration

				String ActualTextDecoration = AddSbuUIPage.AddSBUtext.getCssValue("text-decoration");
				System.out.println("Text Decoration :" + ActualTextDecoration);

				String ExpectedTextDecoration = "none solid rgb(255, 255, 255)";

				boolean textdecoration = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-DECORATION");
				try {
					AssertJUnit.assertEquals(ActualTextDecoration, ExpectedTextDecoration);

				} catch (AssertionError e) {
					textdecoration = false;
				}
				if (textdecoration) {
					testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
					testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
					testCase.log(Status.PASS, "Text decoration is as expected");
				} else {
					testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
					testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
					testCase.log(Status.FAIL, "Text decoration is not as expected");
				}

				// VERTICAL ALIGN

				String actualVerticalAlignment = AddSbuUIPage.AddSBUtext.getCssValue("vertical-align");
				System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);

				String expectedVerticalAlignment = "baseline";

				boolean verticalAlignment = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-VERTICAL-ALIGNMENT");
				try {
					Assert.assertEquals(actualVerticalAlignment, expectedVerticalAlignment);
				} catch (AssertionError e) {
					verticalAlignment = false;
				}

				if (verticalAlignment) {
					testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
					testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
					testCase.log(Status.PASS, "Text vertical Align is as expected");

				} else {
					testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
					testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
					testCase.log(Status.FAIL, "Text vertical Align is as expected");

				}

				// TEXT INDENT (To indent is to begin text with a blank space between it and the
				// margin)

				String ActualTextIndent = AddSbuUIPage.AddSBUtext.getCssValue("text-indent");
				System.out.println("Text Indent :" + ActualTextIndent);

				String ExpectedTextIndent = "0px";

				boolean textindent = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-INDENT");
				try {
					AssertJUnit.assertEquals(ActualTextIndent, ExpectedTextIndent);

				} catch (AssertionError e) {
					textindent = false;
				}
				if (textindent) {
					testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
					testCase.log(Status.INFO, "ExpectedTextIndent :- " + ExpectedTextIndent);
					testCase.log(Status.PASS, "Text Indent is as expected");

				} else {
					testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
					testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
					testCase.log(Status.FAIL, "Text Indent is as expected");

				}
				// TEXT - ORIENTATION(text characters in a line. It only affects text in
				// vertical mode)

				String ActualTextOrientation = AddSbuUIPage.AddSBUtext.getCssValue("text-orientation");
				System.out.println("Text Orientation :" + ActualTextOrientation);

				String ExpectedTextOrientation = "mixed";

				boolean textorientation = true;
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading-ORIENTATION");
				try {
					AssertJUnit.assertEquals(ActualTextOrientation, ExpectedTextOrientation);

				} catch (AssertionError e) {
					textorientation = false;
				}
				if (textorientation) {
					testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
					testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
					testCase.log(Status.PASS, "Text orientation is as expected");
				} else {
					testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
					testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
					testCase.log(Status.FAIL, "Text orientation is as unxpected");
				}

			} else {
				testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading NOT DISPLAYED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("STEP 4 : Check SBU Add Form Heading Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}

		System.out.println("*******Add Sbu Modal Title End********");

	}

//	@Test(priority = 3)
	public static void sbutext() throws InterruptedException {

		System.out.println("*******Add Sbu Field Text Start********");

		PageFactory.initElements(driver, sbuui);

		try {
			if (AddSbuUIPage.SBUText.isDisplayed()) {

//							Text Displayed

				boolean ActualTextDisplay = AddSbuUIPage.SBUText.isDisplayed();
				boolean ExpectedTestDisplay = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-DISPLAYED");
				try {
					Assert.assertEquals(ActualTextDisplay, ExpectedTestDisplay);
					testCase.log(Status.INFO, "Actual text Displayed :- " + ActualTextDisplay);
					testCase.log(Status.INFO, "Expected text Displayed :- " + ExpectedTestDisplay);
					testCase.log(Status.PASS, " text is displayed");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualTextDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedTestDisplay);
					testCase.log(Status.FAIL, " text is not displayed ");
				}

				// text font color

				String Actualtextcolor = AddSbuUIPage.SBUText.getCssValue("font-color");

				String Expectedtextcolor = "";
				System.out.println("font colour :" + Actualtextcolor);
				testCase = extent.createTest("STEP 5 : Check SBU Text-FONT-COLOUR");
				try {
					Assert.assertEquals(Actualtextcolor, Expectedtextcolor);
					testCase.log(Status.INFO, "Actual font colour:- " + Actualtextcolor);
					testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
					testCase.log(Status.PASS, "Correct font colour");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font colour :- " + Actualtextcolor);
					testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
					testCase.log(Status.FAIL, "wrong font colour");
				}

				// text font size

				String Actualtextsize = AddSbuUIPage.SBUText.getCssValue("font-size");

				String Expectedtextsize = "14px";
				System.out.println("font size :" + Actualtextsize);
				testCase = extent.createTest("STEP 5 : Check SBU Text-FONT-SIZE");
				try {
					Assert.assertEquals(Actualtextsize, Expectedtextsize);
					testCase.log(Status.INFO, "Actual font size:- " + Actualtextsize);
					testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
					testCase.log(Status.PASS, "Correct font size");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font size :- " + Actualtextsize);
					testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
					testCase.log(Status.FAIL, "wrong font size");
				}

				// text font style

				String Actualtextstyle = AddSbuUIPage.SBUText.getCssValue("font-style");

				String Expectedtextstyle = "normal";
				System.out.println("font style :" + Actualtextstyle);
				testCase = extent.createTest("STEP 5 : Check SBU Text-FONT-STYLE");
				try {
					Assert.assertEquals(Actualtextstyle, Expectedtextstyle);
					testCase.log(Status.INFO, "Actual font style:- " + Actualtextstyle);
					testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
					testCase.log(Status.PASS, "Correct font style");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font style :- " + Actualtextstyle);
					testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
					testCase.log(Status.FAIL, "wrong font style");
				}

				// text spelling

				String Actualtext = AddSbuUIPage.SBUText.getText();

				String Expectedtext = "Sub Business Unit:";
				System.out.println("text :" + Actualtext);
				testCase = extent.createTest("STEP 5 : Check SBU Text");
				try {
					Assert.assertEquals(Actualtext, Expectedtext);
					testCase.log(Status.INFO, "Actual text:- " + Actualtext);
					testCase.log(Status.INFO, "Expected text :- " + Expectedtext);
					testCase.log(Status.PASS, "Correct text");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font text :- " + Actualtext);
					testCase.log(Status.INFO, "Expected font text :- " + Expectedtext);
					testCase.log(Status.FAIL, "wrong font text");
				}

				// text font family

				String Actualfontfamily = AddSbuUIPage.SBUText.getCssValue("font-family");

				String Expectedfontfamily = "Roboto";
				System.out.println("text :" + Actualfontfamily);
				testCase = extent.createTest("STEP 5 : Check SBU Text-FONT-FAMILY");
				try {
					Assert.assertEquals(Actualfontfamily, Expectedfontfamily);
					testCase.log(Status.INFO, "Actual fontfamily:- " + Actualfontfamily);
					testCase.log(Status.INFO, "Expected fontfamily :- " + Expectedfontfamily);
					testCase.log(Status.PASS, "Correct fontfamily");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font fontfamily :- " + Actualfontfamily);
					testCase.log(Status.INFO, "Expected font fontfamily :- " + Expectedfontfamily);
					testCase.log(Status.FAIL, "wrong font fontfamily");
				}

				// text position

				Point ActulaTitleLocation = AddSbuUIPage.SBUText.getLocation();
				int actual_x = ActulaTitleLocation.getX();
				int actual_y = ActulaTitleLocation.getY();

				System.out.println("X axis: " + actual_x);
				System.out.println("Y axis: " + actual_y);

				Point ExpectedTitleLocation = new Point(417, 167);

				testCase = extent.createTest("STEP 5 : Check SBU Text-POSITION");
				try {
					Assert.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);
					testCase.log(Status.INFO, "Actual TitleLocation:- " + ActulaTitleLocation);
					testCase.log(Status.INFO, "Expected TitleLocation :- " + ExpectedTitleLocation);
					testCase.log(Status.PASS, "Correct TitleLocation");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual  TitleLocation :- " + ActulaTitleLocation);
					testCase.log(Status.INFO, "Expected TitleLocation :- " + ExpectedTitleLocation);
					testCase.log(Status.FAIL, "wrong TitleLocation");
				}

				// padding

				String Actualpadding = AddSbuUIPage.SBUText.getCssValue("padding");

				String Expectedpadding = "0px";
				System.out.println("padding :" + Actualpadding);
				testCase = extent.createTest("STEP 5 : Check SBU Text-PADDING");
				try {
					Assert.assertEquals(Actualpadding, Expectedpadding);
					testCase.log(Status.INFO, "Actual padding:- " + Actualpadding);
					testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
					testCase.log(Status.PASS, "Correct padding");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
					testCase.log(Status.INFO, "Expected padding:- " + Expectedpadding);
					testCase.log(Status.FAIL, "wrong padding");
				}

				// text margin

				String Actualmargin = AddSbuUIPage.SBUText.getCssValue("margin");

				String Expectedmargin = "0px";
				System.out.println("margin :" + Actualmargin);
				testCase = extent.createTest("STEP 5 : Check SBU Text-MARGIN");
				try {
					Assert.assertEquals(Actualmargin, Expectedmargin);
					testCase.log(Status.INFO, "Actual padding:- " + Actualmargin);
					testCase.log(Status.INFO, "Expected padding :- " + Expectedmargin);
					testCase.log(Status.PASS, "Correct padding");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual padding :- " + Actualmargin);
					testCase.log(Status.INFO, "Expected padding:- " + Expectedmargin);
					testCase.log(Status.FAIL, "wrong padding");
				}

				// text box shadow

				String Actualshadow = AddSbuUIPage.SBUText.getCssValue("box-shadow");

				String Expectedshadow = "none";
				System.out.println("shadow :" + Actualshadow);
				testCase = extent.createTest("STEP 5 : Check SBU Text-SHADOW");
				try {
					Assert.assertEquals(Actualshadow, Expectedshadow);
					testCase.log(Status.INFO, "Actual shadow:- " + Actualshadow);
					testCase.log(Status.INFO, "Expected shadow :- " + Expectedshadow);
					testCase.log(Status.PASS, "Correct shadow");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual shadow :- " + Actualshadow);
					testCase.log(Status.INFO, "Expected shadow:- " + Expectedshadow);
					testCase.log(Status.FAIL, "wrong shadow");
				}

				// LETTER SPACING

				String ActualLetterSpacing = AddSbuUIPage.SBUText.getCssValue("letter-spacing");
				System.out.println("Letter Spacing :" + ActualLetterSpacing);

				String ExpectedLetterSpacing = "normal";

				boolean letterspacing = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-LETTER-SPACING");
				try {
					AssertJUnit.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);

				} catch (AssertionError e) {
					letterspacing = false;
				}
				if (letterspacing) {
					testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
					testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
					testCase.log(Status.PASS, "Letter spacing is as expected");
				} else {
					testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
					testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
					testCase.log(Status.FAIL, "Letter spacing is not as expected");
				}

				// WORD SPACING

				String ActualWordSpacing = AddSbuUIPage.SBUText.getCssValue("word-spacing");
				System.out.println("Word Spacing :" + ActualWordSpacing);

				String ExpectedWordSpacing = "0px";

				boolean wordspacing = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-WORD-SPACING");
				try {
					AssertJUnit.assertEquals(ActualWordSpacing, ExpectedWordSpacing);

				} catch (AssertionError e) {
					wordspacing = false;
				}
				if (wordspacing) {
					testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
					testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
					testCase.log(Status.PASS, "Word spacing is as expected");
				} else {
					testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
					testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
					testCase.log(Status.FAIL, "Word spacing is not as expected");
				}

				// ALIGNMENT (CENTER/LEFT/RIGHT)

				String ActualAlignment = AddSbuUIPage.SBUText.getCssValue("text-align");
				System.out.println("Text Alignment :" + ActualAlignment);

				String ExpectedAlignment = "left";

				boolean alignment = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-ALIGNMENT");
				try {
					AssertJUnit.assertEquals(ActualAlignment, ExpectedAlignment);

				} catch (AssertionError e) {
					alignment = false;
				}
				if (alignment) {
					testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
					testCase.log(Status.PASS, "Alignment is as expected");
				} else {
					testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
					testCase.log(Status.FAIL, "Alignment is not as expected");
				}
				// TEXT TRANSFORMATION (UPERCASE/ LOWECASE)

				String ActualTextTransformation = AddSbuUIPage.SBUText.getCssValue("text-transform");
				System.out.println("Text Transformation :" + ActualTextTransformation);

				String ExpectedTextTransformation = "none";

				boolean texttransformation = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-TRANSFORMATION");
				try {
					AssertJUnit.assertEquals(ActualTextTransformation, ExpectedTextTransformation);

				} catch (AssertionError e) {
					texttransformation = false;
				}
				if (texttransformation) {
					testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
					testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
					testCase.log(Status.PASS, "Transformation expected");
				} else {
					testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
					testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
					testCase.log(Status.FAIL, "Transformation unexpected");
				}

				// LINE HEIGHT

				String ActualLineHeight = AddSbuUIPage.SBUText.getCssValue("line-height");
				System.out.println("Line Height :" + ActualLineHeight);

				String ExpectedLineHeight = "22.001px";

				boolean lineheight = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-LINE-HEIGHT");
				try {
					AssertJUnit.assertEquals(ActualLineHeight, ExpectedLineHeight);

				} catch (AssertionError e) {
					lineheight = false;
				}
				if (lineheight) {
					testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
					testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
					testCase.log(Status.PASS, "Line height is as expected");
				} else {
					testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
					testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
					testCase.log(Status.FAIL, "Line height is not as expected");
				}

				// Text Decoration

				String ActualTextDecoration = AddSbuUIPage.SBUText.getCssValue("text-decoration");
				System.out.println("Text Decoration :" + ActualTextDecoration);

				String ExpectedTextDecoration = "none solid rgb(142, 142, 142)";

				boolean textdecoration = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-DECORATION");
				try {
					AssertJUnit.assertEquals(ActualTextDecoration, ExpectedTextDecoration);

				} catch (AssertionError e) {
					textdecoration = false;
				}
				if (textdecoration) {
					testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
					testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
					testCase.log(Status.PASS, "Text decoration is as expected");
				} else {
					testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
					testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
					testCase.log(Status.FAIL, "Text decoration is not as expected");
				}

				// VERTICAL ALIGN

				String actualVerticalAlignment = AddSbuUIPage.SBUText.getCssValue("vertical-align");
				System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);

				String expectedVerticalAlignment = "baseline";

				boolean verticalAlignment = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-VERTICAL-ALIGNMENT");
				try {
					Assert.assertEquals(actualVerticalAlignment, expectedVerticalAlignment);
				} catch (AssertionError e) {
					verticalAlignment = false;
				}

				if (verticalAlignment) {
					testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
					testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
					testCase.log(Status.PASS, "Text vertical Align is as expected");

				} else {
					testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
					testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
					testCase.log(Status.FAIL, "Text vertical Align is as expected");

				}

				// TEXT INDENT (To indent is to begin text with a blank space between it and the
				// margin)

				String ActualTextIndent = AddSbuUIPage.SBUText.getCssValue("text-indent");
				System.out.println("Text Indent :" + ActualTextIndent);

				String ExpectedTextIndent = "0px";

				boolean textindent = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-INDENT");
				try {
					AssertJUnit.assertEquals(ActualTextIndent, ExpectedTextIndent);

				} catch (AssertionError e) {
					textindent = false;
				}
				if (textindent) {
					testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
					testCase.log(Status.INFO, "ExpectedTextIndent :- " + ExpectedTextIndent);
					testCase.log(Status.PASS, "Text Indent is as expected");

				} else {
					testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
					testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
					testCase.log(Status.FAIL, "Text Indent is as expected");

				}
				// TEXT - ORIENTATION(text characters in a line. It only affects text in
				// vertical mode)

				String ActualTextOrientation = AddSbuUIPage.SBUText.getCssValue("text-orientation");
				System.out.println("Text Orientation :" + ActualTextOrientation);

				String ExpectedTextOrientation = "mixed";

				boolean textorientation = true;
				testCase = extent.createTest("STEP 5 : Check SBU Text-ORIENTATION");
				try {
					AssertJUnit.assertEquals(ActualTextOrientation, ExpectedTextOrientation);

				} catch (AssertionError e) {
					textorientation = false;
				}
				if (textorientation) {
					testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
					testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
					testCase.log(Status.PASS, "Text orientation is as expected");
				} else {
					testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
					testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
					testCase.log(Status.FAIL, "Text orientation is as unxpected");
				}

			} else {
				testCase = extent.createTest("STEP 5 : Check SBU Text-NOT-DISPLAYED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("TEXT Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}

		System.out.println("*******Add Sbu Field Text End********");

	}

//	@Test(priority = 4)
	public static void description() throws InterruptedException {

		System.out.println("*******Add Description Field Text Start********");

		PageFactory.initElements(driver, sbuui);

		try {
			if (AddSbuUIPage.DescriptionText.isDisplayed()) {

//							Text Displayed

				boolean ActualTextDisplay = AddSbuUIPage.DescriptionText.isDisplayed();
				boolean ExpectedTestDisplay = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-DISPLAYED");
				try {
					Assert.assertEquals(ActualTextDisplay, ExpectedTestDisplay);
					testCase.log(Status.INFO, "Actual text Displayed :- " + ActualTextDisplay);
					testCase.log(Status.INFO, "Expected text Displayed :- " + ExpectedTestDisplay);
					testCase.log(Status.PASS, " text is displayed");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualTextDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedTestDisplay);
					testCase.log(Status.FAIL, " text is not displayed ");
				}

				// text font color

				String Actualtextcolor = AddSbuUIPage.DescriptionText.getCssValue("font-color");

				String Expectedtextcolor = "";
				System.out.println("font colour :" + Actualtextcolor);
				testCase = extent.createTest("STEP 6 : Check SBU Description-FONT-COLOUR");
				try {
					Assert.assertEquals(Actualtextcolor, Expectedtextcolor);
					testCase.log(Status.INFO, "Actual font colour:- " + Actualtextcolor);
					testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
					testCase.log(Status.PASS, "Correct font colour");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font colour :- " + Actualtextcolor);
					testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
					testCase.log(Status.FAIL, "wrong font colour");
				}

				// text font size

				String Actualtextsize = AddSbuUIPage.DescriptionText.getCssValue("font-size");

				String Expectedtextsize = "14px";
				System.out.println("font size :" + Actualtextsize);
				testCase = extent.createTest("STEP 6 : Check SBU Description-FONT-SIZE");
				try {
					Assert.assertEquals(Actualtextsize, Expectedtextsize);
					testCase.log(Status.INFO, "Actual font size:- " + Actualtextsize);
					testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
					testCase.log(Status.PASS, "Correct font size");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font size :- " + Actualtextsize);
					testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
					testCase.log(Status.FAIL, "wrong font size");
				}

				// text font style

				String Actualtextstyle = AddSbuUIPage.DescriptionText.getCssValue("font-style");

				String Expectedtextstyle = "normal";
				System.out.println("font style :" + Actualtextstyle);
				testCase = extent.createTest("STEP 6 : Check SBU Description-FONT-STYLE");
				try {
					Assert.assertEquals(Actualtextstyle, Expectedtextstyle);
					testCase.log(Status.INFO, "Actual font style:- " + Actualtextstyle);
					testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
					testCase.log(Status.PASS, "Correct font style");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font style :- " + Actualtextstyle);
					testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
					testCase.log(Status.FAIL, "wrong font style");
				}

				// text spelling

				String Actualtext = AddSbuUIPage.DescriptionText.getText();

				String Expectedtext = "Description:";
				System.out.println("text :" + Actualtext);
				testCase = extent.createTest("STEP 6 : Check SBU Description");
				try {
					Assert.assertEquals(Actualtext, Expectedtext);
					testCase.log(Status.INFO, "Actual text:- " + Actualtext);
					testCase.log(Status.INFO, "Expected text :- " + Expectedtext);
					testCase.log(Status.PASS, "Correct text");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font text :- " + Actualtext);
					testCase.log(Status.INFO, "Expected font text :- " + Expectedtext);
					testCase.log(Status.FAIL, "wrong font text");
				}

				// text font family

				String Actualfontfamily = AddSbuUIPage.DescriptionText.getCssValue("font-family");

				String Expectedfontfamily = "Roboto";
				System.out.println("text :" + Actualfontfamily);
				testCase = extent.createTest("STEP 6 : Check SBU Description-FONT-FAMILY");
				try {
					Assert.assertEquals(Actualfontfamily, Expectedfontfamily);
					testCase.log(Status.INFO, "Actual fontfamily:- " + Actualfontfamily);
					testCase.log(Status.INFO, "Expected fontfamily :- " + Expectedfontfamily);
					testCase.log(Status.PASS, "Correct fontfamily");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual font fontfamily :- " + Actualfontfamily);
					testCase.log(Status.INFO, "Expected font fontfamily :- " + Expectedfontfamily);
					testCase.log(Status.FAIL, "wrong font fontfamily");
				}

				// text position

				Point ActulaTitleLocation = AddSbuUIPage.DescriptionText.getLocation();
				int actual_x = ActulaTitleLocation.getX();
				int actual_y = ActulaTitleLocation.getY();

				System.out.println("X axis: " + actual_x);
				System.out.println("Y axis: " + actual_y);

				Point ExpectedTitleLocation = new Point(693, 167);

				testCase = extent.createTest("STEP 6 : Check SBU Description-POSITION");
				try {
					Assert.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);
					testCase.log(Status.INFO, "Actual TitleLocation:- " + ActulaTitleLocation);
					testCase.log(Status.INFO, "Expected TitleLocation :- " + ExpectedTitleLocation);
					testCase.log(Status.PASS, "Correct TitleLocation");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual  TitleLocation :- " + ActulaTitleLocation);
					testCase.log(Status.INFO, "Expected TitleLocation :- " + ExpectedTitleLocation);
					testCase.log(Status.FAIL, "wrong TitleLocation");
				}

				// padding

				String Actualpadding = AddSbuUIPage.DescriptionText.getCssValue("padding");

				String Expectedpadding = "0px";
				System.out.println("padding :" + Actualpadding);
				testCase = extent.createTest("STEP 6 : Check SBU Description-PADDING");
				try {
					Assert.assertEquals(Actualpadding, Expectedpadding);
					testCase.log(Status.INFO, "Actual padding:- " + Actualpadding);
					testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
					testCase.log(Status.PASS, "Correct padding");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
					testCase.log(Status.INFO, "Expected padding:- " + Expectedpadding);
					testCase.log(Status.FAIL, "wrong padding");
				}

				// text margin

				String Actualmargin = AddSbuUIPage.DescriptionText.getCssValue("margin");

				String Expectedmargin = "0px";
				System.out.println("margin :" + Actualmargin);
				testCase = extent.createTest("STEP 6 : Check SBU Description-MARGIN");
				try {
					Assert.assertEquals(Actualmargin, Expectedmargin);
					testCase.log(Status.INFO, "Actual padding:- " + Actualmargin);
					testCase.log(Status.INFO, "Expected padding :- " + Expectedmargin);
					testCase.log(Status.PASS, "Correct padding");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual padding :- " + Actualmargin);
					testCase.log(Status.INFO, "Expected padding:- " + Expectedmargin);
					testCase.log(Status.FAIL, "wrong padding");
				}

				// text box shadow

				String Actualshadow = AddSbuUIPage.DescriptionText.getCssValue("box-shadow");

				String Expectedshadow = "none";
				System.out.println("shadow :" + Actualshadow);
				testCase = extent.createTest("STEP 6 : Check SBU Description-SHADOW");
				try {
					Assert.assertEquals(Actualshadow, Expectedshadow);
					testCase.log(Status.INFO, "Actual shadow:- " + Actualshadow);
					testCase.log(Status.INFO, "Expected shadow :- " + Expectedshadow);
					testCase.log(Status.PASS, "Correct shadow");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual shadow :- " + Actualshadow);
					testCase.log(Status.INFO, "Expected shadow:- " + Expectedshadow);
					testCase.log(Status.FAIL, "wrong shadow");
				}

				// LETTER SPACING

				String ActualLetterSpacing = AddSbuUIPage.DescriptionText.getCssValue("letter-spacing");
				System.out.println("Letter Spacing :" + ActualLetterSpacing);

				String ExpectedLetterSpacing = "normal";

				boolean letterspacing = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-LETTER-SPACING");
				try {
					AssertJUnit.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);

				} catch (AssertionError e) {
					letterspacing = false;
				}
				if (letterspacing) {
					testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
					testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
					testCase.log(Status.PASS, "Letter spacing is as expected");
				} else {
					testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
					testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
					testCase.log(Status.FAIL, "Letter spacing is not as expected");
				}

				// WORD SPACING

				String ActualWordSpacing = AddSbuUIPage.DescriptionText.getCssValue("word-spacing");
				System.out.println("Word Spacing :" + ActualWordSpacing);

				String ExpectedWordSpacing = "0px";

				boolean wordspacing = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-WORD-SPACING");
				try {
					AssertJUnit.assertEquals(ActualWordSpacing, ExpectedWordSpacing);

				} catch (AssertionError e) {
					wordspacing = false;
				}
				if (wordspacing) {
					testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
					testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
					testCase.log(Status.PASS, "Word spacing is as expected");
				} else {
					testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
					testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
					testCase.log(Status.FAIL, "Word spacing is not as expected");
				}

				// ALIGNMENT (CENTER/LEFT/RIGHT)

				String ActualAlignment = AddSbuUIPage.DescriptionText.getCssValue("text-align");
				System.out.println("Text Alignment :" + ActualAlignment);

				String ExpectedAlignment = "left";

				boolean alignment = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-ALIGNMENT");
				try {
					AssertJUnit.assertEquals(ActualAlignment, ExpectedAlignment);

				} catch (AssertionError e) {
					alignment = false;
				}
				if (alignment) {
					testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
					testCase.log(Status.PASS, "Alignment is as expected");
				} else {
					testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
					testCase.log(Status.FAIL, "Alignment is not as expected");
				}
				// TEXT TRANSFORMATION (UPERCASE/ LOWECASE)

				String ActualTextTransformation = AddSbuUIPage.DescriptionText.getCssValue("text-transform");
				System.out.println("Text Transformation :" + ActualTextTransformation);

				String ExpectedTextTransformation = "none";

				boolean texttransformation = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-TRANSFORMATION");
				try {
					AssertJUnit.assertEquals(ActualTextTransformation, ExpectedTextTransformation);

				} catch (AssertionError e) {
					texttransformation = false;
				}
				if (texttransformation) {
					testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
					testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
					testCase.log(Status.PASS, "Transformation expected");
				} else {
					testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
					testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
					testCase.log(Status.FAIL, "Transformation unexpected");
				}

				// LINE HEIGHT

				String ActualLineHeight = AddSbuUIPage.DescriptionText.getCssValue("line-height");
				System.out.println("Line Height :" + ActualLineHeight);

				String ExpectedLineHeight = "22.001px";

				boolean lineheight = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-LINE-HEIGHT");
				try {
					AssertJUnit.assertEquals(ActualLineHeight, ExpectedLineHeight);

				} catch (AssertionError e) {
					lineheight = false;
				}
				if (lineheight) {
					testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
					testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
					testCase.log(Status.PASS, "Line height is as expected");
				} else {
					testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
					testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
					testCase.log(Status.FAIL, "Line height is not as expected");
				}

				// Text Decoration

				String ActualTextDecoration = AddSbuUIPage.DescriptionText.getCssValue("text-decoration");
				System.out.println("Text Decoration :" + ActualTextDecoration);

				String ExpectedTextDecoration = "none solid rgb(142, 142, 142)";

				boolean textdecoration = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-DECORATION");
				try {
					AssertJUnit.assertEquals(ActualTextDecoration, ExpectedTextDecoration);

				} catch (AssertionError e) {
					textdecoration = false;
				}
				if (textdecoration) {
					testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
					testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
					testCase.log(Status.PASS, "Text decoration is as expected");
				} else {
					testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
					testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
					testCase.log(Status.FAIL, "Text decoration is not as expected");
				}

				// VERTICAL ALIGN

				String actualVerticalAlignment = AddSbuUIPage.DescriptionText.getCssValue("vertical-align");
				System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);

				String expectedVerticalAlignment = "baseline";

				boolean verticalAlignment = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-VERTICAL-ALIGNMENT");
				try {
					Assert.assertEquals(actualVerticalAlignment, expectedVerticalAlignment);
				} catch (AssertionError e) {
					verticalAlignment = false;
				}

				if (verticalAlignment) {
					testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
					testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
					testCase.log(Status.PASS, "Text vertical Align is as expected");

				} else {
					testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
					testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
					testCase.log(Status.FAIL, "Text vertical Align is as expected");

				}

				// TEXT INDENT (To indent is to begin text with a blank space between it and the
				// margin)

				String ActualTextIndent = AddSbuUIPage.DescriptionText.getCssValue("text-indent");
				System.out.println("Text Indent :" + ActualTextIndent);

				String ExpectedTextIndent = "0px";

				boolean textindent = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-INDENT");
				try {
					AssertJUnit.assertEquals(ActualTextIndent, ExpectedTextIndent);

				} catch (AssertionError e) {
					textindent = false;
				}
				if (textindent) {
					testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
					testCase.log(Status.INFO, "ExpectedTextIndent :- " + ExpectedTextIndent);
					testCase.log(Status.PASS, "Text Indent is as expected");

				} else {
					testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
					testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
					testCase.log(Status.FAIL, "Text Indent is as expected");

				}
				// TEXT - ORIENTATION(text characters in a line. It only affects text in
				// vertical mode)

				String ActualTextOrientation = AddSbuUIPage.DescriptionText.getCssValue("text-orientation");
				System.out.println("Text Orientation :" + ActualTextOrientation);

				String ExpectedTextOrientation = "mixed";

				boolean textorientation = true;
				testCase = extent.createTest("STEP 6 : Check SBU Description-ORIENTATION");
				try {
					AssertJUnit.assertEquals(ActualTextOrientation, ExpectedTextOrientation);

				} catch (AssertionError e) {
					textorientation = false;
				}
				if (textorientation) {
					testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
					testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
					testCase.log(Status.PASS, "Text orientation is as expected");
				} else {
					testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
					testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
					testCase.log(Status.FAIL, "Text orientation is as unxpected");
				}

			} else {
				testCase = extent.createTest("STEP 6 : Check SBU Description IS NOT DISPLAYED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("STEP 6 : Check SBU Description Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}

		System.out.println("*******Add Description Field Text End********");

	}

//	@Test(priority = 5)
	public static void sbutextbox() throws InterruptedException {

		System.out.println("*******Add Sbu Field TextBox Start********");

		PageFactory.initElements(driver, sbuui);

		try {
			if (AddSbuUIPage.SBUtextbox.isDisplayed()) {

//						button Displayed

				boolean ActualbiuttonDisplay = AddSbuUIPage.SBUtextbox.isDisplayed();
				boolean ExpectedbuttonDisplay = true;
				testCase = extent.createTest("STEP 7 : Check SBU TextBox-DISPLAYED");
				try {
					Assert.assertEquals(ActualbiuttonDisplay, ExpectedbuttonDisplay);
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualbiuttonDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedbuttonDisplay);
					testCase.log(Status.PASS, " Image Displayed is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualbiuttonDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedbuttonDisplay);
					testCase.log(Status.FAIL, " Image Displayed is Wrong");
				}

				try {
					if (AddSbuUIPage.SBUtextbox.isEnabled()) {

//								button enabled

						boolean ActualImageDisplay = AddSbuUIPage.SBUtextbox.isEnabled();
						boolean ExpectedImageDisplay = true;
						testCase = extent.createTest("STEP 7 : Check SBU TextBox-ENABLED");
						try {
							Assert.assertEquals(ActualImageDisplay, ExpectedImageDisplay);
							testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
							testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
							testCase.log(Status.PASS, " Image Displayed is Correct");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
							testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
							testCase.log(Status.FAIL, " Image Displayed is Wrong");
						}

						// Check Image Position
						Point ExpectedImageLocation = new Point(417, 189);
						Point actualImageLocation = AddSbuUIPage.SBUtextbox.getLocation();
						System.out.println("Position :" + actualImageLocation);
						testCase = extent.createTest("STEP 7 : Check SBU TextBox-POSITION");
						try {
							Thread.sleep(1000);
							Assert.assertEquals(actualImageLocation, ExpectedImageLocation);
							Thread.sleep(3000);
							testCase.log(Status.INFO, "Actual Image Position :- " + actualImageLocation);
							testCase.log(Status.INFO, "Expected Image Position :- " + ExpectedImageLocation);
							testCase.log(Status.INFO, "Correct Image Position");
							testCase.log(Status.PASS, " Image Position Correct");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual Image Position :- " + actualImageLocation);
							testCase.log(Status.INFO, "Expected Image Position :- " + ExpectedImageLocation);
							testCase.log(Status.INFO, "Wrong  Image Position");
							testCase.log(Status.FAIL, " Image Position Wrong");
						}

						// CHECK BACKGROUND COLOR

						String Actualbgcolor = AddSbuUIPage.SBUtextbox.getCssValue("background-color");

						String Expectedbgcolour = "rgba(255, 255, 255, 1)";
						System.out.println("text :" + Actualbgcolor);
						testCase = extent.createTest("STEP 7 : Check SBU TextBox-BACKGROUND-COLOUR");
						try {
							Assert.assertEquals(Actualbgcolor, Expectedbgcolour);
							testCase.log(Status.INFO, "Actual bg colur:- " + Actualbgcolor);
							testCase.log(Status.INFO, "Expected bg colur :- " + Expectedbgcolour);
							testCase.log(Status.PASS, "Correct bg colur");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual bg colur :- " + Actualbgcolor);
							testCase.log(Status.INFO, "Expected bg colur :- " + Expectedbgcolour);
							testCase.log(Status.FAIL, "wrong bg colur");
						}

						// text font color

						String Actualtextcolor = AddSbuUIPage.SBUtextbox.getCssValue("font-color");

						String Expectedtextcolor = "";
						System.out.println("font colour :" + Actualtextcolor);
						testCase = extent.createTest("STEP 7 : Check SBU TextBox-FONT-COLOUR");
						try {
							Assert.assertEquals(Actualtextcolor, Expectedtextcolor);
							testCase.log(Status.INFO, "Actual font colour:- " + Actualtextcolor);
							testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
							testCase.log(Status.PASS, "Correct font colour");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual font colour :- " + Actualtextcolor);
							testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
							testCase.log(Status.FAIL, "wrong font colour");
						}

						// text font size

						String Actualtextsize = AddSbuUIPage.SBUtextbox.getCssValue("font-size");

						String Expectedtextsize = "14px";
						System.out.println("font size :" + Actualtextsize);
						testCase = extent.createTest("STEP 7 : Check SBU TextBox-FONT-SIZE");
						try {
							Assert.assertEquals(Actualtextsize, Expectedtextsize);
							testCase.log(Status.INFO, "Actual font size:- " + Actualtextsize);
							testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
							testCase.log(Status.PASS, "Correct font size");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual font size :- " + Actualtextsize);
							testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
							testCase.log(Status.FAIL, "wrong font size");
						}

						// text font style

						String Actualtextstyle = AddSbuUIPage.SBUtextbox.getCssValue("font-style");

						String Expectedtextstyle = "normal";
						System.out.println("font style :" + Actualtextstyle);
						testCase = extent.createTest("STEP 7 : Check SBU TextBox-FONT-STYLE");
						try {
							Assert.assertEquals(Actualtextstyle, Expectedtextstyle);
							testCase.log(Status.INFO, "Actual font style:- " + Actualtextstyle);
							testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
							testCase.log(Status.PASS, "Correct font style");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual font style :- " + Actualtextstyle);
							testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
							testCase.log(Status.FAIL, "wrong font style");
						}

						// SIZE
						Dimension ActualSize = AddSbuUIPage.SBUtextbox.getSize();
						System.out.println("Size :" + ActualSize);
						Dimension ExpectedSize = new Dimension(256, 32);

						boolean size = true;
						testCase = extent.createTest("STEP 7 : Check SBU TextBox-SIZE");
						try {
							AssertJUnit.assertEquals(ActualSize, ExpectedSize);
						} catch (AssertionError e) {
							size = false;
						}
						if (size) {
							testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
							testCase.log(Status.INFO, "Correct Size");
							testCase.log(Status.PASS, "Correct Size");
						} else {
							testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
							testCase.log(Status.INFO, "wrong Size");
							testCase.log(Status.FAIL, "wrong Size");
						}
						Thread.sleep(2000);

						// BORDER COLOUR

						String Actualbordercolour = AddSbuUIPage.SBUtextbox.getCssValue("border-color");

						String Expectedbordercolour = "rgb(217, 217, 217)";
						System.out.println("font style :" + Actualbordercolour);
						testCase = extent.createTest("STEP 7 : Check SBU TextBox-BORDER-COLOUR");
						try {
							Assert.assertEquals(Actualbordercolour, Expectedbordercolour);
							testCase.log(Status.INFO, "Actual border colour:- " + Actualbordercolour);
							testCase.log(Status.INFO, "Expected border colour :- " + Expectedbordercolour);
							testCase.log(Status.PASS, "Correct border colour");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual border colour :- " + Actualbordercolour);
							testCase.log(Status.INFO, "Expected border colour :- " + Expectedbordercolour);
							testCase.log(Status.FAIL, "wrong border colour");
						}

					} else {
						testCase = extent.createTest("STEP 7 : Check SBU TextBox-NOT-ENABLED");
						testCase.log(Status.INFO, "Image Not Displayed");
						testCase.log(Status.FAIL, " Image Not Displayed");
					}
				} catch (NoSuchElementException e) {
					testCase = extent.createTest("STEP 7 : Check SBU TextBox Locator");
					testCase.log(Status.INFO, "Dont Have Image Locator");
					testCase.log(Status.FAIL, " Dont Have Image Locator");
				}

			} else {
				testCase = extent.createTest("STEP 7 : Check SBU TextBox-NOT-DISPLAYED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("STEP 7 : Check SBU TextBox Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}
		System.out.println("*******Add Sbu Field TextBox End********");
	}

//	@Test(priority = 6)
	public static void descriptiontextbox() throws InterruptedException {

		System.out.println("*******Add Description Field TextBox Start********");

		PageFactory.initElements(driver, sbuui);

		try {
			if (AddSbuUIPage.Descriptiontextbox.isDisplayed()) {

//						button Displayed

				boolean ActualbiuttonDisplay = AddSbuUIPage.Descriptiontextbox.isDisplayed();
				boolean ExpectedbuttonDisplay = true;
				testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-DISPLAYED");
				try {
					Assert.assertEquals(ActualbiuttonDisplay, ExpectedbuttonDisplay);
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualbiuttonDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedbuttonDisplay);
					testCase.log(Status.PASS, " Image Displayed is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualbiuttonDisplay);
					testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedbuttonDisplay);
					testCase.log(Status.FAIL, " Image Displayed is Wrong");
				}

				try {
					if (AddSbuUIPage.SBUtextbox.isEnabled()) {

//								button enabled

						boolean ActualImageDisplay = AddSbuUIPage.Descriptiontextbox.isEnabled();
						boolean ExpectedImageDisplay = true;
						testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-ENABLED");
						try {
							Assert.assertEquals(ActualImageDisplay, ExpectedImageDisplay);
							testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
							testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
							testCase.log(Status.PASS, " Image Displayed is Correct");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
							testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
							testCase.log(Status.FAIL, " Image Displayed is Wrong");
						}

						// Check Image Position
						Point ExpectedImageLocation = new Point(693, 189);
						Point actualImageLocation = AddSbuUIPage.Descriptiontextbox.getLocation();
						System.out.println("Position :" + actualImageLocation);
						testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-POSITION");
						try {
							Thread.sleep(1000);
							Assert.assertEquals(actualImageLocation, ExpectedImageLocation);
							Thread.sleep(3000);
							testCase.log(Status.INFO, "Actual Image Position :- " + actualImageLocation);
							testCase.log(Status.INFO, "Expected Image Position :- " + ExpectedImageLocation);
							testCase.log(Status.INFO, "Correct Image Position");
							testCase.log(Status.PASS, " Image Position Correct");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual Image Position :- " + actualImageLocation);
							testCase.log(Status.INFO, "Expected Image Position :- " + ExpectedImageLocation);
							testCase.log(Status.INFO, "Wrong  Image Position");
							testCase.log(Status.FAIL, " Image Position Wrong");
						}

						// CHECK BACKGROUND COLOR

						String Actualbgcolor = AddSbuUIPage.Descriptiontextbox.getCssValue("background-color");

						String Expectedbgcolour = "rgba(255, 255, 255, 1)";
						System.out.println("text :" + Actualbgcolor);
						testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-BACKGROUND-COLOUR");
						try {
							Assert.assertEquals(Actualbgcolor, Expectedbgcolour);
							testCase.log(Status.INFO, "Actual bg colur:- " + Actualbgcolor);
							testCase.log(Status.INFO, "Expected bg colur :- " + Expectedbgcolour);
							testCase.log(Status.PASS, "Correct bg colur");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual bg colur :- " + Actualbgcolor);
							testCase.log(Status.INFO, "Expected bg colur :- " + Expectedbgcolour);
							testCase.log(Status.FAIL, "wrong bg colur");
						}

						// text font color

						String Actualtextcolor = AddSbuUIPage.Descriptiontextbox.getCssValue("font-color");

						String Expectedtextcolor = "";
						System.out.println("font colour :" + Actualtextcolor);
						testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-FONT-COLOUR");
						try {
							Assert.assertEquals(Actualtextcolor, Expectedtextcolor);
							testCase.log(Status.INFO, "Actual font colour:- " + Actualtextcolor);
							testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
							testCase.log(Status.PASS, "Correct font colour");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual font colour :- " + Actualtextcolor);
							testCase.log(Status.INFO, "Expected font colour :- " + Expectedtextcolor);
							testCase.log(Status.FAIL, "wrong font colour");
						}

						// text font size

						String Actualtextsize = AddSbuUIPage.Descriptiontextbox.getCssValue("font-size");

						String Expectedtextsize = "14px";
						System.out.println("font size :" + Actualtextsize);
						testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-FONT-SIZE");
						try {
							Assert.assertEquals(Actualtextsize, Expectedtextsize);
							testCase.log(Status.INFO, "Actual font size:- " + Actualtextsize);
							testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
							testCase.log(Status.PASS, "Correct font size");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual font size :- " + Actualtextsize);
							testCase.log(Status.INFO, "Expected font size :- " + Expectedtextsize);
							testCase.log(Status.FAIL, "wrong font size");
						}

						// text font style

						String Actualtextstyle = AddSbuUIPage.Descriptiontextbox.getCssValue("font-style");

						String Expectedtextstyle = "normal";
						System.out.println("font style :" + Actualtextstyle);
						testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-FONT-STYLE");
						try {
							Assert.assertEquals(Actualtextstyle, Expectedtextstyle);
							testCase.log(Status.INFO, "Actual font style:- " + Actualtextstyle);
							testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
							testCase.log(Status.PASS, "Correct font style");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual font style :- " + Actualtextstyle);
							testCase.log(Status.INFO, "Expected font style :- " + Expectedtextstyle);
							testCase.log(Status.FAIL, "wrong font style");
						}

						// SIZE
						Dimension ActualSize = AddSbuUIPage.Descriptiontextbox.getSize();
						System.out.println("Size :" + ActualSize);
						Dimension ExpectedSize = new Dimension(256, 32);

						boolean size = true;
						testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-SIZE");
						try {
							AssertJUnit.assertEquals(ActualSize, ExpectedSize);
						} catch (AssertionError e) {
							size = false;
						}
						if (size) {
							testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
							testCase.log(Status.INFO, "Correct Size");
							testCase.log(Status.PASS, "Correct Size");
						} else {
							testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
							testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
							testCase.log(Status.INFO, "wrong Size");
							testCase.log(Status.FAIL, "wrong Size");
						}
						Thread.sleep(2000);

						// BORDER COLOUR

						String Actualbordercolour = AddSbuUIPage.Descriptiontextbox.getCssValue("border-color");

						String Expectedbordercolour = "rgb(217, 217, 217)";
						System.out.println("font style :" + Actualbordercolour);
						testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-BORDER-COLOUR");
						try {
							Assert.assertEquals(Actualbordercolour, Expectedbordercolour);
							testCase.log(Status.INFO, "Actual border colour:- " + Actualbordercolour);
							testCase.log(Status.INFO, "Expected border colour :- " + Expectedbordercolour);
							testCase.log(Status.PASS, "Correct border colour");
						} catch (AssertionError e) {
							testCase.log(Status.INFO, "Actual border colour :- " + Actualbordercolour);
							testCase.log(Status.INFO, "Expected border colour :- " + Expectedbordercolour);
							testCase.log(Status.FAIL, "wrong border colour");
						}

					} else {
						testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-NOT-ENABLED");
						testCase.log(Status.INFO, "Image Not Displayed");
						testCase.log(Status.FAIL, " Image Not Displayed");
					}
				} catch (NoSuchElementException e) {
					testCase = extent.createTest("STEP 8 : Check SBU Description TextBox Locator");
					testCase.log(Status.INFO, "Dont Have Image Locator");
					testCase.log(Status.FAIL, " Dont Have Image Locator");
				}

			} else {
				testCase = extent.createTest("STEP 8 : Check SBU Description TextBox-NOT-DISPLAYED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("STEP 8 : Check SBU Description TextBox Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}
		System.out.println("*******Add Description Field TextBox End********");
	}

//	@Test(priority = 7)
	public static void SbusaveButton() throws InterruptedException {

		// check if element visible

		boolean ActualElement = AddSbuUIPage.SBUsavebutton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//	        	  throw(e);

		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(2000);

		// check position

		Point ActualLocation = AddSbuUIPage.SBUsavebutton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(907, 288);

		boolean Position = true; 
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(2000);

//			 check font size

		String ActualFontSize = AddSbuUIPage.SBUsavebutton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(2000);

//			 check the size 

		Dimension ActualSize = AddSbuUIPage.SBUsavebutton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(60, 32);

		boolean size = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(2000);

//	            check the enable

		boolean ActualElementEnable = AddSbuUIPage.SBUsavebutton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(2000);

//	            check the button color

		String ActualButtonColor = AddSbuUIPage.SBUsavebutton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(2000);

//	            check the border color

		String ActualBorderColor = AddSbuUIPage.SBUsavebutton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = "";

		boolean bordercolor = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(2000);

//	            check the font type 

		String ActualFontType = AddSbuUIPage.SBUsavebutton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(2000);

//	                    check font color

		String ActualFontColor = AddSbuUIPage.SBUsavebutton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(2000);

//			cursor

		String ActualActions = AddSbuUIPage.SBUsavebutton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(2000);

//			text spelling

		String text = AddSbuUIPage.SBUsavebutton.getText();

		String text1 = "Save";
		boolean txt1 = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(2000);

//			padding

		String Actualvalue = AddSbuUIPage.SBUsavebutton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(2000);

//	  		border radius

		String Actualradius = AddSbuUIPage.SBUsavebutton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(2000);

//			opacity

		String Actualopacity = AddSbuUIPage.SBUsavebutton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(2000);

//			font weight

		String Actualfontweight = AddSbuUIPage.SBUsavebutton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("STEP 10 : Check SBU Save Button-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(2000);
	}

//	*****************************************************
	static AddSbuUIPage asup = new AddSbuUIPage();
	static boolean AddSbuBtnVisible = true;
	static boolean AddSbuBtnEnable = true;
 
	public static void AddSbuButton() {
		PageFactory.initElements(driver, asup);
		try {
			Category.LowLow("ADD SBU BUTTON VISIBLE", String.valueOf(AddSbuFunPage.AddSbuButton.isDisplayed()),String.valueOf(true));
		} catch (AssertionError e) {
			AddSbuBtnVisible = false;
			Category.HighHigh("ADD SBU BUTTON VISIBLE", String.valueOf(AddSbuFunPage.AddSbuButton.isDisplayed()),String.valueOf(true));
		} catch (NoSuchElementException e) {
			AddSbuBtnVisible = false;
			Category.HighHigh("ADD SBU BUTTON VISIBLE", String.valueOf(AddSbuFunPage.AddSbuButton.isDisplayed()) , String.valueOf(true));
		}
		if (AddSbuBtnVisible) {
			try {
				Category.HighHigh("ADD SBU BUTTON ENABLE", String.valueOf(AddSbuFunPage.AddSbuButton.isEnabled()),String.valueOf(true));
			} catch (AssertionError e) {
				AddSbuBtnEnable = false;
				Category.HighHigh("ADD SBU BUTTON ENABLE", String.valueOf(AddSbuFunPage.AddSbuButton.isEnabled()),String.valueOf(true));
			}

			if (AddSbuBtnEnable) {

			}

		}

	}

	public static void AddSbuModal() {
		PageFactory.initElements(driver, asup);
	}

	public static void AddSbuName() {
		PageFactory.initElements(driver, asup);
	}

	public static void SbuText() {
		PageFactory.initElements(driver, asup);
	}

	public static void DesText() {
		PageFactory.initElements(driver, asup);
	}

	public static void SbuTextBox() {
		PageFactory.initElements(driver, asup);
	}

	public static void DesTextBox() {
		PageFactory.initElements(driver, asup);
	}

	public static void SbuSaveBtn() {
		PageFactory.initElements(driver, asup);
	}
}
