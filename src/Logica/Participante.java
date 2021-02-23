
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Participante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)        
    int id_participante;
    
    @Basic
    String apellido;
    String nombre;
    String localidad;
    String provincia;
    int edad;

    public Participante() {
    }

    public Participante(int id_participante, String apellido, String nombre, String localidad, String provincia int edad) {
        this.id_participante = id_participante;
        this.apellido = apellido;
        this.nombre = nombre;
        this.localidad = localidad;
        this.provincia = provincia;
        this.edad = edad;
    }

    public int getId_participante() {
        return id_participante;
    }

    public void setId_participante(int id_participante) {
        this.id_participante = id_participante;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

      public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
  