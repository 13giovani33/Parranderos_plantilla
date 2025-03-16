package uniandes.edu.co.parranderos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialidades")
public class Especialidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String especialidad;

    public Especialidad(int id, String especialidad)
    {
        this.id=id;
        this.especialidad=especialidad;
    }
    public Especialidad()
    {;}
    public int getId() {
        return id;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
