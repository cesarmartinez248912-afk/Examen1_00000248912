package controlador;

import modelo.Alumno;
import modelo.RepositorioAlumnos;
import java.util.List;

public class MainController {

    private RepositorioAlumnos repo;

    public MainController() {
        repo = new RepositorioAlumnos();
    }

    // Método que busca alumnos por ID parcial
    public List<Alumno> buscarPorId(String texto) {
        return repo.buscarPorId(texto);
    }

    // Genera el texto de constancia
    public String generarConstancia(Alumno a) {
        if (a == null) {
            return "Seleccione un alumno primero.";
        }

        return "CONSTANCIA DE INSCRIPCIÓN\n\n" +
                "Se certifica que el alumno " + a.getNombre() +
                " (ID: " + a.getId() + ")\n" +
                "se encuentra inscrito en el semestre " + a.getSemestre() +
                " con " + a.getMaterias() + " materias.\n\n" +
                "Atentamente,\nInstituto Tecnológico de Sonora\n";
    }
}
