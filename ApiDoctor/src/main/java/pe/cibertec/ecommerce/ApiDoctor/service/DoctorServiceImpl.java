/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiDoctor.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiDoctor.dao.DoctorRepository;
import pe.cibertec.ecommerce.ApiDoctor.entity.Doctor;

/**
 *
 * @author jmvil
 */
@Service
public class DoctorServiceImpl implements DoctorService{
    
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> findAll() {
        return (List<Doctor>) doctorRepository.findAll();
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {
      return doctorRepository.save(doctor);
    }   

    @Override
    public Doctor findById(int doctorId) {
        return doctorRepository.findById(doctorId).get();
    }

    @Override
    public void deleteDoctor(int doctorId) {
       var doctorDelete = doctorRepository.findById(doctorId).get();
        doctorRepository.delete(doctorDelete);

    }
  
    @Override
    public Doctor updateDoctor(Doctor doctor) {
        var doctorBD = doctorRepository.findById(doctor.getDoctorId()).get();
        doctorBD.setDoctorName(doctor.getDoctorName());
        doctorBD.setDoctorLastName(doctor.getDoctorLastName());
        doctorBD.setSpecialty(doctor.getSpecialty());
        doctorBD.setAge(doctor.getAge());
        doctorBD.setDoctorEmail(doctor.getDoctorEmail());
        doctorBD.setDoctorPhone(doctor.getDoctorPhone());
        return doctorRepository.save(doctorBD);    
    }
      
}
