package Screenshots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakeScreenshotExample {
    WebDriver driver;

    @BeforeMethod
    public void openWebPage(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml");
    }

    @Test
    public void takeScreenshotTest() throws IOException {
        //1) Capture screenshot of full page
        //D:\Level 4\L4 S1\Selenium Practice\Selenium_Practicals\selenium_learning\\Screenshots\\alert_full_web_page.png
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("path/to/screenshots/screenshot.png"); // Check this path
        FileUtils.copyFile(screenshot, destination);

        //2) Capture screenshot of section of a webpage
        WebElement section1PageElement=driver.findElement(By.xpath("//*[@id='j_idt88']/div/div[1]"));
        File source=section1PageElement.getScreenshotAs(OutputType.FILE);
        File target=new File("path/to/screenshots/alert_section_of_the_page.png");
        FileUtils.copyFile(source,target);

    }
}
