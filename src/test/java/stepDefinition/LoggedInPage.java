package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.LoggedInPage.*;

public class LoggedInPage {

    @Then("User should  be able to view product category page")
    public void user_should_able_to_view_category_page() throws InterruptedException{
        visibility_product_formalshoes();
        visibility_product_sportsshoes();
        visibility_product_sneakersshoes();

    }

}
