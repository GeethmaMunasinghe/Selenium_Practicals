package web_table;

import org.openqa.selenium.By;
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
        //how many rows in the table
        int rowCount=webDriver.findElements(By.xpath("//table[@id='productTable']/tbody/tr")).size();
        System.out.println("Rows Count: "+rowCount);

        //how many columns in the table
        int columnCount=webDriver.findElements(By.xpath("//table[@id='productTable']/thead/tr/th")).size();
        System.out.println("Column Count: "+columnCount);

        //retrieve the specific row/column data
        String value=webDriver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[3]/td[3]")).getText();
        System.out.println("Specific row/column data: "+value);

        //retrieve all the data from the table
        for(int i=1;i<=rowCount;i++){           //rows
            for (int j=1;j<columnCount;j++){   //columns
                String tblData=webDriver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.println(tblData+" ");
            }
            System.out.println(); //for the line break
        }

        //print ID and Name only
        for (int i=1;i<=rowCount;i++){
            String tblID=webDriver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+i+"]/td[1]")).getText();
            String tblProductName=webDriver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+i+"]/td[2]")).getText();

            System.out.println("Table ID: "+tblID+"Product Name is : "+tblProductName);
        }

    }


}
