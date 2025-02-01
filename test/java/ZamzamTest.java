import Pages.FirstHotelPage;
import Pages.Homepage;
import Pages.SearchResultsPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class ZamzamTest extends BaseTest{
    Faker fake = new Faker();
    SoftAssert soft = new SoftAssert();
    Homepage H;
    SearchResultsPage S;
    FirstHotelPage F;

    @Test

    public void TC_01() throws InterruptedException {
            reportTest = report.createTest("ZamZam Hotels Test");
        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
        driver.close();
H= new Homepage(driver);
        driver.switchTo().window(tabs.get(0));
        H.CloseBUttton();
 H.scrollToFooter();
 //Assert on social media icons
soft.assertTrue(H.IsFBButtonDisplayed());

        soft.assertTrue(H.IsYoutubeButtonDisplayed());
        soft.assertTrue(H.IsInstaButtonDisplayed());
        soft.assertTrue(H.IsLinkedinButtonDisplayed());
        soft.assertTrue(H.IsXButtonDisplayed());
        reportTest.pass("Social media icons displayed");
        //Click on facebook
 H.FacebookIcon();
 Thread.sleep(200);


        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"));
        reportTest.pass("Fb URL Contains Zamzam");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
//        //Twitter
        H.scrollToFooter();
        H.TwitterIcon();
        ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"));
        reportTest.pass("Twitter URL Contains Zamzam");
        driver.close();
        driver.switchTo().window(tabs3.get(0));

        //Linkedin
        H.scrollToFooter();
        H.LinkidinIcon();
        ArrayList<String> tabs4 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"));
        reportTest.pass("Linkedin URL Contains Zamzam");
        driver.close();
        driver.switchTo().window(tabs4.get(0));

        //Youtube
        H.scrollToFooter();
        H.YoutIcon();
        ArrayList<String> tabs5 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs5.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"));
        reportTest.fail("Youtube URL doesnt Contain Zamzam");
        driver.close();
        driver.switchTo().window(tabs5.get(0));

        //Instagram
        H.scrollToFooter();
        H.InstaIcon();
        ArrayList<String> tabs6 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs6.get(1));
        soft.assertTrue(driver.getCurrentUrl().contains("zamzam"));
        reportTest.pass("Twitter URL Contains Zamzam");
        driver.close();
        driver.switchTo().window(tabs6.get(0));

        //scrolling to Search
        H.scrollToSaerch();
        H.IsSearchBarDisplayed();
//Choose City
        H.CityWrite("makkah");
        Thread.sleep(200);
        H.SelectFirstOption();
        //choose dates
        H.Calendar();
H.ChooseFirstDate();
H.ChooseSecDate();
        //ChooseRooms
        H.ClickOnRoom();
        H.selectDay();
        H.SelectNation();
        H.Search();


S = new SearchResultsPage(driver);
soft.assertTrue(H.IsSearchBarDisplayed());
S.FirstHotel();

F = new FirstHotelPage(driver);
F.scrollToAvail();
F.CheckAvailab();
        System.out.println(F.ErrorMsg());
        soft.assertTrue(F.ErrorMsg().contains("We can’t find the page"));
        reportTest.pass("Error message is displayed");





















        soft.assertAll();
    }
}
