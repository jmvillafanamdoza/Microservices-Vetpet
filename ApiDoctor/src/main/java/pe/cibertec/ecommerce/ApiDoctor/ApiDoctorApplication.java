package pe.cibertec.ecommerce.ApiDoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDoctorApplication.class, args);
	}

}
