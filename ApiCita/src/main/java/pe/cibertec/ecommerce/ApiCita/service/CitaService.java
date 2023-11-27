package pe.cibertec.ecommerce.ApiCita.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCita.entity.Cita;

/**
 *
 * @author jmvil
 */
public interface CitaService {
    List<Cita> findAll();
    Cita add(Cita cita);    
}
