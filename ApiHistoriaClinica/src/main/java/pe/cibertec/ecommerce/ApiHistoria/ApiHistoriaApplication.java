package pe.cibertec.ecommerce.ApiHistoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiHistoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiHistoriaApplication.class, args);
	}

}
