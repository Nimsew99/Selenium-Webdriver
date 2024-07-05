package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);


        //driver.manage().window().setSize(new Dimension( 375, 812)); // manage the window size

        //select more than one element at once
        /*List<WebElement> links = driver.findElements(By.tagName("a"));// list of links with <a> </a>
        System.out.println("Number of link <a> elements: " + links.size());

        // Shifting Content -> Example 1: Menu Element
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List <WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of Menu Items: " + menuItems.size());

        WebElement inputsLink = driver.findElement(By.linkText("Inputs")); // find one element
        inputsLink.click();

        System.out.println(driver.getTitle());
        //driver.quit();*/
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

    /*public static void main(String[] args){
        BaseTests test = new BaseTests();
        test.setUp();
    }*/
}
