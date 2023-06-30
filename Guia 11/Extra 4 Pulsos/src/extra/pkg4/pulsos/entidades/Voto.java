//• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
//un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
package extra.pkg4.pulsos.entidades;

import java.util.List;

public class Voto {
    
    private Alumno alumno;
    private List<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumno, List<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(List<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
    
}
