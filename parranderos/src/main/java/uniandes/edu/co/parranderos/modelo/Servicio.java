package uniandes.edu.co.parranderos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String nombre;
    private String tipo_servicio;
    private boolean requieren_orden;
    //private int nit_ips;
    
    public Servicio(int id, String nombre, String tipo_servicio, boolean requieren_orden)//, int nit_ips)
    {
        this.id=id;
        this.nombre=nombre;
        this.tipo_servicio=tipo_servicio;
        //this.nit_ips=nit_ips;
    }
    public Servicio()
    {;}
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo_servicio() {
        return tipo_servicio;
    }
    public boolean isRequieren_orden() {
        return requieren_orden;
    }
    //public int getNit_ips() {
       // return nit_ips;
    //}
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }
    public void setRequieren_orden(boolean requieren_orden) {
        this.requieren_orden = requieren_orden;
    }
    //public void setNit_ips(int nit_ips) {
      //  this.nit_ips = nit_ips;
    //}
    
}
