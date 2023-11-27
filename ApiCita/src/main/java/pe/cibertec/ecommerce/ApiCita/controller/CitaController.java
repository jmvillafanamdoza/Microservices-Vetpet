/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCita.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCita.dao.CitaRepository;
import pe.cibertec.ecommerce.ApiCita.entity.Cita;
import pe.cibertec.ecommerce.ApiCita.service.CitaService;



@RestController
@RequestMapping("api/v1/cita")
public class CitaController {
    
    @Autowired
    private CitaService citaService;
    
     @GetMapping("findAll")
    public ResponseEntity<List<Cita>> findAll(){
        return new ResponseEntity<>(citaService.findAll(),
                HttpStatus.OK);
    }
    
    @PostMapping("add")
    public ResponseEntity<Cita> add(@RequestBody Cita category){
        return new ResponseEntity<>(citaService.add(category),
                HttpStatus.CREATED);
    }
}
