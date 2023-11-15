package pe.cibertec.ecommerce.ApiCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class ApiCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCartApplication.class, args);
	}

}
