package com.invicta.qa.pages.sbu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSbuUIPage {
	@FindBy(id = "usernameOrEmail")
	public static WebElement Username;
	@FindBy(id = "password")
	public static WebElement Password;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
	public static WebElement LoginButton;
@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[2]/td[3]//a[1]")
public static WebElement EditBtn;
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

@FindBy(xpath = "//div[@class='sc-VigVT jzVhIp']/p")
public static WebElement EditSBUName;
@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div/div[1]/div/label")
public static WebElement SbuText;
@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div/div[2]/div/label")
public static WebElement DesText;

@FindBy(xpath = "//div[@class='ant-modal-footer']/div/button[2]")
public static WebElement UpdateButton;

@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[3]/span/a[1]/span")
public static WebElement UpdateIconButton;

}
