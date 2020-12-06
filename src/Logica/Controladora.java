
package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearParticipante(Participante parti) {
    
        controlPersis.crearParticipante(parti);
    }
    
}
