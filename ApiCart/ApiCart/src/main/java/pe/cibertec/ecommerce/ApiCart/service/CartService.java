package pe.cibertec.ecommerce.ApiCart.service;

import pe.cibertec.ecommerce.ApiCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiCart.entity.Cart;
import pe.cibertec.ecommerce.ApiCart.models.ProductOrder;


public interface CartService {
    public PurchaseResponse placeOrder(Purchase purchase);
    public Cart findById(int id);
    public Cart save(Cart cart);

    

    //
    public ProductOrder saveOrder (int cartId, ProductOrder productOrder);

}
