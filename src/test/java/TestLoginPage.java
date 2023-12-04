import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLoginPage {

    private WebDriver driver;

    @BeforeTest
    public void driverStart() {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void test_LoginPositive() throws InterruptedException {
        Utils.loginProcess("wabodef488@tutoreve.com", "Qwertya4764108.", driver);

        Assert.assertEquals(mainPage.mainPageURL, driver.getCurrentUrl());
        Assert.assertTrue(driver.findElement(mainPage.newsColumn).isDisplayed());

        Utils.exitFromProfileWame(driver);

    }

    @Test(priority = 2)
    public void test_LoginNegative() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(loginPage.LOGIN_PAGE_URL);

        String user = "sudix@yandex.ru";
        String invalidUser = "sudivx@yandex.ru";
        String invalidPassword = "Qwerty1346.";

        WebElement emailField = driver.findElement(loginPage.LOGIN_EMAIL_FIELD);
        WebElement passwordField = driver.findElement(loginPage.LOGIN_PASSWORD_FIELD);
        WebElement loginSubmit = driver.findElement(loginPage.LOGIN_SUBMIT_BUTTON);

        emailField.sendKeys(invalidUser);

        Assert.assertFalse(driver.findElement(loginPage.LOGIN_SUBMIT_BUTTON).isEnabled());

        passwordField.sendKeys(invalidPassword);

        loginSubmit.click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.notificationWrongEmail)).isDisplayed());

        emailField.clear();
        emailField.sendKeys(user);
        passwordField.sendKeys(invalidPassword);

        Assert.assertTrue(driver.findElement(loginPage.LOGIN_SUBMIT_BUTTON).isEnabled());

        driver.findElement(loginPage.LOGIN_SUBMIT_BUTTON).click();
        Thread.sleep(2000);

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.notificationWrongEmail)).isDisplayed());

    }

    @Test(priority = 3)
    public void test_RegistrationAlreadyRegistered() throws InterruptedException {
        String user = "sudix@yandex.ru";
        String password = "123456Aa.";

        driver.get(loginPage.LOGIN_PAGE_URL);

        Utils.wait10Exp(driver, loginPage.REGISTRATION_COMPANY_BUTTON);

        WebElement enterRegistration = driver.findElement(loginPage.REGISTRATION_COMPANY_BUTTON);
        enterRegistration.click();

        Utils.wait5();

        WebElement emailField = driver.findElement(loginPage.REGISTRATION_LOGIN_FIELD);
        WebElement passwordField = driver.findElement(loginPage.REGISTRATION_PASSWORD_FIELD);

        emailField.sendKeys(user);

        passwordField.sendKeys(password);

        Utils.wait5();

        driver.findElement(loginPage.REGISTRATION_BUTTON).click();

        Utils.wait10Exp(driver, loginPage.notificationNegativeAlreadyRegistered);

        Assert.assertTrue(driver.findElement(loginPage.notificationNegativeAlreadyRegistered).isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(), loginPage.REGISTRATION_PAGE);
    }


    @Test(priority = 4)
    public void test_Recovery() throws InterruptedException {
        driver.get(loginPage.LOGIN_PAGE_URL);

        Utils.wait3();

        driver.findElement(loginPage.FORGOT_LINK).click();

        Utils.wait3();

        Assert.assertEquals(driver.getCurrentUrl(), loginPage.RECOVERY_PAGE_URL);

        driver.findElement(loginPage.AUTORIZATION_LINK).click();

        Assert.assertEquals(driver.getCurrentUrl(), loginPage.LOGIN_PAGE_URL);

        driver.navigate().back();

        Utils.wait10Exp(driver, loginPage.REGISTRATION_LINK);

        driver.findElement(loginPage.REGISTRATION_LINK).click();

        Utils.wait10Exp(driver, loginPage.REGISTRATION_TITTLE);

        Assert.assertEquals(driver.getCurrentUrl(), loginPage.REGISTRATION_PAGE);
    }
    @AfterTest
    public void exit() {
        driver.close();
        driver.quit();
    }
}

