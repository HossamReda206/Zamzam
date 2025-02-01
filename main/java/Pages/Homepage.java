package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends BasePage{
    public Homepage(WebDriver driver) {
        super(driver);
    }
    //Locators
    By FbIconLocator = By.cssSelector("i[class=\"fa fa-facebook\"]");
    By TwitterIconLocator = By.cssSelector("i[class=\"fa fa-twitter\"]");
    By LinkdIconLocator = By.cssSelector("i[class=\"fa fa-linkedin\"]");
    By YouIconLocator = By.cssSelector("i[class=\"fa fa-youtube-play\"]");
    By InstaIconLocator = By.cssSelector("i[class=\"fa fa-instagram\"]");
     By footerLocator = By.cssSelector("footer[class=\"main_footer\"]");
By CloseButton = By.cssSelector("button[id=\"linkLeadCaptureClose\"]");

//saerch locators
By SearchBarLocator = By.cssSelector("div[class=\"search_form form-motif\"]");
By SeptemFifteenLocator = By.xpath("//div[@class=\"flatpickr-days\"]/div[1]/span[15]");
    By SeptemTwenLocator = By.xpath("//div[@class=\"flatpickr-days\"]/div[1]/span[20]");
By FirstCityLocator = By.xpath("//ul[@id=\"ui-id-1\"]/li[1]");
By SearchCityLocator = By.cssSelector("input[id=\"HotelCity\"]");
By NoOfRoomsLocator = By.cssSelector("select[class=\"form_control paxdetail\"]");
By NationalityLocator = By.cssSelector("select[id=\"searchNationality\"]");
By RoomBarLocator = By.xpath("//div[@class=\"col-lg-2 col-md-6 col-12 pb-md-2  cst-pr-0\"]/div/div[1]");
By CalendarLocator = By.cssSelector("div[class=\"col-12 p-0\"]");
By SearchButton = By.cssSelector("button[id=\"searchBtn\"]");

    public void FacebookIcon() throws InterruptedException {
        click(FbIconLocator);

    }
    public void TwitterIcon() throws InterruptedException {
        click(TwitterIconLocator);

    }
    public void LinkidinIcon() throws InterruptedException {
        click(LinkdIconLocator);

    }
    public void YoutIcon() throws InterruptedException {
        click(YouIconLocator);

    }
    public void InstaIcon() throws InterruptedException {
        click(InstaIconLocator);

    }

    public void scrollToFooter() {
        scrollToElement(footerLocator);  // Calls the scroll method from BasePage
    }
    public void CloseBUttton() throws InterruptedException {
        click(CloseButton);
    }
    public void scrollToSaerch() {
        scrollToElement(SearchBarLocator);  // Calls the scroll method from BasePage
    }
    public void ChooseFirstDate() throws InterruptedException {
        click(SeptemFifteenLocator);
    }
    public void CityWrite(String City) throws InterruptedException {
       write(SearchCityLocator, City);
    }
    public void SelectFirstOption () throws InterruptedException {
        click(FirstCityLocator);
    }
    public void ChooseSecDate() throws InterruptedException {
        click(SeptemTwenLocator);
    }
    public void selectDay() throws InterruptedException {

        Select daySelect = new Select(driver.findElement(NoOfRoomsLocator));
        daySelect.selectByIndex(1);  // or use selectByValue or selectByIndex
    }

    public void ClickOnRoom() throws InterruptedException {
        click(RoomBarLocator);
    }
    public void Calendar() throws InterruptedException {
        click(CalendarLocator);
    }
    public void SelectNation() throws InterruptedException {
       click(NationalityLocator);
        Select NationSelect = new Select(driver.findElement(NationalityLocator));
        NationSelect.selectByVisibleText("Egypt");
    }

    public void Search() throws InterruptedException {
        click(SearchButton);

    }
    public Boolean IsFBButtonDisplayed(){
        WebElement FBButton = driver.findElement(FbIconLocator);
        return FBButton.isDisplayed();
    }
    public Boolean IsXButtonDisplayed(){
        WebElement XButton = driver.findElement(TwitterIconLocator);
        return XButton.isDisplayed();
    }
    public Boolean IsInstaButtonDisplayed(){
        WebElement InstaButton = driver.findElement(InstaIconLocator);
        return InstaButton.isDisplayed();
    }
    public Boolean IsLinkedinButtonDisplayed(){
        WebElement LinkedinButton = driver.findElement(LinkdIconLocator);
        return LinkedinButton.isDisplayed();
    }
    public Boolean IsYoutubeButtonDisplayed(){
        WebElement YoutuButt = driver.findElement(YouIconLocator);
        return YoutuButt.isDisplayed();
    }
    public Boolean IsSearchBarDisplayed(){
        WebElement SearchBar = driver.findElement(SearchBarLocator);
        return SearchBar.isDisplayed();
    }
}
