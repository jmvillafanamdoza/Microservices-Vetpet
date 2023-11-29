/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiDoctor.model;

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
public class Historia {
   private String nombreMascota;
   private String especieMascota;
   private String nombrePropietario;
   private String contactPhone;
   private String observacion;
   private int doctorhId;

}
