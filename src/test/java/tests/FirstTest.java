package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;


public class FirstTest {

    private WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeEach
    void setup(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        homePage = new HomePage(webDriver);
        loginPage = new LoginPage(webDriver);
        webDriver.get("https://www.hepsiburada.com");
    }

    @Test
    public void LoginTest() {
        homePage.WaitForResponse(homePage.Account);
        homePage.ClickButton(homePage.Account);
        homePage.WaitForResponse(homePage.LoginButton);
        homePage.ClickButton(homePage.LoginButton);

        loginPage.WaitForResponse(loginPage.emailAddress);
        loginPage.WriteText(loginPage.emailAddress, "mahir.nazli@gmail.com");
        loginPage.WaitForResponse(loginPage.btnLoginButton);
        loginPage.ClickButton(loginPage.btnLoginButton);
    }

//    @Test
//    public void ProductSearch() {
//        homePage.WaitForResponseCSS(homePage.productSearch);
//        homePage.WriteTextCSS(homePage.productSearch, "Araba");
//        homePage.PressEnter(homePage.productSearch, Keys.ENTER);
//    }
    @AfterEach
    void TearDown(){
        webDriver.close();
    }
}
