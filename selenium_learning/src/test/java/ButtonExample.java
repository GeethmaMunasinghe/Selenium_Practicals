import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExample {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage(){
        System.setProperty("webdriver.chrome.driver","D:\\Level 4\\L4 S1\\Selenium Practice\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        Dimension newSize=new Dimension(800,600);
        driver.manage().window().setSize(newSize);
        driver.get("https://www.leafground.com/button.xhtml");
    }

    @Test
    public void buttonTest(){
        //01. Click and confirm title
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
        String expectedTitle="Dashboard";
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Actual title same as expected");
        }else {
            System.out.println("Actual title not same as expected");
        }

        //02. Find the position of the submit button
        driver.navigate().back();
        WebElement getPosition=driver.findElement(By.id("j_idt88:j_idt94"));
        Point xyPoint=getPosition.getLocation();
        int x=xyPoint.getX();
        int y=xyPoint.getY();
        System.out.println("X position is: "+x+"Y position is: "+y);

        //03. Find the save button color
        WebElement buttoncolour=driver.findElement(By.id("j_idt88:j_idt96"));
        String color=buttoncolour.getCssValue("background-color");
        System.out.println("Button color is: "+color);

        //04. Find the height and width of button
        WebElement size=driver.findElement(By.id("j_idt88:j_idt98"));
        int height=size.getSize().getHeight(); //method chaining
        int width=size.getSize().getWidth();
        System.out.println("Height: "+height+"Width: "+width);

    }


}
