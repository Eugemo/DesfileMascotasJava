
package Persistencia;

import Logica.Participante;

public class ControladoraPersistencia {
    ParticipanteJpaController partiJPA = new ParticipanteJpaController();
    
    public void crearParticipante (Participante parti){
    
        partiJPA.create(parti);
    }
    
    
}
