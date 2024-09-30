package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {



    public static String hamburger_menu_xpath="//*[@id=\"menuToggle\"]/input";
    public  static String signIn_link_xpath="//*[@id=\"menu\"]/a[2]/li";

    public static String OnlineProductsPage_linkText="Online Products";


    public static void click_hamburger_menu() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_link_xpath)).click();
    }


    public static void click_OnlineProducts_link()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.linkText(OnlineProductsPage_linkText)).click();
    }




}
