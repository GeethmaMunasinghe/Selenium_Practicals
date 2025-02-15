import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownExample {
    WebDriver driver;

    @BeforeMethod
    public void openDropDownTestPage(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        Dimension newSize=new Dimension(800,600);
        driver.manage().window().setSize(newSize);
        driver.get("https://www.leafground.com/select.xhtml");
    }

    @Test
    public void dropDownTestPage() throws InterruptedException {
        WebElement dropdown=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select=new Select(dropdown);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Playwright");
        Thread.sleep(3000);

        //Get the number of dropdown options
        //Generics
        List<WebElement>listofOptions=select.getOptions();
        int size=listofOptions.size();
        System.out.println("Number of elements in dropdown: "+size);

        for (WebElement element:listofOptions){
            System.out.println(element.getText());
        }

        //Using sendkeys select dropdown value
        dropdown.sendKeys("Puppeteer");

        //selecting value in a Bootstrap dropdown
        WebElement dropdown2=driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
        dropdown2.click();
        List<WebElement>listofdropdown2values=driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
        for (WebElement element:listofdropdown2values){
            String dropdownValue=element.getText();
            if (dropdownValue.equals("USA")){
                element.click();
                break;
            }
        }


    }

    //Google search - pick a value from suggestions
    @Test
    public void googleSearchDropDown() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("palitha");
        Thread.sleep(2000);
        List<WebElement>googlesearchList=driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']"));
        System.out.println(googlesearchList.size());
        for (WebElement element:googlesearchList){
            System.out.println(element.getText());
        }

    }
    //Handle hidden auto suggestions drop down and search using DOM debugger trick

}
