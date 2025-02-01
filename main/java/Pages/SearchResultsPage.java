package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage{
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
    By FirstHotelLocator= By.cssSelector("button[id=\"bookBtn_1067450\"]");

    public void FirstHotel() throws InterruptedException {
        click(FirstHotelLocator);

    }
}
