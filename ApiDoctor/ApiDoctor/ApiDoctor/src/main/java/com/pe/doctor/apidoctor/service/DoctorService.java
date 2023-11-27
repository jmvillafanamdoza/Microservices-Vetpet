package com.pe.doctor.apidoctor.service;

import com.pe.doctor.apidoctor.entity.Doctor;
import com.pe.doctor.apidoctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DoctorService {
    public List<Doctor> findAll();
    public Doctor getDoctorById(int id);
    public Doctor save(Doctor doctor);
    public void delete(int id);   
}


/*

public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(int id);
    public Product saveProduct (int userId, Product product);
    public Map<String, Object> getUserAndProducts(int userId);
    public Customer save(Customer customer);

   
    
}
*/

/*


public interface ProductService {
    public List<Product> findAll();
    public Page<Product> findAll(int page,int size);
    public Product findById(int id);
    public Product findByProductName(String productName);
    public Product add(Product product);
    public Product update(Product product);
    public void delete(int id);
    public List<Product> findByUserId(int userId);
    public Product save (Product product);
    
    
}
*/