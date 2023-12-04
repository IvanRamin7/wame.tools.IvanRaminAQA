import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class shopsPage {
   public static By shopTab = By.xpath("//li[text() = 'Магазин']");
   public static By articlesTab = By.xpath("//li[text() = 'Статьи']");
   public static By deliveryTab = By.xpath("//li[text() = 'Доставка и оплата']");

   public static By nameNewShopField = By.xpath("//div[p[contains(., 'Название магазина')]]//input");
   public static By descriptionNewShopField = By.xpath("//div[p[contains(., 'Описание магазина')]]/div[@class = 'input_frame']/textarea");
   public static By phoneNewShopField = By.xpath("//div[p[contains(., 'Телефон менеджера')]]//input");
   public static By addPhotoNewShopField = By.xpath("//div[@class='upload_image_box']/input");
   public static By telegramNewShopField = By.xpath("//*[@id= '__next']/main/div/div[2]/div[2]/section/form/div[1]/div[2]/div[4]/div/input");
   public static By textAfterOrderNewShopField = By.xpath("//*[@id= '__next']/main/div/div[2]/div[2]/section/form/div[1]/div[2]/div[5]/div/textarea");

   public static By checkShopIsDigital = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[3]/span");
   public static By checkShopDontUseCategories = By.xpath("//p[text() = 'Мой магазин не использует категории для товара']/../span");
   public static By testUser1shopActivityItem = By.xpath("//button[@class = 'activity_item activity_add']");
   public static By selfPickingBlock = By.xpath("//div[contains(@class, 'duplicate_input')]");
   public static By addAddressSelfPickingButton = By.xpath("//button[@class = 'more_button']/span");
   public static By addAddressSelfPickingField = By.xpath("//div[@class = 'duplicate_list']//input");
   public static By getAddAddressSelfPickingFieldSecond = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[2]/div[6]/button");
   public static By addShopClear = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/section/a");
   public static By addShopMore = By.xpath("//div[@ class = 'product_table_block']/a[@href='/dashboard/shop/add']");
   public static By addShopFinal = By.xpath("//button[@type = 'submit']");

   public static By checkDelivery = By.xpath("//div[@class = 'delivery_checkbox']/div[1]");
   public static By checkSelfPicking = By.xpath("//div[@class = 'delivery_checkbox']/div[2]");
   public static By payToCourier = By.xpath("//div[@class = 'payment_list']/div[3]");






   public static By deliveryAndPaymentTab = By.xpath("//li[text() = 'Доставка и оплата']");
   public static By deliveryCostField = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[5]/div[1]/div/input");
   public static By deliveryFreeFromField = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[1]/div[1]/div[5]/div[2]/div/input");

   public static By notificationPhotoIsNotUploaded = By.xpath("//div[@id='notistack-snackbar' and text() = 'Не указано фото, пожалуйста, повторите попытку.']");
   public static By notificationAddressIsNotPresented = By.xpath("//div[text() = 'Не указан адрес, пожалуйста, повторите попытку.']");
   public static By notificationDeliveryPriceNotExist = By.xpath("//div[@id='notistack-snackbar' and text() = 'Не указана стоимость доставки, пожалуйста, повторите попытку.']");

}
