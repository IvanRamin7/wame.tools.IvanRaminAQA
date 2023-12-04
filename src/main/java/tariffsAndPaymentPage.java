import org.openqa.selenium.By;

public class tariffsAndPaymentPage {
    public static String tariffsURL = "https://dev.wame.tools/dashboard/tariff-payment";
    public static By balanceIndicatorZero = By.xpath("//div[@class = 'text_wrapper']/span[@class = 'number_text red_color']");
    public static By balanceIndicatorNotZero = By.xpath("//div[@class = 'text_wrapper']/span[@class = 'number_text ']");
    public static By paymentScoreField = By.xpath("//input[@type = 'number' and @placeholder = 'Введите сумму'] ");
    public static By runPaymentButton = By.xpath("//button[@type = 'submit']");


}
