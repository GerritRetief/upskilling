package gerrit.retief.upskilling.solid.service;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloStepDefinitions {
    private HelloService helloService;
    private String message;

    @Given("^I have a (.*) HelloService - noAutowired$")
    public void i_have_a_english_hello_service_no_autowired(String language) {
        switch (language.toLowerCase()) {
            case "english":
                helloService = new EnglishHelloService();
                break;
            case "spanish":
                helloService = new SpanishHelloService();
                break;
            case "french":
                helloService = new FrenchHelloService();
                break;
            default:
                throw new IllegalArgumentException("Unsupported language: " + language);
        }
    }

    @When("^I request a hello message - noAutowired$")
    public void i_request_a_hello_message_no_autowired() {
        message = helloService.getHelloMessage();
    }

    @Then("^I should receive \"(.*)\" - noAutowired$")
    public void i_should_receive_no_autowired(String expectedMessage) {
        assertEquals(expectedMessage, message);
    }
}