package features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 *
 */
public class GridStepDefs {


    private GridHub gridHub;
    private URL hubURL;
    private URLConnection connection;

    @Given("^I perform a selenium test$")
    public void I_perform_a_selenium_test() throws Throwable {
        gridHub = new GridHub();
        assertTrue(gridHub != null);
    }

    @When("^I contact the hub$")
    public void I_contact_the_hub() throws Throwable {

        hubURL = gridHub.getURL();

        if (hubURL != null) {

            try {
                connection = hubURL.openConnection();
            } catch (IOException e) {
                fail();
            }

        } else {
            fail();
        }

        if (connection  != null) {
            try {
                connection.connect();
            } catch (IOException e) {
                fail();
            }
        } else {
            fail();
        }
    }

    @Then("^I should receive a reply from hub$")
    public void I_should_receive_a_reply_from_hub() throws Throwable {
        String contentType = null;

        try {
            contentType = connection.getContentType();
        } catch (Exception e) {
            fail();
        }

        assertEquals("application/json;charset=UTF-8", contentType);

    }

    @When("^I request a \"([^\"]*)\" driver$")
    public void I_request_a_driver(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I should be able to use \"([^\"]*)\" driver$")
    public void I_should_be_able_to_use_driver(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

}
