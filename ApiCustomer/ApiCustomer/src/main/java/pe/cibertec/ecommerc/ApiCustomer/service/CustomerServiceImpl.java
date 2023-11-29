
package pe.cibertec.ecommerc.ApiCustomer.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerc.ApiCustomer.dao.CustomerRepository;
import pe.cibertec.ecommerc.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerc.ApiCustomer.feignclients.CitaFeignClient;
import pe.cibertec.ecommerc.ApiCustomer.feignclients.MascotaFeignClient;
import pe.cibertec.ecommerc.ApiCustomer.feignclients.ProductFeignClient;
import pe.cibertec.ecommerc.ApiCustomer.model.Cita;
import pe.cibertec.ecommerc.ApiCustomer.model.Mascota;
import pe.cibertec.ecommerc.ApiCustomer.model.Product;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductFeignClient productFeignClient;
    @Autowired
    private CitaFeignClient citaFeignClient;
    @Autowired
    private MascotaFeignClient mascotaFeignClient;
    
    

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
    
    
    //OpenFeing PRODUCT
    
    @Override
    public Product saveProduct(int userId, Product product) {
        product.setUserId(userId);
        Product productNew = productFeignClient.save(product);
        return productNew;
    }
    

    @Override
    public Map<String, Object> getUserAndProducts(int userId) {
        Map<String, Object> result = new HashMap<>();
        Customer customer = customerRepository.findById(userId).orElse(null);
        if (customer == null){
            result.put("Mensaje", "no existe el Customer");
            return result;
        }
        result.put("Customer",customer);
        List<Product> products = productFeignClient.getProducts(userId);
        if(products.isEmpty())
            result.put("Products", "ese customer no tiene productos");
        else
            result.put("Products", products);
        return result;

    }
    
    //OpenFeing CITA los comandos como .save son de CitaFeignClient

    @Override
    public Cita saveCita(int customerId, Cita cita) {
        cita.setCustomerId(customerId);
        Cita citaNew = citaFeignClient.save(cita);
        return citaNew;    
    }
   
    @Override
    public Map<String, Object> getCustomerAndCitas(int customerId) {
        Map<String, Object> result = new HashMap<>();
        Customer customer = customerRepository.findById(customerId).orElse(null);
        if (customer == null){
            result.put("Mensaje", "no existe el Customer");
            return result;
        }
        result.put("Customer",customer);
        List<Cita> citas = citaFeignClient.getCitas(customerId);
        if(citas.isEmpty())
            result.put("Cita", "ese Cliente no tiene citas");
        else
            result.put("Cita", citas);
        return result;
    }
    
    //OpenFeing Mascotas los comandos como .save son de MascotaFeignClient
   
    
    @Override
    public Mascota saveMascota(int customermId, Mascota mascota) {
        mascota.setCustomermId(customermId);
        Mascota mascotaNew = mascotaFeignClient.saveMascota(mascota);
        return mascotaNew;
    }

    @Override
    public Map<String, Object> getCustomerAndMascotas(int customermId) {
    Map<String, Object> result = new HashMap<>();
        Customer customer = customerRepository.findById(customermId).orElse(null);
        if (customer == null){
            result.put("Mensaje", "no existe el Customer");
            return result;
        }
        result.put("Customer",customer);
        List<Mascota> mascotas = mascotaFeignClient.getMascotas(customermId);
        if(mascotas.isEmpty())
            result.put("Mascota", "ese Cliente no tiene mascotas");
        else
            result.put("Mascota", mascotas);
        return result;    }

   
}
  
