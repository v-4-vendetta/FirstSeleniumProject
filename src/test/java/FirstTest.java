import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest {

    WebDriver webDriver;

    @BeforeEach
    public void Setup(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test
    public void LoginTest() throws InterruptedException{
        webDriver.get("https://www.hepsiburada.com");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myAccount")));
        webDriver.findElement(By.id("myAccount")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
//        Thread.sleep(500);
        webDriver.findElement(By.id("login")).click();
//        Thread.sleep(2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtUserName")));
        webDriver.findElement(By.id("txtUserName")).sendKeys(new String[] { "mahir.nazli@gmail.com" });
//        Thread.sleep(500);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnLogin")));
        webDriver.findElement(By.id("btnLogin")).click();
    }

    @AfterEach
    void TearDown(){
        webDriver.close();
    }
}
