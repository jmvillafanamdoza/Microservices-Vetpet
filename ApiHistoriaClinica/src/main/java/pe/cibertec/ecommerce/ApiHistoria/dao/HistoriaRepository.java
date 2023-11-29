/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiHistoria.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.ecommerce.ApiHistoria.entity.Historia;

/**
 *
 * @author jmvil
 */
@Repository
public interface HistoriaRepository extends JpaRepository<Historia, Integer>{
        
List<Historia> findByDoctorhId(int doctorhId);
    
}
