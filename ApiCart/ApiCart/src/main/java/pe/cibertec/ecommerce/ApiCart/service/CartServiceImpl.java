
package pe.cibertec.ecommerce.ApiCart.service;

import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCart.dao.OrderRepository;
import pe.cibertec.ecommerce.ApiCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiCart.entity.Order;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private OrderRepository orderRepository;
    
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        Order order = purchase.getOrder();
        order.setTrackingNumber(getTrackingNumber());
        purchase.getOrderItems().forEach(i->{
            order.addOrderItem(i);
        });
        
        orderRepository.save(order);
        return 
         new PurchaseResponse(order.getTrackingNumber());
        
    }
    
    private String getTrackingNumber(){
        return UUID.randomUUID().toString();
    }
    
}
