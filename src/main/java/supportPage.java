import org.openqa.selenium.By;

public class supportPage {

    public static By addQuestionsToYourShop = By.xpath("//a[text() = 'Добавьте вопросы в свой магазин']");
    public static By addQuestionButton = By.xpath("//button[@class = 'more_button']");
    public static By saveButton = By.xpath("//button[@type = 'submit']");
    public static By backToCommonQuestions = By.xpath("//a[text() = 'Вернуться к общим вопросам']");
    public static By faqBlock = By.xpath("//div[contains(@class, 'faq_block')]");


    public static By questionField1 = By.xpath("//div[@class = 'duplicate_item'][1]//div[p[contains (., 'Вопрос')]]//div[@class = 'input_frame']/input");
    public static By answerField1 = By.xpath("//div[@class = 'duplicate_item'][1]//div[p[contains (., 'Ответ')]]//div[@class = 'input_frame']/textarea");
    public static By questionField2 = By.xpath("//div[@class = 'duplicate_item'][2]//div[p[contains (., 'Вопрос')]]//div[@class = 'input_frame']/input");
    public static By answerField2 = By.xpath("//div[@class = 'duplicate_item'][2]//div[p[contains (., 'Ответ')]]//div[@class = 'input_frame']/textarea");
    public static By questionField3 = By.xpath("//div[@class = 'duplicate_item'][3]//div[p[contains (., 'Вопрос')]]//div[@class = 'input_frame']/input");
    public static By answerField3 = By.xpath("//div[@class = 'duplicate_item'][3]//div[p[contains (., 'Ответ')]]//div[@class = 'input_frame']/textarea");
}
