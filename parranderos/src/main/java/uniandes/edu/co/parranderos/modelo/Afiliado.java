package uniandes.edu.co.parranderos.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="afiliados")
public class Afiliado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String tipo_documento;
    private String numero_documento;
    private String nombre;
    private String apellidos;
    private Date fecha_nacimiento;
    private String direccion;
    private int telefono;
    private String tipo_afiliado;
    private String parentesco;

    
    public Afiliado(String tipo_documento, String numero_documento, String nombre, String apellidos, Date fecha_nacimiento, String direccion, int telefono, String tipo_afiliado, String parentesco)
    {
        this.tipo_documento=tipo_documento;
        this.numero_documento=numero_documento;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fecha_nacimiento=fecha_nacimiento;
        this.direccion=direccion;
        this.telefono=telefono;
        this.tipo_afiliado=tipo_afiliado;
        this.parentesco=parentesco;
        
    }

    public Afiliado()
    {;}

    public String getTipo_documento() {
        return tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getTipo_afiliado() {
        return tipo_afiliado;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setTipo_afiliado(String tipo_afiliado) {
        this.tipo_afiliado = tipo_afiliado;
    }

    public void setParentesco(String parentesco) {
        this.parentesco= parentesco;
    }

    
    
}
