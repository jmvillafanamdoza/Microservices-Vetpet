package pe.cibertec.ecommerc.ApiCustomer.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerc.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerc.ApiCustomer.model.Cita;
import pe.cibertec.ecommerc.ApiCustomer.model.Mascota;
import pe.cibertec.ecommerc.ApiCustomer.model.Product;
import pe.cibertec.ecommerc.ApiCustomer.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
   
    @GetMapping("/findAll")
    public List<Customer> findAll(){
        return customerService.findAll();
    }
    
    @GetMapping("/findById/{id}")
    public Customer findById(@PathVariable int id){
        return customerService.findById(id);
    }
    
    @PostMapping("/save")
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        Customer customerNew = customerService.save(customer);
        return ResponseEntity.ok(customerNew);
    }
        
    //FeignClient
    
    //GUARDAR PRODUCTOS BY CUSTOMER
   @PostMapping("/saveproductByCustomer/{userId}")
   public ResponseEntity<Product> saveProduct (@PathVariable("userId") int userId, @RequestBody Product product) {
       if(customerService.findById(userId)== null)
           return ResponseEntity.notFound().build();
       Product productNew = customerService.saveProduct(userId, product);
       return ResponseEntity.ok(product); 
   }
   
   //LISTAR PRODUCTOS BY CUSTOMER
   @GetMapping("/getAllUser/{userId}")
   public ResponseEntity<Map<String,Object>> getAllCitas(@PathVariable("userId") int userId) {
       Map<String,Object> result = customerService.getCustomerAndMascotas(userId);
       return  ResponseEntity.ok(result);
   }
   
   //GUARDAR CITAS BY CUSTOMER
   @PostMapping("/savecitabyCustomer/{customerId}")
   public ResponseEntity<Cita> saveCita (@PathVariable("customerId") int customerId, @RequestBody Cita cita) {
       if(customerService.findById(customerId)== null)
           return ResponseEntity.notFound().build();
       Cita citaNew = customerService.saveCita(customerId, cita);
       return ResponseEntity.ok(cita); 
   }
   
   //LISTAR CITAS BY CUSTOMER  
   @GetMapping("/getAllCustomer/{customerId}")
   public ResponseEntity<Map<String,Object>> getallCitas(@PathVariable("customerId") int customerId) {
       Map<String,Object> result = customerService.getCustomerAndMascotas(customerId);
       return  ResponseEntity.ok(result);
   }
   
   //GUARDAR MASCOTAS BY CUSTOMER
   @PostMapping("/saveMascotabyCustomer/{customermId}")
   public ResponseEntity<Mascota> saveMascota (@PathVariable("customermId") int customermId, @RequestBody Mascota mascota) {
       if(customerService.findById(customermId)== null)
           return ResponseEntity.notFound().build();
       Mascota mascotaNew = customerService.saveMascota(customermId, mascota);
       return ResponseEntity.ok(mascota); 
   }
   
   //LISTAR MASCOTAS BY CUSTOMER  
   @GetMapping("/getAllMascotasbyCustomer/{customermId}")
   public ResponseEntity<Map<String,Object>> getAllMascotas(@PathVariable("customermId") int customermId) {
       Map<String,Object> result = customerService.getCustomerAndMascotas(customermId);
       return  ResponseEntity.ok(result);
   }
  
}
