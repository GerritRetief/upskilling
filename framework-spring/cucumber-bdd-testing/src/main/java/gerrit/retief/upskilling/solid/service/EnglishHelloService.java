package gerrit.retief.upskilling.solid.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


/**
 * Liskov substitution principle: Both services follow the contract of HelloService and can be used interchangeably.
 */
@Primary
@Service
public class EnglishHelloService implements HelloService {
    @Override
    public String getHelloMessage() {
        return "Hello, World!";
    }
}