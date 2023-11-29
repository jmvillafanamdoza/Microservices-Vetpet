/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCita.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCita.dao.CitaRepository;
import pe.cibertec.ecommerce.ApiCita.entity.Cita;

/**
    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).get();
    }
    
     @Override
    public Customer save(Customer customer) {
       Customer customerNew = customerRepository.save(customer);
       return customerNew;
    }
    
 */
@Service
public class CitaServiceImpl implements CitaService{
     
    @Autowired
    private CitaRepository citaRepository;

    @Override
    public List<Cita> findAll() {
        return (List<Cita>) citaRepository.findAll();
    }

    @Override
    public Cita findById(int citaId) {
        return citaRepository.findById(citaId).get();
    }

    @Override
    public Cita save(Cita cita) {
        Cita citaNew = citaRepository.save(cita);
       return citaNew;
    }
       
    //OpenFeign Customer con cita
    @Override
    public List<Cita> findByCustomerId(int customerId) {
        return citaRepository.findByCustomerId(customerId);
    }

    @Override
    public Cita addCita(Cita cita) {
         Cita citaNew = citaRepository.save(cita);
          return citaNew;  

    }
    
}
