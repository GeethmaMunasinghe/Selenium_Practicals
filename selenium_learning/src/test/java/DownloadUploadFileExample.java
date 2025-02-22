import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadUploadFileExample {
    WebDriver driver;

    @BeforeMethod
    public void openFileTestsPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void downloadFile(){
        driver.get("https://www.leafground.com/file.xhtml");

    }
}
