package pages;

import brower.Brower;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
public class Homepage {
    @FindBy(id="txtUsername") private WebElement userName;
    @FindBy(id="txtPassword") private WebElement password;
    @FindBy(id="btnLogin") private WebElement loginButton;

    public void login() throws IOException {
        userName.sendKeys(Brower.getPropertyValue("username"));
        password.sendKeys(Brower.getPropertyValue("password"));
        loginButton.sendKeys(Brower.getPropertyValue("loginButton"));

    }


}
