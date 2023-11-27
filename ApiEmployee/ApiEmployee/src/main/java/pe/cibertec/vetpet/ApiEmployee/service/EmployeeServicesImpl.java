package pe.cibertec.vetpet.ApiEmployee.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.vetpet.ApiEmployee.dao.EmployeeRepository;
import pe.cibertec.vetpet.ApiEmployee.entity.Employee;

@Service
public class EmployeeServicesImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeedRepository;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeedRepository.findAll();
    }

    @Override
    public Employee findById(int employeeId) {
        return employeedRepository.findById(employeeId).get();
    }

    @Override
    public Employee save(Employee employee) {
       Employee employeeNew =  employeedRepository.save(employee);
       return employeeNew;
    }
    /*
     public Customer save(Customer customer) {
       Customer customerNew = customerRepository.save(customer);
       return customerNew;
    }
    */

    @Override
    public Employee updateEmp(Employee employee) {
        var employeeDB = employeedRepository.findById(employee.getEmployeeId()).get();
        employeeDB.setFirstname(employee.getFirstname());
        employeeDB.setLastname(employee.getLastname());
        employeeDB.setDocumentId(employee.getDocumentId());
        employeeDB.setEmail(employee.getEmail());
        employeeDB.setPhone(employee.getPhone());
        return employeedRepository.save(employeeDB);
    }

    @Override
    public void deleteEmp(int employeeId) {
        var employeeDelete = employeedRepository.findById(employeeId).get();
        employeedRepository.delete(employeeDelete);
    }


    
}
