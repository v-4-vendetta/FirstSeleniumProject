package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public final String emailAddress = "txtUserName";
    public final String btnLoginButton = "btnLogin";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
