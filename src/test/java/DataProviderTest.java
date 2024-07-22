import org.testng.annotations.DataProvider;
import DataProvider.CustomDataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "LoginDataProvider",dataProviderClass = CustomDataProvider.class)
    public void Login(String email, String password) {
        System.out.println(email);
        System.out.println(password);
    }


}
