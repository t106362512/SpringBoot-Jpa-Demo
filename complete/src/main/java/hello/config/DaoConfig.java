package hello.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"hello.model"})
@EnableJpaRepositories(basePackages = "hello.repository")
public class DaoConfig {
}
