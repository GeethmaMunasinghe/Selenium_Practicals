import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class JavaScriptExecutorExample {
    WebDriver driver;

    @BeforeMethod
    public void openJSExecutorPage(){
        driver=new ChromeDriver();


    }

}
