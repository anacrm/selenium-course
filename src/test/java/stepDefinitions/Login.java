package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login extends Base_PO {


    //injecting given page Object on step definition class
    //what need to do: 1. dependency to POM file 2. inside the step definition class need to specify the class we intend to inject 3. then within the constructor of the set definition, we then need to add the following parameter

    //2
    private Login_PO login_po;

    //constructor (3)
    public Login(Login_PO login_po) {
        this.login_po = login_po;
    }

    //performing the actions
    @Given("I access the webdriver university login page")
    public void access_login_page() {
        login_po.navigateTO_WebDriverUniversity_Login_Page();
    }

    @When("I enter username {}")
    public void enter_username(String username) {
        login_po.setUsername(username);
    }

    @And("I enter a password {}")
    public void enter_a_password(String password) {
        login_po.setPassword(password);
    }

    @And("I click on login button")
    public void click_on_login_button() {
        login_po.clickLoginButton();
    }

    @Then("I should be presented with the successful login message")
    public void successful_message() throws InterruptedException {

     login_po.validate_SuccessfulLogin_Massage();
    }

    @Then("I should be presented with the unsuccessful login message")
    public void unsuccessful_login_message() throws InterruptedException {

        login_po.validate_UnsuccessfulLogin_Massage();
    }

    @Then("I should be presented with the following login validation message {}")
    public void message_validation(String expectedMessage) throws InterruptedException {

        waitForAlert_And_ValidateText(expectedMessage);
    }
}
