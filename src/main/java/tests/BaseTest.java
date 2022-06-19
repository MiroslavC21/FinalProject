package tests;

import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait driverWait;
    private Actions actions;
    private TextBoxPage textBoxPage;
    private RadioButtonPage radioButtonPage;
    private CheckBoxPage checkBoxPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;
    private LinksPage linksPage;


    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }

    public WebTablesPage getWebTablesPage() {
        return webTablesPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public LinksPage getLinksPage() {
        return linksPage;
    }


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\ITBootcamp\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        textBoxPage = new TextBoxPage(driver, driverWait);
        radioButtonPage = new RadioButtonPage(driver, driverWait);
        checkBoxPage = new CheckBoxPage(driver, driverWait);
        webTablesPage = new WebTablesPage(driver, driverWait);
        buttonsPage = new ButtonsPage(driver, driverWait);
        linksPage = new LinksPage(driver, driverWait);


        driver.navigate().to("https://demoqa.com/");
    }

    @AfterClass
    public void close() {
        driver.close();
    }
}



