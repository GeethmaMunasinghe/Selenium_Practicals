import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {

    @Test
    public void googleTest(){
        WebDriver driver=new ChromeDriver(); //Trigger the test case
        driver.get("https://www.google.com/");
        driver.quit();
    }
}
