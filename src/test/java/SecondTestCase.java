import org.testng.Assert;
import org.testng.annotations.*;

public class SecondTestCase {

    @BeforeGroups("Group")
    void BeforeGroup() {
        System.out.println("Before Group");
    }

    @AfterGroups("Group")
    void AfterGroup() {
        System.out.println("After Group");
    }

    @BeforeSuite
    void BeforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    void AfterSuite() {
        System.out.println("After Suite");
    }

    @BeforeClass
    void BeforeClass() {
        System.out.println("Before Class -- Second Test case");
    }

    @AfterClass
    void AfterClass() {
        System.out.println("After Class -- Second Test case");
    }

    @BeforeMethod
    void BeforeMethod() {
        System.out.println("Before every method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("After every method");
    }

    @Test(groups = {"Group"})
    void setup() {
        System.out.println("Open Browser -  Second Testcase");
    }

    @Test
    void login() {
        System.out.println("Login in Amazon");
    }

    @Test(groups = {"Group"})
    void tearDown() {
        System.out.println("Close browser - Second Testcase");
    }
}
