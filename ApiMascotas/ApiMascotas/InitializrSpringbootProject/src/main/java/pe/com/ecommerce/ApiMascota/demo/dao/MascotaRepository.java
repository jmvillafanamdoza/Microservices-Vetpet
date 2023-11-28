
package pe.com.ecommerce.ApiMascota.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.ecommerce.ApiMascota.demo.entity.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer>{
    
}
