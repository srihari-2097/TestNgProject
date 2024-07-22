package paralleltesting;

import DataProvider.CustomDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class parallelTest2 {
    WebDriver driver;

    @Test(dataProvider = "HrmLoginData", dataProviderClass = CustomDataProvider.class)
    public void login(String UserName, String PassWord) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TG1718\\IdeaProjects\\SampleMvnTestNgProject\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PassWord);
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
