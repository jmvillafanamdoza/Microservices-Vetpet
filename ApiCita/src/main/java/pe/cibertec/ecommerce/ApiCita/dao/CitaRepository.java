/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCita.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.ecommerce.ApiCita.entity.Cita;

/**
 *
 * @author jmvil
 */
@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer>{
        List<Cita> findByCustomerId(int customerId);

}
