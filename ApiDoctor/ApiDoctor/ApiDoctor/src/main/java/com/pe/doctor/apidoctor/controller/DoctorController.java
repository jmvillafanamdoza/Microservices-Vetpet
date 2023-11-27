package com.pe.doctor.apidoctor.controller;

import com.pe.doctor.apidoctor.entity.Doctor;
import com.pe.doctor.apidoctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path = "api/v1/doctors")
public class DoctorController {

    @Autowired
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/findAll")
    public List<Doctor> findAll(){
        return doctorService.findAll();
    }

    @GetMapping("/{doctorId}")
     public Doctor findById(@PathVariable int id){
        return doctorService.getDoctorById(id);
    }
    
   
     @PostMapping("/save")
    public ResponseEntity<Doctor> save(@RequestBody Doctor doctor){
        Doctor doctorNew = doctorService.save(doctor);
        return ResponseEntity.ok(doctorNew);
    }

    @DeleteMapping("/{doctorId}")
    public void Delete(@PathVariable("doctorId") int doctorId){
        doctorService.delete(doctorId);
    }
}
