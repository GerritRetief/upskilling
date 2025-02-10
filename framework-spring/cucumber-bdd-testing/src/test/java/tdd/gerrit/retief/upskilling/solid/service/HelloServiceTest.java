package gerrit.retief.upskilling.solid.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceTest {
    @Test
    void testEnglishHelloService() {
        HelloService service = new EnglishHelloService();
        assertEquals("Hello, World!", service.getHelloMessage());
    }

    @Test
    void testSpanishHelloService() {
        HelloService service = new SpanishHelloService();
        assertEquals("¡Hola, Mundo!", service.getHelloMessage());
    }

    @Test
    void testFrenchHelloService() {
        HelloService service = new FrenchHelloService();
        assertEquals("Bonjour, Monde!", service.getHelloMessage());
    }
}