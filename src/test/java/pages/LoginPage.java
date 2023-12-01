package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class LoginPage extends BasePage {
    private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
    private By fieldUsername = By.cssSelector("input[name=\"username\"]");
    private By fieldPassword = By.cssSelector("input[name=\"password\"]");
    private By btnLogin = By.id("btnLogin");
    private By loginPage = By.cssSelector("h1");
    private By invoiceListPage = By.cssSelector("h2");
    private By alertDanger = By.cssSelector(".alert.alert-danger.mt-3");

    public void open(){
        driver.get(url);
    }

    public String validatePageLogin(){
        return getValueByText(loginPage);
    }

    public void setUsername(String username){
        fill(fieldUsername, username);
    }

    public void setPassword(String password){
        fill(fieldPassword, password);
    }

    public void clickButton(){
        click(btnLogin);
    }

    public String validateInvoiceListPage(){
       return getValueByText(invoiceListPage);
    }

    public String alertDanger(){
        return getValueByText(alertDanger);
    }
}
