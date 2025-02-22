import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class DownloadUploadFileExample {
    WebDriver driver;

    @BeforeMethod
    public void openFileTestsPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void downloadFile() throws InterruptedException {
        driver.get("https://www.leafground.com/file.xhtml");
        WebElement downloadBtn= driver.findElement(By.id("j_idt93:j_idt95"));
        downloadBtn.click();
        Thread.sleep(3000);

        File file1=new File("C:\\Users\\Geethma\\Downloads");
        File[] totalFiles=file1.listFiles();

        for (File findFile:totalFiles){
            if (findFile.getName().equals("TestLeaf Logo.png")){
                System.out.println("File is downloaded...");
                break;
            }
        }

    }

    @Test
    public void uplaodFileTest(){
        driver.get("https://www.leafground.com/file.xhtml");

    }
}
