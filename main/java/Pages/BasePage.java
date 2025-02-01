package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
   public Actions actions;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        PageFactory.initElements(driver, this);
    }
    public void click(By locator) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(locator).click();
    }
    public void write(By locator, String text){
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }
    public String returnText(By locator){
        return driver.findElement(locator).getText();


    }
    public void scrollToElement(By locator) {
        Actions actions = new Actions(driver);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.moveToElement(element).perform();
    }

}
