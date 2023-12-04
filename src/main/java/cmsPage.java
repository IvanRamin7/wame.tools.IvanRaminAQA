import org.openqa.selenium.By;

public class cmsPage {

    public static String cmsURL = "https://cms.wame.tools";

    public static String userName = "ivanramin7@gmail.com";
    public static String password = "azaza4764108.";


    public static By loginField = By.xpath("//input[@placeholder = 'E-mail']");
    public static By passwordField = By.xpath("//input[@placeholder = 'Пароль']");
    public static By submitButton = By.xpath("//button");

    public static By contentPartOfSideBar = By.xpath("//a[@href = '/admin/content']");
    public static By createElementClean = By.xpath("//span[@class = 'content' and text() = 'Создать элемент']");

    public static By statusOfNews = By.xpath("//*[@id='main-content']/div/main/div[1]/div[1]/div[2]/div/div/div/div");
    public static By draftModeChooseInStatusOfNews = By.xpath("//span[@class = 'item-text' and text() = 'Черновик']");

    public static By tittleDraftField = By.xpath("//*[@id='main-content']/div/main/div[1]/div[2]/div[2]/div/div/input");
    public static By tittleForNewsField = By.xpath("//*[@id='main-content']/div/main/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div[2]/div/div/input");
    public static By descriptionField = By.xpath("/html/body/div[1]/div/div/div[1]/div/main/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/div/textarea");
    public static By seoTitleField = By.xpath("//*[@id='main-content']/div/main/div[1]/div[4]/div[2]/div/div/div[2]/div[5]/div[2]/div/div/input");
    public static By seoDescriptionField = By.xpath("//*[@id='main-content']/div/main/div[1]/div[4]/div[2]/div/div/div[2]/div[6]/div[2]/div/textarea");
    public static By saveTheNewsButton = By.xpath("//*[@id='main-content']/header/div[5]/div[2]/div[2]/button/span/span/i");
    public static By deleteButton = By.xpath("//i[@data-icon = 'delete']/../../..");
    public static By confirmDelete = By.xpath("//span[text() = 'Удалить']/..");



}
