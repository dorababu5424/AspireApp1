package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.Date;

public class BaseClass {


    public static WebDriver driver;

    @BeforeSuite
    public void SuiteStarted(){
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println("*******************Test Suite Started********************");
    }
        @BeforeClass
    public  void StepUp() throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dorab\\AppCRM\\ApirseApp\\Drivers\\chromedriver.exe");

          //  WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://aspireapp.odoo.com/web#cids=1&home=");
        Thread.sleep(2000);

    }

    @AfterClass
    private void teardown() {
        // TODO Auto-generated method stub
        driver.close();
        driver.quit();
    }

    @AfterSuite
    public void SuiteEnded(){
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println("*******************Test Suite Endes********************");
    }
}
