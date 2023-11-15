
package pe.cibertec.ecommerce.ApiCart.dto;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import pe.cibertec.ecommerce.ApiCart.entity.Order;
import pe.cibertec.ecommerce.ApiCart.entity.OrderItem;

@Getter
@Setter
public class Purchase {
    private Order order;
    private Set<OrderItem> orderItems; 
}
