/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerc.ApiCustomer.feignclients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.cibertec.ecommerc.ApiCustomer.model.Cita;


/**

 */
@FeignClient(name = "ApiCita", url = "http://localhost:8003") 
public interface CitaFeignClient {
    
    @PostMapping("/api/v1/cita")
    Cita save(@RequestBody Cita cita); 
           
    @GetMapping("/api/v1/cita/byCustomer/{customerId}")
    List<Cita> getCitas(@PathVariable("customerId") int customerId);
    
}

/*
@FeignClient(name = "ApiProductv2", url = "http://localhost:8002")
//@RequestMapping("api/v1/product")
public interface ProductFeignClient {
    
    @PostMapping("/api/v1/product")
    Product save (@RequestBody Product product);
    
        
    @GetMapping("/api/v1/product/byuser/{userId}")
    List<Product> getProducts(@PathVariable("userId") int userId);
    
}


*/