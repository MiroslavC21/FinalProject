package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementsSectionTests extends BaseTest {
    
    @Test(priority = 1)
    public void testTextBoxEntry() {
        getTextBoxPage().scrollThePage();
        getTextBoxPage().getToTextBox();
        getTextBoxPage().enterAllFields("Gary Oldman", "oldman@gmail.com", "Holywood lane 2", "Holywood lane 2");
        getTextBoxPage().scrollThePage();
        getTextBoxPage().clickSubmit();
        Assert.assertTrue(getTextBoxPage().allFieldsText());
    }

    @Test(priority = 2)
    public void testAllCheckBoxButtonsAreSelected() {
        getCheckBoxPage().scrollThePage();
        getCheckBoxPage().getToheckBoxButton();
        getCheckBoxPage().clickhomeCheckBox();
        Assert.assertEquals(getCheckBoxPage().checkCompleteMessageCheckBox(), "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");
    }
        @Test(priority = 3)
        public void testOneCheckBoxIsChecked () {
            getCheckBoxPage().uncheckHomeBox();
            getCheckBoxPage().expandHomeButtonClick();
            getCheckBoxPage().expandDesktopButtonClick();
            getCheckBoxPage().checkNotesBox();
            Assert.assertEquals(getCheckBoxPage().checkMessageCheckBox(), "You have selected :\n" +
                    "notes");

        }


        @Test(priority = 4)
        public void testRadioButton () {
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            getRadioButtonPage().scrollThePage();
            getRadioButtonPage().getToRadioButton();
            getRadioButtonPage().clickImpressiveButton();
            Assert.assertEquals(getRadioButtonPage().checkButtonImpressiveMessage(), "You have selected Impressive");
            getRadioButtonPage().clickYesButton();
            Assert.assertTrue(getRadioButtonPage().checkButtonYesMessage());
            getRadioButtonPage().clickButtonNo();
            Assert.assertFalse(getRadioButtonPage().checkRadioButtonNoIsSelected());

        }


        @Test(priority = 5)
        public void testWebTablesAddNewEntry () {
            getWebTablesPage().scrollThePage();
            getWebTablesPage().getToWebTablesButton();
            getWebTablesPage().addButtonClick();
            getWebTablesPage().addNewTableEntry("Gary", "Cooper", "cooper@gmail.com", "67", "97000", "Movie");
            getWebTablesPage().clickSubmit();
            getWebTablesPage().scrollThePage();
            Assert.assertTrue(getWebTablesPage().newUserIsAddedToList());

        }

        @Test(priority = 6)
        public void testWebTableEntryEditing () {
            getWebTablesPage().editDataButtonClick();
            getWebTablesPage().clearField();
            getWebTablesPage().enterFirstName("Lary");
            getWebTablesPage().clickSubmit();
            Assert.assertTrue(getWebTablesPage().checkIfNewEntryIsInTable("Lary"));

        }

        @Test(priority = 7)
        public void testDeletionOfEntry () {
            getWebTablesPage().deleteEntryClick();
            Assert.assertFalse(getWebTablesPage().checkIfNewEntryIsInTable("Lary"));
        }

        @Test(priority = 8)
        public void testButtons () {

            getButtonsPage().getToButtonsPage();
            getButtonsPage().waitForDoubleClickability();
            getButtonsPage().performDoubleClick();
            Assert.assertEquals(getButtonsPage().doubleClickButtonMessage(), "You have done a double click");
            getButtonsPage().performRightClick();
            Assert.assertEquals(getButtonsPage().rightClickButtonMessage(), "You have done a right click");
            getButtonsPage().performClick();
            Assert.assertEquals(getButtonsPage().clickButtonMessage(), "You have done a dynamic click");

        }

        @Test(priority = 9)
        public void testLinksPageCreatedApiCall () {
            getLinksPage().scrollThePage();
            getLinksPage().getToLinksButton();
            getLinksPage().clickCreatedApiCall();
            Assert.assertTrue(getLinksPage().createdApiCallMessage());
        }
        @Test(priority = 10)
        public void testLinksPageNoContentApiCall () {
            getLinksPage().scrollThePage();
            getLinksPage().clickNoContentApiCall();
            Assert.assertTrue(getLinksPage().noContentApiCallMessageCheck());
        }
        @Test(priority = 11)
        public void testLinksPageMovedApiCall () {
            getLinksPage().clickMovedApiCall();
            Assert.assertTrue(getLinksPage().movedApiCallMessageCheck());
        }
        @Test(priority = 12)
        public void testLinksPageBadRequestApiCall () {
            getLinksPage().clickBadRequestApiCall();
            Assert.assertTrue(getLinksPage().badRequestApiCallMessageCheck());
        }
        @Test(priority = 13)
        public void testLinksPageUnauthorizedApiCall () {
            getLinksPage().clickUnauthorizedApiCall();
            Assert.assertTrue(getLinksPage().unauthorizedApiCallMessageCheck());
        }
        @Test(priority = 14)
        public void testLinksPageForbiddenApiCall () {
            getLinksPage().clickForbidenApiCall();
            Assert.assertTrue(getLinksPage().forbidenApiCallMessageCheck());
        }
        @Test(priority = 15)
        public void testLinksPageNotFoundApiCall () {
            getLinksPage().clickNotFoundApiCall();
            Assert.assertTrue(getLinksPage().notFoundApiCallMessageCheck());
        }
    }




