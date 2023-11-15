
package pe.cibertec.ecommerce.ApiCart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiCart.entity.Order;

public interface OrderRepository 
        extends JpaRepository<Order, Long> {
    
}
