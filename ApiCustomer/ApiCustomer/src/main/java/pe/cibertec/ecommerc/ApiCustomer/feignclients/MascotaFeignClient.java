/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerc.ApiCustomer.feignclients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.cibertec.ecommerc.ApiCustomer.model.Mascota;


@FeignClient(name = "ApiMascota", url = "http://localhost:8007")
public interface MascotaFeignClient {
    
    @PostMapping("/api/v1/mascotas/saveMascotabyCustomer")
    Mascota saveMascota(@RequestBody Mascota mascota);
    
    @GetMapping("/api/v1/mascotas/getMascotasbyCustomer/{customermId}")
    List<Mascota> getMascotas(@PathVariable("customermId") int customermId);
    
}
