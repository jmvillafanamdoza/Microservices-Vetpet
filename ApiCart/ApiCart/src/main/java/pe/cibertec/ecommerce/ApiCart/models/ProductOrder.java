/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCart.models;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jmvil
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductOrder {
    private String productName;
    private BigDecimal unitPrice;
    private int quantity;
    private int cartId;

}

/*
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
    private String productName;
    private BigDecimal unitPrice;
    private int userId;
}
*/