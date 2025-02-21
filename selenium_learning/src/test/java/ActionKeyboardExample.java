import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionKeyboardExample {
    WebDriver driver;

    @BeforeMethod
    public void KeyBoardOperationTestsBrowserOpen(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void KeyBoardActionTest1() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement googleSearchTextBox=driver.findElement(By.name("q"));
        googleSearchTextBox.sendKeys("Welcome");

        Actions actions=new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

        Thread.sleep(5000);

        actions.keyDown(Keys.SHIFT)
                .sendKeys("Writing capital sentence...").perform();
        Thread.sleep(5000);

        actions.keyUp(Keys.SHIFT)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .keyDown(Keys.CONTROL)
                .sendKeys("x")
                .build().perform();

    }

    @Test
    public void KeyBoardActionTest2(){

    }
}
