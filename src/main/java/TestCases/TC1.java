package TestCases;

import Base.BaseClass;
import PageObjects.PageElements;
import Utilites.SeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class TC1 extends BaseClass {


    public SeleniumMethods sm = new SeleniumMethods();

    @Test(priority = 1)
    public void Tc1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        PageElements pe = new PageElements();
        sm.SendData(pe.getEmail(),"user@aspireapp.com");

        sm.SendData(pe.getPassword(),"@sp1r3app");

        sm.ClickButton(pe.getLoginButton());

        Thread.sleep(4000);
    }

    @Test(priority = 2)
    public void Tc2() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        PageElements pe = new PageElements();
        sm.ClickButton(pe.getInventoryBtn());

        sm.ClickButton(pe.getMenuBtn());

        sm.ClickButton(pe.getProductBtn());

        sm.ClickButton(pe.getProductClck());

        sm.SendData(pe.getProductName(),"NewProduct4");

        sm.ClickButton(pe.getProductSave());

        sm.ClickButton(pe.getApplicationClck());

        Thread.sleep(4000);
    }

    @Test(priority = 3)
    public void Tc3() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;

        PageElements pe = new PageElements();
        sm.ClickButton(pe.getManufacturingBtn());

        Thread.sleep(2000);

        sm.ClickButton(pe.getMenuBtn2());

        Thread.sleep(2000);

        sm.SendData(pe.getProductSend(),"tp20220117000630");

        Robot r = new Robot();

        Thread.sleep(4000);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(6000);

        sm.ClickButton(pe.getConfromBtn());

        Thread.sleep(4000);

      WebElement markAsDone = pe.getDoneBtn();
     String textmark = markAsDone.getText();
     System.out.println(textmark);
        Assert.assertEquals(textmark,textmark.contains("M"));
        Thread.sleep(2000);

        sm.ClickButton(markAsDone);



    }
}
