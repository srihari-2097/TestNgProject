import org.testng.annotations.Test;

public class GroupingTests {

    @Test(groups = {"regression"})
    void test1() {
        System.out.println("This is Test1");
    }

    @Test(groups = {"regression"})
    void test2() {
        System.out.println("This is Test2");
    }

    @Test(groups = {"regression","sanity"})
    void test3() {
        System.out.println("This is Test3");
    }

    @Test(groups = {"sanity"})
    void test4() {
        System.out.println("This is Test4");
    }

    @Test(groups = {"sanity"})
    void test5() {
        System.out.println("This is Test");
    }
}
