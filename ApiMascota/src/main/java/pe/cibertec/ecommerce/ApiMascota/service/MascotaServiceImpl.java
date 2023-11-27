/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiMascota.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiMascota.dao.MascotaRepository;
import pe.cibertec.ecommerce.ApiMascota.entity.Mascota;

@Service
public class MascotaServiceImpl implements MascotaService{
    
    @Autowired
    MascotaRepository  mascotaRepository;

    @Override
    public List<Mascota> findAll() {
        return (List<Mascota>) mascotaRepository.findAll();
    }

    @Override
    public void deletePet(int Id) {
        var petDelete = mascotaRepository.findById(Id).get();
                mascotaRepository.delete(petDelete);

    }

    @Override
    public Mascota addPet(Mascota mascota) {
        Mascota mascotaNew = mascotaRepository.save(mascota);
        return mascotaNew;
    }
    
}

