package stepDefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;


public class LoginPage {



    @When("User successfully enters the login details")
    public void user_successfully_the_login_details() throws InterruptedException {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }



}
