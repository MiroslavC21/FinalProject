package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {
    private By elementsButton= By.className("card-up");

    private By textBoxMenu=By.xpath("//*[@id=\"item-0\"]");

    private By fullName=By.id("userName");
    private By email=By.id("userEmail");
    private By currentAddress=By.id("currentAddress");
    private By permanentAddress=By.id("permanentAddress");
    private By submitButton=By.id("submit");




    public TextBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickElementsButton(){
        getDriver().findElement(elementsButton).click();

    }
    public void clickTextBoxMenu(){
        getDriver().findElement(textBoxMenu).click();
    }
    public void getToTextBox(){
        clickElementsButton();
        clickTextBoxMenu();
    }

    public void enterFullName(String fullName){
        getDriver().findElement(this.fullName).sendKeys(fullName);
    }
    public void enterEmail(String email) {
        getDriver().findElement(this.email).sendKeys(email);
    }
    public void enterCurrentAddress (String address){

        getDriver().findElement(this.currentAddress).sendKeys(address);
    }
    public void enterPermanentAddress (String permanentAddress){
        getDriver().findElement(this.permanentAddress).sendKeys(permanentAddress);
    }
    public void clickSubmit () {
        getDriver().findElement(submitButton).click();
    }

    public boolean nameText() {
        return getDriver().findElement(By.id("output")).getText().contains(getDriver().findElement(fullName).getText());
    }
    public boolean emailText(){
        return getDriver().findElement(By.id("output")).getText().contains(getDriver().findElement(email).getText());
    }
    public boolean currentAddressText(){
        return getDriver().findElement(By.id("output")).getText().contains(getDriver().findElement(currentAddress).getText());
    }
    public boolean permanentAddressText(){
        return getDriver().findElement(By.id("output")).getText().contains(getDriver().findElement(permanentAddress).getText());
    }

    /**
     * Mehod that checks are all entries matching with the expected entries in text boxes
     * @return
     */
    public boolean allFieldsText(){
        if(nameText() && emailText() && currentAddressText() && permanentAddressText()) {
            return true;
        }
        return false;
    }
    public void enterAllFields(String fullName,String email,String currentAddress, String permanentAddress){
        enterFullName(fullName);
        enterEmail(email);
        enterCurrentAddress(currentAddress);
        enterPermanentAddress(permanentAddress);

    }

}
