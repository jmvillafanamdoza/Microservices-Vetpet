/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiDoctor.feignclients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.cibertec.ecommerce.ApiDoctor.model.Historia;


@FeignClient(name = "ApiHistoria", url = "http://localhost:8009")
public interface HistoriaFeignClient {
    
   
  @PostMapping("/api/v1/historia/saveHistoriabyDoctor")
   Historia saveHistoria (@RequestBody Historia historia);
   
   @GetMapping("/api/v1/historia/getHistoriasbyDoctor/{doctorhId}")
    List<Historia> getHistorias(@PathVariable("doctorhId") int doctorhId);
}
