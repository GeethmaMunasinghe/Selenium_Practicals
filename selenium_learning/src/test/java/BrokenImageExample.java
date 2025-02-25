import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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
        List<WebElement> images=driver.findElements(By.xpath("//div[@class='example']/img"));

        int i=1;
        for (WebElement image:images){
            if (image.getAttribute("naturalWidth").equals("0")){
                System.out.println("Image " + i +" is Broken");
            }else {
                System.out.println("Image " + i + " is not Broken");
            }
            i++;
        }
    }

}
