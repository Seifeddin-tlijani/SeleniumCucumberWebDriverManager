package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.OnlineProductPage.click_formalshoesdropdown;
import static pages.OnlineProductPage.getText_formalshoes_firstvalue;


public class OnlineProductPage {



    @When("User clicks on Formal Shoes drop down")
    public void user_clicks_on_Formal_Shoes_drop_down() throws InterruptedException {
        click_formalshoesdropdown();

    }

    @Then("User should  be able to view the products")
    public void user_should_be_able_to_view_the_products() throws InterruptedException {
         getText_formalshoes_firstvalue();
         assertEquals("   Classic Cheltenham", getText_formalshoes_firstvalue());
    }






}
