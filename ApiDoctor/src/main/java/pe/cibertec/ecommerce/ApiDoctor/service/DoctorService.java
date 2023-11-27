/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiDoctor.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiDoctor.entity.Doctor;

/**
   
    public Doctor updateDoctor (Doctor doctor);
 */
public interface DoctorService {
    
    public List<Doctor> findAll();
    public Doctor addDoctor(Doctor doctor);
    public Doctor findById(int doctorId);
    public void deleteDoctor (int doctorId);
    public Doctor updateDoctor (Doctor doctor);    
}
