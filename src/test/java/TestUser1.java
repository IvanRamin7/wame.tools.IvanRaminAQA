import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class TestUser1 {
    private final String testUser1Login = "cotan84051@hupoi.com";
    private final String testUser1Password = "Qwertya4764108.";
    private final String testUser1shopName = "Honey Moon Shop Test";
    private final String testUser1shopDescription = "MY HONEY SHOP IS THE BEST IN THE WORLD!";
    private final String testUser1shopTelegram = "i_am_honey_maker";
    private final String testUser1shopPhone = "+79165241287";
    private final String testUser1shopTextAfterOrder = "Thank you! The manager is gonna call you soon! And we'll bring you the honey!";
    private final String testUser1shopTittlePhotoPath = "/Users/ivan/Desktop/WAME Test Data/Honey Shop/Honey Pics/TovarTittle.jpg";
    private final String testUser1shopDeliveryPayment = "299";
    private final String testUser1shopDeliveryFreeFrom = "7999";
    private final String testUser1shopSelfPickingAddress = "Washington DC, Roosevelt St 73954";
    private final String testUser1shopCategoryName = "This is my Honey category";
    private final String testUser1shopCategoryPhotoPath = "/Users/ivan/Desktop/WAME Test Data/Honey Shop/Honey Pics/TovarTittle.jpg";

    private final String testUser1goodName = "Honey Special";
    private final String testUser1goodDescription = "Indulge in the natural goodness of our pure honey, straight from the heart of the honeycomb. "
            + "Our honey is a sweet delight, carefully harvested from the finest wildflowers, giving it a unique and rich flavor profile.";
    private final String testUser1goodComposition = "100% Natural: Our honey is free from additives, preservatives, and artificial sweeteners. It's pure, unadulterated nature's sweetness.\n" +
            "Unfiltered and Raw: We believe in preserving the integrity of honey. Our unfiltered and raw honey retains all the natural enzymes and antioxidants for maximum health benefits.\n" +
            "Locally Sourced: Sustainably harvested from local beekeepers who prioritize the well-being of their bees and the environment.\n" +
            "Versatile Delicacy: Perfect as a natural sweetener for your tea, drizzled over yogurt, or as a wholesome ingredient in your favorite recipes.\n" +
            "Health Benefits: Packed with vitamins, minerals, and antibacterial properties, our honey is not only delicious but also a nutritional powerhouse.";
    private final String testUser1goodPrice = "400";
    private final String testUser1goodTittlePhotoPath = "/Users/ivan/Desktop/WAME Test Data/Honey Shop/Honey Pics/TovarTittle.jpg";
    private final String testUser1goodGalleryPhotoPath = "/Users/ivan/Desktop/WAME Test Data/Honey Shop/Honey Pics/TovarTittle.jpg";
    private final String[] testUser1goodGalleryPhotoPaths = {"/Users/ivan/Desktop/WAME Test Data/Honey Shop/Honey Pics/TovarTittle.jpg", "/Users/ivan/Desktop/WAME Test Data/Honey Shop/Honey Pics/TovarTittle.jpg", "/Users/ivan/Desktop/WAME Test Data/Honey Shop/Honey Pics/TovarTittle.jpg"};

    private final String testUser1shopName2 = "Shop number 2";
    private final String testUser1shopDescription2 = "BUY MY GOODS NOW!!!";
    private final String testUser1shopSelfPickingAddress2 = "Moscow, Red Square, 1";
    private final String testUser1shopDeliveryPayment2 = "999";

    private final String testUser1Question1 = "Can i have a Honey?";
    private final String testUser1Answer1 = "Sure, you can!";
    private final String testUser1Question2 = "How can I pay for my purchase?";
    private final String testUser1Answer2 = "We accept VISA, MasterCard and end-to-end transactions.";
    private final String testUser1Question3 = "My name is Natasha?";
    private final String testUser1Answer3 = "Yes, probably";

    private final String testUser1paymentAmount = "15000";
    private final String testUser1cardNumber = "4111 1111 1111 1111";
    private final String testUser1cardExpireDate = "0126";
    private final String testUser1cardCcv = "777";

    private final String userName = "John Doe";
    private final String userPhone = "+1 234567890987654321";
    private final String userTelegram = "this_is_my_tg";
    private final String userCompanyName = "HONEY INCORPORATED";
    private final String userCompanyDescription = "This is my company";

    private WebDriver driver;

    @BeforeSuite
    public void driverStart() {
        System.setProperty("chromedriver", "/usr/local/Caskroom/chromedriver/118.0.5993.70/chromedriver-mac-x64");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void test_IfNullShopButtonCreateShopExists() throws InterruptedException {
        Utils.loginProcess(testUser1Login, testUser1Password, driver);

        WebElement shops = driver.findElement(sideMenu.shopsSection);
        shops.click();

        Utils.wait10Exp(driver, shopsPage.addShopClear);

        WebElement addShopButtonClear = driver.findElement(shopsPage.addShopClear);

        Assert.assertTrue(addShopButtonClear.isDisplayed());

        WebElement categories = driver.findElement(sideMenu.categoriesSection);
        categories.click();

        Assert.assertTrue(addShopButtonClear.isDisplayed());

        WebElement goods = driver.findElement(sideMenu.goodsSection);
        goods.click();

        Assert.assertTrue(addShopButtonClear.isDisplayed());

        Utils.exitFromProfileWame(driver);
    }

    @Test(priority = 2)
    public void test_user1CreateStandartShop() throws InterruptedException {
        Utils.loginProcess(testUser1Login, testUser1Password, driver);

        Utils.wait10Exp(driver, sideMenu.shopsSection);

        WebElement shops = driver.findElement(sideMenu.shopsSection);

        shops.click();

        Utils.wait10Exp(driver, shopsPage.addShopClear);

        WebElement addShopButtonClear = driver.findElement(shopsPage.addShopClear);
        addShopButtonClear.click();

        Utils.wait10Exp(driver, shopsPage.nameNewShopField);

        WebElement nameField = driver.findElement(shopsPage.nameNewShopField);
        nameField.sendKeys(testUser1shopName);

        WebElement descriptionField = driver.findElement(shopsPage.descriptionNewShopField);
        descriptionField.sendKeys(testUser1shopDescription);

        WebElement addFinalShopButton = driver.findElement(shopsPage.addShopFinal);
        addFinalShopButton.click();

        WebElement errorNoShopPhoto = driver.findElement(shopsPage.notificationPhotoIsNotUploaded);

        Assert.assertTrue(errorNoShopPhoto.isDisplayed());

        WebElement photoField = driver.findElement(shopsPage.addPhotoNewShopField);
        photoField.sendKeys(testUser1shopTittlePhotoPath);

        Utils.wait5();

        WebElement phoneField = driver.findElement(shopsPage.phoneNewShopField);
        phoneField.sendKeys(testUser1shopPhone);

        WebElement telegramField = driver.findElement(shopsPage.telegramNewShopField);
        telegramField.sendKeys(testUser1shopTelegram);

        WebElement afterOrderField = driver.findElement(shopsPage.textAfterOrderNewShopField);
        afterOrderField.sendKeys(testUser1shopTextAfterOrder);

        Utils.wait5();

        addFinalShopButton.click();

        Utils.wait10Exp(driver, shopsPage.notificationAddressIsNotPresented);

        WebElement errorNoAddress = driver.findElement(shopsPage.notificationAddressIsNotPresented);

        Assert.assertTrue(errorNoAddress.isDisplayed());

        WebElement selfPickingButton = driver.findElement(shopsPage.addAddressSelfPickingButton);
        selfPickingButton.click();

        WebElement selfPickingField = driver.findElement(shopsPage.addAddressSelfPickingField);

        selfPickingField.sendKeys(testUser1shopSelfPickingAddress);

        addFinalShopButton.click();

        Utils.wait10Exp(driver, shopsPage.notificationDeliveryPriceNotExist);

        WebElement errorNoDelieveryCost = driver.findElement(shopsPage.notificationDeliveryPriceNotExist);

        Assert.assertTrue(errorNoDelieveryCost.isDisplayed());

        WebElement goToDeliveryTab = driver.findElement(shopsPage.deliveryAndPaymentTab);

        Assert.assertTrue(goToDeliveryTab.isDisplayed());

        WebElement goToShopTab = driver.findElement(shopsPage.shopTab);
        goToShopTab.click();

        goToDeliveryTab.click();

        WebElement devCost = driver.findElement(shopsPage.deliveryCostField);
        devCost.sendKeys(testUser1shopDeliveryPayment);

        WebElement devFree = devCost.findElement(shopsPage.deliveryFreeFromField);
        devFree.sendKeys(testUser1shopDeliveryFreeFrom);

        addFinalShopButton.click();

        Utils.wait10Exp(driver, sideMenu.categoriesSection);

        driver.get(categoryPage.categoriesURL);

        Utils.wait10Exp(driver, categoryPage.textIfShopHasNoCategories);

        WebElement addCategoryClearButton = driver.findElement(categoryPage.addCategoryClear);
        addCategoryClearButton.click();

        Utils.wait10Exp(driver, categoryPage.addCategoryFinal);

        WebElement acceptCategory = driver.findElement(categoryPage.addCategoryFinal);

        Assert.assertFalse(acceptCategory.isEnabled());

        WebElement addCategoryName = driver.findElement(categoryPage.addCategoryNameField);
        addCategoryName.sendKeys(testUser1shopCategoryName);

        Assert.assertTrue(acceptCategory.isEnabled());

        acceptCategory.click();

        WebElement errorPhoto = driver.findElement(categoryPage.notificationUploadPhoto);
        Assert.assertTrue(errorPhoto.isDisplayed());

        WebElement addCategoryPhoto = driver.findElement(categoryPage.addPhotoCategoryField);
        addCategoryPhoto.sendKeys(testUser1shopCategoryPhotoPath);

        Utils.wait10Exp(driver, categoryPage.addCustomCategoryField);

        WebElement addCustomSize = driver.findElement(categoryPage.addCustomCategoryField);
        addCustomSize.sendKeys("1 Litre");
        addCustomSize.sendKeys(Keys.ENTER);
        addCustomSize.sendKeys("5 Litre");
        addCustomSize.sendKeys(Keys.ENTER);
        addCustomSize.sendKeys("25 Litre");
        addCustomSize.sendKeys(Keys.ENTER);
        addCustomSize.sendKeys("99 Litre");
        addCustomSize.sendKeys(Keys.ENTER);
        addCustomSize.sendKeys("108 Litre");

        acceptCategory.click();

        Utils.wait10Exp(driver, sideMenu.goodsSection);

        WebElement goToGoods = driver.findElement(sideMenu.goodsSection);
        goToGoods.click();

        Utils.wait10Exp(driver, goodsPage.addGoodColdStart);

        WebElement firstGood = driver.findElement(goodsPage.addGoodColdStart);
        firstGood.click();

        Utils.wait10Exp(driver, goodsPage.photoGoodTab);

        WebElement photoGoodTab = driver.findElement(goodsPage.photoGoodTab);
        photoGoodTab.click();

        WebElement doneEditingGood = driver.findElement(categoryPage.editCategory);
        doneEditingGood.click();

        WebElement errorNoName = driver.findElement(goodsPage.notificationNoName);
        WebElement goodTab = driver.findElement(goodsPage.goodTab);

        Assert.assertTrue(errorNoName.isDisplayed());
        Assert.assertTrue(goodTab.isDisplayed());


        WebElement goodNameField = driver.findElement(goodsPage.addGoodNameField);
        goodNameField.sendKeys(testUser1goodName);

        photoGoodTab.click();
        doneEditingGood.click();

        WebElement errorNoDescription = driver.findElement(goodsPage.notificationNoDescription);

        Assert.assertTrue(errorNoDescription.isDisplayed());
        Assert.assertTrue(goodTab.isDisplayed());

        WebElement descriptionFieldGood = driver.findElement(goodsPage.descriptionCategoryField);
        descriptionFieldGood.sendKeys(testUser1goodDescription);

        photoGoodTab.click();
        doneEditingGood.click();

        Utils.wait10Exp(driver, goodsPage.notificationNoPrice);

        WebElement errorNoPrice = driver.findElement(goodsPage.notificationNoPrice);

        Assert.assertTrue(errorNoPrice.isDisplayed());

        WebElement priceField = driver.findElement(goodsPage.priceGoodField);
        priceField.sendKeys(testUser1goodPrice);

        doneEditingGood.click();

        Utils.wait10Exp(driver, goodsPage.notificationNoCategory);

        WebElement errorNoCategory = driver.findElement(goodsPage.notificationNoCategory);

        Assert.assertTrue(errorNoCategory.isDisplayed());

        WebElement dropTheDown = driver.findElement(goodsPage.dropdownCategories);
        dropTheDown.click();

        Thread.sleep(1000);

        List<WebElement> options = dropTheDown.findElements(By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[3]/div[2]/div/ul/li"));
        for (WebElement option : options) {
            if (option.getText().equals(testUser1shopCategoryName)) {
                option.click();
                break;
            }
        }

        Utils.wait3();

        doneEditingGood.click();

        Utils.wait10Exp(driver, goodsPage.notificationNoPhoto);

        WebElement errorNoGoodPhoto = driver.findElement(goodsPage.notificationNoPhoto);

        Assert.assertTrue(errorNoGoodPhoto.isDisplayed());
        Assert.assertTrue(photoGoodTab.isDisplayed());

        goodTab.click();

        WebElement compositionFieldGood = driver.findElement(goodsPage.compositionCategoryField);
        compositionFieldGood.sendKeys(testUser1goodComposition);

        WebElement goodIsBestseller = driver.findElement(goodsPage.checkGoodIsBestseller);
        goodIsBestseller.click();

        WebElement goodIsNew = driver.findElement(goodsPage.checkGoodIsNew);
        goodIsNew.click();

        photoGoodTab.click();

        WebElement sendTittlePhoto = driver.findElement(goodsPage.photoTittleGoodDrop);
        sendTittlePhoto.sendKeys(testUser1goodTittlePhotoPath);

        Utils.wait10Exp(driver, goodsPage.photoGalleryGoodDrop);

        WebElement sendGalleryPhotos = driver.findElement(goodsPage.photoGalleryGoodDrop);
        sendGalleryPhotos.sendKeys(testUser1goodGalleryPhotoPath);

        Utils.wait3();

        // Upload each photo
        for (String photoPath : testUser1goodGalleryPhotoPaths) {
            sendGalleryPhotos.sendKeys(photoPath);
        }

        Utils.wait5();

        doneEditingGood.click();

        Utils.wait3();
    }

    @Test(priority = 3)
    public void test_isStatisticBlockWorks() throws InterruptedException {

        WebElement goToMainPage = driver.findElement(sideMenu.mainSection);
        goToMainPage.click();

        Utils.wait10Exp(driver, mainPage.statisticsShop);

        WebElement shopStatistic = driver.findElement(mainPage.statisticsShop);
        Assert.assertEquals(shopStatistic.getText(), "1");

        WebElement goodStatistic = driver.findElement(mainPage.statisticsGood);
        Assert.assertEquals(goodStatistic.getText(), "1");


        Utils.deleteShop(testUser1Login, testUser1Password, testUser1shopName, driver);
    }


    /**
     * Тест, что при нажатии галочки "Магазин цифровых товаров" - исчезает адресный блок,
     * чек-боксы "Доставка" и "Самовывоз из магазина" на вкладке "Доставка и Оплата" недоступны
     * и возможна оплата только картой или переводом (без курьера).
     *
     * @throws InterruptedException
     */


    @Test(priority = 4)
    public void test_shopIsDigitalNoSelfPickingAddress() throws InterruptedException {
        Utils.loginProcess(testUser1Login, testUser1Password, driver);

        WebElement shops = driver.findElement(sideMenu.shopsSection);

        shops.click();

        Thread.sleep(4000);

        WebElement addNewShop = driver.findElement(shopsPage.addShopClear);      /*AddShopClear!*/
        addNewShop.click();

        Thread.sleep(3000);

        WebElement selfPickArea = driver.findElement(shopsPage.selfPickingBlock);

        WebElement shopIsDigital = driver.findElement(shopsPage.checkShopIsDigital);

        int initialCount = driver.findElements(shopsPage.selfPickingBlock).size();

        shopIsDigital.click();

        Thread.sleep(4000);

        int finalCount = driver.findElements(shopsPage.selfPickingBlock).size();
        Assert.assertTrue(finalCount < initialCount);

        WebElement delTab = driver.findElement(shopsPage.deliveryTab);
        delTab.click();

        Thread.sleep(2000);

        WebElement delCheck = driver.findElement(shopsPage.checkDelivery);
        WebElement delSelfPicking = driver.findElement(shopsPage.checkSelfPicking);
        WebElement payToCourier = driver.findElement(shopsPage.payToCourier);

        Assert.assertTrue(delCheck.getAttribute("class").contains("disabled"));
        Assert.assertTrue(delSelfPicking.getAttribute("class").contains("disabled"));
        Assert.assertTrue(payToCourier.getAttribute("class").contains("disabled"));

    }


    /**
     * Тест, что если выбрал, при создании "магазин без категорий", то при заходе во вкладку "Категории"
     * и выборе этого магазина - будет текст "Этот магазин без категорий" и кнопка "Вернуться на главную", и это кнопка
     * ведёт на главную страницу.
     *
     * @throws InterruptedException
     */

    @Test(priority = 5)
    public void test_shopHasNoCategory() throws InterruptedException {
        Utils.loginProcess(testUser1Login, testUser1Password, driver);

        Thread.sleep(2000);

        WebElement goToShop = driver.findElement(sideMenu.shopsSection);
        goToShop.click();

        Thread.sleep(4000);

        WebElement newShop = driver.findElement(shopsPage.addShopClear);
        newShop.click();

        Thread.sleep(1000);

        WebElement noUseCategories = driver.findElement(shopsPage.checkShopDontUseCategories);
        noUseCategories.click();

        WebElement nameField = driver.findElement(shopsPage.nameNewShopField);
        nameField.sendKeys(testUser1shopName2);

        WebElement descriptionField = driver.findElement(shopsPage.descriptionNewShopField);
        descriptionField.sendKeys(testUser1shopDescription2);

        WebElement selfPickingButton = driver.findElement(shopsPage.addAddressSelfPickingButton);
        selfPickingButton.click();

        WebElement selfPickingField = driver.findElement(shopsPage.addAddressSelfPickingField);
        selfPickingField.sendKeys(testUser1shopSelfPickingAddress2);

        WebElement photoField = driver.findElement(shopsPage.addPhotoNewShopField);
        Thread.sleep(1000);
        photoField.sendKeys(testUser1shopTittlePhotoPath);
        Thread.sleep(3000);

        WebElement goToDeliveryTab = driver.findElement(shopsPage.deliveryAndPaymentTab);
        goToDeliveryTab.click();

        WebElement delCost = driver.findElement(shopsPage.deliveryCostField);
        delCost.sendKeys(testUser1shopDeliveryPayment2);

        Thread.sleep(3000);

        WebElement addFinalShopButton = driver.findElement(shopsPage.addShopFinal);
        addFinalShopButton.click();

        Thread.sleep(7000);

        WebElement categories = driver.findElement(sideMenu.categoriesSection);
        categories.click();

        Thread.sleep(3000);

        WebElement noCategoriesText = driver.findElement(categoryPage.textIfShopSelectedAsNullCategory);
        WebElement addCategoryButton = driver.findElement(categoryPage.buttonIfShopSelectedAsNullCategory);

        Assert.assertTrue(noCategoriesText.isDisplayed());
        Assert.assertTrue(addCategoryButton.isDisplayed());

        addCategoryButton.click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(), mainPage.mainPageURL);

        Utils.deleteShop(testUser1Login, testUser1Password, testUser1shopName2, driver);
    }

    /**
     *
     * Тест возможности создания новых вопросов в FAQ
     */

    @Test(priority = 6)
    public void test_faqCreateQuestionsAndAnswers() throws InterruptedException {

        WebElement shops = driver.findElement(sideMenu.shopsSection);

        shops.click();

        Thread.sleep(4000);

        WebElement addShopButtonClear = driver.findElement(shopsPage.addShopClear);
        addShopButtonClear.click();
        Thread.sleep(3000);

        WebElement nameField = driver.findElement(shopsPage.nameNewShopField);
        nameField.sendKeys(testUser1shopName);

        WebElement descriptionField = driver.findElement(shopsPage.descriptionNewShopField);
        descriptionField.sendKeys(testUser1shopDescription);

        WebElement photoField = driver.findElement(shopsPage.addPhotoNewShopField);
        Thread.sleep(1000);
        photoField.sendKeys(testUser1shopTittlePhotoPath);
        Thread.sleep(2000);

        WebElement selfPickingButton = driver.findElement(shopsPage.addAddressSelfPickingButton);
        selfPickingButton.click();

        WebElement selfPickingField = driver.findElement(shopsPage.addAddressSelfPickingField);
        selfPickingField.sendKeys(testUser1shopSelfPickingAddress);

        WebElement goToDeliveryTab = driver.findElement(shopsPage.deliveryAndPaymentTab);
        WebElement addFinalShopButton = driver.findElement(shopsPage.addShopFinal);

        goToDeliveryTab.click();

        WebElement devCost = driver.findElement(shopsPage.deliveryCostField);
        devCost.sendKeys(testUser1shopDeliveryPayment);

        addFinalShopButton.click();

        Thread.sleep(1000);

        WebElement goToFaq = driver.findElement(sideMenu.supportSection);
        goToFaq.click();

        Thread.sleep(1000);

        WebElement addQuestionsToYourShop = driver.findElement(supportPage.addQuestionsToYourShop);
        addQuestionsToYourShop.click();

        Thread.sleep(3000);

        WebElement addQuestion = driver.findElement(supportPage.addQuestionButton);
        addQuestion.click();
        addQuestion.click();
        addQuestion.click();

        Thread.sleep(1000);

        WebElement firstQuestion = driver.findElement(supportPage.questionField1);
        firstQuestion.sendKeys(testUser1Question1);

        WebElement firstAnswer = driver.findElement(supportPage.answerField1);
        firstAnswer.sendKeys(testUser1Answer1);

        WebElement secondQuestion = driver.findElement(supportPage.questionField2);
        secondQuestion.sendKeys(testUser1Question2);

        WebElement secondAnswer = driver.findElement(supportPage.answerField2);
        secondAnswer.sendKeys(testUser1Answer2);

        WebElement thirdQuestion = driver.findElement(supportPage.questionField3);
        thirdQuestion.sendKeys(testUser1Question3);

        WebElement thirdAnswer = driver.findElement(supportPage.answerField3);
        thirdAnswer.sendKeys(testUser1Answer3);

        WebElement save = driver.findElement(supportPage.saveButton);
        save.click();

        Thread.sleep(2000);

        WebElement blockWithQuestionsAndAnswers = driver.findElement(supportPage.faqBlock);
        Assert.assertTrue(blockWithQuestionsAndAnswers.isDisplayed() && blockWithQuestionsAndAnswers.isEnabled());


        Utils.deleteShop(testUser1Login, testUser1Password, testUser1shopName, driver);

    }

    @Test(priority = 7)
    public void localizationTest() throws InterruptedException {
        Utils.loginProcess(testUser1Login, testUser1Password, driver);
        Thread.sleep(2000);

        WebElement welcomeHeader = driver.findElement(mainPage.welcomeText);
        String oldWelcomeHeader  = welcomeHeader.getText();

        WebElement changeLang = driver.findElement(mainPage.languageSwitcher);
        changeLang.click();

        WebElement engLanguage = driver.findElement(mainPage.languageSwitchEn);
        engLanguage.click();

        Thread.sleep(3000);

        String newWelcomeHeader = welcomeHeader.getText();

        Thread.sleep(1000);

        Assert.assertNotEquals(oldWelcomeHeader, newWelcomeHeader);
    }


    @Test(priority = 8)
    public void test_Payment() throws InterruptedException{
        Utils.loginProcess(testUser1Login, testUser1Password, driver);

        WebElement goToTariffs = driver.findElement(sideMenu.tariffsAndPaymentSection);
        goToTariffs.click();

        Thread.sleep(5000);


        WebElement balance = driver.findElement(tariffsAndPaymentPage.balanceIndicatorZero);

        String amountOfBalance = balance.getText();
        String[] partsAmountAndCurrencyOld = amountOfBalance.split(" ");

        int oldValueOfBalance = Integer.parseInt(partsAmountAndCurrencyOld[0].trim());

        WebElement sendPaymentAmount = driver.findElement(tariffsAndPaymentPage.paymentScoreField);
        sendPaymentAmount.sendKeys(testUser1paymentAmount);

        WebElement submitPaymentAmount = driver.findElement(tariffsAndPaymentPage.runPaymentButton);
        submitPaymentAmount.click();

        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains(paymasterPage.payMasterURL));

        WebElement cardNumber = driver.findElement(paymasterPage.cardIdField);
        cardNumber.sendKeys(testUser1cardNumber);

        WebElement cardExpireDate = driver.findElement(paymasterPage.expireDateField);
        cardExpireDate.sendKeys(testUser1cardExpireDate);

        WebElement cardCcv = driver.findElement(paymasterPage.ccvField);
        cardCcv.sendKeys(testUser1cardCcv);

        WebElement confirmPayment = driver.findElement(paymasterPage.submitPaymentButton);
        confirmPayment.click();

        Thread.sleep(3000);

        WebElement donePayment = driver.findElement(paymasterPage.submitFinal);

        Thread.sleep(6000);

        donePayment.click();

        Thread.sleep(2000);

        driver.get(tariffsAndPaymentPage.tariffsURL);

        Thread.sleep(3000);

        balance = driver.findElement(tariffsAndPaymentPage.balanceIndicatorNotZero);

        amountOfBalance = balance.getText();

        String[] partsAmountAndCurrencyNew = amountOfBalance.split(" ₽");

        int newValueOfBalance = Integer.parseInt(partsAmountAndCurrencyNew[0].replaceAll(" ", ""));

        Assert.assertNotEquals(oldValueOfBalance, newValueOfBalance);
        //Assert.assertEquals(newValueOfBalance, Integer.parseInt(testUser1paymentAmount));
    }


    @Test(priority = 9)
    public void test_Profile() throws InterruptedException {
        Utils.loginProcess(testUser1Login, testUser1Password, driver);

        WebElement goToProfile = driver.findElement(sideMenu.profileSection);
        goToProfile.click();

        Thread.sleep(2000);

        WebElement photoField = driver.findElement(profilePage.photoUser);
        photoField.sendKeys(testUser1goodTittlePhotoPath);

        WebElement nameField = driver.findElement(profilePage.nameField);
        nameField.sendKeys(userName);

        WebElement phoneField = driver.findElement(profilePage.phoneField);
        phoneField.sendKeys(userPhone);

        WebElement telegramField = driver.findElement(profilePage.telegramField);
        telegramField.sendKeys(userTelegram);


        WebElement companyName = driver.findElement(profilePage.companyNameField);
        companyName.sendKeys(userCompanyName);

        WebElement companyDescription = driver.findElement(profilePage.descriptionCompanyField);
        companyDescription.sendKeys(userCompanyDescription);

        WebElement saveChanges = driver.findElement(profilePage.submitButton);
        saveChanges.click();


        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        String actualResultName = driver.findElement(profilePage.nameField).getAttribute("value");
        String actualResultPhone = driver.findElement(profilePage.phoneField).getAttribute("value");
        String actualResultTelegram =  driver.findElement(profilePage.telegramField).getAttribute("value");
        String actualResultCompanyName = driver.findElement(profilePage.companyNameField).getAttribute("value");
        String actualResultCompanyDescription = driver.findElement(profilePage.descriptionCompanyField).getAttribute("value");

        Assert.assertEquals(actualResultName, userName);
        Assert.assertEquals(actualResultPhone, userPhone);
        Assert.assertEquals(actualResultTelegram, "@" + userTelegram);
        Assert.assertEquals(actualResultCompanyName, userCompanyName);
        Assert.assertEquals(actualResultCompanyDescription, userCompanyDescription);




    }
    @AfterSuite
    public void exit() throws InterruptedException {
        //Utils.deleteShop(testUser1Login, testUser1Password, testUser1shopName, driver);
        driver.close();
        driver.quit();
    }
}
