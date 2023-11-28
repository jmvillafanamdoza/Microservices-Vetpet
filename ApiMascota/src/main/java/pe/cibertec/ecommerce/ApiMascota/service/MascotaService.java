/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiMascota.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiMascota.entity.Mascota;



public interface MascotaService {
    public List<Mascota> findAll();
    public void deletePet (int Id);
    public Mascota addPet(Mascota mascota);

    
}

/*
public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(int employeeId);
    public Employee addEmp(Employee employee);
    public Employee updateEmp (Employee employee);
    public void deleteEmp (int employeeId);
    public Product saveProduct (int employeeId, Product product);
    public Map<String, Object> getEmployeeAndProducts(int employeeId);
}

*/
