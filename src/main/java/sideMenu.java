import org.openqa.selenium.By;

public class sideMenu {
    public static By mainSection = By.xpath("//*[@id='__next']/main/div/div[1]/nav/ul/li[1]/a/span");
    public static By shopsSection = By.xpath("//*[@id='__next']/main/div/div[1]/nav/ul/li[2]");
    public static By categoriesSection = By.xpath("//*[@id='__next']/main/div/div[1]/nav/ul/li[3]/a[text() = 'Категории']/span");
    public static By goodsSection = By.xpath("//*[@id='__next']/main/div/div[1]/nav/ul/li[4]");
    public static By profileSection = By.xpath("//*[@id='__next']/main/div/div[1]/nav/ul/li[7]");
    public static By supportSection = By.xpath("//*[@id='__next']/main/div/div[1]/nav/ul/li[8]");
    public static By tariffsAndPaymentSection = By.xpath("//*[@id='__next']/main/div/div[1]/nav/ul/li[9]");

}
