/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiDoctor.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiDoctor.dao.DoctorRepository;
import pe.cibertec.ecommerce.ApiDoctor.entity.Doctor;
import pe.cibertec.ecommerce.ApiDoctor.feignclients.HistoriaFeignClient;
import pe.cibertec.ecommerce.ApiDoctor.model.Historia;

/**
 *
 * @author jmvil
 */
@Service
public class DoctorServiceImpl implements DoctorService{
    
    @Autowired    
    private DoctorRepository doctorRepository;
    @Autowired
    private HistoriaFeignClient historiaFeignClient;

    @Override
    public List<Doctor> findAll() {
        return (List<Doctor>) doctorRepository.findAll();
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {
      return doctorRepository.save(doctor);
    }   

    @Override
    public Doctor findById(int doctorId) {
        return doctorRepository.findById(doctorId).get();
    }
    /*
    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }
    
    */



    @Override
    public void deleteDoctor(int doctorId) {
       var doctorDelete = doctorRepository.findById(doctorId).get();
        doctorRepository.delete(doctorDelete);

    }
  
    @Override
    public Doctor updateDoctor(Doctor doctor) {
        var doctorBD = doctorRepository.findById(doctor.getDoctorId()).get();
        doctorBD.setDoctorName(doctor.getDoctorName());
        doctorBD.setDoctorLastName(doctor.getDoctorLastName());
        doctorBD.setSpecialty(doctor.getSpecialty());
        doctorBD.setAge(doctor.getAge());
        doctorBD.setDoctorEmail(doctor.getDoctorEmail());
        doctorBD.setDoctorPhone(doctor.getDoctorPhone());
        return doctorRepository.save(doctorBD);    
    }
    
    //OpenFeing Historia 

    
    @Override
    public Historia saveHistoria(int doctorhId, Historia historia) {
        historia.setDoctorhId(doctorhId);
        Historia historiaNew = historiaFeignClient.saveHistoria(historia);
        return historiaNew;    
    }

    @Override
    public Map<String, Object> getHistoriasbyDoctor(int doctorhId) {
        Map<String, Object> result = new HashMap<>();
        Doctor doctor = doctorRepository.findById(doctorhId).orElse(null);
        if (doctor == null){
            result.put("Mensaje", "no existe el Doctor");
            return result;
        }
        result.put("Doctor",doctor);
        List<Historia> historias = historiaFeignClient.getHistorias(doctorhId);
        if(historias.isEmpty())
            result.put("Historia", "ese Dostor no tiene Historias");
        else
            result.put("Historia", historias);
        return result;  
    }      
}
