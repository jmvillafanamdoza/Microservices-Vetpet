package pe.cibertec.ecommerce.ApiCart.service;

import pe.cibertec.ecommerce.ApiCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiCart.dto.PurchaseResponse;


public interface CartService {
    public PurchaseResponse placeOrder(Purchase purchase);
}
