import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CalendarTestExample {
    WebDriver driver;

    @BeforeMethod
    public void OpenCalendarPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        Thread.sleep(3000);
    }

    @Test
    public void CalendarTest(){
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        //Method 01
       /* WebElement datePicker=driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("02/27/2025");*/

        //Method 02
        WebElement datePicker=driver.findElement(By.id("datepicker"));
        datePicker.click();

        selectFutureDate("2026","October","6");
        //selectPastDate("2024","May","8");

    }


    public void selectFutureDate(String year,String month,String day){
        while (true){
            String actualYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String actualMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            if (actualYear.equals(year)&& actualMonth.equals(month)){
                break;
            }else {
                driver.findElement(By.xpath("//a[@title='Next']")).click();
            }
        }

        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

        for (WebElement dateElement:allDates){
            if (dateElement.getText().equals(day)){
                dateElement.click();
                break;
            }
        }
    }

    public void selectPastDate(String year,String month,String day){
        while (true){
            String actualYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String actualMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            if (actualYear.equals(year)&& actualMonth.equals(month)){
                break;
            }else {
                driver.findElement(By.xpath("//a[@title='Prev']")).click();
            }
        }

        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

        for (WebElement dateElement:allDates){
            if (dateElement.getText().equals(day)){
                dateElement.click();
                break;
            }
        }
    }


}
