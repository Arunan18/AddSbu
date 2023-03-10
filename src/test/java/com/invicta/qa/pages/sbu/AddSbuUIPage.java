package com.invicta.qa.pages.sbu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSbuUIPage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")
	public static WebElement SBUbutton;
	
	@FindBy(xpath = "//div[@class='sc-VigVT jzVhIp']/p")
	public static WebElement AddSBUtext;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div/label")
	public static WebElement SBUText;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div/label")
	public static WebElement DescriptionText;
	
	@FindBy(xpath = "//*[@id=\"sub_business_unit\"]")
	public static WebElement SBUtextbox;
	
	@FindBy(xpath = "//*[@id=\"description\"]")
	public static WebElement Descriptiontextbox;
	
	@FindBy (xpath = "/html/body/div[3]/div/div[2]/div")
	public static WebElement modal;
	
	@FindBy (xpath = "//*[@id=\"rcDialogTitle0\"]/div/p")
	public static WebElement modalheader;
	
	@FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]")
	public static WebElement modalcontent;
	
	@FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[1]")
	public static WebElement modalclose;
	@FindBy (id="plant_address")
	public static WebElement PlanAddress;
	
	
	@FindBy(xpath = "//*[@id=\"sub_business_unit\"]")
	public static WebElement SBUtext;
	
	@FindBy(xpath = "//*[@id=\"description\"]")
	public static WebElement SBUdestext;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")
	public static WebElement SBUsavebutton;
	
	@FindBy(xpath = "//*[@id=\"rcDialogTitle0\"]/div/span")
	public static WebElement SBUclose;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]/span")
	public static WebElement SBUsavefont;
	
	@FindBy(xpath = "//*[@id=\"sub_business_unit\"]")
	public static WebElement SBUplaceholder;
	
	@FindBy(xpath = "//*[@id=\"description\"]")
	public static WebElement Desplaceholder;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]")
	public static WebElement sbumodal;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")
	public static WebElement AddSBU;
	
//	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")
//	public static WebElement AddSbuBtn;
//	
//	@FindBy(xpath = "//div[@class='sc-VigVT jzVhIp']/p")
//	public static WebElement AddSbuModal;
//	
//	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div/label")
//	public static WebElement AddSBUName;
//	
//	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div/label")
//	public static WebElement SBUText;
//	
//	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div/label")
//	public static WebElement DesText;
//	
//	@FindBy(xpath = "//*[@id=\"sub_business_unit\"]")
//	public static WebElement SBUTextBox;
//	
//	@FindBy(xpath = "//*[@id=\"description\"]")
//	public static WebElement DesTextBox;
//	
//	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div/label")
//	public static WebElement SBUSaveBtn;
}

