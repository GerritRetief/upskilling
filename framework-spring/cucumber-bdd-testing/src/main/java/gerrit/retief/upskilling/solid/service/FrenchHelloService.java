package gerrit.retief.upskilling.solid.service;

import org.springframework.stereotype.Service;

/**
 * LSP: Both services follow the contract of HelloService and can be used interchangeably.
 */
@Service
public class FrenchHelloService implements HelloService {
    @Override
    public String getHelloMessage() {
        return "Bonjour, Monde!";
    }
}