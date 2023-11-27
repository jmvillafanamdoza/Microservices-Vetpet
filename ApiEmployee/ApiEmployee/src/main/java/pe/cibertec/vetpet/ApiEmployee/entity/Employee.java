package pe.cibertec.vetpet.ApiEmployee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String firstname;
    private String lastname;
    private String documentId;
    private String phone;
    private String email;
}
