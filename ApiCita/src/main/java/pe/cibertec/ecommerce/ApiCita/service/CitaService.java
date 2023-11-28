/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCita.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCita.entity.Cita;

/**
    public List<Product> findByEmployeeId(int employeeId);
    public Product save (Product product);
 */
public interface CitaService {
    public List<Cita> findAll();
    public Cita findById(int citaId);
    public Cita save(Cita cita);
    
    
    //FeignClient
    public List<Cita> findByCustomerId(int customerId);
    public Cita addCita (Cita cita);
    
}
