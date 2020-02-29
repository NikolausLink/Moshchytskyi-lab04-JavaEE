package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyStarterClassConfig {

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "default")
    MyStarterClass myStarterClassDefault() {
        return new MyStarterClass("default");
    }

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "custom")
    MyStarterClass myStarterClassCustom() {
        return new MyStarterClass("custom");
    }
}
