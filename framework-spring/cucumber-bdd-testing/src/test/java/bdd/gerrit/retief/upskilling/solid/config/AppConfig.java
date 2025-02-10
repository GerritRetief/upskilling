// AppConfig.java
package gerrit.retief.upskilling.solid.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "gerrit.retief.upskilling.solid.service")
public class AppConfig {
}