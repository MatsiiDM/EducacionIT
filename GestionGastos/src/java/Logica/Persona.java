package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long dni;
    @Basic
    String nombre;
    String apellido;
    String cargo;
    String direccion;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fechaNacimiento;
    @OneToMany
    List<Producto> listaProductos;

    public Persona() {
    }

    public Persona(long dni, String nombre, String apellido, String cargo, String direccion, Date fechaNacimiento, List<Producto> listaProductos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.listaProductos = listaProductos;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    

  
    
    
    
}
