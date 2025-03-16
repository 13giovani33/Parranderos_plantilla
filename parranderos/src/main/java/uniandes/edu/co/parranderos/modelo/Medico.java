package uniandes.edu.co.parranderos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String nombre;
    private String apellidos;
    private String numero_registro_medico;
    //private int numero_documento_medico;

    public Medico(String nombre, String apellidos, String numero_registro_medico) //, int numero_documento_medico)
    {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numero_registro_medico=numero_registro_medico;
        //this.numero_documento_medico=numero_documento_medico;

    }
    
    public Medico()
    {;}

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumero_registro_medico() {
        return numero_registro_medico;
    }

    //public int getNumero_documento_medico() {
    //    return numero_documento_medico;
    //}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumero_registro_medico(String numero_registro_medico) {
        this.numero_registro_medico = numero_registro_medico;
    }

    //public void setNumero_documento_medico(int numero_documento_medico) {
       // this.numero_documento_medico = numero_documento_medico;
    //}
    
    
}
