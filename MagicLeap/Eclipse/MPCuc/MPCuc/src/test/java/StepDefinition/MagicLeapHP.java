package StepDefinition;

import java.net.MalformedURLException;

import Selenium.SeleniumFunctions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MagicLeapHP {

    SeleniumFunctions sf = new SeleniumFunctions();

    @Given("^user is on Magic Leap homepage$")
    public void user_is_on_magicleap_homepage() throws MalformedURLException,
            InterruptedException {
        sf.createDriver();
        sf.ishomepageDisplayed();
    }

    @When("^user fills out contact form and clicks on Submit button$")
    public void user_clicks_on_Submit_button() {
    	sf.fillOutContacform();
        sf.clickSubmitButton();
    }

    @Then("^the message Thanks See ya soon is displayed$")
    public void msg_is_displyed() {
        sf.isContactmsgDisplayed();;
    }

    @And("^refresh homepage$")
    public void refresh_homepage() {
    	sf.refreshHP();
    }
    
    @And("^user looks for Calling all developers$")
    public void user_looks_for_Calling_all_developers() throws Exception {
    	sf.txtIsnotDisplayed();
    	sf.teardown();
    	
}
    
}
