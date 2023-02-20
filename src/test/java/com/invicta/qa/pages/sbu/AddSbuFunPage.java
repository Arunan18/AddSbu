package com.invicta.qa.pages.sbu;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSbuFunPage {
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")
	public static WebElement Master;
	@FindBy(xpath = "//*[@href='#/master/plantlevel']")
	public static WebElement Plant;
	@FindBy(xpath = "//div[@class='sc-dnqmqq bxMwVY']")
	public static WebElement SBU;
	@FindBy(xpath = "//button[@type='button'][@class='ant-btn sc-gZMcBi dMdnOw']")
	public static WebElement AddSbuButton;
	@FindBy(id = "sub_business_unit")
	public static WebElement SBUName;
	@FindBy(id = "description")
	public static WebElement Des;
	@FindBy(xpath = "//div[@class='ant-modal-footer']/div/button[2]")
	public static WebElement SaveBtn;
	@FindBy(xpath = "//div[@class='ant-modal-footer']/div/button[1]")
	public static WebElement CancelBtn;
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> SbuNameColumn;
	@FindBy(xpath = "//li[@title='Next Page']/button")
	public static WebElement NextPageBtn;
}
