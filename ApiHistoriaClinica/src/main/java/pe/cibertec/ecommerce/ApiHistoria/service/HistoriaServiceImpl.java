/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiHistoria.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiHistoria.dao.HistoriaRepository;
import pe.cibertec.ecommerce.ApiHistoria.entity.Historia;

/**
 *
 * @author jmvil
 */
@Service
public class HistoriaServiceImpl implements IHistoriaService{
    
    @Autowired
    private HistoriaRepository historiaRepository;

    @Override
    public List<Historia> findAll() {
        return (List<Historia>) historiaRepository.findAll();
    }

    @Override
    public Historia findById(int historiaID) {
        return historiaRepository.findById(historiaID).get();
    }

    @Override
    public Historia add(Historia historia) {
       return historiaRepository.save(historia);
    }

    @Override
    public Historia update(Historia historia) {
    var historiaDB = historiaRepository.findById(historia.getHistoriaID()).get();
        historiaDB.setNombreMascota(historia.getNombreMascota());
        historiaDB.setEspecieMascota(historia.getEspecieMascota());
        historiaDB.setNombrePropietario(historia.getNombrePropietario());
        historiaDB.setContactPhone(historia.getContactPhone());
        historiaDB.setObservacion(historia.getObservacion());
                return historiaRepository.save(historiaDB);    }
    
    
    //FeignClient 
    
    //GUARDAR HISTORIA BY DOCTOR
    @Override
    public Historia save(Historia historia) {
         Historia historiaNew = historiaRepository.save(historia);
         return historiaNew;
    }
    
    //LISTAR HISTORIAS BY DOCTOR
    @Override
    public List<Historia> findByDoctorId(int doctorhId) {
        return historiaRepository.findByDoctorhId(doctorhId);
    }
    
    
    
}
