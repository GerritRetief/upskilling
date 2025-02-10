package gerrit.retief.upskilling.solid.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AppConfig.class)
public class CucumberSpringConfiguration {
}