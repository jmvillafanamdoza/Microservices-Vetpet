
package pe.cibertec.ecommerce.ApiCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiCart.entity.Cart;
import pe.cibertec.ecommerce.ApiCart.models.ProductOrder;
import pe.cibertec.ecommerce.ApiCart.service.CartService;

@RestController
@RequestMapping("api/v1/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    
    @PostMapping("/placeOrder")
    public PurchaseResponse placeOrder(
            @RequestBody Purchase purchase){
        return cartService.placeOrder(purchase);
    }
    @PostMapping("/newOrder")
    public ResponseEntity<Cart> save(@RequestBody Cart cart){
        Cart cartNew = cartService.save(cart);
        return ResponseEntity.ok(cartNew);
    }
    
    //FeignClient PRODUCTO / CREA UNA ORDEN CON PRODUCTOS / LISTA LAS ORDENES QUE CREA
   @PostMapping("/saveproductinCart/{cartId}")
   public ResponseEntity<ProductOrder> saveOrder (@PathVariable("cartId") int cartId, @RequestBody ProductOrder productOrder) {
       if(cartService.findById(cartId)== null)
           return ResponseEntity.notFound().build();
       ProductOrder orderNew = cartService.saveOrder(cartId, productOrder);
       return ResponseEntity.ok(productOrder); 
   }
    
}
