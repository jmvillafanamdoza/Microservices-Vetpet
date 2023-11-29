package pe.cibertec.ecommerce.ApiProduct.service;

import java.util.List;
import org.springframework.data.domain.Page;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;
import pe.cibertec.ecommerce.ApiProduct.entity.ProductOrder;


public interface ProductService {
    public List<Product> findAll();
    public Page<Product> findAll(int page,int size);
    public Product findById(int id);
    public Product findByProductName(String productName);
    public Product add(Product product);
    public Product update(Product product);
    public void delete(int id);
    public List<Product> findByUserId(int userId);
    public List<Product> findByEmployeeId(int employeeId);
    public Product save (Product product);
    public ProductOrder saveOrder (ProductOrder productOrder);

    
    /*
      @PostMapping("/api/v1/product")
    Product save (@RequestBody Product product);
    
    @GetMapping("/api/v1/product/byuser/{userId}")
    List<Product> getProducts(@PathVariable("userId") int userId);
    */
    
    
}