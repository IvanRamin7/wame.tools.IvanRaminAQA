import org.openqa.selenium.By;

public class categoryPage {
    public static String categoriesURL = "https://dev.wame.tools/dashboard/categories";
    public static By addCategoryClear = By.xpath("//div[@class = 'dashboard_content']//button[text() = 'Добавить категорию']");
    public static By addPhotoCategoryField = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/div[2]/div[1]/div[2]/div/div[1]/div/input");
    public static By addCategoryNameField = By.xpath("//div[@class='input_frame']/input[@type='text' and @placeholder = 'Название категории']");
    public static By addCustomCategoryField = By.xpath("//div[@class='input_frame']/input[@placeholder = 'Введите размер и нажмите Enter']");
    public static By saveCategoryAsScratch = By.xpath("//div[@class = 'buttons_list']/button[text() = 'Сохранить как черновик']");
    public static By addCategoryFinal = By.xpath("//div[@class = 'buttons_list']/button[text() = 'Добавить категорию']");
    public static By editCategory = By.xpath("//*[@id='__next']/main/div/div[2]/div[2]/section/form/div[2]/div/button[1]");
    public static By textIfShopHasNoCategories = By.xpath("//span[contains(., 'Кажется, вы еще не добавили') and contains(., 'ни одной категории в этот магазин')]");
    public static By buttonIfShopHasNoCategories = By.xpath("//button[text() = 'Добавить категорию']");
    public static By textIfShopSelectedAsNullCategory = By.xpath("//span[contains(., 'Этот магазин не использует категории')]");
    public static By buttonIfShopSelectedAsNullCategory = By.xpath("//a[contains(., 'Вернуться на главную')]");
    public static By notificationUploadPhoto = By.xpath("//div[@id = 'notistack-snackbar' and text() = 'Не загружена обложка категории, пожалуйста, повторите попытку.']");

}
