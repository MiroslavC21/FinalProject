package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage {
    private By elementsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By radioButtonMenu = By.xpath("//*[@id=\"item-2\"]");



    private By yesButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By yesButtonMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");
    private By impressiveButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By impressiveButtonMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");
    private By radioButtonNo = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]");


    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickElementsButton() {
        getDriver().findElement(elementsButton).click();
    }

    public void clickRadioButtonMenu() {

        getDriver().findElement(radioButtonMenu).click();
    }

    public void getToRadioButton() {
      //   clickElementsButton();

        clickRadioButtonMenu();
    }

    public void clickYesButton() {
        getDriver().findElement(yesButton).click();
    }

    public void clickImpressiveButton() {
        getDriver().findElement(impressiveButton).click();
    }

    public boolean checkButtonYesMessage() {
        return getDriver().findElement(yesButtonMessage).isEnabled();
    }
    public String checkButtonImpressiveMessage(){
        return  getDriver().findElement(impressiveButtonMessage).getText();
    }

    public boolean checkRadioButtonNoIsSelected() {
        return
                getDriver().findElement(radioButtonNo).isSelected();

    }
    public void clickButtonNo(){
        getDriver().findElement(radioButtonNo).click();
    }

}



