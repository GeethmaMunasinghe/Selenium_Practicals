
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ThirdStage {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver(); //Trigger the test case
        driver.get("https://www.google.com/");
        driver.quit();
    }
}
