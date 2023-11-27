
package pe.cibertec.ecommerce.ApiProduct.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiProduct.dao.ProductRepository;
    import pe.cibertec.ecommerce.ApiProduct.entity.Product;
import pe.cibertec.ecommerce.ApiProduct.exception.EntityNotFoundException;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }
      
    @Override
    public Product add(Product product) {
       return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        var productDB = productRepository.findById(product.getId()).get();
        productDB.setProductName(product.getProductName());
        productDB.setUnitPrice(product.getUnitPrice());
        return productRepository.save(productDB);
    }

    @Override
    public void delete(int id) {
        var productDB = productRepository.findById(id).get();
        productRepository.delete(productDB);
    }

    @Override
    public Page<Product> findAll(int page, int size) {
        return 
        productRepository
        .findAll(PageRequest.of(page, size));
    }

    @Override
    public Product findByProductName(String productName) {
        return productRepository.findByProductName(productName);
    }

    @Override
    public List<Product> findByUserId(int userId) {
        return productRepository.findByUserId(userId);
    }
    
  
    
    /* public Bike save(Bike bike) {
        Bike bikeNew = bikeRepository.save(bike);
        return bikeNew;
    }
    */
    @Override
    public Product save(Product product) {
         Product productNew = productRepository.save(product);
        return productNew;  
    }

    @Override
    public List<Product> findByEmployeeId(int employeeId) {
        return productRepository.findByEmployeeId(employeeId);
    }
    
    
    
}
