
package pe.cibertec.ecommerce.ApiDoctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.ecommerce.ApiDoctor.entity.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
    
}


