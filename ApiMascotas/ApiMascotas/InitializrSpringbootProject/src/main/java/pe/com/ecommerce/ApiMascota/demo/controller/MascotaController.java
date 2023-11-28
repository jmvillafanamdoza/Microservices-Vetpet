
package pe.com.ecommerce.ApiMascota.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.ecommerce.ApiMascota.demo.entity.Mascota;
import pe.com.ecommerce.ApiMascota.demo.service.MascotaService;

@RestController
@RequestMapping(path = "api/v1/mascotas")
public class MascotaController {
    
    @Autowired
    private MascotaService mascotaService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Mascota>> findAll(){
        return new ResponseEntity<>(mascotaService.findAll(), HttpStatus.OK);
    }
    
    @GetMapping("/add")
    public ResponseEntity<Mascota> add(@RequestBody Mascota mascota){
        return new ResponseEntity<>(mascotaService.addPet(mascota), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{Id}")
    public void delete(@PathVariable int Id){
        mascotaService.deletePet(Id);
    }
}