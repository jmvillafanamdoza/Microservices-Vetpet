
package pe.cibertec.ecommerce.ApiCart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiCart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
    Product findByProductName(String productName);
    
}
