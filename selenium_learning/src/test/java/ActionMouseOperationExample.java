import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionMouseOperationExample {
    WebDriver driver;

    @BeforeMethod
    public void mouseOperationTestsBrowserOpen(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void mouseOperationTests1() throws InterruptedException {
        driver.get("https://www.leafground.com/drag.xhtml");

        System.out.println("1. Move to an element operation...");
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("menuform:j_idt37")))
            .moveToElement(driver.findElement(By.id("menuform:j_idt38")))
                .moveToElement(driver.findElement(By.id("menuform:j_idt38"))).perform();

        System.out.println("2. Drag and drop operation...");
        WebElement from=driver.findElement(By.id("form:drag"));
        WebElement to=driver.findElement(By.id("form:drop"));

        actions.clickAndHold(from).moveToElement(to).release(to).perform();
        actions.dragAndDrop(from,to).perform();

        System.out.println("3. Slider operation...");
        WebElement sliderpoint1=driver.findElement(By.xpath("//div[@id='form:j_idt125']/span[1]"));
        System.out.println("Location of sliderpoint1 before moving: "+sliderpoint1.getLocation());
        actions.dragAndDropBy(sliderpoint1,50,0).perform();
        System.out.println("Location of sliderpoint1 after moving: "+sliderpoint1.getLocation());


    }
}
