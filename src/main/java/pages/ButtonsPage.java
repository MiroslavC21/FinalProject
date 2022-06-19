package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ButtonsPage extends BasePage {
    private By elementsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By buttonsMenu = By.xpath("//*[@id=\"item-4\"]");
    private By doubleClickButton = By.id("doubleClickBtn");
    private By rightClickButton = By.id("rightClickBtn");
    private By clickMeButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    private By doubleClickMessage = By.id("doubleClickMessage");
    private By rightClickMessage = By.id("rightClickMessage");
    private By clickMeMessage = By.id("dynamicClickMessage");

    public ButtonsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickElementsButton() {
        getDriver().findElement(elementsButton).click();
    }

    public void clickButtonsMenu() {
        getDriver().findElement(buttonsMenu).click();
    }

    public void getToButtonsPage() {
        /*scrollThePage();
        clickElementsButton();*/
        scrollThePage();
        clickButtonsMenu();
    }

    public void performDoubleClick() {
        Actions actions = new Actions(getDriver());
            actions.doubleClick(getDriver().findElement(doubleClickButton)).perform();
    }
    public void performRightClick(){
        Actions actions = new Actions(getDriver());
        actions.contextClick(getDriver().findElement(rightClickButton)).perform();

    }
    public void performClick(){
        getDriver().findElement(clickMeButton).click();
    }

    public void waitForDoubleClickability() {
        getDriverWait().until(ExpectedConditions.presenceOfElementLocated(doubleClickButton));

    }

    public void verifyDoubleClickButton() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
    }

    public String doubleClickButtonMessage() {
        return getDriver().findElement(doubleClickMessage).getText();
    }
    public String rightClickButtonMessage() {
        return getDriver().findElement(rightClickMessage).getText();
    }
    public String clickButtonMessage() {
        return getDriver().findElement(clickMeMessage).getText();
    }
}

