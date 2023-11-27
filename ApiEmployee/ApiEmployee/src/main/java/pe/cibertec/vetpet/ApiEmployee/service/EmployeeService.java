package pe.cibertec.vetpet.ApiEmployee.service;

import java.util.List;
import pe.cibertec.vetpet.ApiEmployee.entity.Employee;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(int employeeId);
    public Employee save(Employee employee);
    public Employee updateEmp (Employee employee);
    public void deleteEmp (int employeeId);

}
