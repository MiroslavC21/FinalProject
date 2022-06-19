package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class WebTablesPage extends BasePage {

    private By elementsButton= By.className("card-up");
    private By webTablesButton= By.xpath("//*[@id=\"item-3\"]");
    private By addButton= By.id("addNewRecordButton");
    private By firstName= By.id("firstName");
    private By lastName= By.id("lastName");
    private By email= By.id("userEmail");
    private By age=By.id("age");
    private By salary= By.id("salary");
    private By department=By.id("department");
    private By submitButton=By.id("submit");
    private By editDataButton= By.id("edit-record-4");
    private By editSubmitButton= By.xpath("//*[@id=\"submit\"]");
    private By deleteEntry=By.id("delete-record-4");
    private By newUserIsAdded = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div");

    public WebTablesPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickElementsButton(){
        getDriver().findElement(elementsButton).click();

    }
    public void clickWebTablesButton(){
        getDriver().findElement(webTablesButton).click();
    }
    public void getToWebTablesButton(){

        //clickElementsButton();
        //scrollThePage();
        clickWebTablesButton();
    }

    public void enterFirstName(String firstName){
        getDriver().findElement(this.firstName).sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        getDriver().findElement(this.lastName).sendKeys(lastName);
    }
    public void enterEmail(String email) {
        getDriver().findElement(this.email).sendKeys(email);
    }
    public void enterAge (String age){
        getDriver().findElement(this.age).sendKeys(age);
    }
    public void enterSalary (String salary){
        getDriver().findElement(this.salary).sendKeys(salary);
    }
    public void enterDepartment (String department){
        getDriver().findElement(this.department).sendKeys(department);
    }
    public void clickSubmit () {
        getDriver().findElement(submitButton).click();
    }
    public void addButtonClick (){
        getDriver().findElement(addButton).click();
    }
    public void editDataButtonClick(){
        getDriver().findElement(editDataButton).click();

    }
    public void clearField(){
        getDriver().findElement(firstName).clear();
    }
    public void deleteEntryClick(){
        getDriver().findElement(deleteEntry).click();

    }

    /**
     * Method that returns true if the name added is found in the table
     * @param addedName
     * @return
     */
    public boolean checkIfNewEntryIsInTable(String addedName) {
        List<WebElement> namesInTable = getDriver().findElements(By.className("rt-table"));

        for (WebElement i : namesInTable) {
            if (i.getText().contains(addedName)) {
                return true;
            }
        }

        return false;

    }
    /**
     * method for input of all data for the user (all informations are String type)
     */
    public void addNewTableEntry(String firstName,String lastName,String emailAddress,String age,String salary, String department){
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(emailAddress);
        enterAge(age);
        enterSalary(salary);
        enterDepartment(department);
    }

    /**
     * Method that checks is the new user added and displayed in the Web table
     * @return
     */
    public boolean newUserIsAddedToList () {
        return getDriver().findElement(newUserIsAdded).isDisplayed();
    }

    }


