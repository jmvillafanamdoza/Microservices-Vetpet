/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.doctor.apidoctor.service;

import com.pe.doctor.apidoctor.entity.Doctor;
import com.pe.doctor.apidoctor.repository.DoctorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jmvil
 */
@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;
      
    @Override
    public List<Doctor> findAll() {
      return (List<Doctor>) doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(int id) {
      return doctorRepository.findById(id).get();
    }

    @Override
    public Doctor save(Doctor doctor) {   
        return doctorRepository.save(doctor);
    }

    @Override
    public void delete(int id) {
        var doctorDB = doctorRepository.findById(id).get();
        doctorRepository.delete(doctorDB);
    }
    
}
