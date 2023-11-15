package pe.cibertec.ecommerce.ApiCart.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiCart.entity.Item;


public interface CartService {
    public PurchaseResponse placeOrder(Purchase purchase);


}
