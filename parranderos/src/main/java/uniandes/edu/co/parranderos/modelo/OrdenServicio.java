package uniandes.edu.co.parranderos.modelo;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordenes_de_servicio")
public class OrdenServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String estado;
    private Timestamp fecha;

    public OrdenServicio(int id, String estado, Timestamp fecha)
    {
        this.id=id;
        this.estado=estado;
        this.fecha=fecha;
    }
    public OrdenServicio()
    {;}
    public int getId() {
        return id;
    }
    public String getEstado() {
        return estado;
    }
    public Timestamp getFecha() {
        return fecha;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    
}
