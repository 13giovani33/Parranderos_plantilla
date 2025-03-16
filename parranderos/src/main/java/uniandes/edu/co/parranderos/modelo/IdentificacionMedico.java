package uniandes.edu.co.parranderos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "identificacion_medicos")
public class IdentificacionMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String tipo_documento;
    private int numero_documento;
    
    public IdentificacionMedico( String tipo_documento, int numero_documento)
    {
        this.tipo_documento=tipo_documento;
        this.numero_documento=numero_documento;
    }
    public IdentificacionMedico()
    {;}
    public String getTipo_documento() {
        return tipo_documento;
    }
    public int getNumero_documento() {
        return numero_documento;
    }
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }
    
}
