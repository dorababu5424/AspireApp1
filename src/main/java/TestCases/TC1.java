package TestCases;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class TC1 extends BaseClass {


    @Test(priority = 1)
    public void Tc1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys("user@aspireapp.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@sp1r3app");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
    }

    @Test(priority = 2)
    public void Tc2() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//div[text()='Inventory']")).click();
        driver.findElement(By.xpath("(//a[@class='dropdown-toggle o-no-caret o_menu_header_lvl_1'])[2]")).click();
        driver.findElement(By.xpath("//span[text()='Products']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary o-kanban-button-new']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("NewProduct4");
        driver.findElement(By.xpath("//button[@class='btn btn-primary o_form_button_save']")).click();
        driver.findElement(By.xpath("//a[@title='Applications']")).click();
        Thread.sleep(4000);
    }

    @Test(priority = 3)
    public void Tc3() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;

        driver.findElement(By.xpath("//div[text()='Manufacturing']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary o_list_button_add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='o_input ui-autocomplete-input'])[1]")).sendKeys("tp20220117000630");
//        Thread.sleep(4000);
        Robot r = new Robot();
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(4000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(6000);


        driver.findElement(By.xpath("//span[text()='Confirm']")).click();
        Thread.sleep(4000);
      WebElement markAsDone = driver.findElement(By.xpath("//span[text()='Mark as Done']"));
     String textmark = markAsDone.getText();
        Assert.assertEquals(textmark,textmark.contains("M"));

        markAsDone.click();
        driver.findElement(By.xpath("//span[text()='Apply']")).click();



    }
}
