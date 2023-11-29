
package pe.cibertec.ecommerc.ApiCustomer.service;

import java.util.List;
import java.util.Map;
import pe.cibertec.ecommerc.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerc.ApiCustomer.model.Cita;
import pe.cibertec.ecommerc.ApiCustomer.model.Mascota;
import pe.cibertec.ecommerc.ApiCustomer.model.Product;


public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(int id);
    public Customer save(Customer customer);
    
    //openfeign Producto
    public Product saveProduct (int userId, Product product);
    public Map<String, Object> getUserAndProducts(int userId);

    
     //openfeign Cita
    public Cita saveCita (int customerId, Cita cita);
    public Map<String, Object> getCustomerAndCitas(int customerId);
    
    //openfeign Mascotas
    public Mascota saveMascota (int customermId, Mascota mascota);
    public Map<String, Object> getCustomerAndMascotas(int customermId);
 
    
}
