package pe.cibertec.ecommerce.ApiCita.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCita.entity.Cita;

/**
 *
 * @author jmvil
 */
public interface CitaService {
    public List<Cita> findAll();
    public Cita add(Cita cita); 
   
    
    //OpenFeign  
    public Cita save (Cita cita);
    public List<Cita> findByCustomerId(int customerId);
    
}
