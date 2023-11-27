package com.example.apimascota.service;

import com.example.apimascota.entity.Mascota;
import com.example.apimascota.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {

    @Autowired
    MascotaRepository mascotaRepository;

    public List<Mascota> getMascota(){
        return mascotaRepository.findAll();
    }

    public void saveOrUpdate(Mascota mascota){
        mascotaRepository.save(mascota);
    }
}
