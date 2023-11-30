
package pe.com.ecommerce.ApiMascota.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;
    public int edad;
    public String nombre;
    public String genero;
    public String especie;
    public String raza;
    public int customermId;
}
