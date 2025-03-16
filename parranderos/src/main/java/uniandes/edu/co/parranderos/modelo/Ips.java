package uniandes.edu.co.parranderos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ips")
public class Ips {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int nit;
    private String nombre;
    private String direccion;
    private int telefono;

    public Ips(int nit, String nombre, String direccion, int telefono)
    {
        this.nit=nit;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    public Ips()
    {;}
    public int getNit() {
        return nit;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setNit(int nit) {
        this.nit = nit;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    

    
}
