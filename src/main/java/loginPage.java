import org.openqa.selenium.By;

public class loginPage {


    public static String LOGIN_PAGE_URL = "https://dev.wame.tools/login";

    public static final String REGISTRATION_PAGE = "https://dev.wame.tools/registration";

    public static final By REGISTRATION_TITTLE = By.xpath("//h1[text() = 'Регистрация профиля']");

    public static By LOGIN_EMAIL_FIELD = By.xpath("//div[@class = 'input_frame']/input[@type = 'email']");

    public static By LOGIN_PASSWORD_FIELD = By.xpath("//input[@type = 'password']");

    public static By LOGIN_SUBMIT_BUTTON = By.xpath("//button[@type = 'submit']");

    public static By ENTER_IFRAME_LOGIN = By.xpath("//iframe[@src = 'https://id.beta.vitamin.tools/login/wame']");

    public static By LOGIN_EMAIL_FIELD_IFRAME = By.xpath("//input[@id = 'user-email']");

    public static By LOGIN_PASSWORD_FIELD_IFRAME = By.xpath("//input[@id = 'user-password']");

    public static By LOGIN_BUTTON_IFRAME = By.xpath("//button[text() = 'Войти на сайт']");

    public static By REGISTRATION_COMPANY_BUTTON = By.xpath("//a[text() = 'Регистрация компании']");

    public static By REGISTRATION_BUTTON = By.xpath("//button[@type = 'submit']");

    public static By REGISTRATION_LOGIN_FIELD = By.xpath("//input[@type = 'email']");

    public static By REGISTRATION_PASSWORD_FIELD = By.xpath("//input[@type = 'password']");

    public static By notificationWrongEmail = By.xpath("//div[text() = 'Неверная электронная почта или пароль, пожалуйста, повторите попытку.']");

    public static By notificationWrongPassword = By.xpath("//div[text() = 'Неверный пароль']");

    public static By notificationNegativeAlreadyRegistered = By.xpath("//div[text() = 'Аккаунт с такой почтой уже зарегистрирован, пожалуйста, повторите попытку.']");

    public static By FORGOT_LINK = By.xpath("//a[@href = '/recovery' and text() = 'Забыли пароль?']");

    public static By AUTORIZATION_LINK = By.xpath("//a[@href = '/login' and text() = 'Войти']");

    public static By REGISTRATION_LINK = By.xpath("//a[@href = '/registration' and text() = 'Регистрация']");

    public static String RECOVERY_PAGE_URL = "https://dev.wame.tools/recovery";

    public static String DASHBOARD = "https://dev.wame.tools/dashboard";
}
