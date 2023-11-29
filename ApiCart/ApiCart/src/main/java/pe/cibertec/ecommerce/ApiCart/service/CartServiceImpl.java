
package pe.cibertec.ecommerce.ApiCart.service;

import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCart.dao.CartRepository;
import pe.cibertec.ecommerce.ApiCart.dao.OrderRepository;
import pe.cibertec.ecommerce.ApiCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiCart.entity.Cart;
import pe.cibertec.ecommerce.ApiCart.entity.Order;
import pe.cibertec.ecommerce.ApiCart.feignclients.ProductFeignClient;
import pe.cibertec.ecommerce.ApiCart.models.ProductOrder;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductFeignClient productFeignClient;
    @Autowired
    private CartRepository cartRepository;
    
    @Override
    public Cart save(Cart cart) {
      Cart cartNew = cartRepository.save(cart);
       return cartNew;
    }
    
   @Override
    public Cart findById(int carid) {
        return cartRepository.findById(carid).get();
    }
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

    @Override
    public ProductOrder saveOrder(int cartId, ProductOrder productOrder) {
            productOrder.setCartId(cartId);
        ProductOrder productNew = productFeignClient.saveOrder(productOrder);
        return productNew;    }

   

   
    
}
