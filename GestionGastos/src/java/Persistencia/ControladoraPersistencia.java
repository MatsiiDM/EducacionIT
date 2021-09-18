package Persistencia;

import Logica.Persona;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraPersistencia {
    
    PersonaJpaController perJPA = new PersonaJpaController();
    
    
    //Creo una nueva persona para la base de datos
    public void crearPersona(Persona per){
        perJPA.create(per);
    }
    
    //Obtengo las personas que estan en la base de datos
    public List<Persona> getPersonas(){
        List <Persona> listaPersonas;
        listaPersonas = perJPA.findPersonaEntities();
        return listaPersonas;
        
    }
    //Borra un usuario
    public void borrarPersona(Persona per) throws NonexistentEntityException {
        perJPA.destroy(per.getDni());
    }
}
