
package pe.cibertec.ecommerc.ApiCustomer.service;

import java.util.List;
import java.util.Map;
import pe.cibertec.ecommerc.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerc.ApiCustomer.model.Product;


public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(int id);
    public Product saveProduct (int userId, Product product);
    public Map<String, Object> getUserAndProducts(int userId);
    public Customer save(Customer customer);

   
    
}
