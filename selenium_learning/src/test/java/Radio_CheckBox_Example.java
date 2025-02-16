import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Radio_CheckBox_Example {
    WebDriver driver;

    @BeforeMethod
    public void radio_checkbox_before_tests(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void radio_tests(){
        driver.get("https://www.leafground.com/radio.xhtml");
        boolean chromeradioOption=driver.findElement(By.id("j_idt87:console2:0")).isSelected();
        boolean firefoxadioOption=driver.findElement(By.id("j_idt87:console2:1")).isSelected();
        boolean safariradioOption=driver.findElement(By.id("j_idt87:console2:2")).isSelected();
        boolean edgeradioOption=driver.findElement(By.id("j_idt87:console2:3")).isSelected();

        if (chromeradioOption){
            String chromeText=driver.findElement(By.xpath("//label[@for='j_idt87:console2:0']")).getText();
            System.out.println("Default select radio button is: "+chromeText);
        } else if (firefoxadioOption) {
            String firefoxText=driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']")).getText();
            System.out.println("Default select radio button is: "+firefoxText);
        } else if (safariradioOption) {
            String safariText=driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
            System.out.println("Default select radio button is: "+safariText);
        } else if (edgeradioOption) {
            String edgeText=driver.findElement(By.xpath("//label[@for='j_idt87:console2:3']")).getText();
            System.out.println("Default select radio button is: "+edgeText);
        }

        //select the age group
        WebElement myAgeGroup=driver.findElement(By.id("j_idt87:age:0"));
        boolean isChecked=myAgeGroup.isSelected();
        if (!isChecked){
            //myAgeGroup.click();
            driver.findElement(By.xpath("//label[@for='j_idt87:age:0']")).click();
        }


    }

    @Test
    public void checkbox_tests(){
        driver.get("https://www.leafground.com/checkbox.xhtml");
        //Choose your favourite language
        List<WebElement> checkboxList=driver.findElements(By.xpath("//table[@id='j_idt87:basic']//label"));
        for (WebElement element:checkboxList){
            if (!(element.getText().equals("Others"))){
                element.click();
            }
        }

        for (int i=1;i<=checkboxList.size();i++){
            boolean checkboxStatus=driver.findElement(By.xpath("(//table[@id='j_idt87:basic']//input)[" + i+"]")).isSelected();
            System.out.println("Checkbox "+i+ "selected status is : "+checkboxStatus);
        }


    }
}
