package pe.com.ecommerce.ApiMascota.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiMascotaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMascotaApplication.class, args);
	}

}
