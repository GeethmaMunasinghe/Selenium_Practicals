import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImageExample {
    WebDriver driver;

    @BeforeMethod
    public void OpenImagePage(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void findBrokenImageTest(){
        driver.get("https://the-internet.herokuapp.com/broken_images");

    }

}
