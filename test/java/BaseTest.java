import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    protected static ExtentReports report;
    protected static ExtentTest reportTest;

    @BeforeSuite
    public void SetUpR() {
        report = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(new File("Reports/report.html"));
        report.attachReporter(spark);
    }


    @BeforeTest
    public void setUp() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/main/resources/GIGHMMPIOBKLFEPJOCNAMGKKBIGLIDOM_6_9_0_0.crx")); // Load adblocker extension
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://zamzam.com/");
    }
    @AfterTest
    public void after() throws InterruptedException {
        Thread.sleep(2000);
driver.quit();
    }
    @AfterSuite
    public void tearDown() throws IOException {
        report.flush();
        Desktop.getDesktop().open(new File("Reports/report.html"));
    }
}