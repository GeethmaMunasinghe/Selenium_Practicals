import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameExample {
    WebDriver driver;

    @BeforeMethod
    public void frameTestPage(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/frame.xhtml");

    }

    @Test
    public void frameTest(){
        //Click me (inside frame)

        driver.switchTo().frame(0);
        WebElement button1=driver.findElement(By.xpath("//button[@id='Click']"));
        button1.click();

        String afterClickButtonText=button1.getText();
        System.out.println("After click inside frame button text "+afterClickButtonText);

    }

}
