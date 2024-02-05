package com.dbaesic.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;

/**
 * Configuration class for OpenAPI documentation.
 * @author Amiel De Los Reyes
 */
@Configuration
public class OpenAPIConfig {

    /**
     * Defines custom OpenAPI documentation.
     *
     * @return OpenAPI instance with custom information.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Dbaesic Apparel API")
                        .description("Rest API of the DBaesic Apparel application. It contains CRUD functionalities for a comprehensive e-commerce.")
                        .contact(new Contact()
                                .name("Developer: Amiel De Los Reyes")
                                .url("https://github.com/AmielDeLosReyes")));
    }
}
