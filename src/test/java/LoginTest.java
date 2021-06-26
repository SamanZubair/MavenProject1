import impactQa.ReadExcelData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

        public static WebDriver driver;
        public static String url = "https://the-internet.herokuapp.com/login";

        @BeforeMethod
        public void enterUrl(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

        @Test(dataProvider = "excel-data",dataProviderClass = ReadExcelData.class)
        public void titleTest(String username,String password) {
            System.out.println("DATATATTATATA  DAATAAA"+username+" ......"+password);
    }

        @Test
        public void textTest() {
        System.out.println("second test case second test caseeeee");
        Assert.assertTrue(true);
        }


        @AfterMethod
        public void deleteAllCookies(){
        System.out.println("After method called");
        driver.quit();
    }

}
