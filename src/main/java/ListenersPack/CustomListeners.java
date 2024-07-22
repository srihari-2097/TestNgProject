package ListenersPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub
        System.out.println("Finish Test execution........" + arg0.getName());
    }

    public void onStart(ITestContext arg0) {
        System.out.println("Starts Test execution........" + arg0.getName());

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestFailure(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test Failed....." + arg0.getName());
    }

    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test Skipped....." + arg0.getName());
    }

    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Starts Test....." + arg0.getName());
    }

    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub
    }
}