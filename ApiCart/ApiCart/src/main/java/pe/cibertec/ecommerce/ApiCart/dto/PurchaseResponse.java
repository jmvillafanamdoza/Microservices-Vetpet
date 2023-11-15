package pe.cibertec.ecommerce.ApiCart.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PurchaseResponse {
    private String trackingNumber=null;
}
