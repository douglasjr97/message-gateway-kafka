package br.com.nerak.apipayment.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI().info(new Info()
                .title("Api Payment")
                .description("Api Payment Slip")
                .contact(new Contact().name("Douglas Falcão").email("falcao@gmail.com"))
                .version("1.0.0")
        );
    }
}
