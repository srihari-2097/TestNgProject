import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test
    void startCar() {
        Assert.fail();
        System.out.println("Car Started");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar() {
        System.out.println("Driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void parkCar() {
        System.out.println("Car Parked");
    }

    @Test(dependsOnMethods = {"startCar", "driveCar", "parkCar"},alwaysRun = true)
    void stopCar() {
        System.out.println("Car Stopped");
    }
}
