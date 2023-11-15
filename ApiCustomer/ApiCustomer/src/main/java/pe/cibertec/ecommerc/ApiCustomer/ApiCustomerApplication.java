package pe.cibertec.ecommerc.ApiCustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCustomerApplication.class, args);
	}

}
