package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class InvoiceDetailsPage extends BasePage {

    private By invoiceLink = By.cssSelector("a[href=\"/invoice/0\"]");
    private By invoiceDetails = By.cssSelector("h2[class=\"mt-5\"]");
    private By hotelName = By.cssSelector("h4[class=\"mt-5\"]");
    private By invoiceDate = By.cssSelector("body > section > div > ul > li:nth-child(1)");
    private By dueDate = By.cssSelector("body > section > div > ul > li:nth-child(2)");
    private By invoiceNumber = By.cssSelector("h6[class=\"mt-2\"]");
    private By bookingCode = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(1) > td:nth-child(2)");
    private By customerDetails = By.cssSelector("body > section > div > div");
    private By room = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(2) > td:nth-child(2)");
    private By checkinDate = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(5) > td:nth-child(2)");
    private By checkoutDate = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(6) > td:nth-child(2)");
    private By stayCount = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(3) > td:nth-child(2)");
    private By stayAmount = By.cssSelector("body > section > div > table:nth-child(8) > tbody > tr:nth-child(4) > td:nth-child(2)");
    private By depositNow = By.cssSelector("body > section > div > table:nth-child(12) > tbody > tr > td:nth-child(1)");
    private By taxVat = By.cssSelector("body > section > div > table:nth-child(12) > tbody > tr > td:nth-child(2)");
    private By totalAmount = By.cssSelector("body > section > div > table:nth-child(12) > tbody > tr > td:nth-child(3)");

    public void getFirstItem(){
        click(invoiceLink);
        newTab();
    }

    public String validatePageInvoice(){
        return getValueByText(invoiceDetails);
    }

    public String hotelName(){
        return getValueByText(hotelName);
    }

    public String invoiceDate(){
        return positionText(getValueByText(invoiceDate),": ", 1);
    }

    public String dueDate(){
        return positionText(getValueByText(dueDate),": ", 1);
    }

    public String invoiceNumber(){
        return positionTextoStringSpecific(getValueByText(invoiceNumber), " ",1, 1);
    }

    public String bookingCode(){
        return getValueByText(bookingCode);
    }

    public String customerDetails(){
        return getValueByText(customerDetails).replace("\n", " ");
    }

    public String room(){
        return getValueByText(room);
    }

    public String checkinDate(){
        return getValueByText(checkinDate);
    }

    public String checkoutDate(){
        return getValueByText(checkoutDate);
    }

    public String stayCount(){
        return getValueByText(stayCount);
    }

    public String stayAmount(){
        return getValueByText(stayAmount);
    }

    public String depositNow(){
        return getValueByText(depositNow);
    }

    public String taxVat(){
        return getValueByText(taxVat)+".00";
    }

    public String totalAmount(){
        return getValueByText(totalAmount)+".00";
    }
}
