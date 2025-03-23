package selenium_wait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitDemo {
    WebDriver driver;

    @BeforeMethod
    public void openTablePage(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //till the driver.quit this will affect.here exception will hold
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/waits.xhtml");
    }

    @Test
    public void fluentWaitTest(){
        //Declaration(Define fluent wait)
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
                                .withTimeout(Duration.ofSeconds(30))       //maximum time to wait
                                .pollingEvery(Duration.ofSeconds(5))       //frequency to check the condition
                                .ignoring(NoSuchElementException.class);   //ignore specific condition


        driver.findElement(By.xpath(" //button[@id='j_idt87:j_idt89']")).click();
        String newBtnText=driver.findElement(By.xpath("//button[@id='j_idt87:j_idt90']/span")).getText();
        System.out.println("New button text is: "+newBtnText);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
