package com.invicta.qa.testcases.sbu;

import java.io.IOException;

import org.testng.annotations.Test;

import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.testcases.login.LoginTest;

public class AddSbuTestScript extends DriverIntialization{

	@Test(priority = 0)
	public static void AddSbuFunction() throws InterruptedException, IOException {

//		Login Function
		LoginTest.Login();

//		Click Master
		AddSbuFunTest.ClickMaster();

//		Click Plant
		AddSbuFunTest.ClickPlant();

//		Click SBU
		AddSbuFunTest.ClickSbu();

		/*
		 * STEP 1 : Check Add SBU Button UI Properties (1.Visibility, 2.Enablity,
		 * 3.Size, 4.Postion, 5.Background-color ,6.Font-color ,7.Border-color,
		 * 8.Font-type, 9.Font-size, 10.Text , 11.Box-shadow, 12.Padding, 13.Cursor,
		 * 14.Border-radius, 15.Opacity, 16.Font-weight)
		 */
		AddSbuUITest.AddSbuButton();

//		STEP 2 : Check Add SBU Button Click
		AddSbuFunTest.ClickAddSBU();

//		STEP 3 : Check SBU Add Form UI Properties 
		AddSbuUITest.addsbuModal();

		/*
		 * STEP 4 : Check SBU Add Form Heading UI Properties (1.visibility,
		 * 2.Font-color, 3.Font-size, 4.Font-style , 5.Text-spelling,6. position,
		 * 7.padding, 8. margin, 9.shadow,10.Enablity, 11. Word Spacing, 12.Letter
		 * Spacing, 13.Text Align, 14. Text- Transformation, 15.Text-Line-Height, 16.
		 * Text-Vertical -Alignment, 17. Text - Indent, 18. Text -Decoration, 19. Text -
		 * Orientation, 20.Font-Family)
		 */
		AddSbuUITest.addsbutext();

		/*
		 * STEP 5 : Check SBU Text UI Properties (1.visibility, 2.Font-color,
		 * 3.Font-size, 4.Font-style , 5.Text-spelling,6. position, 7.padding, 8.
		 * margin, 9.shadow,10.Enablity, 11. Word Spacing, 12.Letter Spacing, 13.Text
		 * Align, 14. Text- Transformation, 15.Text-Line-Height, 16. Text-Vertical
		 * -Alignment, 17. Text - Indent, 18. Text -Decoration, 19. Text - Orientation,
		 * 20.Font-Family)
		 */
		AddSbuUITest.sbutext();

		/*
		 * STEP 6 : Check SBU Description UI Properties (1.visibility, 2.Font-color,
		 * 3.Font-size, 4.Font-style , 5.Text-spelling,6. position, 7.padding, 8.
		 * margin, 9.shadow,10.Enablity, 11. Word Spacing, 12.Letter Spacing, 13.Text
		 * Align, 14. Text- Transformation, 15.Text-Line-Height, 16. Text-Vertical
		 * -Alignment, 17. Text - Indent, 18. Text -Decoration, 19. Text - Orientation,
		 * 20.Font-Family)
		 */
		AddSbuUITest.description();

		/*
		 * STEP 7 : Check SBU TextBox UI Properties (1.PlaceHolder
		 * ,2.Visibility,3.Enablity, 4.Postion, 5.Background-color, 6.Border-color,
		 * 7.Length, 8.Width, 9.Border Color, 10.Font style, 11.Font Size,
		 * 12.Font-color)
		 */
		AddSbuUITest.SbuTextBox();

		/*
		 * STEP 8 : Check SBU Description TextBox UI Properties (1.PlaceHolder
		 * ,2.Visibility,3.Enablity, 4.Postion, 5.Background-color, 6.Border-color,
		 * 7.Length, 8.Width, 9.Border Color, 10.Font style, 11.Font Size,
		 * 12.Font-color)
		 */
		AddSbuUITest.DesTextBox();

//		STEP 9 : INPUT SBU and Descreption Data 
		AddSbuFunTest.InputSbuData();

		/*
		 * STEP 10 : Check SBU Save Button UI Properties (1.Visibility, 2.Enablity,
		 * 3.Size, 4.Postion, 5.Background-color ,6.Font-color ,7.Border-color,
		 * 8.Font-type, 9.Font-size, 10.Text , 11.Box-shadow, 12.Padding, 13.Cursor,
		 * 14.Border-radius, 15.Opacity, 16.Font-weight)
		 */
		AddSbuUITest.SbuSaveBtn();

		// STEP 11 : Check SBU Save Button Click
		AddSbuFunTest.ClickSaveSbu();

		if(AddSbuFunTest.validation==false) {
		AddSbuFunTest.CancelButton();
		}
		
		if(AddSbuFunTest.validation) {	
//		Check Page count
		AddSbuFunTest.PageCount();

//		STEP 11 :Check added data had or not in SBU Table
		AddSbuFunTest.CheckDataTable(AddSbuFunTest.sbu);
		}
	}
	
	@Test(priority = 1)
	public static void CheckValidation() throws InterruptedException, IOException {
		
//		STEP 1 : Click Add SBU Button
		AddSbuFunTest.ClickAddSBU();
		
//		STEP 2 : Input Test Data and Check Validation
		AddSbuFunTest.Validation();
		
//		STEP 3 : Check Cancel Button Properties
		AddSbuUITest.SbuCancelBtn();
		
//		STEP 4 : Click Cancel Button
		AddSbuFunTest.CancelButton();
		
		
	}
	
}
