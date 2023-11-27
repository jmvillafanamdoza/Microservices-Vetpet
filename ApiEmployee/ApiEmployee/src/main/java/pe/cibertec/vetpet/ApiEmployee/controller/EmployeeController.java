package pe.cibertec.vetpet.ApiEmployee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.vetpet.ApiEmployee.entity.Employee;
import pe.cibertec.vetpet.ApiEmployee.service.EmployeeService;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    
    @Autowired//Instanciación del objeto (reemplaza a la instanciación tradicional)
    private EmployeeService employeeService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Employee>>findAll(){
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }
    
    @GetMapping("/findById/{employeeId}")
    public ResponseEntity<Employee> findById(int employeeId) {
        return new ResponseEntity<>(employeeService.findById(employeeId), HttpStatus.OK);
    }
    
    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
       Employee employeeNew = employeeService.save(employee);
       return ResponseEntity.ok(employeeNew);
    }
    /*
      @PostMapping("/save")
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        Customer customerNew = customerService.save(customer);
        return ResponseEntity.ok(customerNew);
    }
    */
    @PutMapping("/update")
    public ResponseEntity<Employee> update(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.updateEmp(employee), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{employeeId}")
    public void delete(@PathVariable int employeeId){
        employeeService.deleteEmp(employeeId);
    }
    
}
