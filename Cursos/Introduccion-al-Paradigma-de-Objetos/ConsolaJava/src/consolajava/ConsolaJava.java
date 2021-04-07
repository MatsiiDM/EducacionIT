package consolajava;
import EducacionIT.Alumno;
import EducacionIT.Carrera;
import EducacionIT.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConsolaJava {
    
    public static void main(String[] args) throws ParseException {
        /*
        Persona p = new Persona();
        p.Nombre = "Maximiliano";
        p.Apellido = "Martin";
        p.Dni = "38371057";
        p.Mail = "maximiliano.d.martin@gmail.com";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        p.Nacimiento = sdf.parse("20-07-1994");
        //p.mostrarDatos();
        
        Persona p1 = new Persona();
        p1.Nombre = "Maximiliano";
        p1.Apellido = "Martin";
        p1.Dni = "38371057";
        p1.Mail = "maximiliano.d.martin@gmail.com";
        
        //RELACION DE CONTENCION
        Alumno a = new Alumno();
        //a.Datos.Nombre = "Andres";
        
        a.Datos = p;
        //a.Carrera = ;
        //a.
        */
        Carrera c = new Carrera();
        c.Nombre = "Programacion JAVA";
        
        /*
        Alumno a1 = new Alumno();
        a1.Datos = p1;
        a1.Datos.mostrarDatos();
        */
        
        Alumno a1 = new Alumno();
        a1.Nombre = "Cesar";
        a1.Apellido = "Musio";
        a1.Dni = "542878";
        a1.Mail= "cesarmussio@gmail.com";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        a1.Nacimiento = sdf.parse("19-04-1998");
        a1.Carrera = c;
        a1.mostrarDatos();
    }
    
}
