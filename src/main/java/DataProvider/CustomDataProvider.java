package DataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        return new Object[][]{{"Username@email.com", "password"}, {"username1@email.com", "Password1"}, {"username2@email.com", "password2"}};
    }

    @DataProvider(name = "HrmLoginData")
    public Object[][] getHrmLoginData() {
        return new Object[][]{{"Admin", "admin123"}};
    }
}
