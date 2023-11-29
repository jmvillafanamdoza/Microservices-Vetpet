
package pe.cibertec.ecommerce.ApiCart.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.cibertec.ecommerce.ApiCart.models.ProductOrder;

/**
 @FeignClient(name = "ApiProductv2", url = "http://localhost:8002")
    public interface ProductFeignClient {
    
    @PostMapping("/api/v1/product")
    Product save (@RequestBody Product product);
    
        
    @GetMapping("/api/v1/product/byuser/{userId}")
    List<Product> getProducts(@PathVariable("userId") int userId);
    
}
 
 */

@FeignClient(name = "ApiProductv2", url = "http://localhost:8002")
public interface ProductFeignClient {
    
    @PostMapping("/api/v1/product/saveOrder")
    ProductOrder saveOrder (@RequestBody ProductOrder productOrder);
    
}
