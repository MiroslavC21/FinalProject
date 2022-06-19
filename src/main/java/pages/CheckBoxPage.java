package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage {
    private By elementsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By checkBoxButton= By.xpath("//*[@id=\"item-1\"]/span");
    private By homeCheckBox= By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]");
    private By homeUncheckBox=By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]") ;
    private By expandHomeButton=By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button");
    private By expandDesktopButton= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button");
    private By notesCheckBox=By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]");

    private By notesCheckBoxMessage=By.id("result");
    private By completeCheckBoxMessage=By.xpath("//*[@id=\"result\"]");

    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickElementsButton() {
        getDriver().findElement(elementsButton).click();
    }
    public void uncheckHomeBox(){
        getDriver().findElement(homeUncheckBox).click();
    }
    public void expandHomeButtonClick(){
        getDriver().findElement(expandHomeButton).click();
    }
    public void expandDesktopButtonClick(){
        getDriver().findElement(expandDesktopButton).click();
    }
    public void checkNotesBox(){
        getDriver().findElement(notesCheckBox).click();
    }

    public void clickcheckBoxButtonMenu() {

        getDriver().findElement(checkBoxButton).click();
    }

    public void getToheckBoxButton() {
     // clickElementsButton();

        clickcheckBoxButtonMenu();
    }

    public void clickhomeCheckBox() {
        getDriver().findElement(homeCheckBox).click();
    }

    /**
     * Method for displaying message when notes check Box is the only one selected
     * @return
     */
    public String checkMessageCheckBox(){
      return   getDriver().findElement(notesCheckBoxMessage).getText();
    }

    /**
     * Method for displaying complete message when all check boxes are selected
     * @return
     */
    public String checkCompleteMessageCheckBox(){
        return getDriver().findElement(completeCheckBoxMessage).getText();
    }

}

