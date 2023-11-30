
package pe.com.ecommerce.ApiMascota.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ecommerce.ApiMascota.demo.dao.MascotaRepository;
import pe.com.ecommerce.ApiMascota.demo.entity.Mascota;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    MascotaRepository mascotaRepository;

    @Override
    public List<Mascota> findAll() {
        return (List<Mascota>) mascotaRepository.findAll();
    }

    @Override
    public Mascota addPet(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public void deletePet(int Id) {
        var petDelete = mascotaRepository.findById(Id).get();
        mascotaRepository.delete(petDelete);
    }
    
    //FeignClient 
    /*
      @Override
    public Product save(Product product) {
         Product productNew = productRepository.save(product);
        return productNew;  
    }

    @Override
    public List<Product> findByEmployeeId(int employeeId) {
        return productRepository.findByEmployeeId(employeeId);
    }
    */
    @Override
    public Mascota saveMascota(Mascota mascota) {
        Mascota mascotaNew = mascotaRepository.save(mascota);
        return mascotaNew;
    }

    @Override
    public List<Mascota> findByCustomermId(int customermId) {
        return mascotaRepository.findByCustomermId(customermId);
    }
}
