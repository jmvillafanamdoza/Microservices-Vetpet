package pe.cibertec.ecommerc.ApiCustomer.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
    private String productName;
    private BigDecimal unitPrice;
    private int userId;
}
