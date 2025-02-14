import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownExample {
    WebDriver driver;

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
        List<WebElement>listofdropdown2values=driver.findElements(By.xpath(""));


    }
}
