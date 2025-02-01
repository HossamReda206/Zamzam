package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstHotelPage extends BasePage{
    public FirstHotelPage(WebDriver driver) {
        super(driver);
    }
    By CheckAvailabLocator = By.cssSelector("button[id=\"checkAvailabilityBtn\"]");
   By ErrorMsgLocator = By.cssSelector("h5[class=\"pt-3 pb-3\"]");

    public void CheckAvailab() throws InterruptedException {
        click(CheckAvailabLocator);

    }
    public void scrollToAvail() {
        scrollToElement(CheckAvailabLocator);  // Calls the scroll method from BasePage
    }
 public String ErrorMsg(){
        return returnText(ErrorMsgLocator);
 }
}
