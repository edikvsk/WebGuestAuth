package org.webguest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthForm {

    public WebDriver driver;

    //добавляю конструктор класса для инициализации полей класса
    public AuthForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //определяю локаторы
    @FindBy(xpath = "//span[.='Connect']")
    private WebElement btnConnect;

    //методы
    public void clickConnectBtn() {
        btnConnect.click();
    }
}
