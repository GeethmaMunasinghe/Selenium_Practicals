import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorExample {
    WebDriver driver;

    @BeforeMethod
    public void openJSExecutorPage(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

    }

    @Test
    public void JSExecutorTests(){
        JavascriptExecutor executor= (JavascriptExecutor) driver;

        //Get an alert box in to Web page using JavaScript
        executor.executeScript("alert('Hello World');");


    }

}
