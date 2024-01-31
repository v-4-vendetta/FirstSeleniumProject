package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver webDriver;
    public BasePage(WebDriver driver) {
        this.webDriver = driver;
    }

    public void WaitForResponse(String elementId) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    public void WaitForResponseCSS(String elementId) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(100L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
    }

    public void ClickButton(String elementId) {
        webDriver.findElement(By.id(elementId)).click();
    }

    public void WriteText(String elementId, String emailAddress) {
        webDriver.findElement(By.id(elementId)).sendKeys(new String[] { emailAddress });
    }

    public void WriteTextCSS(String elementId, String text) {
        webDriver.findElement(By.cssSelector(elementId)).sendKeys(new String[] { text });
    }

    public void PressEnter(String elementId, Keys keyboard) {
        webDriver.findElement(By.cssSelector(elementId)).sendKeys(new String[] {String.valueOf(keyboard)});
    }
}
