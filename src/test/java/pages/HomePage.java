package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public final String Account = "myAccount";
    public final String LoginButton = "login";
    public final String productSearch = "[placeholder='Ürün, kategori veya marka ara']";
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
