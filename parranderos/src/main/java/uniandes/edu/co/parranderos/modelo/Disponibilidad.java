package uniandes.edu.co.parranderos.modelo;


import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "disponibilidades")
public class Disponibilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Timestamp fecha_inicio;
    private Timestamp fecha_fin;
    private String estado;

    public Disponibilidad(Timestamp fecha_incio, Timestamp fecha_fin, String estado)
    {
        this.fecha_inicio=fecha_incio;
        this.fecha_fin=fecha_fin;
        this.estado=estado;
    }
    public Disponibilidad()
    {;}
    public Timestamp getFecha_inicio() {
        return fecha_inicio;
    }
    public Timestamp getFecha_fin() {
        return fecha_fin;
    }
    public String getEstado() {
        return estado;
    }
    public void setFecha_inicio(Timestamp fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public void setFecha_fin(Timestamp fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
