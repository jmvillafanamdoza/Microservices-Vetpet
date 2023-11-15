package pe.cibertec.ecommerce.ApiProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProductApplication.class, args);
	}

}
