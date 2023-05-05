package com.israel.startupapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("RESTful API with java 20 and Spring Boot 3.0.5")
                        .version("v1")
                        .description("startup-api uma api RESTFul criado durante o curso de REST API's RESTFul do 0 à AWS c. Spring Boot 3 Java e Docker")
                        .termsOfService("https://github.com/Israelpsilva8246")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://github.com/Israelpsilva8246")));
    }
}
