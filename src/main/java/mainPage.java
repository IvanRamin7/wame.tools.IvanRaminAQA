import org.openqa.selenium.By;

public class mainPage {
    public static String mainPageURL = "https://dev.wame.tools/dashboard";
    public static By closeProfileContainer = By.xpath("//div[@class='modal_heading']/button[contains(@class, 'close_button')]");
    public static By welcomeText = By.xpath("//div[@class = 'content_wrapper']/section/h2");
    public static By statisticsShop = By.xpath("//div[@class = 'list']//p[@class = 'title' and contains(text(), 'Магазин')]/preceding-sibling::p[@class = 'value']");
    public static By statisticsGood = By.xpath("//div[@class = 'list']//p[@class = 'title' and contains(text(), 'Товар')]/preceding-sibling::p[@class = 'value']");
    public static By statisticBalance = By.xpath("/html/body/div/main/div/div[2]/div[2]/section[2]/div[2]/div[1]/div/div[1]/span[2]");
    public static By newsColumn = By.xpath("//div[@class = 'news_list']");
    public static By languageSwitcher = By.xpath("//div[@class = 'custom_select_drop']");
    public static By languageSwitchEn = By.xpath("//div[@class = 'custom_select_drop']//li[text()  = 'en']");
    public static By languageSwitchRu = By.xpath("//div[@class = 'custom_select_drop']//li[text()  = 'ru']");
}
