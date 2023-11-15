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
public class Product {
    
    private Long id;
    private String productName;
    private BigDecimal unitPrice;
    
  
}
