package pe.cibertec.ecommerce.ApiCart.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Customer {
    private Long customerId;
    private String name;
    private String email;
    private String phone;
    
}
