
package pe.com.ecommerce.ApiMascota.demo.service;

import java.util.List;
import pe.com.ecommerce.ApiMascota.demo.entity.Mascota;

public interface IMascotaService {
    public List<Mascota> findAll();
    public Mascota addPet(Mascota mascota);
    public void deletePet (int Id);
    
    //FeignClient
    public Mascota saveMascota (Mascota mascota);
    public List<Mascota> findByCustomermId(int customermId);


}
