package EducacionIT;

import java.util.Date;

public class Persona {
    public String Nombre;
    public String Apellido;
    public String Mail;
    public String Dni;
    public Date Nacimiento;
    
    public void mostrarDatos(){
        System.out.println("DNI: " + Dni);
        System.out.println("Alumno: " + Nombre + " " + Apellido);
        System.out.println("Correo electronico: " + Mail);
        System.out.println("Fecha de nacimiento: " + Nacimiento);
    }
    
}
