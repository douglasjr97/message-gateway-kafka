package br.com.nerak.apipayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = "br.com.nerak.api_payment.entity")
public class ApiPaymentApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiPaymentApplication.class, args);
	}

}
