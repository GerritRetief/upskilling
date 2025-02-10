package gerrit.retief.upskilling.solid.service;

import gerrit.retief.upskilling.solid.config.CucumberSpringConfiguration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = CucumberSpringConfiguration.class)
public class HelloServiceStepDefinitions {

    @Autowired
    private FrenchHelloService frenchHelloService;

    @Autowired
    private SpanishHelloService spanishHelloService;

    @Autowired
    private EnglishHelloService englishHelloService;

    private HelloService helloService;
    private String message;

    @Given("^I have a \"(.*)\" HelloService - Autowired$")
    public void i_have_a_hello_service(String language) {
        if ("French".equals(language)) {
            helloService = frenchHelloService;
        } else if ("Spanish".equals(language)) {
            helloService = spanishHelloService;
        } else if ("English".equals(language)) {
            helloService = englishHelloService;
        } else {
            throw new IllegalArgumentException("Unsupported hello service type: " + language);
        }
    }

    @When("^I request a hello message - Autowired$")
    public void i_request_a_hello_message() {
        message = helloService.getHelloMessage();
    }

    @Then("^I should receive \"(.*)\" - Autowired$")
    public void i_should_receive(String expectedMessage) {
        assertEquals(expectedMessage, message);
    }
}