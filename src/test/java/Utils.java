import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Utils {
    public static void dragAndDropFile(WebDriver driver, WebElement target, String filePath) {
    Actions actions = new Actions(driver);
    WebElement input = target.findElement(By.tagName("input"));
    actions.moveToElement(target)
            .clickAndHold()
            .moveToElement(input)
            .release()
            .build()
            .perform();

    input.sendKeys(filePath);
    }

    public static void slowType(WebElement element, String text) throws InterruptedException {
        for (char ch : text.toCharArray()) {
            element.sendKeys(String.valueOf(ch));
            Thread.sleep(200);
        }
    }

    public static void deleteShop(String userName, String password, String shopName, WebDriver driver) throws InterruptedException {

        Utils.loginProcess(userName, password, driver);

        Utils.wait5Exp(driver, sideMenu.shopsSection);

        WebElement enterShopSection = driver.findElement(sideMenu.shopsSection);
        enterShopSection.click();

        Utils.wait5Exp(driver, By.xpath("//td[contains(div[@class='image_block']/p, '" + shopName + "')]/following-sibling::td//button"));

        WebElement deleteConcreteShop = driver.findElement(By.xpath("//td[contains(div[@class='image_block']/p, '" + shopName + "')]/following-sibling::td//button"));
        deleteConcreteShop.click();

        Utils.wait5Exp(driver, By.xpath("//div[@class ='input_frame']/input"));

        WebElement confirmDeletingShopField = driver.findElement(By.xpath("//div[@class ='input_frame']/input"));
        confirmDeletingShopField.sendKeys(shopName);

        Utils.wait5Exp(driver, By.xpath("//div[@class='modal_buttons_wrapper']/button[text() = 'Да']"));

        WebElement confirmDeletingShopButtonYes = driver.findElement(By.xpath("//div[@class='modal_buttons_wrapper']/button[text() = 'Да']"));
        confirmDeletingShopButtonYes.click();

        Utils.wait5();

        Assert.assertTrue(driver.findElement(shopsPage.addShopClear).isDisplayed());
    }

    public static void loginProcess(String username, String password, WebDriver driver) throws InterruptedException {
        driver.get(loginPage.LOGIN_PAGE_URL);

        Utils.wait10Exp(driver, loginPage.LOGIN_EMAIL_FIELD);

        WebElement emailFieldWame = driver.findElement(loginPage.LOGIN_EMAIL_FIELD);

        WebElement passwordFieldWame = driver.findElement(loginPage.LOGIN_PASSWORD_FIELD);

        WebElement submitWame = driver.findElement(loginPage.LOGIN_SUBMIT_BUTTON);

        emailFieldWame.click();
        emailFieldWame.sendKeys(username);
        passwordFieldWame.sendKeys(password);
        submitWame.click();

        Utils.wait5Exp(driver, mainPage.closeProfileContainer);

        try {
            WebElement closeContainer = driver.findElement(mainPage.closeProfileContainer);
            closeContainer.click();

        } catch (NoSuchElementException ignored) {
        }
    }

    public static void exitFromProfileWame(WebDriver driver) throws InterruptedException {

        WebElement enterProfile = driver.findElement(sideMenu.profileSection);
        enterProfile.click();

        Utils.wait5Exp(driver, profilePage.exitProfileButton);

        WebElement initiatingExit = driver.findElement(profilePage.exitProfileButton);
        initiatingExit.click();

        Utils.wait3();

        Assert.assertEquals(driver.getCurrentUrl(), loginPage.LOGIN_PAGE_URL);
    }

    public static void intoLoginFrame(WebDriver driver){
        driver.switchTo().defaultContent();
        WebElement iframeElement = driver.findElement(loginPage.ENTER_IFRAME_LOGIN);
        driver.switchTo().frame(iframeElement);
    }

    public static void deleteConcreteCmsNews(WebDriver driver, String tittleOfNews) throws InterruptedException {
        WebElement selectTheCell = driver.findElement(By.xpath("//tbody//span[text()='" + tittleOfNews + "']/../../../td[@class='select cell']/button"));
        selectTheCell.click();

        Utils.wait5Exp(driver, cmsPage.deleteButton);

        WebElement delete = driver.findElement(cmsPage.deleteButton);
        delete.click();

        Utils.wait5Exp(driver, cmsPage.confirmDelete);

        WebElement confirm = driver.findElement(cmsPage.confirmDelete);
        confirm.click();

        Utils.wait3();
    }

    public static boolean isElementPresent(WebDriver driver, By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public static void wait10Exp(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException ignored) {}
    }

    public static void wait5Exp(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException ignored) {}
    }

    public static void wait5() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void wait3() throws InterruptedException {
        Thread.sleep(3000);
    }

}





