import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testCms {
    private WebDriver driver;

    private final String testUserLogin = "ceoofappleisqueer@gmail.com";
    private final String testUserPassword = "Qwertya4764108.";
    private final String draftFieldText = "Welcome to WAME.tools";

    @BeforeSuite
    public void driverStart() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void test_CmsNews() throws InterruptedException {
        String textForTittleDraftField =  "Черновик News";
        String textForTittleForNewsField = "Добро пожаловать в WAME!";
        String textForTittleForDescriptionField = "WAME - это мы, а довольные клиенты WAME - это вы";
        String textForSeoTitleField = "Hi, i am CEO of WAME.tools!";
        String textForSeoDescriptionField = "My name is John Doe! Nice to meet you and hope your experience with us is excellent!";
        By createdNews = By.xpath("//span[text() = 'chernovik-news']");

        Utils.loginProcess(testUserLogin, testUserPassword, driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.open();");

        String mainWindowHandle = driver.getWindowHandle();
        String newTabHandle = null;

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                newTabHandle = handle;
                driver.switchTo().window(newTabHandle);
                break;
            }
        }

        driver.get(cmsPage.cmsURL);

        Utils.wait10Exp(driver, cmsPage.loginField);

        WebElement loginField = driver.findElement(cmsPage.loginField);
        loginField.sendKeys(cmsPage.userName);

        WebElement passwordField = driver.findElement(cmsPage.passwordField);
        passwordField.sendKeys(cmsPage.password);

        WebElement enterCms = driver.findElement(cmsPage.submitButton);
        enterCms.click();

        Utils.wait10Exp(driver, cmsPage.contentPartOfSideBar);

        WebElement contentPartOfSideBar = driver.findElement(cmsPage.contentPartOfSideBar);
        contentPartOfSideBar.click();

        Utils.wait10Exp(driver, cmsPage.createElementClean);

        WebElement createElementClean = driver.findElement(cmsPage.createElementClean);
        createElementClean.click();

        Utils.wait10Exp(driver, cmsPage.statusOfNews);

        WebElement statusOfNews = driver.findElement(cmsPage.statusOfNews);
        statusOfNews.click();

        Utils.wait10Exp(driver, cmsPage.draftModeChooseInStatusOfNews);

        WebElement draftModeChooseInStatusOfNews = driver.findElement(cmsPage.draftModeChooseInStatusOfNews);
        draftModeChooseInStatusOfNews.click();

        WebElement tittleDraftField = driver.findElement(cmsPage.tittleDraftField);
        tittleDraftField.sendKeys(textForTittleDraftField);

        WebElement tittleForNewsField = driver.findElement(cmsPage.tittleForNewsField);
        tittleForNewsField.sendKeys(textForTittleForNewsField);


        WebElement descriptionField = driver.findElement(cmsPage.descriptionField);
        descriptionField.sendKeys(textForTittleForDescriptionField);


        WebElement seoTitleField = driver.findElement(cmsPage.seoTitleField);
        seoTitleField.sendKeys(textForSeoTitleField);


        WebElement seoDescriptionField = driver.findElement(cmsPage.seoDescriptionField);
        seoDescriptionField.sendKeys(textForSeoDescriptionField);


        WebElement saveButton = driver.findElement(cmsPage.saveTheNewsButton);
        saveButton.click();

        Utils.wait10Exp(driver, createdNews);

        WebElement chernovik = driver.findElement(createdNews);

        Assert.assertTrue(chernovik.isDisplayed() && chernovik.isEnabled());

        Thread.sleep(2000);

        Utils.deleteConcreteCmsNews(driver, textForTittleDraftField);

        Thread.sleep(1000);

        Assert.assertFalse(Utils.isElementPresent(driver, createdNews));


    }

    @AfterSuite
    public void exit() throws InterruptedException {
        driver.close();
        driver.quit();
    }
}
