import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void JSExecutorTests() throws InterruptedException {
        JavascriptExecutor executor= (JavascriptExecutor) driver;

        //Get an alert box in to Web page using JavaScript
        //executor.executeScript("alert('Hello World');");

        //Set a input value in a text box
            //method 01
        WebElement inputTextBox=driver.findElement(By.xpath("//input[@id='name']"));
        //executor.executeScript("arguments[0].value='Geethma Munasinghe';",inputTextBox);
            //method 02
        executor.executeScript("arguments[0].setAttribute('value','Geethma Munasinghe');",inputTextBox);

        Thread.sleep(4000);

        //Highlight element
        executor.executeScript("arguments[0].style.border='3px solid red';",inputTextBox);
        executor.executeScript("arguments[0].style.background='yellow';",inputTextBox);



    }

}
