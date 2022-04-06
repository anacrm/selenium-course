package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class ContactUs_PO extends Base_PO {
    public ContactUs_PO() {
        super();
    }

    private @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstName_TextField;

    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastName_TextField;

    private @FindBy(xpath = "//input[@name='email']")
    WebElement emailAddress_TextField;

    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement comments_TextField;

    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submit_Button;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement submit_Message;


    public void navigateTO_WebDriverUniversity_ContactUs_Page() {
        navigateTo_URL(Global_Vars.WEBSITE_BASE_URL + "/Contact-Us/contactus.html");
    }

    public void setFirstName() {
        sendKeys(firstName_TextField, "Ana" + generateRandomString(4));
    }

    public void setLastName() {
        sendKeys(lastName_TextField, "Medeiros" + generateRandomString(3));
    }

    public void setEmailAddress() {
        sendKeys(emailAddress_TextField, "biribin" + generateRandomNumber(3) + "@gmail.com");
    }

    public void setComment() {
        sendKeys(comments_TextField, "Hello" + generateRandomNumber(3));
    }

    public void setSpecificFirstName(String firstName) {
        sendKeys(firstName_TextField, firstName);
    }

    public void setSpecificLastName(String lastName) {
        sendKeys(lastName_TextField, lastName);
    }

    public void setSpecificEmailAddress(String emailAddress) {
        sendKeys(emailAddress_TextField, emailAddress);
    }

    public void setSpecificComment(String comment) {
        sendKeys(comments_TextField, comment);
    }

    public void clickSubmitButton() {
        waitForWebElementAndClick(submit_Button);
    }

    public void validate_Submit_Massage() {
        waitFor(submit_Message);
        Assert.assertEquals(submit_Message.getText(), "Thank You for your Message!");
    }


}

