/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCart.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author jmvil
 */

@Data
public class ItemFeign {
    private Product product;
    private Long quantity;
    
    public ItemFeign(){
    }
    
    public ItemFeign(Product product ,Long quantity){
        this.product = product;
        this.quantity = quantity;
    }
    
     public BigDecimal getTotal(){
    return product.getUnitPrice().multiply(BigDecimal.valueOf(quantity));
    }
}
