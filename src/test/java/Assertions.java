import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions {

    WebDriver driver;

    @BeforeClass
    void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TG1718\\IdeaProjects\\SampleMvnTestNgProject\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
    }

    @AfterClass
    void tearDown()
    {
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
