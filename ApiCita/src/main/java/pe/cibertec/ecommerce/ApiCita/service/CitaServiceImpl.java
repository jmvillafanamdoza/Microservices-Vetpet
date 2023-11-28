package pe.cibertec.ecommerce.ApiCita.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCita.dao.CitaRepository;
import pe.cibertec.ecommerce.ApiCita.entity.Cita;

/**
 *
 * @author jmvil
 */
@Service
public class CitaServiceImpl implements CitaService{
    
    @Autowired
    private CitaRepository citaRepository;

    @Override
    public List<Cita> findAll() {
        return citaRepository.findAll();
    }

    @Override
    public Cita add(Cita cita) {
        return citaRepository.save(cita);
    }
  
    //FeingClient
    
    @Override
    public Cita save(Cita cita) {
        Cita citaNew = citaRepository.save(cita);
        return citaNew;
    }

    @Override
    public List<Cita> findByCustomerId(int customerId) {
        return citaRepository.findByCustomerId(customerId);
    }
      
}
