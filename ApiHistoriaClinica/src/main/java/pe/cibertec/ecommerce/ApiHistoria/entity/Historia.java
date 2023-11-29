/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiHistoria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author jmvil
 */
@Data
@Entity
public class Historia {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int historiaID;
   private String nombreMascota;
   private String especieMascota;
   private String nombrePropietario;
   private String contactPhone;
   private String observacion;
   private int doctorhId;
}
