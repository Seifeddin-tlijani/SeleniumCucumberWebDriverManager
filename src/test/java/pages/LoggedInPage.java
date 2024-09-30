package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {


    public static String product_formalshoes="//*[text()='Formal Shoes']";
    public static String product_sportsshoes="//*[text()='Sports']";
    public static String product_sneakersshoes="//*[text()='Sneakers']";




    public static void visibility_product_formalshoes() throws InterruptedException{
        String actualproduct_fs=driver.findElement(By.xpath(product_formalshoes)).getText();
        assertEquals(actualproduct_fs,"Formal Shoes");

    }

    public static void visibility_product_sportsshoes()throws InterruptedException{
        String actualproduct_ss=driver.findElement(By.xpath(product_sportsshoes)).getText();
        assertEquals(actualproduct_ss,"Sports");



    }

    public static void visibility_product_sneakersshoes(){
        String actualproduct_s=driver.findElement(By.xpath(product_sneakersshoes)).getText();
        assertEquals(actualproduct_s,"Sneakers");


    }

}
