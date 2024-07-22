import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setup(String browser, String app) throws InterruptedException {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\TG1718\\IdeaProjects\\SampleMvnTestNgProject\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\TG1718\\IdeaProjects\\SampleMvnTestNgProject\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        driver.get(app);
        Thread.sleep(5000);
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    void logoTest() {
        WebElement element = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
        Assert.assertTrue(element.isDisplayed(), "Logo is displayed on the page");
    }

    @Test(priority = 2)
    void verifyHomepageTitle() {
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
