/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiHistoria.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiHistoria.entity.Historia;

/**
 *
 * @author jmvil
 */
public interface IHistoriaService {
   public List<Historia> findAll();
   public Historia findById(int id);
   public Historia add(Historia historia);
   public Historia update(Historia historia);
   
   //FeignClient PRODUCT
   public Historia save (Historia historia);
   
   //FeignClient EMPLOYEE lista productos
    public List<Historia> findByDoctorId(int doctorhId);
       
}
