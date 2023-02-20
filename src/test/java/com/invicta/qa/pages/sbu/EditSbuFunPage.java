package com.invicta.qa.pages.sbu;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSbuFunPage {

	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")
	public static WebElement Master;
	@FindBy(xpath = "//*[@href='#/master/plantlevel']")
	public static WebElement Plant;
	@FindBy(xpath = "//div[@class='sc-dnqmqq bxMwVY']")
	public static WebElement SBU;
	@FindBy(id = "sub_business_unit")
	public static WebElement SBUName;
	@FindBy(id = "description")
	public static WebElement Des;
	@FindBy(xpath = "//div[@class='ant-modal-footer']/div/button[2]")
	public static WebElement UpdateBtn;
	@FindBy(xpath = "//div[@class='ant-modal-footer']/div/button[1]")
	public static WebElement CancelBtn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> SbuNameColumn;
	@FindBy(xpath = "//li[@title='Next Page']/button")
	public static WebElement NextPageBtn;
	@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div/div[1]/div[1]/div[1]")
	public static WebElement Validation;
	@FindBy(xpath = "//div[@class='ant-notification-notice-content']/div/div[1]")
	public static WebElement SucessMessage;
	 
	public static String SbuNameBefore="//tbody[@class='ant-table-tbody']/tr[";
	public static String SbuNameAfter ="]/td[1]";

	public static String EditBtnBefore = "//tbody[@class='ant-table-tbody']/tr[";
	public static String EditBtnAfter = "]/td[3]/span/a[1]";
}
