package gerrit.retief.upskilling.solid.controller;

import gerrit.retief.upskilling.solid.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SRP(Single responsibility principle): This controller is only responsible for handling HTTP requests.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    private final HelloService helloService;

    /**
     * Spring Boot automatically injects dependencies if the class has only one constructor, even without @Autowired.
     * Your code will still work fine because Spring will assume that HelloService should be injected.
     *
     * @param helloService
     */
    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String sayHello() {
        return helloService.getHelloMessage();
    }
}