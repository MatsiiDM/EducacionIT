package Logica;

import Persistencia.ControladoraPersistencia;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controladora {
        
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public Date ParseFecha(String fecha) {
        DateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
        }
    
    //Recibo todos los datos
    
    public void crearPersona (String nombre, String apellido, String cargo, Date fechaNacimiento, long dni, String direccion){
        
        
        //Creo un nuevo objeto del tipo Consulta
        Persona per = new Persona();
        
        //Y le asigno los valores recibido del servlet
        per.setNombre(nombre);
        per.setApellido(apellido);
        per.setCargo(cargo);
        per.setFechaNacimiento(fechaNacimiento);
        per.setDni(dni);
        per.setDireccion(direccion);
        
        
        //Llamo a la controladora de persistencia para dar de alta esta Consulta en la base de datos
        controlPersis.crearPersona(per);
    }
    
}
