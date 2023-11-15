/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCart.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiCart.entity.ItemFeign;
import pe.cibertec.ecommerce.ApiCart.entity.Product;

/**
 *
 * @author jmvil
 */
@FeignClient(name="servicios-products",url = "http://localhost:8081")
public interface ProductoFeignClient {
    
    @GetMapping("/api/v1/product/findAll")
    public List<ItemFeign> ListProduct();
    
    @GetMapping("/api/v1/product/findById/{id}")
    public Product findById(@PathVariable Long id);
    
}
