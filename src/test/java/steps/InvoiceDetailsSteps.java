package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.InvoiceDetailsPage;
import pages.LoginPage;
import runner.base_class.BaseSteps;

public class InvoiceDetailsSteps extends BaseSteps {

    LoginPage loginPage = new LoginPage();
    InvoiceDetailsPage page = new InvoiceDetailsPage();


    @Given("to click the Invoice Details link for the first item presented in the screen")
    public void toClickTheInvoiceDetailsLinkForTheFirstItemPresentedInTheScreen() {
        page.getFirstItem();
        screenshot();
    }

    @When("the application show the page Invoice Details")
    public void theApplicationShowThePageInvoiceDetails() {
        Assert.assertEquals(page.validatePageInvoice(), "Invoice Details");
        screenshot();
    }

    @And("validation the Hotel Name: {string}")
    public void validationTheHotelName(String msgExpected) {
        Assert.assertEquals(msgExpected,page.hotelName());
        screenshot();
    }

    @And("validation the Invoice Date: {string}")
    public void validationTheInvoiceDate(String msgExpected) {
        Assert.assertEquals(msgExpected, page.invoiceDate());
        screenshot();
    }

    @And("validation the Due Date: {string}")
    public void validationTheDueDate(String msgExpected) {
        Assert.assertEquals(msgExpected, page.dueDate());
        screenshot();
    }

    @And("validation the Invoice Number: {string}")
    public void validationTheInvoiceNumber(String msgExpected) {
        Assert.assertEquals(msgExpected, page.invoiceNumber());
        screenshot();
    }

    @And("validation the Booking Code: {string}")
    public void validationTheBookingCode(String msgExpected) {
        Assert.assertEquals(msgExpected, page.bookingCode());
        screenshot();
    }

    @And("validation the Customer Details: {string}")
    public void validationTheCustomerDetails(String msgExpected) {
        Assert.assertEquals(msgExpected, page.customerDetails());
        screenshot();
    }

    @And("validation the Room:{string}")
    public void validationTheRoom(String msgExpected) {
        Assert.assertEquals(msgExpected, page.room());
        screenshot();
    }

    @And("validation the Check In: {string}")
    public void validationTheCheckIn(String msgExpected) {
        Assert.assertEquals(msgExpected, page.checkinDate());
        screenshot();
    }

    @When("validation the Check Out: {string}")
    public void validationTheCheckOut(String msgExpected) {
        Assert.assertEquals(msgExpected, page.checkoutDate());
        screenshot();
    }

    @And("validation the Total Stay Count: {string}")
    public void validationTheTotalStayCount(String msgExpected) {
        Assert.assertEquals(msgExpected, page.stayCount());
        screenshot();
    }

    @And("validation the Total Stay Amount: {string}")
    public void validationTheTotalStayAmount(String msgExpected) {
        Assert.assertEquals(msgExpected, page.stayAmount());
        screenshot();
    }

    @And("validation the Deposit Now: {string}")
    public void validationTheDepositNow(String msgExpected) {
        Assert.assertEquals(msgExpected, page.depositNow());
        screenshot();
    }

    @And("validation the Tax&VAT: {string}")
    public void validationTheTaxVAT(String msgExpected) {
        Assert.assertEquals(msgExpected, page.taxVat());
        screenshot();
    }

    @And("validation the Total Amount: {string}")
    public void validationTheTotalAmount(String msgExpected) {
        Assert.assertEquals(msgExpected, page.totalAmount());
        screenshot();
    }
}
