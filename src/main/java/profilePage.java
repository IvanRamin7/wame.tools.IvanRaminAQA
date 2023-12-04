import org.openqa.selenium.By;

public class profilePage {
    public static By nameField = By.xpath("//p[text() = 'Ваше ФИО']//following-sibling::div/input");
    public static By phoneField = By.xpath("//p[text() = 'Номер телефона']//following-sibling::div/input");
    public static By telegramField = By.xpath("//p[text() = 'Telegram-никнейм']//following-sibling::div/input");
    public static By companyNameField = By.xpath("//p[text() = 'Название компании']//following-sibling::div/input");
    public static By descriptionCompanyField = By.xpath("//p[text() = 'Описание компании']//following-sibling::div[@class = 'input_frame']/textarea");

    public static By exitProfileButton = By.xpath("//button[text() = 'Выйти из профиля']");
    public static By photoUser = By.xpath("//div[@class = 'upload_image_box']/input");
    public static By submitButton = By.xpath("//button[@type='submit']");


}
