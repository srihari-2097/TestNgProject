import org.testng.annotations.*;

import java.awt.desktop.SystemSleepEvent;

public class FirstTestCase {
    @BeforeTest
    void BeforeTest() {
        System.out.println("Before Test- First Test case");
    }

    @AfterTest
    void AfterTest() {
        System.out.println("After Test- First Test case");
    }

    @BeforeClass
    void BeforeClass() {
        System.out.println("Before Class -- First Test case");
    }

    @AfterClass
    void AfterClass() {
        System.out.println("After Class -- First Test case");
    }

    @BeforeMethod
    void setup() {
        System.out.println("Before every method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("After every method");
    }

    @Test(priority = 1)
    void login() {
        System.out.println("Login");
    }

    @Test(priority = 2)
    void tearDown() {
        System.out.println("Close browser");
    }

}
