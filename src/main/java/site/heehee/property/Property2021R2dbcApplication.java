package site.heehee.property;

import io.r2dbc.spi.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import site.heehee.property.model.Customer;
import site.heehee.property.repository.CustomerRepository;

import java.time.Duration;
import java.util.Arrays;

@SpringBootApplication
public class Property2021R2dbcApplication {

    private static final Logger log = LoggerFactory.getLogger(Property2021R2dbcApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Property2021R2dbcApplication.class, args);
    }

/*    @Bean
    ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {

        ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(connectionFactory);
        initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));

        return initializer;
    }*/


}
