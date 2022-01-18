package Utilites;

import Base.BaseClass;
import org.openqa.selenium.WebElement;

public class SeleniumMethods extends BaseClass {

    public static void  SendData(WebElement web, String Data){

        web.sendKeys(Data);

    }

    public  static void ClickButton(WebElement Web1){

        Web1.click();

    }


}
