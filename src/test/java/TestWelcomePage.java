import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestWelcomePage {



    private WebDriver driver;

    @BeforeTest
    public void driverStart() {
        System.setProperty("chromedriver", "/usr/local/Caskroom/chromedriver/118.0.5993.70/chromedriver-mac-x64");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    public void test_WelcomePage() throws InterruptedException{

        driver.get(welcomePage.WELCOME_PAGE);
        Utils.wait3();

        if(driver.findElement(welcomePage.mainTextHeader).getText().equals(welcomePage.mainTextHeaderEng)) {
            WebElement switchLanguage = driver.findElement(mainPage.languageSwitcher);
            switchLanguage.click();

            Utils.wait3();

            WebElement russianLanguage = driver.findElement(mainPage.languageSwitchRu);
            russianLanguage.click();
        }

        Utils.wait3();

        Assert.assertTrue(driver.findElement(welcomePage.TRY_BUTTON_LARGE).isDisplayed());
        Assert.assertTrue(driver.findElement(welcomePage.TRY_BUTTON_SMALL).isDisplayed());
        Assert.assertTrue(driver.findElement(welcomePage.TRY_BUTTON_LAST).isDisplayed());
        Assert.assertTrue(driver.findElement(welcomePage.CONFIDENTIAL_LINK).isDisplayed());
        Assert.assertFalse(driver.findElement(welcomePage.REQUEST_BUTTON_APPLICATION).isEnabled());

        driver.findElement(welcomePage.TRY_BUTTON_LARGE).click();

        Utils.wait3();

        Assert.assertEquals(driver.getCurrentUrl(), welcomePage.LOGIN_PAGE);

        driver.navigate().back();

        Utils.wait3();

        Assert.assertEquals(driver.getCurrentUrl(), welcomePage.WELCOME_PAGE);

        driver.findElement(welcomePage.TRY_BUTTON_SMALL).click();

        Utils.wait3();

        Assert.assertEquals(driver.getCurrentUrl(), welcomePage.LOGIN_PAGE);

        driver.navigate().back();

        Utils.wait3();

        WebElement lastButtonTry = driver.findElement(welcomePage.TRY_BUTTON_LAST);

        Utils.wait3();

        lastButtonTry.click();

        Utils.wait3();

        Assert.assertEquals(driver.getCurrentUrl(), loginPage.REGISTRATION_PAGE);
    }


    @Ignore
    @Test(priority = 2)
    public void test_ApplicationForm() throws InterruptedException {
        String name = "Ivan Ivanich Ivanov (test)";
        String phone = "+1234567890";
        String instagram = "test.com";
        String message = "I want to create my own shop for business";

        driver.get(welcomePage.WELCOME_PAGE);

        Utils.wait3();

        if(driver.findElement(welcomePage.mainTextHeader).getText().equals(welcomePage.mainTextHeaderEng)) {
            WebElement switchLanguage = driver.findElement(mainPage.languageSwitcher);
            switchLanguage.click();

            Thread.sleep(1000);

            WebElement russianLanguage = driver.findElement(mainPage.languageSwitchRu);
            russianLanguage.click();
        }

        WebElement nameField = driver.findElement(welcomePage.NAME_APPLICATION_FIELD);
        WebElement phoneField = driver.findElement(welcomePage.PHONE_APPLICATION_FIELD);
        WebElement instagramField = driver.findElement(welcomePage.INSTAGRAM_APPLICATION_FIELD);
        WebElement textField = driver.findElement(welcomePage.MESSAGE_APPLICATION_FIELD);
        WebElement sendRequest = driver.findElement(welcomePage.REQUEST_BUTTON_APPLICATION);

        nameField.sendKeys(name);
        phoneField.sendKeys(phone);
        instagramField.sendKeys(instagram);
        textField.sendKeys(message);

        Utils.wait3();

        Assert.assertTrue(sendRequest.isEnabled());

        sendRequest.click();

        Utils.wait3();

        Assert.assertTrue(driver.findElement(welcomePage.REQUEST_MESSAGE_SUCCESS).isDisplayed());
    }


    @AfterTest
    public void exit() {
        driver.close();
        driver.quit();
    }
}
