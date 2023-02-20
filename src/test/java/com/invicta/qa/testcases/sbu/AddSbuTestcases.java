//***********************************************************************************
//* Description
//*------------
//* Add Sbu functionaltiy
//***********************************************************************************
//*
//* Author           : Priyanka Sundaramoorthy
//* Date Written     : 17/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        20/02/2023   Arunan     Orginal Version
//*
//************************************************************************************


package com.invicta.qa.testcases.sbu;

import java.io.IOException;
import org.testng.annotations.Test;
import com.invicta.qa.testcases.login.LoginTest;

public class AddSbuTestcases {
	 static LoginTest lt = new LoginTest();
	 AddSbuFunTest FT = new AddSbuFunTest();
	 AddSbuUITest UI= new AddSbuUITest();
	
	
	
	@Test
	public static void AddSbuFunction() throws InterruptedException, IOException {

		lt.Login();
		AddSbuFunTest.ClickMaster();
		AddSbuFunTest.ClickPlant();
		AddSbuFunTest.ClickSbu();
		
//		STEP 1 : Check Add SBU Button UI Testcases
		UI.addsbubutton();
		 
//		STEP 2 : Check Add SBU Button Click
		AddSbuFunTest.ClickAddSBU();
		
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
		AddSbuFunTest.InputSbuData();


	}
}

