package org.webguest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AuthFormTest {
    public static AuthForm authForm;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        //путь к драйверу
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //добавляю вейт
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //беру ссылку на страницу webguest из conf.properties
        driver.get(ConfProperties.getProperty("web-guest-page"));
        authForm = new AuthForm(driver);
    }

    @Test
    public void loginTest() {
        authForm.clickConnectBtn();
    }

    @AfterClass
    public static void tearDown() {
    driver.quit();
    }
}
