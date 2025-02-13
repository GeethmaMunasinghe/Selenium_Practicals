import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() throws InterruptedException {

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setBrowserVersion("122");
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");
        Thread.sleep(3000);
    }

    @Test
    public void textBoxTests(){
        //01. Type your name
        WebElement name=driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Geethma");

        //02. Append country to this city
        WebElement appendText=driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("Sri Lanka");


        //03. Verify if text box is disabled
        boolean enabled=driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is text box enabled? "+enabled);


        //04. Clear the typed text
        WebElement clearText=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        clearText.clear();

        //05. Retrieve the typed text
        WebElement retrieveText=driver.findElement(By.id("j_idt88:j_idt97"));
        String value=retrieveText.getAttribute("value");
        System.out.println(value);

        //06. Type email and Tab. Confirm control moved to next element
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("geethmamuna234555@gmail.com"+ Keys.TAB+"Confirmed Go to next element");


    }

}
