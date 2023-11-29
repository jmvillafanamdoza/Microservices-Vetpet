/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiHistoria.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiHistoria.entity.Historia;
import pe.cibertec.ecommerce.ApiHistoria.service.IHistoriaService;

/**
 *
 * @author jmvil
 */
@RestController
@RequestMapping("api/v1/historia")
public class HistoriaController {
    
    @Autowired
    private IHistoriaService iHistoriaService;
    
     @GetMapping("/findAll")
    public ResponseEntity<List<Historia>> findAll(){
        return new ResponseEntity<>(iHistoriaService.findAll(),
                HttpStatus.OK);
    }
      @PutMapping("/update")
    public ResponseEntity<Historia> update(@RequestBody Historia historia){
        return new ResponseEntity<>(iHistoriaService.update(historia),
                HttpStatus.OK);
    }
      @GetMapping("/findById/{historiaID}")
    public ResponseEntity<Historia> findById(@PathVariable int historiaID){
        return new ResponseEntity<>(iHistoriaService.findById(historiaID),HttpStatus.OK);
    }
    
      @PostMapping("/add")
    public ResponseEntity<Historia> add(@RequestBody Historia historia){
        return new ResponseEntity<>(iHistoriaService.add(historia),
                HttpStatus.CREATED);
    }
    
    //FEIGN CLIENT HISTORIA CLINICA BY DOCTOR
    
     //LISTAR PRODUCTOS POR ID EMPLEADO
    
    @GetMapping("/getHistoriasbyDoctor/{doctorhId}")
    public ResponseEntity<List<Historia>> findByDoctorId(@PathVariable("doctorhId") int doctorhId){
        List<Historia> historias = iHistoriaService.findByDoctorId(doctorhId);
        return ResponseEntity.ok(historias);
    } 
       
    //GUARDAR PRODUCTOS PARA LAS APIS
    
    @PostMapping("saveHistoriabyDoctor")
    public ResponseEntity<Historia> save (@RequestBody Historia historia){
        Historia historiaNew = iHistoriaService.save(historia);
        return ResponseEntity.ok(historiaNew);    
    }
    
    
    
}
