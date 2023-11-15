package pe.cibertec.ecommerce.ApiCart.entity;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Embeddable
public class Item {
    
    
    private String productName;
    private BigDecimal unitPrice;
    private Long quantity;
   
}
