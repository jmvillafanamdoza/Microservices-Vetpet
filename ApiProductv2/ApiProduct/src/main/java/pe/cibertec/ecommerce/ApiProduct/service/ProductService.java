package pe.cibertec.ecommerce.ApiProduct.service;

import java.util.List;
import org.springframework.data.domain.Page;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;


public interface ProductService {
    public List<Product> findAll();
    public Page<Product> findAll(int page,int size);
    public Product findById(int id);
    public Product findByProductName(String productName);
    public Product add(Product product);
    public Product update(Product product);
    public void delete(int id);
    
    //FeignClient CUSTOMER lista productos
    public List<Product> findByUserId(int userId);
    
    //FeignClient EMPLOYEE lista productos
    public List<Product> findByEmployeeId(int employeeId);
    
    //FeignClient PRODUCT
    public Product save (Product product);
       
}