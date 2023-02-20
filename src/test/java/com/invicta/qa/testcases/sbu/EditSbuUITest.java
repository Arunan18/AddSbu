package com.invicta.qa.testcases.sbu;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.EditSbuUIPage;
import com.invicta.qa.pages.sbu.EditSbuUIPage;

public class EditSbuUITest extends DriverIntialization {
	EditSbuUIPage Ebup = new EditSbuUIPage();
//public void test() {
//	System.out.println("Hi*********");
//}
	
	@Test(priority = 0)
	public void NavigateSBU() throws InterruptedException {
		PageFactory.initElements(driver, Ebup);
		Thread.sleep(3000);
//	TextPage.master1.click();
		EditSbuUIPage.Username.sendKeys("admin");
		Thread.sleep(1000);
		EditSbuUIPage.Password.sendKeys("tokyo@admin");
		Thread.sleep(1000);
		EditSbuUIPage.LoginButton.click();

		Thread.sleep(5000);
		EditSbuUIPage.Master.click();
		Thread.sleep(1000);
		EditSbuUIPage.Plant.click(); 
		Thread.sleep(1000);
		EditSbuUIPage.SBU.click();
		Thread.sleep(2000);
		EditSbuUIPage.EditBtn.click();
		Thread.sleep(5000);
		EditSBU();
		SBUText();
		DesText();
		SbuUIUpdateButton();
	}
 
//	@Test(priority = 0)
	public  void EditSBU() throws InterruptedException {
		PageFactory.initElements(driver, Ebup);
//Text Visible 
		boolean SbuNameTextEnable=true;
		boolean ExpectedTextVisible = true;
		System.out.println("IsVisible"); 
		boolean ActualTextVisible = EditSbuUIPage.EditSBUName.isDisplayed();
//		ActualTextVisible=false;
		testCase = extent.createTest("TEXT VISIBLE - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
			testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
		} catch (AssertionError e) {
			SbuNameTextEnable=false;
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
			testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
		}
		catch (NoSuchElementException e) {
			SbuNameTextEnable=false;
			testCase.log(Status.INFO, "Dont have this locator");
			testCase.log(Status.FAIL, "Dont have this locator");
		
		}
		if(SbuNameTextEnable) {
//FONT COLOR

		String aa = EditSbuUIPage.EditSBUName.getCssValue("color");
		String ActualTitleFontColor = Color.fromString(aa).asHex();
		System.out.println("Font color of button: " + ActualTitleFontColor);
		String ExpectedTitleFontColor = "#ffffff";

		boolean fontColour = true;

		testCase = extent.createTest("TITLE-FONT-COLOUR - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);

		} catch (AssertionError e) {
			// TODO: handle exception

			fontColour = false;
		}
		if (fontColour) {
			testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
			testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
			testCase.log(Status.INFO, "Correct font Colour");
			testCase.log(Status.PASS, "Correct font Colour");

		} else {
			testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
			testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
			testCase.log(Status.INFO, "wrong font Colour");
			testCase.log(Status.FAIL, "wrong font Colour");
		}
//FONTSIZE
		String ActualTitleFontsSize = EditSbuUIPage.EditSBUName.getCssValue("font-size");
		System.out.println("Font Size: " + ActualTitleFontsSize);
		String ExpectedTitleFontsSize = "16px";

		boolean fontsize = true;
		testCase = extent.createTest("TITLE-FONT- SIZE - 'Edit SBU'");

		try {
			Assert.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
		} catch (AssertionError e) {
			// TODO: handle exception
			fontsize = false;

		}
		if (fontsize) {
			testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
			testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
			testCase.log(Status.PASS, "Correct font-size");
			testCase.log(Status.PASS, " Font-size Correct");
		} else {
			testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
			testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
			testCase.log(Status.INFO, "Wrong font-size");
			testCase.log(Status.FAIL, "Font-size Wrong");

		}
//Font Family (Specifies the font family for text //family-name, generic-family, inherit)

		String ActualElementfamily = EditSbuUIPage.EditSBUName.getCssValue("FONT-FAMILY");
		System.out.println("FONT-FAMILY: " + ActualElementfamily);
		String ExpectedElementFamily = "Roboto, sans-serif";
		testCase = extent.createTest("TEXT-FONT-FAMILY - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
			testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
			testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
			testCase.log(Status.INFO, "Correct Text");
			testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
			testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
			testCase.log(Status.INFO, "wrong Text");
			testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
//Enable
		boolean ExpectedTextEnable = true;
		boolean ActualTextEnable = EditSbuUIPage.EditSBUName.isEnabled();
		System.out.println("TEXT EABLE: " + ActualTextEnable);
		testCase = extent.createTest("TEXT ENABLE - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTextEnable, ExpectedTextEnable);
			testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
			testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
			testCase.log(Status.PASS, "External Radio Button Enable is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
			testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
			testCase.log(Status.FAIL, "External Radio Button Enable is Wrong");
		}
//Spelling		
		try {
			String AcctualTitleText = EditSbuUIPage.EditSBUName.getText();
			String ExpectedTitleText = "Edit SBU";
			System.out.println(" Text:" + AcctualTitleText);
			boolean Titletext = true;
			testCase = extent.createTest("TEXT-SPELLING - 'Edit SBU'");
			try {
				Assert.assertEquals(AcctualTitleText, ExpectedTitleText);
			} catch (AssertionError e) {
				Titletext = false;
			}
			if (Titletext) {
				testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
				testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
				testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("TEXT-SPELLING - 'Edit SBU'");
			testCase.log(Status.FAIL, "No Element");
		}

//Position
		Point ActulaTitleLocation = EditSbuUIPage.EditSBUName.getLocation();
		int actual_x = ActulaTitleLocation.getX();
		int actual_y = ActulaTitleLocation.getY();
		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedTitleLocation = new Point(397, 106);
		boolean Position = true;
		testCase = extent.createTest("TEXT-POSITION - 'Edit SBU'");
		try {
			Assert.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActulaTitleLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedTitleLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActulaTitleLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedTitleLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
//Padding   

		String ActualTitlepadding = EditSbuUIPage.EditSBUName.getCssValue("padding");
		System.out.println("PADING: " + ActualTitlepadding);
		String ExpectedTitlepadding = "0px";
		testCase = extent.createTest("TEXT PADDING - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTitlepadding, ExpectedTitlepadding);
			testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
			testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
			testCase.log(Status.PASS, "padding is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
			testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
			testCase.log(Status.FAIL, "padding is Wrong");
		}

//Shadow
		String ActualTitleShadow = EditSbuUIPage.EditSBUName.getCssValue("box-shadow");
		System.out.println("Text Shadow :" + ActualTitleShadow);

		String ExpectedTitleShadow = "none";

		boolean boxshadow = true;
		testCase = extent.createTest("TEXT-SHADOW - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTitleShadow, ExpectedTitleShadow);

		} catch (AssertionError e) {
			boxshadow = false;
		}
		if (boxshadow) {
			testCase.log(Status.INFO, "ActualTitleShadow :- " + ActualTitleShadow);
			testCase.log(Status.INFO, "ExpectedTitleShadow :- " + ExpectedTitleShadow);
			testCase.log(Status.PASS, "Shadow text available");
		} else {
			testCase.log(Status.INFO, "ActualBorderShadow :- " + ActualTitleShadow);
			testCase.log(Status.INFO, "ExpectedBorderShadow :- " + ExpectedTitleShadow);
			testCase.log(Status.FAIL, "Shadow text not available");
		}

//Margin
		String ActualTitleMargin = EditSbuUIPage.EditSBUName.getCssValue("margin");
		System.out.println("Text Margin :" + ActualTitleMargin);

		String ExpectedTitleMargin = "0px 0px 16px";

		boolean textmargin = true;
		testCase = extent.createTest("TEXT-MARGIN - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTitleMargin, ExpectedTitleMargin);
		} catch (AssertionError e) {
			// TODO: handle exception
			textmargin = false;

		}
		if (textmargin) {
			testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
			testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
			testCase.log(Status.PASS, "Text margin available");
		} else {
			testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
			testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
			testCase.log(Status.FAIL, "Text margin text not available");
		}
//LETTER SPACING
		String ActualLetterSpacing = EditSbuUIPage.EditSBUName.getCssValue("letter-spacing");
		System.out.println("Letter Spacing :" + ActualLetterSpacing);

		String ExpectedLetterSpacing = "normal";

		boolean letterspacing = true;
		testCase = extent.createTest("TEXT-SPACING - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);

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

//WORD SPACING
		String ActualWordSpacing = EditSbuUIPage.EditSBUName.getCssValue("word-spacing");
		System.out.println("Word Spacing :" + ActualWordSpacing);

		String ExpectedWordSpacing = "0px";

		boolean wordspacing = true;
		testCase = extent.createTest("WORD-SPACING - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualWordSpacing, ExpectedWordSpacing);

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
//ALIGNMENT (CENTER/LEFT/RIGHT)
		String ActualAlignment = EditSbuUIPage.EditSBUName.getCssValue("text-align");
		System.out.println("Text Alignment :" + ActualAlignment);

		String ExpectedAlignment = "start";

		boolean alignment = true;
		testCase = extent.createTest("TEXT-ALIGNMENT - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualAlignment, ExpectedAlignment);

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
//TEXT TRANSFORMATION (UPERCASE/ LOWECASE)

		String ActualTextTransformation = EditSbuUIPage.EditSBUName.getCssValue("text-transform");
		System.out.println("Text Transformation :" + ActualTextTransformation);

		String ExpectedTextTransformation = "none";

		boolean texttransformation = true;
		testCase = extent.createTest("TEXT-TRANSFORMATION - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTextTransformation, ExpectedTextTransformation);

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
//LINE HEIGHT
		String ActualLineHeight = EditSbuUIPage.EditSBUName.getCssValue("line-height");
		System.out.println("Line Height :" + ActualLineHeight);

		String ExpectedLineHeight = "22px";

		boolean lineheight = true;
		testCase = extent.createTest("LINE-HEIGHT - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualLineHeight, ExpectedLineHeight);

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

//Text Decoration
		String ActualTextDecoration = EditSbuUIPage.EditSBUName.getCssValue("text-decoration");
		System.out.println("Text Decoration :" + ActualTextDecoration);

		String ExpectedTextDecoration = "none solid rgb(255, 255, 255)";

		boolean textdecoration = true;
		testCase = extent.createTest("TEXT-DECORATION - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTextDecoration, ExpectedTextDecoration);

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

//VERTICAL ALIGN

		String actualVerticalAlignment = EditSbuUIPage.EditSBUName.getCssValue("vertical-align");
		System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);

		String expectedVerticalAlignment = "baseline";

		boolean verticalAlignment = true;
		testCase = extent.createTest("TEXT-VERTICAL-ALIGNMENT - 'Edit SBU'");
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
			testCase.log(Status.PASS, "Text vertical Align is as expected");

		}

//TEXT INDENT  (To indent is to begin text with a blank space between it and the margin)

		String ActualTextIndent = EditSbuUIPage.EditSBUName.getCssValue("text-indent");
		System.out.println("Text Indent :" + ActualTextIndent);

		String ExpectedTextIndent = "0px";

		boolean textindent = true;
		testCase = extent.createTest("TEXT-INDENT - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTextIndent, ExpectedTextIndent);

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
			testCase.log(Status.PASS, "Text Indent is as expected");

		}
//TEXT - ORIENTATION(text characters in a line. It only affects text in vertical mode)

		String ActualTextOrientation = EditSbuUIPage.EditSBUName.getCssValue("text-orientation");
		System.out.println("Text Orientation :" + ActualTextOrientation);

		String ExpectedTextOrientation = "mixed";

		boolean textorientation = true;
		testCase = extent.createTest("TEXT-ORIENTATION - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualTextOrientation, ExpectedTextOrientation);

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
			testCase.log(Status.PASS, "Text orientation is as unxpected");
		}
//FONT STYLE
		String ActualFontStyle = EditSbuUIPage.EditSBUName.getCssValue("font-style");
		System.out.println("Font Style :" + ActualFontStyle);

		String ExpectedFontStyle = "normal";

		boolean fontstyle = true;
		testCase = extent.createTest("FONT-STYLE - 'Edit SBU'");
		try {
			Assert.assertEquals(ActualFontStyle, ExpectedFontStyle);

		} catch (AssertionError e) {
			fontstyle = false;
		}
		if (fontstyle) {
			testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
			testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
			testCase.log(Status.PASS, "Font style is as expected");
		} else {
			testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
			testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
			testCase.log(Status.FAIL, "Font style is not as expected");
		}
	}
	}
	
//	@Test(priority = 1)
	public void SBUText() throws InterruptedException {
		PageFactory.initElements(driver, Ebup);
		//Text Visible
		boolean SbuTextDisplay = true;
				boolean ExpectedTextVisible = true;
				System.out.println("IsVisible");
				boolean ActualTextVisible = EditSbuUIPage.SbuText.isDisplayed();
				testCase = extent.createTest("TEXT VISIBLE - 'Sub Business Unit '");
				try {
					Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
					testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " +ActualTextVisible);
					testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
					testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
				} catch (AssertionError e) {
					SbuTextDisplay=false;
					testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
					testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
					testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
				}catch (NoSuchElementException e) {
					SbuTextDisplay=false;
					testCase.log(Status.INFO, "Dont have this locator");
					testCase.log(Status.FAIL, "Dont have this locator");
				
				}
				if (SbuTextDisplay) {
					// FONT COLOR

					String bb = EditSbuUIPage.SbuText.getCssValue("color");
					String ActualTitleFontColor = Color.fromString(bb).asHex();
					System.out.println("Font color of button: " + ActualTitleFontColor);
					String ExpectedTitleFontColor = "#8e8e8e";

					boolean fontColour = true;

					testCase = extent.createTest("TITLE-FONT-COLOUR - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);

					} catch (AssertionError e) {
						// TODO: handle exception

						fontColour = false;
					}
					if (fontColour) {
						testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
						testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
						testCase.log(Status.INFO, "Correct font Colour");
						testCase.log(Status.PASS, "Correct font Colour");

					} else {
						testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
						testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
						testCase.log(Status.INFO, "wrong font Colour");
						testCase.log(Status.FAIL, "wrong font Colour");
					}
					// FONTSIZE
					String ActualTitleFontsSize = EditSbuUIPage.SbuText.getCssValue("font-size");
					System.out.println("Font Size: " + ActualTitleFontsSize);
					String ExpectedTitleFontsSize = "14px";

					boolean fontsize = true;
					testCase = extent.createTest("TITLE-FONT- SIZE - 'Sub Business Unit'");

					try {
						Assert.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
					} catch (AssertionError e) {
						// TODO: handle exception
						fontsize = false;

					}
					if (fontsize) {
						testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
						testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
						testCase.log(Status.PASS, "Correct font-size");
						testCase.log(Status.PASS, " Font-size Correct");
					} else {
						testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
						testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
						testCase.log(Status.INFO, "Wrong font-size");
						testCase.log(Status.FAIL, "Font-size Wrong");

					}
					// Font Family (Specifies the font family for text //family-name,
					// generic-family, inherit)

					String ActualElementfamily = EditSbuUIPage.SbuText.getCssValue("FONT-FAMILY");
					System.out.println("FONT-FAMILY: " + ActualElementfamily);
					String ExpectedElementFamily = "Roboto";
					testCase = extent.createTest("TEXT-FONT-FAMILY - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
						testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
						testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
						testCase.log(Status.INFO, "Correct Text");
						testCase.log(Status.PASS, "Correct Text");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
						testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
						testCase.log(Status.INFO, "wrong Text");
						testCase.log(Status.FAIL, "wrong Text");
					}
					Thread.sleep(2000);
					// Enable
					boolean ExpectedTextEnable = true;
					boolean ActualTextEnable = EditSbuUIPage.SbuText.isEnabled();
					System.out.println("TEXT EABLE: " + ActualTextEnable);
					testCase = extent.createTest("TEXT ENABLE - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualTextEnable, ExpectedTextEnable);
						testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
						testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
						testCase.log(Status.PASS, "External Radio Button Enable is Correct");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
						testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
						testCase.log(Status.FAIL, "External Radio Button Enable is Wrong");
					}
					// Spelling
					try {
						String AcctualTitleText = EditSbuUIPage.SbuText.getText();
						String ExpectedTitleText = "Sub Business Unit:";
						System.out.println(" Text:" + AcctualTitleText);
						boolean Titletext = true;
						testCase = extent.createTest("TEXT-SPELLING - 'Sub Business Unit'");
						try {
							Assert.assertEquals(AcctualTitleText, ExpectedTitleText);
						} catch (AssertionError e) {
							Titletext = false;
						}
						if (Titletext) {
							testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
							testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
							testCase.log(Status.INFO, "Element Available");
							testCase.log(Status.PASS, "Correct element");
						} else {
							testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
							testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
							testCase.log(Status.INFO, "Element not available");
							testCase.log(Status.FAIL, "No Element");
						}
					} catch (Exception e) {
						testCase = extent.createTest("TEXT-SPELLING - 'Sub Business Unit'");
						testCase.log(Status.FAIL, "No Element");
					}

					// Position
					Point ActulaTitleLocation = EditSbuUIPage.SbuText.getLocation();
					int actual_x = ActulaTitleLocation.getX();
					int actual_y = ActulaTitleLocation.getY();
					System.out.println("X axis: " + actual_x);
					System.out.println("Y axis: " + actual_y);

					Point ExpectedTitleLocation = new Point(417, 167);
					boolean Position = true;
					testCase = extent.createTest("TEXT-POSITION - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);

					} catch (AssertionError e) {
						Position = false;
					}
					if (Position) {
						testCase.log(Status.INFO, "ActualFontSize :- " + ActulaTitleLocation);
						testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedTitleLocation);
						testCase.log(Status.PASS, "Correct Location");
					} else {
						testCase.log(Status.INFO, "ActualSize :- " + ActulaTitleLocation);
						testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedTitleLocation);
						testCase.log(Status.FAIL, "Wrong Location");
					}
					// Padding

					String ActualTitlepadding = EditSbuUIPage.SbuText.getCssValue("padding");
					System.out.println("PADING: " + ActualTitlepadding);
					String ExpectedTitlepadding = "0px";
					testCase = extent.createTest("TEXT PADDING - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualTitlepadding, ExpectedTitlepadding);
						testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
						testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
						testCase.log(Status.PASS, "padding is Correct");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
						testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
						testCase.log(Status.FAIL, "padding is Wrong");
					}

					// Shadow
					String ActualTitleShadow = EditSbuUIPage.SbuText.getCssValue("box-shadow");
					System.out.println("Text Shadow :" + ActualTitleShadow);

					String ExpectedTitleShadow = "none";

					boolean boxshadow = true;
					testCase = extent.createTest("TEXT-SHADOW - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualTitleShadow, ExpectedTitleShadow);

					} catch (AssertionError e) {
						boxshadow = false;
					}
					if (boxshadow) {
						testCase.log(Status.INFO, "ActualTitleShadow :- " + ActualTitleShadow);
						testCase.log(Status.INFO, "ExpectedTitleShadow :- " + ExpectedTitleShadow);
						testCase.log(Status.PASS, "Shadow text available");
					} else {
						testCase.log(Status.INFO, "ActualBorderShadow :- " + ActualTitleShadow);
						testCase.log(Status.INFO, "ExpectedBorderShadow :- " + ExpectedTitleShadow);
						testCase.log(Status.FAIL, "Shadow text not available");
					}

					// Margin
					String ActualTitleMargin = EditSbuUIPage.SbuText.getCssValue("margin");
					System.out.println("Text Margin :" + ActualTitleMargin);

					String ExpectedTitleMargin = "0px";

					boolean textmargin = true;
					testCase = extent.createTest("TEXT-MARGIN - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualTitleMargin, ExpectedTitleMargin);
					} catch (AssertionError e) {
						// TODO: handle exception
						textmargin = false;
 
					}
					if (textmargin) {
						testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
						testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
						testCase.log(Status.PASS, "Text margin available");
					} else {
						testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
						testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
						testCase.log(Status.FAIL, "Text margin text not available");
					}
					// LETTER SPACING
					String ActualLetterSpacing = EditSbuUIPage.SbuText.getCssValue("letter-spacing");
					System.out.println("Letter Spacing :" + ActualLetterSpacing);

					String ExpectedLetterSpacing = "normal";

					boolean letterspacing = true;
					testCase = extent.createTest("TEXT-SPACING - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);

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
					String ActualWordSpacing = EditSbuUIPage.SbuText.getCssValue("word-spacing");
					System.out.println("Word Spacing :" + ActualWordSpacing);

					String ExpectedWordSpacing = "0px";

					boolean wordspacing = true;
					testCase = extent.createTest("WORD-SPACING - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualWordSpacing, ExpectedWordSpacing);

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
					String ActualAlignment = EditSbuUIPage.SbuText.getCssValue("text-align");
					System.out.println("Text Alignment :" + ActualAlignment);

					String ExpectedAlignment = "left";

					boolean alignment = true;
					testCase = extent.createTest("TEXT-ALIGNMENT - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualAlignment, ExpectedAlignment);

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

					String ActualTextTransformation = EditSbuUIPage.SbuText.getCssValue("text-transform");
					System.out.println("Text Transformation :" + ActualTextTransformation);

					String ExpectedTextTransformation = "none";

					boolean texttransformation = true;
					testCase = extent.createTest("TEXT-TRANSFORMATION - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualTextTransformation, ExpectedTextTransformation);

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
					String ActualLineHeight = EditSbuUIPage.SbuText.getCssValue("line-height");
					System.out.println("Line Height :" + ActualLineHeight);

					String ExpectedLineHeight = "22.001px";

					boolean lineheight = true;
					testCase = extent.createTest("LINE-HEIGHT - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualLineHeight, ExpectedLineHeight);

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
					String ActualTextDecoration = EditSbuUIPage.SbuText.getCssValue("text-decoration");
					System.out.println("Text Decoration :" + ActualTextDecoration);

					String ExpectedTextDecoration = "none solid rgb(142, 142, 142)";

					boolean textdecoration = true;
					testCase = extent.createTest("TEXT-DECORATION - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualTextDecoration, ExpectedTextDecoration);

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

					String actualVerticalAlignment = EditSbuUIPage.SbuText.getCssValue("vertical-align");
					System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);

					String expectedVerticalAlignment = "baseline";

					boolean verticalAlignment = true;
					testCase = extent.createTest("TEXT-VERTICAL-ALIGNMENT - 'Sub Business Unit'");
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
						testCase.log(Status.PASS, "Text vertical Align is as expected");

					}

					// TEXT INDENT (To indent is to begin text with a blank space between it and the
					// margin)

					String ActualTextIndent = EditSbuUIPage.SbuText.getCssValue("text-indent");
					System.out.println("Text Indent :" + ActualTextIndent);

					String ExpectedTextIndent = "0px";

					boolean textindent = true;
					testCase = extent.createTest("TEXT-INDENT - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualTextIndent, ExpectedTextIndent);

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
						testCase.log(Status.PASS, "Text Indent is as expected");

					}
					// TEXT - ORIENTATION(text characters in a line. It only affects text in
					// vertical mode)

					String ActualTextOrientation = EditSbuUIPage.SbuText.getCssValue("text-orientation");
					System.out.println("Text Orientation :" + ActualTextOrientation);

					String ExpectedTextOrientation = "mixed";

					boolean textorientation = true;
					testCase = extent.createTest("TEXT-ORIENTATION - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualTextOrientation, ExpectedTextOrientation);

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
						testCase.log(Status.PASS, "Text orientation is as unxpected");
					}
					// FONT STYLE
					String ActualFontStyle = EditSbuUIPage.SbuText.getCssValue("font-style");
					System.out.println("Font Style :" + ActualFontStyle);

					String ExpectedFontStyle = "normal";

					boolean fontstyle = true;
					testCase = extent.createTest("FONT-STYLE - 'Sub Business Unit'");
					try {
						Assert.assertEquals(ActualFontStyle, ExpectedFontStyle);

					} catch (AssertionError e) {
						fontstyle = false;
					}
					if (fontstyle) {
						testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
						testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
						testCase.log(Status.PASS, "Font style is as expected");
					} else {
						testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
						testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
						testCase.log(Status.FAIL, "Font style is not as expected");
					}
				}
	}
	
	
//	@Test(priority = 2)
	public void DesText() throws InterruptedException {
		PageFactory.initElements(driver, Ebup);
		//Text Visible
		boolean DesTestDisplay=true;
				boolean ExpectedTextVisible = true;
				System.out.println("IsVisible");
//				boolean ActualTextVisible = EditSbuUIPage.DesText.isDisplayed();
				testCase = extent.createTest("TEXT VISIBLE - 'Description'");
				try {
					Assert.assertEquals(EditSbuUIPage.DesText.isDisplayed(), ExpectedTextVisible);
					testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + EditSbuUIPage.DesText.isDisplayed());
					testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
					testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
				} catch (AssertionError e) {
					DesTestDisplay=false;
					testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + EditSbuUIPage.DesText.isDisplayed());
					testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
					testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
				}catch (NoSuchElementException e) {
					DesTestDisplay=false;
					testCase.log(Status.INFO, "Dont have this locator");
					testCase.log(Status.FAIL, "Dont have this locator");
				}
				if (DesTestDisplay) {
					// FONT COLOR

					String bb = EditSbuUIPage.DesText.getCssValue("color");
					String ActualTitleFontColor = Color.fromString(bb).asHex();
					System.out.println("Font color of button: " + ActualTitleFontColor);
					String ExpectedTitleFontColor = "#8e8e8e";

					boolean fontColour = true;

					testCase = extent.createTest("TITLE-FONT-COLOUR - 'Description'");
					try {
						Assert.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);

					} catch (AssertionError e) {
						// TODO: handle exception

						fontColour = false;
					}
					if (fontColour) {
						testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
						testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
						testCase.log(Status.INFO, "Correct font Colour");
						testCase.log(Status.PASS, "Correct font Colour");

					} else {
						testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
						testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
						testCase.log(Status.INFO, "wrong font Colour");
						testCase.log(Status.FAIL, "wrong font Colour");
					}
					// FONTSIZE
					String ActualTitleFontsSize = EditSbuUIPage.DesText.getCssValue("font-size");
					System.out.println("Font Size: " + ActualTitleFontsSize);
					String ExpectedTitleFontsSize = "14px";

					boolean fontsize = true;
					testCase = extent.createTest("TITLE-FONT- SIZE - 'Description'");

					try {
						Assert.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
					} catch (AssertionError e) {
						// TODO: handle exception
						fontsize = false;

					}
					if (fontsize) {
						testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
						testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
						testCase.log(Status.PASS, "Correct font-size");
						testCase.log(Status.PASS, " Font-size Correct");
					} else {
						testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
						testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
						testCase.log(Status.INFO, "Wrong font-size");
						testCase.log(Status.FAIL, "Font-size Wrong");

					}
					// Font Family (Specifies the font family for text //family-name,
					// generic-family, inherit)

					String ActualElementfamily = EditSbuUIPage.DesText.getCssValue("FONT-FAMILY");
					System.out.println("FONT-FAMILY: " + ActualElementfamily);
					String ExpectedElementFamily = "Roboto";
					testCase = extent.createTest("TEXT-FONT-FAMILY - 'Description'");
					try {
						Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
						testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
						testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
						testCase.log(Status.INFO, "Correct Text");
						testCase.log(Status.PASS, "Correct Text");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
						testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
						testCase.log(Status.INFO, "wrong Text");
						testCase.log(Status.FAIL, "wrong Text");
					}
					Thread.sleep(2000);
					// Enable
					boolean ExpectedTextEnable = true;
					boolean ActualTextEnable = EditSbuUIPage.DesText.isEnabled();
					System.out.println("TEXT EABLE: " + ActualTextEnable);
					testCase = extent.createTest("TEXT ENABLE - 'Description'");
					try {
						Assert.assertEquals(ActualTextEnable, ExpectedTextEnable);
						testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
						testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
						testCase.log(Status.PASS, "External Radio Button Enable is Correct");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
						testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
						testCase.log(Status.FAIL, "External Radio Button Enable is Wrong");
					}
					// Spelling
					try {
						String AcctualTitleText = EditSbuUIPage.DesText.getText();
						String ExpectedTitleText = "Description:";
						System.out.println(" Text:" + AcctualTitleText);
						boolean Titletext = true;
						testCase = extent.createTest("TEXT-SPELLING - 'Description'");
						try {
							Assert.assertEquals(AcctualTitleText, ExpectedTitleText);
						} catch (AssertionError e) {
							Titletext = false;
						}
						if (Titletext) {
							testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
							testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
							testCase.log(Status.INFO, "Element Available");
							testCase.log(Status.PASS, "Correct element");
						} else {
							testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
							testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
							testCase.log(Status.INFO, "Element not available");
							testCase.log(Status.FAIL, "No Element");
						}
					} catch (Exception e) {
						testCase = extent.createTest("TEXT-SPELLING - 'Description'");
						testCase.log(Status.FAIL, "No Element");
					}

					// Position
					Point ActulaTitleLocation = EditSbuUIPage.DesText.getLocation();
					int actual_x = ActulaTitleLocation.getX();
					int actual_y = ActulaTitleLocation.getY();
					System.out.println("X axis: " + actual_x);
					System.out.println("Y axis: " + actual_y);

					Point ExpectedTitleLocation = new Point(693, 167);
					boolean Position = true;
					testCase = extent.createTest("TEXT-POSITION - 'Description'");
					try {
						Assert.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);

					} catch (AssertionError e) {
						Position = false;
					}
					if (Position) {
						testCase.log(Status.INFO, "ActualFontSize :- " + ActulaTitleLocation);
						testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedTitleLocation);
						testCase.log(Status.PASS, "Correct Location");
					} else {
						testCase.log(Status.INFO, "ActualSize :- " + ActulaTitleLocation);
						testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedTitleLocation);
						testCase.log(Status.FAIL, "Wrong Location");
					}
					// Padding

					String ActualTitlepadding = EditSbuUIPage.DesText.getCssValue("padding");
					System.out.println("PADING: " + ActualTitlepadding);
					String ExpectedTitlepadding = "0px";
					testCase = extent.createTest("TEXT PADDING - 'Description'");
					try {
						Assert.assertEquals(ActualTitlepadding, ExpectedTitlepadding);
						testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
						testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
						testCase.log(Status.PASS, "padding is Correct");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
						testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
						testCase.log(Status.FAIL, "padding is Wrong");
					}

					// Shadow
					String ActualTitleShadow = EditSbuUIPage.DesText.getCssValue("box-shadow");
					System.out.println("Text Shadow :" + ActualTitleShadow);

					String ExpectedTitleShadow = "none";

					boolean boxshadow = true;
					testCase = extent.createTest("TEXT-SHADOW - 'Description'");
					try {
						Assert.assertEquals(ActualTitleShadow, ExpectedTitleShadow);

					} catch (AssertionError e) {
						boxshadow = false;
					}
					if (boxshadow) {
						testCase.log(Status.INFO, "ActualTitleShadow :- " + ActualTitleShadow);
						testCase.log(Status.INFO, "ExpectedTitleShadow :- " + ExpectedTitleShadow);
						testCase.log(Status.PASS, "Shadow text available");
					} else {
						testCase.log(Status.INFO, "ActualBorderShadow :- " + ActualTitleShadow);
						testCase.log(Status.INFO, "ExpectedBorderShadow :- " + ExpectedTitleShadow);
						testCase.log(Status.FAIL, "Shadow text not available");
					}

					// Margin
					String ActualTitleMargin = EditSbuUIPage.DesText.getCssValue("margin");
					System.out.println("Text Margin :" + ActualTitleMargin);

					String ExpectedTitleMargin = "0px";

					boolean textmargin = true;
					testCase = extent.createTest("TEXT-MARGIN - 'Description'");
					try {
						Assert.assertEquals(ActualTitleMargin, ExpectedTitleMargin);
					} catch (AssertionError e) {
						// TODO: handle exception
						textmargin = false;

					}
					if (textmargin) {
						testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
						testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
						testCase.log(Status.PASS, "Text margin available");
					} else {
						testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
						testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
						testCase.log(Status.FAIL, "Text margin text not available");
					}
					// LETTER SPACING
					String ActualLetterSpacing = EditSbuUIPage.DesText.getCssValue("letter-spacing");
					System.out.println("Letter Spacing :" + ActualLetterSpacing);

					String ExpectedLetterSpacing = "normal";

					boolean letterspacing = true;
					testCase = extent.createTest("TEXT-SPACING - 'Description'");
					try {
						Assert.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);

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
					String ActualWordSpacing = EditSbuUIPage.DesText.getCssValue("word-spacing");
					System.out.println("Word Spacing :" + ActualWordSpacing);

					String ExpectedWordSpacing = "0px";

					boolean wordspacing = true;
					testCase = extent.createTest("WORD-SPACING - 'Description'");
					try {
						Assert.assertEquals(ActualWordSpacing, ExpectedWordSpacing);

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
					String ActualAlignment = EditSbuUIPage.DesText.getCssValue("text-align");
					System.out.println("Text Alignment :" + ActualAlignment);

					String ExpectedAlignment = "left";

					boolean alignment = true;
					testCase = extent.createTest("TEXT-ALIGNMENT - 'Description'");
					try {
						Assert.assertEquals(ActualAlignment, ExpectedAlignment);

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

					String ActualTextTransformation = EditSbuUIPage.DesText.getCssValue("text-transform");
					System.out.println("Text Transformation :" + ActualTextTransformation);

					String ExpectedTextTransformation = "none";

					boolean texttransformation = true;
					testCase = extent.createTest("TEXT-TRANSFORMATION - 'Description'");
					try {
						Assert.assertEquals(ActualTextTransformation, ExpectedTextTransformation);

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
					String ActualLineHeight = EditSbuUIPage.SbuText.getCssValue("line-height");
					System.out.println("Line Height :" + ActualLineHeight);

					String ExpectedLineHeight = "22.001px";

					boolean lineheight = true;
					testCase = extent.createTest("LINE-HEIGHT - 'Description'");
					try {
						Assert.assertEquals(ActualLineHeight, ExpectedLineHeight);

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
					String ActualTextDecoration = EditSbuUIPage.SbuText.getCssValue("text-decoration");
					System.out.println("Text Decoration :" + ActualTextDecoration);

					String ExpectedTextDecoration = "none solid rgb(142, 142, 142)";

					boolean textdecoration = true;
					testCase = extent.createTest("TEXT-DECORATION - 'Description'");
					try {
						Assert.assertEquals(ActualTextDecoration, ExpectedTextDecoration);

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

					String actualVerticalAlignment = EditSbuUIPage.DesText.getCssValue("vertical-align");
					System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);

					String expectedVerticalAlignment = "baseline";

					boolean verticalAlignment = true;
					testCase = extent.createTest("TEXT-VERTICAL-ALIGNMENT - 'Description'");
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
						testCase.log(Status.PASS, "Text vertical Align is as expected");

					}

					// TEXT INDENT (To indent is to begin text with a blank space between it and the
					// margin)

					String ActualTextIndent = EditSbuUIPage.DesText.getCssValue("text-indent");
					System.out.println("Text Indent :" + ActualTextIndent);

					String ExpectedTextIndent = "0px";

					boolean textindent = true;
					testCase = extent.createTest("TEXT-INDENT - 'Description'");
					try {
						Assert.assertEquals(ActualTextIndent, ExpectedTextIndent);

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
						testCase.log(Status.PASS, "Text Indent is as expected");

					}
					// TEXT - ORIENTATION(text characters in a line. It only affects text in
					// vertical mode)

					String ActualTextOrientation = EditSbuUIPage.DesText.getCssValue("text-orientation");
					System.out.println("Text Orientation :" + ActualTextOrientation);

					String ExpectedTextOrientation = "mixed";

					boolean textorientation = true;
					testCase = extent.createTest("TEXT-ORIENTATION - 'Description'");
					try {
						Assert.assertEquals(ActualTextOrientation, ExpectedTextOrientation);

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
						testCase.log(Status.PASS, "Text orientation is as unxpected");
					}
					// FONT STYLE
					String ActualFontStyle = EditSbuUIPage.DesText.getCssValue("font-style");
					System.out.println("Font Style :" + ActualFontStyle);

					String ExpectedFontStyle = "normal";

					boolean fontstyle = true;
					testCase = extent.createTest("FONT-STYLE - 'Description'");
					try {
						Assert.assertEquals(ActualFontStyle, ExpectedFontStyle);

					} catch (AssertionError e) {
						fontstyle = false;
					}
					if (fontstyle) {
						testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
						testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
						testCase.log(Status.PASS, "Font style is as expected");
					} else {
						testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
						testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
						testCase.log(Status.FAIL, "Font style is not as expected");
					}
				}
	}
	
//	@Test(priority = 3)
	public void SbuUIUpdateButton() throws InterruptedException {
		PageFactory.initElements(driver, Ebup);
		
		Thread.sleep(5000);
//		EditSbuFunPage.Master.click();
//		Thread.sleep(1000);
////		EditSbuFunPage.Plant.click();
////		Thread.sleep(1000);
//		EditSbuFunPage.SBU.click();
//		Thread.sleep(3000);
//		EditSbuUIPage.UpdateIconButton.click();
//		Thread.sleep(2000);

		// VISIBLITY

		try {

			boolean ActualElement = EditSbuUIPage.UpdateButton.isDisplayed();
			boolean ExpectedElement = true;

			boolean visibility = true;
			testCase = extent.createTest("ELEMENT-VISIBILITY");
			try {
				Assert.assertEquals(ActualElement, ExpectedElement);

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

		} catch (Exception e) {

			System.out.println("ELEMET-VISIBLIY-IS-NOT-AVAILABLE");

		}

		// ENABILITY

		try {
			boolean ActualElementEnable = EditSbuUIPage.UpdateButton.isEnabled();
			boolean ExpectedElementEnable = false;

			boolean enablity = true;
			testCase = extent.createTest("BUTTON-ENABLE");
			try {
				Assert.assertEquals(ActualElementEnable, ExpectedElementEnable);

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
		} catch (Exception e) {

			System.out.println("ELEMET-ENABLE-FAILED");

		}

		Thread.sleep(2000);

		// SIZE

		try {

			String ActualFontSize = EditSbuUIPage.UpdateButton.getCssValue("font-size");
			System.out.println("Font Size: " + ActualFontSize);
			String ExpectedFontSize = "14px";

			boolean Fontsize = true;
			testCase = extent.createTest("FONT-SIZE");
			try {
				Assert.assertEquals(ActualFontSize, ExpectedFontSize);

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

		// POSITION

		try {
			Point ActualLocation = EditSbuUIPage.UpdateButton.getLocation();

			int actual_x = ActualLocation.getX();
			int actual_y = ActualLocation.getY();

			System.out.println("X axis: " + actual_x);
			System.out.println("Y axis: " + actual_y);

			Point ExpectedLocation = new Point(892, 288);

			boolean Position = true;
			testCase = extent.createTest("BUTTON-POSITION");
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
		} catch (Exception e) {

			System.out.println("ELEMET-VISIBLIY-IS-NOT-AVAILABLE");

		}

		Thread.sleep(2000);

		// SPELLING

		try {

			String text = EditSbuUIPage.UpdateButton.getText();

			String text1 = "Update";
			boolean txt1 = true;
			testCase = extent.createTest("SPELLING");

			try {
				Assert.assertEquals(text, text1);
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
			String ActualBorderColour = EditSbuUIPage.UpdateButton.getCssValue("border-color");
			String ExpectedBorderColour = "rgb(255, 255, 255)";
			testCase = extent.createTest("BORDER-COLOUR");
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
			String elementOpacity = EditSbuUIPage.UpdateButton.getCssValue("opacity");
			double ActualOpacity = Double.parseDouble(elementOpacity);
			double ExpectedOpacity = 1.0;
			testCase = extent.createTest("OPACITY");
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
			String ActualBorderRadius = EditSbuUIPage.UpdateButton.getCssValue("border-Radius");
			String ExpectedBorderRadius = "2px";
			testCase = extent.createTest("BORDER-RADIUS");
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
			String Actualpadding = EditSbuUIPage.UpdateButton.getCssValue("padding");
			String Expectedpadding = "4px 15px";
			testCase = extent.createTest("PADDING");
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
			String ActualBgColor = EditSbuUIPage.UpdateButton.getCssValue("background-color");
			String hex1 = Color.fromString(ActualBgColor).asHex();
			String ExpectedBgColor = "#001328";

			boolean elementbgcolor = true;
			testCase = extent.createTest("BACKGROUND-COLOR");
			try {
				Assert.assertEquals(hex1, ExpectedBgColor);
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
			String actualCursorPoint = EditSbuUIPage.UpdateButton.getCssValue("cursor");
			String expectedCursorPoint = "not-allowed";

			boolean elementCursor = true;
			testCase = extent.createTest("CURSOR-POINTER");
			try {
				Assert.assertEquals(actualCursorPoint, expectedCursorPoint);
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
			String Actualfontcolor = EditSbuUIPage.UpdateButton.getCssValue("color");
			System.out.println("Font Size: " + Actualfontcolor);
			testCase = extent.createTest("FONT-COLOUR");
			String Expectedfontcolor = "rgba(255, 255, 255, 1)";
			boolean fontcolor = true;
			try {
				Assert.assertEquals(Actualfontcolor, Expectedfontcolor);
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
			String actualFontType = EditSbuUIPage.UpdateButton.getCssValue("font-family");
			// String hex = Color.fromString(actualbackgroundcolor).asHex();
			System.out.println("actual box shadow:" + actualFontType);
			String expectedFontType = "Roboto, sans-serif";

			boolean boxshadow1 = true;
			testCase = extent.createTest("FONT-type");
			try {
				Assert.assertEquals(actualFontType, expectedFontType);
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
			String actualFontSize = EditSbuUIPage.UpdateButton.getCssValue("font-size");
			// String hex = Color.fromString(actualbackgroundcolor).asHex();
			System.out.println("actual box shadow:" + actualFontSize);
			String expectedFontSize = "14px";

			boolean boxshadow1 = true;
			testCase = extent.createTest("FONT-SIZE");
			try {
				Assert.assertEquals(actualFontSize, expectedFontSize);
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
			String actualboxshadow = EditSbuUIPage.UpdateButton.getCssValue("box-shadow");
			// String hex = Color.fromString(actualbackgroundcolor).asHex();
			System.out.println("actual box shadow:" + actualboxshadow);
			String expectedboxshadow = "none";

			boolean boxshadow1 = true;
			testCase = extent.createTest("BOX-SHADOW");
			try {
				Assert.assertEquals(actualboxshadow, expectedboxshadow);
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
			String Actualfontweight = EditSbuUIPage.UpdateButton.getCssValue("font-weight");
			System.out.println("fontweight  :" + Actualfontweight);
			String Expectedfontweight = "400";

			boolean fontweight = true;
			testCase = extent.createTest("FONT-WEIGHT");
			try {
				Assert.assertEquals(Actualfontweight, Expectedfontweight);

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

		driver.navigate().refresh();
	}
	
}
