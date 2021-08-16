package Persistencia;

import Logica.Persona;

public class ControladoraPersistencia {
    
    PersonaJpaController perJPA = new PersonaJpaController();
    
    //crear alumno
    public void crearPersona(Persona per){
        perJPA.create(per);
    }
    
}
