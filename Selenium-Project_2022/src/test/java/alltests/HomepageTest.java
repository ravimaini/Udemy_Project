package alltests;

import brower.Brower;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

public class HomepageTest {
    WebDriver driver;
    @BeforeMethod
    public void setup() throws IOException {
      driver=  Brower.getDriver();
      driver.navigate().to(Brower.getPropertyValue("url"));
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
}
