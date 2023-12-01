package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import runner.base_class.BaseSteps;

public class LoginSteps extends BaseSteps {

    LoginPage page = new LoginPage();

    @Given("the main page loaded")
    public void theMainPageLoaded() {
        page.open();
        Assert.assertEquals(page.validatePageLogin(), "Login");
        screenshot();
    }

    @When("the following field Username: {string}")
    public void theFollowingFieldUsername(String string) {
        page.setUsername(string);
        screenshot();
    }

    @And("the following field Password: {string}")
    public void theFollowingFieldPassword(String string) {
        page.setPassword(string);
        screenshot();
    }

    @And("the click the button Login")
    public void theClickTheButtonLogin() {
        page.clickButton();
    }

    @Then("the application show the page Invoice List")
    public void theApplicationShowThePageInvoiceList() {
        Assert.assertEquals(page.validateInvoiceListPage(), "Invoice List");
        screenshot();
    }

    @Then("the application shows the message: {string}")
    public void theApplicationShowsTheMessage(String alertExpected) {
        Assert.assertEquals(page.alertDanger(), alertExpected);
        screenshot();
    }
}
