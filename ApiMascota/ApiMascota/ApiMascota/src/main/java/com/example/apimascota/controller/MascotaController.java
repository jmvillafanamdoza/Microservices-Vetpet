package com.example.apimascota.controller;

import com.example.apimascota.entity.Mascota;
import com.example.apimascota.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/mascotas")
public class MascotaController {

    @Autowired
    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @GetMapping
    public List<Mascota> GetAll(){
        return mascotaService.getMascota();
    }

    @PostMapping
    public void SaveDoctor(@RequestBody Mascota mascota){
        mascotaService.saveOrUpdate(mascota);
    }
}
