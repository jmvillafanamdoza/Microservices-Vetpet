/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerc.ApiCustomer.model;

import java.util.Date;
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
public class Cita {
    
    private String descriptioncita;
    private String namemascota;
    private Date fechacita;
    private int customerId;

}
