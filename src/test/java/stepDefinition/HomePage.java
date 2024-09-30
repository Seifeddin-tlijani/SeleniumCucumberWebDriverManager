package stepDefinition;
import static pages.HomePage.*;

import io.cucumber.java.en.Given;

public class HomePage {



    @Given("User navigates to login page")
    public void user_navigates_to_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();

    }



}
