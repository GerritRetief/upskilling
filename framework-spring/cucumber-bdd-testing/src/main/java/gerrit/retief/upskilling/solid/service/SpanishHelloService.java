package gerrit.retief.upskilling.solid.service;

import org.springframework.stereotype.Service;

/**
 * LSP: Both services follow the contract of HelloService and can be used interchangeably.
 */
@Service
public class SpanishHelloService implements HelloService {
    @Override
    public String getHelloMessage() {
        return "¡Hola, Mundo!";
    }
}