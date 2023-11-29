/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiDoctor.controller;

import java.util.List;
import java.util.Map;
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
import pe.cibertec.ecommerce.ApiDoctor.entity.Doctor;
import pe.cibertec.ecommerce.ApiDoctor.model.Historia;
import pe.cibertec.ecommerce.ApiDoctor.service.DoctorService;


@RestController
@RequestMapping(path = "api/v1/doctor")
public class DoctorController {
    
    @Autowired
    private DoctorService doctorService;
    
     @GetMapping("/findAll")
    public ResponseEntity<List<Doctor>> findAll(){
        return new ResponseEntity<>(doctorService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findById/{doctorId}")
    public ResponseEntity<Doctor> findById(@PathVariable int doctorId) {
        return new ResponseEntity<>(doctorService.findById(doctorId), HttpStatus.OK);
    }
    
    @GetMapping("/add")
    public ResponseEntity<Doctor> add(@RequestBody Doctor doctor){
        return new ResponseEntity<>(doctorService.addDoctor(doctor), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Doctor> update(@RequestBody Doctor doctor){
        return new ResponseEntity<>(doctorService.updateDoctor(doctor), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{doctorId}")
    public void delete(@PathVariable int doctorId){
        doctorService.deleteDoctor(doctorId);
    }
    
    
    //FEIGN CONTROLLER
    //GUARDAR HISTORIAS BY DOCTOR
     @PostMapping("/saveHistoriasByDoctor/{doctorhId}")
      public ResponseEntity<Historia> saveHistoria (@PathVariable("doctorhId") int doctorhId, @RequestBody Historia historia) {
            if(doctorService.findById(doctorhId)== null)
           return ResponseEntity.notFound().build();
       Historia historiaNew = doctorService.saveHistoria(doctorhId, historia);
       return ResponseEntity.ok(historia); 
   }
    //LISTAR PRODUCTOS BY CUSTOMER
    @GetMapping("/getAllHistoriasByDoctor/{doctorhId}")
    public ResponseEntity<Map<String,Object>> getAllHistorias(@PathVariable("doctorhId") int doctorhId) {
       Map<String,Object> result = doctorService.getHistoriasbyDoctor(doctorhId);
       return  ResponseEntity.ok(result);
   }
  
}
