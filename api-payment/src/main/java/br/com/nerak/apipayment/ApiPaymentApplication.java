package br.com.nerak.apipayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ApiPaymentApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiPaymentApplication.class, args);
	}

}
