package kz.iitu.lw6_fw.lw6_fw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "kz.iitu.lw6_fw.lw6_fw")
@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "kz.iitu.lw6_fw.lw6_fw.repository")
public class SpringConfig {
}
