import org.openqa.selenium.By;

public class paymasterPage {
    public static String payMasterURL = "https://paymaster.ru/cpay/";
    public static By cardIdField = By.xpath("//input[@placeholder = 'Card number']");
    public static By expireDateField = By.xpath("//input[@placeholder = 'MM / YY']");
    public static By ccvField = By.xpath("//input[@placeholder = 'CVV / CVC']");
    public static By submitPaymentButton = By.xpath("//button[@type = 'submit']");
    public static By submitFinal = By.xpath("//button[@type='submit']");

}
