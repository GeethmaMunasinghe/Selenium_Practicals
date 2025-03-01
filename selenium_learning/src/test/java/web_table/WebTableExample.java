package web_table;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableExample {
    WebDriver webDriver;

    @BeforeMethod
    public void OpenTablePage(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();

    }

    @Test
    public void WebTableTest(){

    }


}
