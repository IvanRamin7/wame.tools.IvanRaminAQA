import org.openqa.selenium.By;

public class welcomePage {

    public static String WELCOME_PAGE = "https://dev.wame.tools/";
    public static String LOGIN_PAGE = "https://dev.wame.tools/registration";
    public static By CONFIDENTIAL_LINK = By.xpath("//a[@rel = 'noreferrer' and text() = 'Политика конфиденциальности']");
    public static By TRY_BUTTON_LARGE = By.xpath("//a[@href='/registration' and text() = 'Попробовать']");
    public static By TRY_BUTTON_SMALL = By.xpath("//button[@class = 'try_button' and text() = 'Попробовать']");
    public static By TRY_BUTTON_LAST = By.xpath("//button[@type ='button' and text() = 'Присоединиться']");
    public static By NAME_APPLICATION_FIELD = By.xpath("//input[@type = 'text' and @placeholder = 'Ваше имя']");
    public static By PHONE_APPLICATION_FIELD = By.xpath("//input[@type = 'text' and @placeholder = 'Ваш телефон']");
    public static By INSTAGRAM_APPLICATION_FIELD = By.xpath("//input[@type = 'text' and @placeholder = 'Сайт / Instagram компании']");
    public static By MESSAGE_APPLICATION_FIELD = By.xpath("//textarea[@placeholder = 'Сообщение']");
    public static By REQUEST_BUTTON_APPLICATION = By.xpath("//button[@type ='submit' and text() = 'Оставить заявку']");
    public static By REQUEST_MESSAGE_SUCCESS = By.xpath("//h2[text() = 'заявка успешно отправлена']");
    public static By mainTextHeader = By.xpath("//h1");
    public static String mainTextHeaderEng = "Start selling your products and services on Telegram in 10 minutes";

}
