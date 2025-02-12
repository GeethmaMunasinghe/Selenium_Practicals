import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    //Open Google
    //Go to Google Home Page

    public static void main(String[] args) {
        //stage 01: setProperty
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //Trigger the test case
        driver.get("https://www.google.com/");

    }
}
