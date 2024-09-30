package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {


    public static String registration_xpath ="/html/body/center/h1";

    public static void visibility_user_registration_page(){
        String actualregistration=driver.findElement(By.xpath(registration_xpath)).getText();
        assertEquals(actualregistration,"User Registration Page");


    }
}
