package pe.cibertec.ecommerc.ApiCita.ApiCita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiCitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCitaApplication.class, args);
	}

}
