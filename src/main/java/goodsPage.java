import org.openqa.selenium.By;

import javax.swing.text.html.CSS;

public class goodsPage {
    public static By goodTab = By.xpath("//li[text() = 'Описание']");
    public static By photoGoodTab = By.xpath("//li[text() = 'Фото']");
    public static By characteristicsAndAmountTab = By.xpath("//li[text() = 'Характеристики и количество']");


    public static By addGoodColdStart = By.xpath("//a[@href='/dashboard/product/add']");
    public static By addGoodNameField = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[2]/div/input");
    public static By dropDownChoiceFutVoid = By.xpath("//div[@class = 'custom_select_drop']//li[text() = 'This is my Honey category']");

    public static By dropdownCategories = By.xpath("//div[@class = 'custom_select_drop']/button[text() = 'Укажите категорию']");
    public static By fillInFormField = By.xpath("//div[@class = 'sc-bdb8b360-0 flKoJw form_input form_textarea']//div[@class='input_frame']");
    public static By descriptionCategoryField = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[4]/div/textarea");
    public static By compositionCategoryField = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[5]/div/textarea");
    public static By priceGoodField = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[6]/div[1]/div/input");
    public static By checkGoodIsBestseller = By.xpath("//p[text()='Бестселлер']/preceding-sibling::span[1]");
    public static By checkGoodIsNew = By.xpath("//p[text()='Новый товар']/preceding-sibling::span[1]");

    public static By photoTittleGoodDrop = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[2]/div/input");
    public static By photoGalleryGoodDrop = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[4]/div/input");

    public static By notificationNoName = By.xpath("//div[@id = 'notistack-snackbar' and text() = 'Не указано название, пожалуйста, повторите попытку.']");
    public static By notificationNoDescription = By.xpath("//div[@id = 'notistack-snackbar' and text() = 'Не указано описание, пожалуйста, повторите попытку.']");
    public static By notificationNoPrice = By.xpath("//div[@id = 'notistack-snackbar' and text() = 'Не указана цена, пожалуйста, повторите попытку.']");
    public static By notificationNoCategory = By.xpath("//div[@id = 'notistack-snackbar' and text() = 'Не указана категория, пожалуйста, повторите попытку.']");
    public static By notificationNoPhoto = By.xpath("//div[@id = 'notistack-snackbar' and text() = 'Не добавлены изображения, пожалуйста, повторите попытку.']");








}
