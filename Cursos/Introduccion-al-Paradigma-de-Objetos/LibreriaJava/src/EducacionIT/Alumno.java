package EducacionIT;

import java.util.List;

//contencion
//public class Alumno {
//herencia uso extends
public class Alumno extends Persona{
    //public Persona Datos;
    public Carrera Carrera;
    public List<Curso> Cursos;
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Carrera: " + Carrera.Nombre);
    }
    
}
