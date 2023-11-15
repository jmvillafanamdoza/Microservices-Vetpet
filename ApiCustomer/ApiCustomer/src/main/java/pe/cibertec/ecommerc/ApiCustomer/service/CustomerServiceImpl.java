
package pe.cibertec.ecommerc.ApiCustomer.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerc.ApiCustomer.dao.CustomerRepository;
import pe.cibertec.ecommerc.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerc.ApiCustomer.feignclients.ProductFeignClient;
import pe.cibertec.ecommerc.ApiCustomer.model.Product;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductFeignClient productFeignClient;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).get();
    }

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

    @Override
    public Customer save(Customer customer) {
       Customer customerNew = customerRepository.save(customer);
       return customerNew;
    }
      /*
      public User save(User user) {
        User userNew = userRepository.save(user);
        return userNew;
    }
    
    */

}
  
