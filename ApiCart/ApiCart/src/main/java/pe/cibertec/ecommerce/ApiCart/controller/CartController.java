
package pe.cibertec.ecommerce.ApiCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiCart.dto.PurchaseResponse;
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

}
