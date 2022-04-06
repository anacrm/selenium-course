package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.ContactUs_PO;


public class ContactUs extends Base_PO {


    private ContactUs_PO contactUs_po;

    public ContactUs(ContactUs_PO contactUs_po) {
        this.contactUs_po = contactUs_po;
    }


    //performing the actions

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {

        contactUs_po.navigateTO_WebDriverUniversity_ContactUs_Page();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUs_po.setFirstName();
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUs_po.setLastName();
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUs_po.setEmailAddress();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUs_po.setComment();
    }

    @When("I enter a specific first name {}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactUs_po.setSpecificFirstName(firstName);
    }

    @When("I enter a specific last name {}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUs_po.setSpecificLastName(lastName);
    }

    @When("I enter a specific email address {}")
    public void i_enter_a_specific_email_address(String emailAddress) {
        contactUs_po.setSpecificEmailAddress(emailAddress);
    }

    @When("I enter a specific comment {}")
    public void i_enter_a_specific_comment(String comment) {
        contactUs_po.setSpecificComment(comment);
    }

    @And("I click on submit button")
    public void i_click_on_submit_button() {
        contactUs_po.clickSubmitButton();
    }

    @Then("I should be presented a successful contact us submission massage")
    public void i_should_be_presented_a_successful_contact_us_submission_massage() throws InterruptedException {
        contactUs_po.validate_Submit_Massage();
    }
}
