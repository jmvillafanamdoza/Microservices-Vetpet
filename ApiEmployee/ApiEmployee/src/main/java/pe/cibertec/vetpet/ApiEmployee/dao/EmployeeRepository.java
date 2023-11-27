package pe.cibertec.vetpet.ApiEmployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.vetpet.ApiEmployee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
}
