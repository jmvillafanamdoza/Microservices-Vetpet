package pe.cibertec.ecommerc.ApiCustomer.feignclients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.cibertec.ecommerc.ApiCustomer.model.Product;

@FeignClient(name = "ApiProductv2", url = "http://localhost:8002")
//@RequestMapping("api/v1/product")
public interface ProductFeignClient {
    
    @PostMapping("/api/v1/product")
    Product save (@RequestBody Product product);
    
        
    @GetMapping("/api/v1/product/byuser/{userId}")
    List<Product> getProducts(@PathVariable("userId") int userId);
    
}
